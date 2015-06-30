/**
 * Created by mogargaa65 on 30/06/2015.
 *
 * http://www.geeksforgeeks.org/microsoft-interview-experience-set-55-for-software-engineer-2/
 */
public class ZigZag {

    public static void main (String[] args) {
        ZigZag gfg = new ZigZag();

        Node t1 = new Node(1);
        Node t2 = new Node(2);
        Node t3 = new Node(3);
        Node t4 = new Node(4);
        Node t5 = new Node(5);
        Node t6 = new Node(6);
        Node t7 = new Node(7);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;

        gfg.zigzag(t1);
    }


    public void zigzag(Node root) {

        stack s1 = new stack(), s2=new stack();
        int flag = 1;

        s1.push(root);
        while (!s1.isEmpty() || !s2.isEmpty()) {

            if(flag==1)  // 1) s1 to be parsed and children to be put in s2. AND. Left first
            {
                while(!s1.isEmpty()) {
                    Node currentNode = s1.pop();
                    System.out.println(currentNode.data);
                    if(currentNode.left!=null)
                        s2.push(currentNode.left);
                    if(currentNode.right!=null)
                        s2.push(currentNode.right);
                }
                flag=2;
            }
            else if(flag==2)  // 1) s2 to be parsed and children to be put in s1. AND. Right first
            {
                while(!s2.isEmpty()) {
                    Node currentNode = s2.pop();
                    System.out.println(currentNode.data);
                    if(currentNode.right!=null)
                        s1.push(currentNode.right);
                    if(currentNode.left!=null)
                        s1.push(currentNode.left);
                }
                flag=1;
            }
        }

    }

    static class stack {

        Node first = null;

        public Node pop() {
            Node toReturn = first;
            if(first!=null)
                first = first.next;

            return toReturn;
        }

        public void push(Node node) {
            if(node!=null) {
                node.next = first;
                first = node;
            }
        }

        public boolean isEmpty() {
            if(first==null)
                return true;
            else
                return  false;
        }
    }

    static class  Node {
        int data;
        Node left, right, next;

        Node(int d) {
            data = d;
            left = null; right=null;
        }
    }
}
