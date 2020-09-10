package be.intecbrussel.io_streams.character_streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderApp {

    public static void main(String[] args) {

        try(FileReader fileReader = new FileReader("MyTextFile.txt");
            BufferedReader reader = new BufferedReader(fileReader)){

            String line = null;

            while((line = reader.readLine()) != null){

                if(line.trim().equals("")){
                    line = "\n\t\t\t\t*** ooh white spaces ***\n";
                }

                System.out.println(line);
            }


        } catch (FileNotFoundException e) {
            System.err.println("File not found");


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Job is done!");
    }
}
