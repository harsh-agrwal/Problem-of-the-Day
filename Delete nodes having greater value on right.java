class Solution
{
    Node compute(Node head)
    {
        Node temp=head.next;
        while(temp!=null){
            if(temp.data>head.data)
                head=temp;
            else temp=temp.next;    
        }
        temp=head;
        while(temp.next!=null){
            Node max=temp.next;
            Node x=max.next;
            while(x!=null){
                if(x.data>max.data)
                    max=x;
                else x=x.next;    
            }
            temp.next=max;
            temp=max;
        }
        return head;
    }
}
