package trees;

import stacksandqueues.*;

/** creates a binary tree and performs traversals  
 * @author Lisa Miller
 * @since 11/13/25
 */
public class TraversalTree {
    private BinaryNode<String> root;
    
    /** constructor builds the tree */
    public TraversalTree() {
        // build the tree
        BinaryNode<String> n7 = new BinaryNode<>("G", null, null);
        BinaryNode<String> n6 = new BinaryNode<>("F", null, null);
        BinaryNode<String> n5 = new BinaryNode<>("E", null, null);
        BinaryNode<String> n4 = new BinaryNode<>("D", null, null);
        BinaryNode<String> n3 = new BinaryNode<>("C", n6, n7);
        BinaryNode<String> n2 = new BinaryNode<>("B", n4, n5);
        root = new BinaryNode<>("A", n2, n3);
    }
    
    /** public method to start inorder traversal */
    public void inorderTraversal() {
        inorderTraversal(root);
    }
    
    /** private helper method for inorder traversal
     * @param node current node
     */
    private void inorderTraversal(BinaryNode<String> node) {
        if (node != null) {
            System.out.println("go left");
            inorderTraversal(node.getLeftChild());
            System.out.println("visit: " + node.getData());
            System.out.println("go right");
            inorderTraversal(node.getRightChild());
        } else {
            System.out.println("hit null");
        }
    }

    public void preorderTraversal() {
        preorderTraversal(root);
    }

    private void preorderTraversal(BinaryNode<String> node) {
        if (node != null) {
            System.out.println("visit: " + node.getData());
            System.out.println("go left");
            preorderTraversal(node.getLeftChild());
            System.out.println("go right");
            preorderTraversal(node.getRightChild());
        } else {
            System.out.println("hit null");
        }
    }
    public void postorderTraversal() {
        postorderTraversal(root);
    }   
    private void postorderTraversal(BinaryNode<String> node) {
        if (node != null) {
            System.out.println("go left");
            postorderTraversal(node.getLeftChild());
            System.out.println("go right");
            postorderTraversal(node.getRightChild());
            System.out.println("go up");
            System.out.println("visit: " + node.getData());
            
        } else {
            System.out.println("hit null");
        }
    }
    /** displays the tree structure 
     * in a top-down unrotated fashion
     */
    public void displayTree() {
        breadthFirstDisplay();
    } 

    /** Breadth-first traversal (top-down) */
    public void breadthFirstDisplay() {
        if (root == null) {
            return;
        }

        LinkedQueue<BinaryNode<String>> queue = new LinkedQueue<>();
        queue.offer(root);
        int largestLevel = 0;
        int spacing = 0;
        String spaces = " ";

        while (!queue.empty()) {
            int levelSize = queue.size();
            if(levelSize > largestLevel) {
                largestLevel = levelSize;
            }
            for (int i = 0; i < levelSize; i++) {
                BinaryNode<String> node = queue.poll();
                if (node.getLeftChild() != null) {
                    queue.offer(node.getLeftChild());
                }
                if (node.getRightChild() != null) {
                    queue.offer(node.getRightChild());
                }
            }
           
        }
        queue.offer(root);

        while (!queue.empty()) {
            int levelSize = queue.size();
            spacing = largestLevel / levelSize;


            for (int i = 0; i < levelSize; i++) {
                BinaryNode<String> node = queue.poll();
                System.out.print(spaces.repeat(spacing) + node.getData() + spaces.repeat(spacing));

                if (node.getLeftChild() != null) {
                    queue.offer(node.getLeftChild());
                }
                if (node.getRightChild() != null) {
                    queue.offer(node.getRightChild());
                }
            }
            System.out.println(); // New line after each level
        }
    }

     /** Breadth-first traversal (top-down) */
    public void breadthFirstTraversal() {
        if (root == null) {
            return;
        }
        
        LinkedQueue<BinaryNode<String>>  queue = new LinkedQueue<>();
        queue.offer(root);
        
        while (!queue.empty()) {
            int levelSize = queue.size();
            
            for (int i = 0; i < levelSize; i++) {
                BinaryNode<String> node = queue.poll();
                System.out.print(node.getData() + " ");
                
                if (node.getLeftChild() != null) {
                    queue.offer(node.getLeftChild());
                }
                if (node.getRightChild() != null) {
                    queue.offer(node.getRightChild());
                }
            }
            System.out.println(); // New line after each level
        }
    }

    /** main method to test the traversals */
    public static void main(String[] args) {
        TraversalTree tree = new TraversalTree();

        System.out.println("Tree structure:");
        tree.displayTree();
        System.out.println();

        System.out.print("Inorder traversal: ");
        tree.inorderTraversal();
        System.out.println();
      
        tree.displayTree();
        System.out.println();

        System.out.print("Preorder traversal: ");
        tree.preorderTraversal();
        System.out.println();

        tree.displayTree();
        System.out.println();

        System.out.print("Postorder traversal: ");
        tree.postorderTraversal();
        System.out.println();
    }
}