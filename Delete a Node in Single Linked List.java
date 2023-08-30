class GfG
{
    Node deleteNode(Node head, int x)
    {
     
    if(head==null) return null;
     
    if(x==1){
         head=head.next;
         return head;
    }
     
    int i=1;
    Node curr = head;
    Node prev = head;
    while(curr!=null){
         if(i==x){
             prev.next=curr.next;
             break;
         }
         prev=curr;
         curr=curr.next;
         i++;
    }
  return head;
    }
}
