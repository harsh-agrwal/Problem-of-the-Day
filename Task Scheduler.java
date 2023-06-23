class Solution {
    static class Pair{
        char ch;
        int fre;
        Pair(char ch, int fre){
            this.ch = ch;
            this.fre = fre;
        }

    }
    static int leastInterval(int N, int K, char tasks[]) {
        if(K == 0) return tasks.length;
        HashMap<Character, Integer> map = new HashMap<>();
        LinkedList<Pair> list= new LinkedList<>();
        for(char c : tasks) map.put(c, map.getOrDefault(c, 0)+1);
        for(char c : map.keySet()) list.add(new Pair(c, map.get(c)));
        Collections.sort(list, (Pair p1, Pair p2)->p2.fre-p1.fre);
        int idle = (list.get(0).fre-1)*K;
        for(int i = 1 ; i < list.size() ; i++){
            idle = idle - Math.min(list.get(i).fre, list.get(0).fre-1);
        }
        return tasks.length+Math.max(idle, 0);
    }
}
