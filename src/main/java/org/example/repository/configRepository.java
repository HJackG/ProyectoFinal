package org.example.repository;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class configRepository {
    private static final String CONFIG_FILE_PATH = "src/main/java/resources/config.json";
    private static Config config;
    private static Gson gson = new Gson();

    public static Config loadConfig() {
        if (config == null) {
            try (Reader reader = new FileReader(CONFIG_FILE_PATH)) {
                config = gson.fromJson(reader, Config.class);
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to load configuration", e);
            }
        }
        return config;
    }
}
