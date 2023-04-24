package service;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;

public class FileService {

    private static final String filePath = "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\pao presentation 2023\\lab6\\ex1\\src\\audit\\audit.txt";

    //java 7
    public void read(){
        try(FileInputStream fileInputStream = new FileInputStream(filePath);
            BufferedInputStream bufferedInputStream =
                    new BufferedInputStream(fileInputStream)){
            String content = new String(bufferedInputStream.readAllBytes());
            System.out.println(content);
        }catch (IOException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }
    }

    //java 8
    public void read2() {
        Path path = Paths.get(filePath);
        try {
            Files.lines(path)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(String content) {
        try(FileOutputStream fileOutputStream = new FileOutputStream(filePath, true);
            BufferedOutputStream bufferedOutputStream =
                    new BufferedOutputStream(fileOutputStream)){
            bufferedOutputStream.write(content.getBytes(StandardCharsets.UTF_8));
        }catch (IOException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }
    }

    public void write2(String content){
        Path path = Paths.get(filePath);
        try {
            Files.writeString(path,content, APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
