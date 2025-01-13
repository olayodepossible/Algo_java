package com.possible.coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
//import org.json.JSONArray;
//import org.json.JSONObject;
public class monieBarCode {
    private static final String BASE_URL = "https://jsonmock.hackerrank.com/api/inventory";

    public static int getDiscountedPrice(String barcode) {
        HttpURLConnection connection = null;
        try {
            // Create URL with query parameter
            URL url = new URL(BASE_URL + "?barcode=" + barcode);

            // Open connection
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(10000);
            connection.setReadTimeout(10000);

            // Check response code
            int responseCode = connection.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                return -1;
            }

            // Read response
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream())
            );
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Parse JSON response
            JSONObject jsonResponse = new JSONObject(response.toString());
            JSONArray data = jsonResponse.getJSONArray("data");

            // Check if data array is empty
            if (data.length() == 0) {
                return -1;
            }

            // Get the first (and only) item
            JSONObject item = data.getJSONObject(0);
            double price = item.getDouble("price");
            double discount = item.getDouble("discount");

            // Calculate discounted price
            double discountAmount = price * (discount / 100.0);
            return (int)(price - discountAmount);

        } catch (Exception e) {
            // In case of any errors (network, parsing, etc.), return -1
            return -1;
        } finally {
            // Clean up connection
            if (connection != null) {
                connection.disconnect();
            }
        }


        // Example usage
        public static void main(String[] args) {
            String barcode = "74001755";
            double price = getDiscountedPrice(barcode);

            if (price == -1) {
                System.out.println("Item not found or error occurred");
            } else {
                System.out.printf("Discounted price: %.2f%n", price);
            }

            int[] arr = {1, 2, 3, 4, 6};
            int index = findBalanceIndex(arr);
            System.out.println(index);  // Output: 3
        }
    }

    //===============================

    public static int findBalanceIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // Right sum

            if (leftSum == totalSum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1; // No balance index found
    }

}
