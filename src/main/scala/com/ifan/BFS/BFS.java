package com.ifan.BFS;

import java.util.*;

public class BFS {
    class Node {
        int  value;
        List<Node> next;

        public Node(int value) {
            this.value = value;
            next = new ArrayList<Node>();
        }

    }

    public static int Bfs(Node root, Node target) {
        Queue<Node> queue = new LinkedList<Node>();
        Set<Node> used = new HashSet<Node>();
        int step = 0;

        queue.add(root);
        used.add(root);

        while (queue.size() != 0) {
            step = step + 1;
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node cur = queue.peek();

                if (cur == target) {
                    return step;
                }

                for (Node node : cur.next) {
                    if (!used.contains(node)) {
                        queue.add(node);
                        used.add(node);
                    }

                }

                queue.poll();

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        BFS bfs = new BFS();
        Node root = bfs.new Node(0);

        Node root1 = bfs.new Node(1);
        Node root2 = bfs.new Node(1);
        Node root3 = bfs.new Node(1);

        Node root4 = bfs.new Node(2);
        Node root5 = bfs.new Node(2);

        Node root6 = bfs.new Node(3);

        root.next.add(root1);
        root.next.add(root2);
        root.next.add(root3);

        root1.next.add(root4);
        root1.next.add(root5);

        root2.next.add(root6);
        root5.next.add(root6);

        System.out.println(BFS.Bfs(root,root6));


    }


}
