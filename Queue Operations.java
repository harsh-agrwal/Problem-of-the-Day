class Geeks{

    static void insert(Queue<Integer> q, int k){
        q.add(k);
    }
    
    static int findFrequency(Queue<Integer> q, int k){
        return Collections.frequency(q,k);
    }

}
