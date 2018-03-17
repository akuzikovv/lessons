package Lesson14;

import com.sun.org.apache.xml.internal.utils.res.StringArrayWrapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

import static Module1.Task4.Task4.currentLine;

public class Lesson14 {
    public static String currentLine;
    public static ArrayList<String> listOfShops = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        doProgram();
    }

    public static void doProgram(){
        System.out.println(readFile("/home/treward/Documents/task4"));
        System.out.println(writeFile("/home/treward/Documents/task5"));
        //        System.out.println(lines.toString());
    }


    public static String readFile(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
            while ((currentLine = reader.readLine()) != null) {
                stringBuilder.append(currentLine + "\n");
//                listOfShops.add(currentLine + "\n");
//                Collections.sort(listOfShops);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }

    public static String writeFile(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(path));
            writer.write(listOfShops.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }
}
