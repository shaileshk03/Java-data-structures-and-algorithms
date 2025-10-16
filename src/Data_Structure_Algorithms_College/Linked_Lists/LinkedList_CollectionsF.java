package Data_Structure_Algorithms_College.Linked_Lists;

import org.w3c.dom.Node;

import java.util.LinkedList;

/**
 * @author Shailesh
 */
public class LinkedList_CollectionsF {

    // Merge sort in Linked List, it also in Divide and Conquer.
    // Concepts are shown below in steps

    // Find out the Middle of LinkedList
    // Note if there are odd numbers of elements in LinkedList let's say 3 - the first two will come under the first half.
    // Divide the linked list into two part Left part and right part
    // Mid.next = null will remove the connection of first half and Last half as it will point to null.
    // Sort the fist half and last half
    // Merge them.

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addFirst(0);
        linkedList.addLast(3);
        System.out.println(linkedList);
    }
}
