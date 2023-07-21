class Solution
{
     public static Node reverse(Node node, int k)
    {
        Node previous = null;
        Node current = node;
        Node next = null;
        
        int count = 0;
        
        //Your code here
        while(current!=null && count < k)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            
            count++;
        }
        
        if(next != null)
        {
            node.next = reverse(next,k);
        }
        
        return previous;
    }
}
