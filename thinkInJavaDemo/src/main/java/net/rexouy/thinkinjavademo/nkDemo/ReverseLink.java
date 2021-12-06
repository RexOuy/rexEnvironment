package net.rexouy.thinkinjavademo.nkDemo;

import org.w3c.dom.NodeList;

public class ReverseLink {

    private class ListNode{
        int value;
        ListNode next;
        ListNode(int value) {
            this.value = value;
        }
    }

    //构造
    public ListNode setLink(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode tmp;
        for (int i=1;i<arr.length;i++) {
            add(arr[i],head);
        }
        return head;
    }

    //单链表新增点
    public void add(int value,ListNode head) {
        ListNode newNode = new ListNode(value);
        ListNode tmp = head;
        if (tmp.next!=null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }

    //单链表翻转
    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null) {
            ListNode curNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return pre;
    }

    public static void main(String[] args) {
        ReverseLink reverseLink = new ReverseLink();
        ListNode head = reverseLink.setLink(new int[]{1,2,3});
        System.out.println(head.next.next.value);
        ListNode pre = reverseLink.reverse(head);
        System.out.println(pre.next.next.value);

    }
}
