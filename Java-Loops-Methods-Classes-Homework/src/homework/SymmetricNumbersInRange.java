package homework;

import java.util.Scanner;

public class SymmetricNumbersInRange {
 
        public static void main(String[] args) {
                       
                Scanner sc = new Scanner(System.in);
               
                int start = sc.nextInt();
                int end = sc.nextInt();
               
                String result = "";
               
                for (int i = start; i <= end; i++) {
 
                        if(isSymmetric(i)){
                                result += i + " ";
                        }
                }
                System.out.println(result);
        }
 
        private static boolean isSymmetric(int n) {
               
                boolean isSymmetric = true;
                char[] numberElements = Integer.toString(n).toCharArray();
               
                for (int i = 0, j = 1; i < numberElements.length; i++, j++) {
                        if(isSymmetric){
                                if(numberElements[i] != numberElements[numberElements.length - j]){
                                        isSymmetric = false;
                                }
                        }
                }
                return isSymmetric;
        }
}