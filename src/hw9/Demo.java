package hw9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
    //throws IOException
    public static String read(String path) {

        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
            String currentString;
            while ((currentString = reader.readLine()) != null) {
                stringBuilder.append(currentString);
                stringBuilder.append("\n");
            }
        }
     catch (IOException e) {
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

    public static void main(String[] args) throws IOException {
        System.out.println(read("/home/akuzikovv/Documents/text"));
    }
}
