class Solution {
    public Node pairwiseSwap(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        while(head != null && head.next != null)
        {
            Node first = head;
            Node second = head.next;
            prev.next = second;
            first.next = second.next;
            second.next = first;
            prev = first;
            head = first.next;
        }
        return dummy.next;
    }
}
