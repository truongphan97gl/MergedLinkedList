import org.w3c.dom.Node;

import java.sql.SQLOutput;

public class Main {
    public static void main(String args[]){
        LinkedList list1 = new LinkedList();
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(4);
        list1.show();
        System.out.println();
        LinkedList list2 = new LinkedList();
        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(4);
        list2.show();

        Solution sl = new Solution();
        ListNode list3 = sl.mergeTwoLists(list1,list2);


    }
}
