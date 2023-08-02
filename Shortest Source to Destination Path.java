class Pair {
    int weight;
    Node node;
    Pair(int weight, Node node) {
        this.weight = weight;
        this.node = node;
    }
}
class Node {
    int x;
    int y;
    Node (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Solution {
    boolean isPossible(int n, int m, int x, int y, int[][] A) {
        if (x < 0 || x >= n || y < 0 || y >= m) {
            return false;
        }
        else if (A[x][y] == 0) {
            return false;
        }
        else {
            return true;
        }
    }
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        if (A[0][0] == 0) {
            return -1;
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        pq.add(new Pair(0, new Node(0, 0)));
        boolean[][] vis = new boolean[N][M];
        vis[0][0] = true;
        int[][] dist = new int[N][M];
        for (int[] a : dist) {
            Arrays.fill(a, (int) 1e9);
        }
        dist[0][0] = 0;
        while (!pq.isEmpty()) {
            Pair currPair = pq.poll();
            Node currNode = currPair.node;
            int weight = currPair.weight;
            int x = currNode.x;
            int y = currNode.y;
            int[] dx = {0, 1, 0, -1};
            int[] dy = {-1, 0, 1, 0};
            
            for (int i = 0; i < 4; i++) {
                if (isPossible(N, M, x + dx[i], y + dy[i], A) && !vis[x + dx[i]][y + dy[i]]) {
                    if (dist[x + dx[i]][y + dy[i]] > weight + 1) {
                        dist[x + dx[i]][y + dy[i]] = weight + 1;
                        pq.add(new Pair(weight + 1, new Node(x + dx[i], y + dy[i])));
                    }
                }
            }
        }
        return dist[X][Y] == (int) 1e9 ? -1 : dist[X][Y];
    }
}
