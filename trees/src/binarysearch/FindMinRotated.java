package binarysearch;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
public class FindMinRotated {
	 public static int findMinRotated(int[] arr) {
	        // WRITE YOUR BRILLIANT CODE HERE
	        int left = 0;
	        int right = arr.length - 1;
	        int boundaryIndex = -1;
	        while (left <= right) {
	            int mid = (left + right) / 2;
	            // if <= last element, then belongs to lower half
	            if (arr[mid] <= arr[arr.length - 1]) {
	                boundaryIndex = mid;
	                right = mid - 1;
	            } else {
	                left = mid + 1;
	            }
	        }
	        return boundaryIndex;
	    }
	    public static void main(String[] args) throws IOException {
	        Scanner scanner = new Scanner(System.in);
	        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	        int res = findMinRotated(arr);
	        System.out.println(res);
	    }
}
