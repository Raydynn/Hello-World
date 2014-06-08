package homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class SumNumbersFromTextFile {
 
        public static void main(String[] args) {
 
                BufferedReader br = null;
                int result = 0;
                try {
 
                        String currentLine;
 
                        br = new BufferedReader(new FileReader("Input.txt"));
 
                        while ((currentLine = br.readLine()) != null) {
                                result += Integer.parseInt(currentLine);
                        }
                        System.out.println(result);
 
                } catch (IOException e) {
                        System.out.println("Error!");
                } finally {
                        try {
                                if (br != null){
                                        br.close();
                                }
                        } catch (IOException ex) {
                                ex.printStackTrace();
                        }
                }
               
        }
       
}