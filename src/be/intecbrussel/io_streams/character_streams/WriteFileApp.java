package be.intecbrussel.io_streams.character_streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WriteFileApp {

    public static void main(String[] args) {

        //FileWriter fWriter = null;

        Scanner kbd = new Scanner(System.in);



        /*while(true) {
            try {
                int choice = kbd.nextInt(); // mika
            } catch (InputMismatchException im) {
                kbd.next();
                im.printStackTrace();
            }
        } */

        Path pathTotallyNotNeededAtAll = Paths.get("MyTextFile.txt");

        File file = pathTotallyNotNeededAtAll.toFile();
        Path copy = file.toPath();

        System.out.println(pathTotallyNotNeededAtAll);
        System.out.println(file);

       try (FileWriter fWriter = new FileWriter(pathTotallyNotNeededAtAll.toFile());
            FileWriter fileWriter = new FileWriter("SecondFile.txt")){

            fWriter.write("Hello");
            fWriter.write("Again");

            fileWriter.write("this is also closed");

        } catch (IOException e){
            e.printStackTrace();
        }



        //-------
        /*
        try {
            fWriter = new FileWriter("MyTextFile.txt");

            fWriter.write("Hello");
            fWriter.write("World");

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try{
                if(fWriter != null) {
                    fWriter.close();
                }
            }catch (IOException io){
                System.out.println("Error closing file");
            }
            System.out.println("Job done, no problem!");
        } */
    }
}
