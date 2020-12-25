package binarysearch;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class BinarySearchGivenTarget {

	

	    public static int binarySearch(int[] arr, int target) {
	        // WRITE YOUR BRILLIANT CODE HERE
	    	int left = 0;
	        int right = arr.length - 1;
	    	while (left <= right) { // <= here because left and right could point to the same element, < would miss it
	            int mid = left + (right - left) / 2; // use `(right - left) /2` to prevent `left + right` potential overflow
	            // found target, return its index
	            if (arr[mid] == target) return mid;
	            if (arr[mid] < target) {
	                // middle less than target, discard left half by making left search boundary `mid + 1`
	                left = mid + 1;
	            } else {
	                // middle greater than target, discard right half by making right search boundary `mid - 1`
	                right = mid - 1;
	            }
	        }
	        return -1; // if we get here we didn't hit above return so we didn't find target
	    
	    }

	    public static void main(String[] args) throws IOException {
	        Scanner scanner = new Scanner(System.in);
	        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	        int target = Integer.parseInt(scanner.nextLine());
	        System.out.println(binarySearch(arr, target));
	    }

	}

	
	
	

