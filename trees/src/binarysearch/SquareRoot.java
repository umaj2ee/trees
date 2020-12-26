package binarysearch;
import java.io.IOException;
import java.util.Scanner;

public class SquareRoot {
	 public static int squareRoot(int n) {
	        // WRITE YOUR BRILLIANT CODE HERE
	        int left = 0;
	        int right = n;
	        int res = -1;
	        while (left <= right) {
	            int mid = (left + right) / 2;
	            if (mid * mid >= n) {
	                res = mid;
	                right = mid - 1;
	            } else {
	                left = mid + 1;
	            }
	        }
	        if (res * res > n) {
	            return res - 1;
	        }
	        return res;
	    }
	    public static void main(String[] args) throws IOException {
	        Scanner scanner = new Scanner(System.in);
	        int n = Integer.parseInt(scanner.nextLine());
	        int res = squareRoot(n);
	        System.out.println(res);
	    }
}
