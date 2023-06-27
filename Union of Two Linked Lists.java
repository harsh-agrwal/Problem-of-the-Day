class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    TreeSet<Integer> ts = new TreeSet<>();
	    while(head1 != null){
	        ts.add(head1.data);
	        head1 = head1.next;
	    }
	    while(head2 != null){
	        ts.add(head2.data);
	        head2 = head2.next;
	    }
	    Node ans = new Node(-1);
	    Node temp = ans;
	    for(Integer i : ts){
	        temp.next = new Node(i);
	        temp = temp.next;
	    }
	    return ans.next;
	}
}
