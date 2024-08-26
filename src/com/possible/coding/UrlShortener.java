package com.possible.coding;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.UUID;

public class UrlShortener {

    // Method to generate a 7-character short URL
    public static String generateShortUrl(String longUrl) {
        // Combine the long URL with a UUID to ensure uniqueness
        String uniqueInput = longUrl + UUID.randomUUID().toString();

        // Generate a hash of the unique input
        String hash = hash(uniqueInput);

        // Encode the hash using Base64 and take the first 7 characters
        return hash.substring(0, 7);
    }

    // Method to hash the unique input using SHA-256
    private static String hash(String input) {
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
        // Example usage
        String longUrl = "https://example.com/some/very/long/url";
        String shortUrl = generateShortUrl(longUrl);
        System.out.println("Short URL: " + shortUrl);
    }
}
