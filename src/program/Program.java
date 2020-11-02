package program;

import java.io.BufferedReader;
import java.io.FileReader;

public class Program {
    public static void main(String[] args) {

        String path = "C:\\Windows\\System32\\drivers\\etc\\hosts";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            while (bufferedReader.readLine() != null){
                System.out.println(bufferedReader.readLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
