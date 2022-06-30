package ru.spbu.arts.java.oop.exam;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;


public class FileVisitorTest {
    public static void main(String[] args) throws IOException {
        Path forTest = Path.of("src/ru/spbu/arts/java/oop");
        Exam fc = new Exam();
        Files.walkFileTree(forTest, fc);
        List<Path> allFiles = fc.getAllFiles();
        System.out.println(allFiles);

        Map<String, List<Path>> allFilesByExtension = fc.getFilesByExtension();
        System.out.println(allFilesByExtension);

    }



}
