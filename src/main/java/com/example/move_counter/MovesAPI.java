package com.example.move_counter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MovesAPI {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public String getMovesData(int moveID) {
        try {
            String apiUrl = "https://pokeapi.co/api/v2/move/" + moveID + "/";
            URL url = new URL(apiUrl);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            if(connection.getResponseCode() == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder responseStringBuilder = new StringBuilder();
                String line;

                while((line = reader.readLine()) != null) {
                    responseStringBuilder.append(line);
                }
                reader.close();
                connection.disconnect();
                return responseStringBuilder.toString();
            } else {
                System.out.println("Failed to fecth data. HTTP Status Code: " + connection.getResponseCode());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Move stringToMove(String pokemonInfo) {
        try {
            JsonNode jsonNode = objectMapper.readTree(pokemonInfo);
            int id = jsonNode.get("id").asInt();
            String name = jsonNode.get("name").asText();
            JsonNode typeNode = jsonNode.get("type");
            String type = typeNode.get("name").asText();
            int pP = jsonNode.get("pp").asInt();
            int power = jsonNode.get("power").asInt();
            int accuracy = jsonNode.get("accuracy").asInt();

            return new Move(name, type, pP, power, accuracy);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
