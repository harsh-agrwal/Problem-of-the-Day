class Solution
{
    public static Node modifyTheList(Node head)
    {
        ArrayList<Integer>list = new ArrayList<Integer>();
        if(head==null || head.next==null){
            return head;
        }
        Node temp=head;
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        temp=head;
        int n=list.size();
        int i=0;
        int j=n-1;
        int m=(n%2==1)?n/2:n/2-1;
        
        while(j>m){
            int temp1=list.get(i);
            list.set(i,list.get(j)-list.get(i));
            list.set(j,temp1);
            i++;
            j--;
        }
        i=0;
        while(temp!=null){
            temp.data=list.get(i);
            temp=temp.next;
            i++;
        }
        return head;
    }
}
