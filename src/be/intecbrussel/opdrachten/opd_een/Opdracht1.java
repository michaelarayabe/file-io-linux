package be.intecbrussel.opdrachten.opd_een;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class Opdracht1 {

    public static void main(String[] args) {

        List<String> content = new ArrayList<>();
        content.add("Some lines");
        content.add(" are added");

        Path destDir = Paths.get("C:/Data");
        Path destFile = destDir.resolve("test.txt");

        try {
            Files.createDirectories(destDir);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if(Files.notExists(destDir.resolve("test.txt"))){
                Files.createFile(destDir.resolve("test.txt"));
                System.out.println("File is created!");
            } else{
                System.out.println("File exixts!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.write(destFile, content, Charset.defaultCharset(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        PosixFileAttributes attributes  = null;

        try {
            attributes = Files.readAttributes(destFile, PosixFileAttributes.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        if(attributes != null){
            //System.out.println("Hidden: " + attributes.isHidden());
            //System.out.println("Archive: " + attributes.isArchive());
            //System.out.println("Read Only : " + attributes.isReadOnly());
            //System.out.println("System: " + attributes.isSystem());
            System.out.println("creation Time: " + attributes.creationTime());
            System.out.println("is Directory: " + attributes.isDirectory());
            System.out.println("is RegularFile: " + attributes.isRegularFile());

        }

        //content.forEach(System.out::println);



    }
}
