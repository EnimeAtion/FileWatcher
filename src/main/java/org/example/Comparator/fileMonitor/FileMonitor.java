package org.example.Comparator.fileMonitor;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileMonitor {

    public static List<Path> listFilesInDirectory(String directoryPath) {
        List<Path> fileList = new ArrayList<>();

        Path dir = Paths.get(directoryPath);

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {

            for (Path entry : stream) {
                if (Files.isRegularFile(entry)) {
                    String filename = entry.getFileName().toString();
                    if (isValidFilename(filename)) {
                        fileList.add(entry);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileList;
    }

    public static boolean isValidFilename(String filename) {
        String pattern = "TRANSACTION_[0-9]{3}\\.csv";
        return filename.matches(pattern);
    }
}