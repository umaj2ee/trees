package binarysearch;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
public class FirstNotSmaller {
	 public static int firstNotSmaller(int[] arr, int target) {
	        // WRITE YOUR BRILLIANT CODE HERE
	       /* int res=0;
	        for(int i : arr){
	         if(i>=target)
	             return res;
	          else
	              res++;
	        }
	        return res;*/
		 	int left = 0;
	        int right = arr.length - 1;
	        int boundaryIndex = -1;
	        while (left <= right) {
	            int mid = left  + (right - left) / 2;
	            if (arr[mid] >= target) {
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
	        int target = Integer.parseInt(scanner.nextLine());
	        int res = firstNotSmaller(arr, target);
	        System.out.println(res);
	    }
}
