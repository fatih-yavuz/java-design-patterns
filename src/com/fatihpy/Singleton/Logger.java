package com.fatihpy.Singleton;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Logger {

    private static Logger instance = null;

    private Logger() { }


    public synchronized static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log() {
        try {
            Files.write(Paths.get("log"), "Hello World".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
