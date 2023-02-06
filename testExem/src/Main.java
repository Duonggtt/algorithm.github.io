import java.util.*;

public class Main {
    public static void main(String[] args) {
        char[][] grid = new char[5][6];
        for(int i = 0;i<grid.length;i++) {
            for(int j = 0;j< grid.length;j++) {
                grid[i][j] = '0';
            }
        }
        grid[0][0] = '1';
        grid[0][1] = '1';
        grid[0][2] = '1';
        grid[0][3] = '1';
        grid[1][0] = '1';
        grid[1][1] = '1';
        grid[1][3] = '1';
        grid[2][0] = '1';
        grid[2][1] = '1';
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int ans = 0;
        for(int i =0;i<grid.length;i++) {
            for(int j = 0;j< grid.length;j++) {
                if(grid[i][j] == '1') {
                    if(grid[i][j+1] == '0'&& grid[i+1][j] == '0' &&grid[i][j-1] == '0' ) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            Stack<Integer> dfs = new Stack<>(); dfs.add(0);
            HashSet<Integer> seen = new HashSet<Integer>(); seen.add(0);
            while (!dfs.isEmpty()) {
                int i = dfs.pop();
                for (int j : rooms.get(i))
                    if (!seen.contains(j)) {
                        dfs.add(j);
                        seen.add(j);
                        if (rooms.size() == seen.size()) return true;
                    }
            }
            return rooms.size() == seen.size();


        }


    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i =0;i<s.length();i++) {
            if(s.charAt(i) != '#') {
                st1.push(s.charAt(i));
            }
            if(!st1.isEmpty() && s.charAt(i) == '#') {
                st1.pop();
            }
        }
        for(int i =0;i<t.length();i++) {
            if(t.charAt(i) != '#') {
                st2.push(t.charAt(i));
            }
            if(!st2.isEmpty() && t.charAt(i) == '#') {
                st2.pop();
            }
        }
        if(st1.equals(st2)) {
            return true;
        }
        return false;
    }
}