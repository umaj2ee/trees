package dfs;

import java.io.IOException;
import java.util.Scanner;

public class Factorial {
	
 public static int getFactorial(int i) {
	 if (i >= 1)
         return i * getFactorial(i - 1);
     else
         return 1;
 }
 public static void main(String[] args) throws IOException {
     Scanner scanner = new Scanner(System.in);
     int n = Integer.parseInt(scanner.nextLine());
     int res = getFactorial(n);
     System.out.println(res);
 }
}
