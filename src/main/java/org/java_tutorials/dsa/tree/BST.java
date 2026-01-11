package org.java_tutorials.dsa.tree;

import java.util.ArrayList;

public class BST {
    Node root;
    private final ArrayList<Integer> inner_list = new ArrayList<>();

    public void add(int d) {
        if (root == null) {
            root = new Node(d);
        } else {
            Node node = find_node(d);
            Node new_node = new Node(d);
            if (node.getLeft() == null)
                node.setLeft(new_node);
            else
                node.setRight(new_node);
        }
    }

    public boolean isPresent(int d) {
        Node temp_root = new Node(root.getData());
        while (true) {
            if (temp_root.getData() <= d) {
                if (temp_root.getData() == d) {
                    return true;
                }
                temp_root = temp_root.getLeft();
            } else {
                if (temp_root.getData() == d) {
                    return true;
                }
                temp_root = temp_root.getRight();
            }
        }
    }

    public void delete(int d) {

    }

    public String toString() {
        return "BST";
    }

    private Node find_node(int d) {
        Node temp_root = new Node(root.getData());
        while (true) {
            if (temp_root.getData() <= d) {
                if (temp_root.getLeft() == null) {
                    return temp_root;
                }
                temp_root = temp_root.getLeft();
            } else {
                if (temp_root.getRight() == null) {
                    return temp_root;
                }
                temp_root = temp_root.getRight();
            }
        }
    }

    private void node_traverse(Node temp_root) {
        if (temp_root != null) {
        }
    }
}