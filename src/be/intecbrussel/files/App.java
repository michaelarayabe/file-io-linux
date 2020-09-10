package be.intecbrussel.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        Path destDir = Paths.get("home/mika/Data/folder1/testing.txt");
        Path destFile = destDir.resolve("testing.txt");

        try {
            Files.createDirectories(destDir);

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            MyFileUtil.writeSomeLinesToFile(destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stream<String> content = null;

        try {
            Files.lines(destFile);
            content.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();

        } finally{
            content.close();
        }

        try {
            Files.copy(destFile, Paths.get(destDir.resolve("copy_test").toUri()));

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.deleteIfExists(destDir);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
