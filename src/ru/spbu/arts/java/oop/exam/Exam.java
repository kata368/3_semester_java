package ru.spbu.arts.java.oop.exam;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class Exam implements FileVisitor {
    List <Path> allFiles = new ArrayList<>();

    Map<String, List<Path>> extensions = new HashMap<>();

    @Override
    public FileVisitResult preVisitDirectory(Object dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Вошли в каталог "+ dir.toString());
        return  FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException {

        System.out.println("Нашли файл "+ file.toString());
        allFiles.add(Path.of(file.toString()));
        String[] ext = file.toString().split("\\.");
        String finalExt = ext[ext.length - 1];
        System.out.println(finalExt);
        if (extensions.containsKey(ext)){  // поменяла чтобы всегда попадало на else так как не знаю как решить
            extensions.get(finalExt).add(Path.of(file.toString()));
        }else {
            extensions.put(finalExt, Collections.singletonList(Path.of(file.toString())));
        }

        return  FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Object file, IOException exc) throws IOException {
        System.out.println("Нашли файл "+ file.toString()+ " с ошибкой "+ exc.toString());
        return  FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Object dir, IOException exc) throws IOException {
        System.out.println("Вышли из каталога "+ dir.toString());
        return  FileVisitResult.CONTINUE;
    }

    public List<Path> getAllFiles(){
        return allFiles;
    }

    public Map<String, List<Path>> getFilesByExtension(){
        return extensions;
    }


}
