package binarysearch;
import java.io.IOException;
import java.util.Scanner;
public class FindBoundary {

	public static int findBoundary(boolean[] arr) {
        // WRITE YOUR BRILLIANT CODE HERE
         int left=0;
        int right=arr.length-1;
        int boundaryIndex = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid]) {
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
        String[] input = scanner.nextLine().split(" ");
        scanner.close();
        boolean[] arr = new boolean[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = input[i].equals("true");
        }
        System.out.println(findBoundary(arr));
    }

}
