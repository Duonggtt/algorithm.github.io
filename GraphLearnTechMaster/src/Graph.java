import java.util.*;

public class Graph {

    public static void main(String[] args) {

//        int[][] graph = new int[7][7];
//        for(int i = 0;i<7;i++) {
//            for(int j = 0;j< 7;j++) {
//                graph[i][j] = 0;
//            }
//        }
//        graph[0][1] = 1;
//        graph[1][0] = 1;
//        graph[1][2] = 1;
//        graph[2][1] = 1;
//        graph[1][3] = 1;
//        graph[3][1] = 1;
//        graph[1][4] = 1;
//        graph[4][1] = 1;
//        graph[2][5] = 1;
//        graph[5][2] = 1;
//        graph[5][3] = 1;
//        graph[3][5] = 1;
//        graph[4][6] = 1;
//        graph[6][4] = 1;
//        Duyet_BFS(0,graph);
//        Duyet_DFS(0,graph);
//        Duyet_DFSDQ(0,graph);
        int[] num = {25,64,9,4,100};
        System.out.println(pickGifts(num, 4));
    }

    public static void Duyet_DFS(int u,int[][] graph) {
        Stack<Integer> stack = new Stack();
//        System.out.println(u);
        int[] A = new int[7];
        A[u] = 1;
        stack.push(u);
        while(!stack.isEmpty()) {
            int v = stack.pop();
            System.out.println(v);
            for(int i =0;i<A.length;i++) {
                if(graph[v][i] == 1 && A[i] == 0) {
                    stack.push(i);
                    A[i] = 1;
                }
            }
        }
    }

    public static void Duyet_DFSDQ(int u,int[][] graph) {
        System.out.println(u);
        int[] A = new int[7];
        A[u] = 1;
        for(int i =0;i< A.length;i++) {
            if(graph[u][i] == 1 && A[i] == 0) {
                Duyet_DFSDQ(i,graph);
            }
        }
    }

    public static void Duyet_BFS(int u,int[][] graph) {
        Queue<Integer> queue = new ArrayDeque<>();
        int[] A = new int[7];
        A[u] = 1;
        queue.add(u);
        while(!queue.isEmpty()) {
            int v = queue.remove();
            System.out.println(v);
            for(int i =0;i<A.length;i++) {
                if(graph[v][i] == 1 && A[i] == 0) {
                    queue.add(i);
                    A[i] = 1;
                }
            }
        }
    }

    public static long pickGifts(int[] gifts, int k) {

        Arrays.sort(gifts);
        long res = 0;
        int max =0;
        for(int i = k;i>0;i--) {
            gifts[gifts.length-1] = (int) Math.floor(Math.sqrt(gifts[gifts.length-1]));
            Arrays.sort(gifts);
        }
        for(int num : gifts) {
            res += num;
        }
        return res;
    }

}
