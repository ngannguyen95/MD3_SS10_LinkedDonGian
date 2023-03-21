package rikkei.academy;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("*******TESTTING******");
        MyLinkedList ll=new MyLinkedList(3);
        ll.addFirst(11);
        ll.addFirst(12);


        System.out.println(ll);
    }
}
