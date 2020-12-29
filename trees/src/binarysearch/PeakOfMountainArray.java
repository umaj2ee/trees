package binarysearch;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PeakOfMountainArray {
	public static int peakOfMountainArray(int[] arr) {
        // WRITE YOUR BRILLIANT CODE HERE
        int left = 0;
        int right = arr.length - 1;
        int boundaryIndex = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid == arr.length - 1 || arr[mid] >= arr[mid + 1]) {
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
        int res = peakOfMountainArray(arr);
        System.out.println(res);
    }
}
