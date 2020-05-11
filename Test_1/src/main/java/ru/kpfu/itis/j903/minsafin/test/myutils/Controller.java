package ru.kpfu.itis.j903.minsafin.test.myutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Scanner;

public class Controller {
    Properties properties = new Properties();

    public void start() {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        try {
            FileInputStream fis = new FileInputStream("src\\main\\resources\\app.properties");
            properties.load(fis);
            String query = properties.getProperty("query");
            URI uri = new URI(query + "/" + id);
            new Saver(uri).saveContent();
            //TODO вызов ContentSaver'a
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
