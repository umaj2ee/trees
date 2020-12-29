package dfs;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class MaxDepthOfTree {
	private static int depth=0;
	 public static int getMaxTreeDepth(Node root) {
	        // WRITE YOUR BRILLIANT CODE HERE
		 if (root == null) return 0;
	        return Math.max(getMaxTreeDepth(root.left), getMaxTreeDepth(root.right)) + 1;
		 
	    }

	    /** Driver class, do not change **/
	    static class Node {
	        int val;
	        Node left, right;

	        public Node(int val) {
	            this.val = val;
	        }

	        public static Node buildTree(Iterator<String> iter) {
	            String nxt = iter.next();
	            if (nxt.equals("x")) return null;
	            Node node = new Node(Integer.parseInt(nxt));
	            node.left = buildTree(iter);
	            node.right = buildTree(iter);
	            return node;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Node root = Node.buildTree(Arrays.stream(scanner.nextLine().split(" ")).iterator());
	        scanner.close();
	        System.out.println(getMaxTreeDepth(root));
	    }

}
