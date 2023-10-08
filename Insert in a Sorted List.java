class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        
        Node newNode = new Node(key);
        if(head1 == null){
            return newNode;
        }
        
        if(head1.data >= key){
            newNode.next = head1;
            return newNode;
        }
        Node curr = head1;
        while(curr.next != null && curr.next.data < key){
            curr = curr.next; 
        }
        if(curr.next == null){
            curr.next = newNode;
            return head1;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head1;
    }
}
