package be.intecbrussel.io_streams.bytestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamApp {

    public static void main(String[] args) {

        String sourceFileName = "input.txt";
        String destFileName = "output.txt";

        try(FileOutputStream out = new FileOutputStream(destFileName);
            FileInputStream in = new FileInputStream(sourceFileName)) {

            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }

            System.out.println("Data is taken from: " + sourceFileName + " and put in " + destFileName);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}