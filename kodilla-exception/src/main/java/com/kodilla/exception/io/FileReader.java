package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile(){

        ClassLoader loader = getClass().getClassLoader();
        File file = new File(loader.getResource("file/names.txt").getFile());

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))){

            System.out.println("DONE!!!");
            fileLines.forEach(System.out::println);

        } catch (IOException e){

            System.out.println("Oh oh oh. Something is wrong\n");

        } finally {

            System.out.println("I am gonna be here...always");

        }



    }
}
