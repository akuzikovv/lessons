package Lesson9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
//throws IOException
    public static String read(String path) {

//        BufferedReader reader = null;
        StringBuilder stringBuilder = new StringBuilder();


            stringBuilder = new StringBuilder();
           try ( BufferedReader reader = new BufferedReader(new FileReader(path))){


            String currentString;

            while ((currentString = reader.readLine()) != null) {
                stringBuilder.append(currentString);
                stringBuilder.append("\n");
            }
            return stringBuilder.toString();
        }

//                reader.close();


            return stringBuilder.toString();
        }

    public static void main(String[] args) throws IOException {
        System.out.println(read("/home/treward/Documents/text"));
    }
}
