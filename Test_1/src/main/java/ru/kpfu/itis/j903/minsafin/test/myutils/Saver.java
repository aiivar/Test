package ru.kpfu.itis.j903.minsafin.test.myutils;

import java.io.*;
import java.net.URI;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Saver {
    private URI uri;

    public Saver(URI uri) {
        this.uri = uri;
    }

    public void saveContent() throws IOException {
        Path content = Paths.get("src/main/java/ru/kpfu/itis/j903/minsafin/test/myutils/content.json");
        if (!Files.exists(content)) {
            Files.createFile(content);
        }
        FileWriter fileWriter = new FileWriter(String.valueOf(content));
        URLConnection connection = uri.toURL().openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        while ((line = in.readLine()) != null) {
            fileWriter.write(line + "\n");
        }
        fileWriter.flush();
        fileWriter.close();
    }
}
