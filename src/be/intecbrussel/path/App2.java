package be.intecbrussel.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class App2 {

    public static void main(String[] args) {

        Path p1 = Paths.get("C:/data/file.txt");
        Path p2 = Paths.get("C:/data/copyfile.txt");
        Path p3  = p1.getFileName();
        Path p4 = p1.relativize(Paths.get("file.txt"));

        System.out.println(p2.compareTo(p1));

        for(Path path : p1){
            System.out.println(path);
        }

        System.out.println("---------------");

        p2.forEach(System.out::println);

        System.out.println("---------------");


        System.out.println("This file is a .txt file: " + p4);
        System.out.println("This file is located under the C drive: " + p1.startsWith("C:/"));
    }
}