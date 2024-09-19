package com.possible.coding;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
public class DistributedUrlShortener {
        private final SnowflakeIdGenerator idGenerator;

        public DistributedUrlShortener(SnowflakeIdGenerator idGenerator) {
            this.idGenerator = idGenerator;
        }

        public String generateShortUrl(String longUrl) {
            // Generate a unique ID using the Snowflake algorithm
            long uniqueId = idGenerator.nextId();

            // Combine the long URL with the unique ID to ensure uniqueness
            String uniqueInput = longUrl + uniqueId;

            // Generate a hash of the unique input
            String hash = hash(uniqueInput);

            // Encode the hash using Base64 and take the first 7 characters
            return hash.substring(0, 7);
        }

        private String hash(String input) {
            try {
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                byte[] encodedHash = digest.digest(input.getBytes(StandardCharsets.UTF_8));

                // Convert the byte array to a Base64 string
                return Base64.getUrlEncoder().encodeToString(encodedHash);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("SHA-256 algorithm not found", e);
            }
        }

        public static void main(String[] args) {
            // Example usage with a Snowflake ID generator
            SnowflakeIdGenerator idGenerator = new SnowflakeIdGenerator(1, 1);
            DistributedUrlShortener urlShortener = new DistributedUrlShortener(idGenerator);

            String longUrl = "https://example.com/some/very/long/url";
            String shortUrl = urlShortener.generateShortUrl(longUrl);
            System.out.println("Short URL: " + shortUrl);
        }
    }

   class SnowflakeIdGenerator {
        private final long epoch = 1622505600000L; // Custom epoch (e.g., June 1, 2021)
        private final long nodeId;
        private final long datacenterId;
        private long sequence = 0L;
        private long lastTimestamp = -1L;

        public SnowflakeIdGenerator(long nodeId, long datacenterId) {
            this.nodeId = nodeId;
            this.datacenterId = datacenterId;
        }

        public synchronized long nextId() {
            long timestamp = System.currentTimeMillis();

            if (timestamp < lastTimestamp) {
                throw new RuntimeException("Clock moved backwards.");
            }

            if (lastTimestamp == timestamp) {
                sequence = (sequence + 1) & 4095L; // 12-bit sequence (4096 max)
                if (sequence == 0) {
                    timestamp = waitNextMillis(lastTimestamp);
                }
            } else {
                sequence = 0L;
            }

            lastTimestamp = timestamp;

            return ((timestamp - epoch) << 22)
                    | (datacenterId << 17)
                    | (nodeId << 12)
                    | sequence;
        }

        private long waitNextMillis(long lastTimestamp) {
            long timestamp = System.currentTimeMillis();
            while (timestamp <= lastTimestamp) {
                timestamp = System.currentTimeMillis();
            }
            return timestamp;
        }

}


