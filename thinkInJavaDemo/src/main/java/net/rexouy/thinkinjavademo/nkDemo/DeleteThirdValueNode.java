package net.rexouy.thinkinjavademo.nkDemo;

public class DeleteThirdValueNode {
    private class Node {
        public Node pri;
        public Node next;
        public int value;
    }

    public int getFinal(int size) {
        Node head = new Node();
        Node source = head;
        // 构建
        for (int i =0;i<size;i++) {
                Node node = new Node();
                node.value = i;
                node.pri = head;
                node.next = source.next;
                head.next = node;
                head = node;
            }
        // 晒除
        if (source.next.next!=null) {
            head = source;
            while (true) {
                head = head.next.next;
                head.next.next.pri = head;
                head.next = head.next.next;
                if (head.next == head.pri) {
                    break;
                }
            }
        }

        return head.value;
    }

    public static void main(String[] args) {
        DeleteThirdValueNode deleteThirdValueNode = new DeleteThirdValueNode();
        System.out.println(deleteThirdValueNode.getFinal(Integer.valueOf(1)));
    }
}
