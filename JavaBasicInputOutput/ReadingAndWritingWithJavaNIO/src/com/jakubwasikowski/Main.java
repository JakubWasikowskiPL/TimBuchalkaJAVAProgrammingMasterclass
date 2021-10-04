package com.jakubwasikowski;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
//            FileInputStream file =new FileInputStream("data.txt"); //we create InputStream
//            FileChannel channel=file.getChannel(); //we are calling getChannel() to get a file channel, we only need 1 channel for both reading and writing
            Path dataPath= FileSystems.getDefault().getPath("data.txt");
            Files.write(dataPath,"\nLIne 5".getBytes("UTF-8"), StandardOpenOption.APPEND);
            List<String>lines= Files.readAllLines(dataPath);
            for (String line:lines){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
