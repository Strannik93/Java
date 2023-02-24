package hw.seminar4.invertedListOutput;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        System.out.println(invertList(head));
    }

    public static String invertList(ListNode lNode) {
        StringBuilder newLine = new StringBuilder("");
        ListNode current = lNode;
        newLine.insert(0, current.val);
        while (current.next != null) {
            current = current.next;
            newLine.insert(0, current.val + " ");
        }
        return newLine.toString();
    }
}
