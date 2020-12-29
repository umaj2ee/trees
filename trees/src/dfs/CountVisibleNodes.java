package dfs;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class CountVisibleNodes {
	public static int countVisibleNodes(Node root) {
        // WRITE YOUR BRILLIANT CODE HERE
        return dfs(root, Integer.MIN_VALUE);
    }
    private static int dfs(Node root, int maxSoFar) {
        if (root == null) return 0;
        int total = 0;
        if (root.val >= maxSoFar) {
            total++;
        }
        // maxSoFar of the child node is the larger value of previous max and current node val
        total += dfs(root.left, Math.max(maxSoFar, root.val));
        total += dfs(root.right, Math.max(maxSoFar, root.val));
        return total;
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
        System.out.println(countVisibleNodes(root));
    }
}
