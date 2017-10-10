package Visitor.hm;

import java.util.ArrayList;
import java.util.List;

public class DisplayNodeVisitorTest {
    public static void main(String[] args) {
        List<Node> nodelists = new ArrayList<Node>();
        Root root = new Root("Topic", "NONE");
        Node nodeA = new Node(root, "A", "RIGHT");
        Node nodeA1 = new Node(nodeA, "A1", "RIGHT");
        Node nodeAA1 = new Node(nodeA1, "AA1", "RIGHT");
        Node nodeD = new Node(root, "D", "LEFT");
        Node nodeD1 = new Node(nodeD, "D1", "LEFT");

        nodelists.add(nodeA);
        nodelists.add(nodeA1);
        nodelists.add(nodeAA1);
        nodelists.add(nodeD);
        nodelists.add(nodeD1);

        System.out.println(root.getName() + ":");
        int rnum = 0;
        int lnum = 0;
        Node checkNode = null;
        String output = "";
        String nodename = "";
        System.out.println("Right nodes:");
        for (int i = 0; i < nodelists.size(); i++) {
            checkNode = nodelists.get(i);
            if (checkNode.getSide().equals("RIGHT")) {
                rnum++;
                if (checkNode.getRoot().getName().equals("Topic")) {
                    nodename = checkNode.getName();
                }
            }
        }
        output = rnum + " " + nodename + " nodes";
        System.out.println(output);

        System.out.println("Left nodes:");
        for (int i = 0; i < nodelists.size(); i++) {
            checkNode = nodelists.get(i);
            if (checkNode.getSide().equals("LEFT")) {
                lnum++;
                if (checkNode.getRoot().getName().equals("Topic")) {
                    nodename = checkNode.getName();
                }
            }
        }
        output = lnum + " " + nodename + " nodes";
        System.out.println(output);

    }

}
