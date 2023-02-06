import java.util.HashSet;
import java.util.Set;

public class let {

    public static void main(String[] args) {
        int n = 3;
        int[][] trust = new int[2][2];
        trust[0][0] = 1;
        trust[0][1] = 3;
        trust[1][0] = 2;
        trust[1][1] = 3;
        System.out.println(findJudge(n,trust));
    }

    public static int findJudge(int n, int[][] trust) {
        Set<Integer> p = new HashSet<>();
        Set<Integer> jugde = new HashSet<>();
        for(int[] x : trust) {
            p.add(x[0]);
            jugde.add(x[1]);
        }
        jugde.removeAll(p);
        if(jugde.isEmpty()) {
            return -1;
        }
        int count = 0;
        int jugdeNum = 0;
        for(Integer s : jugde) {
            jugdeNum = s;
        }
        for(int i = 0;i< trust.length;i++) {
            if(trust[i][1] == jugdeNum) {
                count++;
            }
        }
        if(count == n - 1) {
            return jugdeNum;
        }
        return -1;
    }

}
