public class LinkedList {
    ListNode head;
    public void insertLast(int data){
        ListNode current = head;
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return ;
        }

        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;

    }

    public void show(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
