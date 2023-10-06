class Solution
{
    public static void rearrange(Node head)
    {
        if(head.next == null || head.next.next == null){
            return;
        }
        Node prev = head;
        Node curr = head.next;
        Node head2 = head.next;
        Node curr2 = head2;
        curr = curr.next;
        prev.next = curr;
        int count=0;
        while(curr != null && curr.next != null){
            count++;
            if(count%2==0){
                curr2.next= curr;
                curr2 = curr2.next;
                curr = curr.next;
                prev.next = curr;
            }else{
                curr = curr.next;
                prev = prev.next;
            }
        }
        if(curr!=null && curr.next==null){
            curr2.next= curr;
        }
        head2 = reverse(head2);
        prev.next = head2;
        return;
    }
    public static Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node prev = head;
        Node curr = head.next;
        Node next = curr.next;

        while(next != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next; 
        }
        curr.next = prev;
        head.next = null;
        head = curr;
        return head;
    }
}
