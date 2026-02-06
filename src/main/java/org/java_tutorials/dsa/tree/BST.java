package org.java_tutorials.dsa.tree;

import java.util.*;

public class BST {

    Node root;

    public void add(int d) {
        if (root == null) {
            root = new Node(d);
        } else {
            Node node = find_node(d);
            Node new_node = new Node(d);
            if (d <= node.getData())
                node.setLeft(new_node);
            else
                node.setRight(new_node);
        }
    }

    public boolean isPresent(int d) {
        Node temp_root = root;
        while (temp_root != null) {
            if (temp_root.getData() >= d) {
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
        return false;
    }

    public void delete(int d) {

    }

    private Node find_node(int d) {
        Node temp_root = root;
        while (true) {
            if (temp_root.getData() >= d) {
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

    private LinkedList<Integer> node_traverse1() {
        LinkedList<Integer> inner_list = new LinkedList<>();
        Node cur = root;
        Stack<Node> stack = new Stack<>();
        stack.push(cur);
        while (!stack.isEmpty()) {
            if (cur != null && cur.getLeft() != null) {
                stack.push(cur.getLeft());
                cur = cur.getLeft();
            } else {
                cur = stack.pop();
                inner_list.add(cur.getData());
                if (cur.getRight() != null) {
                    stack.push(cur.getRight());
                    cur = cur.getRight();
                } else {
                    cur = null;
                }
            }
        }
        return inner_list;
    }

    public LinkedList<Integer> node_traverse() {
        LinkedList<Integer> inner_list = new LinkedList<>();
        Node curr = root;
        while (curr != null) {
            if (curr.getLeft() == null) {
                inner_list.add(curr.getData());
                curr = curr.getRight();
            } else {
                Node pre = curr.getLeft();
                while (pre.getRight() != null && pre.getRight() != curr) {
                    pre = pre.getRight();
                }
                if (pre.getRight() == null) {
                    pre.setRight(curr);
                    curr = curr.getLeft();
                } else {
                    pre.setRight(null);
                    inner_list.add(curr.getData());
                    curr = curr.getRight();
                }
            }
        }
        return inner_list;
    }

    public Node get_root() {
        return root;
    }

    @Override
    public String toString() {
        return node_traverse1().toString();
    }
}