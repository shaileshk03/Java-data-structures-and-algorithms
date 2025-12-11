package Data_Structure_Algorithms_College.Binary_Trees;

/**
 * @author Shailesh
 */

public class BinaryTreesHeight {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    // Optional: O(n^2) diameter returning an int (nodes)
    public static int diameter(Node root) {
        if (root == null) return 0;
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        int throughRoot = height(root.left) + height(root.right) + 1;
        return Math.max(throughRoot, Math.max(leftDiameter, rightDiameter));
    }

    // Recommended: O(n) diameter using Info
    public static class Info {
        int diam; // in nodes
        int ht;   // in nodes
        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
        public static Info diameter(Node root) {
            if (root == null) return new Info(0, 0);
            Info left = diameter(root.left);
            Info right = diameter(root.right);
            int throughRoot = left.ht + right.ht + 1;
            int diam = Math.max(throughRoot, Math.max(left.diam, right.diam));
            int ht = Math.max(left.ht, right.ht) + 1;
            return new Info(diam, ht);
        }
    }

    // Subtree of another tree
    public static boolean isIdentical(Node node, Node subRoot){
      if ( node == null && subRoot == null){
          return true;
      } else if (node == null || subRoot == null || node.data != subRoot.data) {
          return false;
      }

      if(!isIdentical(node.left, subRoot.left)){
          return false;
      }

      if(!isIdentical(node.right, subRoot.right)){
          return false;
      }
      return true;
    }

    public static boolean isSubtree(Node root, Node subRoot){
        if(root == null){
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
              return true;
            }
        }

      return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        //   1
        //   / \
        //   2   3
        //  /\   /\
        // 4  5  6 7


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //System.out.println(height(root));

        // O(n) version:
        //System.out.println(Info.diameter(root).diam);

        // Or O(n^2) version:
        // System.out.println(diameter(root));

        //   2
        //  /\
        // 4  5

       Node subRoot = new Node(2);
       subRoot.left = new Node(4);
       subRoot.right = new Node(5);
       System.out.println(isSubtree(root, subRoot));
    }
}

