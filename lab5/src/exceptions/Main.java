package exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath =  "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\pao presentation 2023\\lab5\\src\\exceptions\\audit\\audit.txt";
        /**
         * Throwable(parintele exceptilor)
         * checked
         * unchecked
         * errors
         */
        String msg = "Hello!!!!";

        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(msg);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //inchidere obiect deschis
        }

        /**
         * try with resources can be used
         * only on classes that implements
         * Closeable
         */


        try(FileWriter fileWriter = new FileWriter(filePath)){
            fileWriter.write(msg);
            fileWriter.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }

//        try{
//            iterate();
//        }
//        catch (RuntimeException e){
//            e.printStackTrace();
//        } catch (Ex1 e1){
//            e1.printStackTrace();
//        }catch (Ex2 e2){
//            e2.printStackTrace();
//        }

        try{
            iterate();
        } catch (Ex1 e1){
            e1.printStackTrace();
        }catch (Ex2 e2){
            e2.printStackTrace();
        } catch (RuntimeException e){
            e.printStackTrace();
        }

        try{
            iterate();
        }catch (Ex1 | Ex2 e){
            e.printStackTrace();
        } finally {

        }

    }


    public static void iterate() throws Ex1{
        for(int i =0; i < 10; i ++){
            if(i == 5){
                throw new Ex1("I = 5!!!!");
            }
        }
    }
}
