package Module1.Task4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Task4 {
    public static String currentLine;
    public static ArrayList<String> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
         doProgram();
    }

    public static void doProgram(){
        System.out.println(read("/home/akuzikov/Documents/task4"));
        System.out.println(write("/home/akuzikov/Documents/task5"));
        //        System.out.println(lines.toString());
    }

    public static String read(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
            while ((currentLine = reader.readLine()) != null) {
                stringBuilder.append(currentLine + "\n");
                lines.add(currentLine + "\n");
                Collections.sort(lines);
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

    public static String write(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(path));
            writer.write(lines.toString());
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


