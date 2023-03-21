package rikkei.academy;

import jdk.nashorn.internal.ir.Node;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }
    }

    // cài phương thức add
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    // thêm đối tượng vào vị trí đầu tiên trong danh sách
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    // cài đặt phương thức get
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }
    // cài đặt phương thức prinList
    public void prinList(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
