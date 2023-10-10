class Solution
{
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k){
        Node tar=findKey(root,target);
        HashMap<Node,Node> m=new HashMap<>();
        mapParent(root,m,target);
        return findKDistance(m,new HashMap<>(),root,tar,k);
    }
    private static void mapParent(Node root,HashMap<Node,Node> m,int target){
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            if(curr.left!=null){
                m.put(curr.left,curr);
                q.offer(curr.left);
            }
            if(curr.right!=null){
                m.put(curr.right,curr);
                q.offer(curr.right);
               
            }
        }
    }
    private static ArrayList<Integer> findKDistance(HashMap<Node,Node> m,HashMap<Node,Boolean> hs,Node root,Node tar,int k){
        Queue<Node> q=new LinkedList<>();
        q.offer(tar);
        hs.put(tar,true);
        int level=0;
        while(!q.isEmpty()){
            if(level==k) break;
            level++;
            int size=q.size();
            for(int i=0;i<size;i++){
                 Node curr=q.poll();
                if(curr.left!=null && hs.get(curr.left)==null){
                    q.offer(curr.left);
                    hs.put(curr.left,true);
                }
                if(curr.right!=null && hs.get(curr.right)==null){
                    q.offer(curr.right);
                    hs.put(curr.right,true);
                }
                if(m.get(curr)!=null && hs.get(m.get(curr))==null){
                    q.offer(m.get(curr));
                    hs.put(m.get(curr),true);
                }
            }
        }
        ArrayList<Integer> arr=new ArrayList<>();
        while(!q.isEmpty()){
            arr.add(q.poll().data);
        }
        Collections.sort(arr);
        return arr;
    }
    private static Node findKey(Node root,int target){
        if(root==null) return null;
        
        if(root.data==target){
            return root;
        }
        Node left=findKey(root.left,target);
        Node right=findKey(root.right,target);
        if(right==null) return left;
        return right;
    }   
}
