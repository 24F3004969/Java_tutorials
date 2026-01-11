package org.java_tutorials.tuition.shahir.part_1.tutorials_14;

public record Node(int value, Integer left, Integer right) {

}

class Root {
    static Node[] tree = new Node[15];

    public static void main(String[] args) {
        tree[0] = new Node(51, 1, 2);
        tree[1] = new Node(55, null, 3);
        tree[2] = new Node(35, 3, 4);
        tree[3] = new Node(59, null, null);
        tree[4] = new Node(75, null, 4);
        print_tree(tree, 0, 0);

    }

    static void print_tree(Node[] node, Integer l, Integer r) {
        if (l != null)
            System.out.print(node[l].value() + "  ");
        if (r != null)
            System.out.println(node[r].value() + "  ");
        if ((l != null && r != null))
            if (node[l].left() != null
                    || node[l].right() != null)
            print_tree(node, node[l].left(), node[l].right());
        else if (node[r].left() != null
                || node[r].right() != null)
            print_tree(node, node[r].left(), node[r].right());
    }
}