package com.company;

import com.google.gson.Gson;

public class Main {
    //From task
    private static final String JSON = "{\n" +
            "  \"name\": \"...\",\n" +
            "  \"surname\": \"...\",\n" +
            "  \"phones\": [\n" +
            "    \"044-256-78-90\",\n" +
            "    \"066-123-45-67\"\n" +
            "  ],\n" +
            "  \"sites\": [\n" +
            "    \"http://site1.com\",\n" +
            "    \"http://site2.com\"\n" +
            "  ],\n" +
            "  \"address\": {\n" +
            "    \"country\": \"...\",\n" +
            "    \"city\": \"...\",\n" +
            "    \"street\": \"...\"\n" +
            "  }\n" +
            "}";

    public static void main(String[] args) {
        Gson gson = new Gson();

        Data parsedData = gson.fromJson(JSON, Data.class);
        System.out.println(parsedData.toString());
    }
}
