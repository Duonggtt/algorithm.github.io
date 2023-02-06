public class Leetcode200 {

    public int numIslands(char[][] grid) {
        int ans = 0;
        for(int i =0;i<grid.length;i++) {
            for(int j = 0;j< grid.length;j++) {
                if(grid[i][j] == '1') {
                    if(grid[i][j+1] == '0'&& grid[i+1][j] == '0' && grid[i][j-1] == '0'  ) {
                        ans++;
                    }
                    if(grid[i][j+1] == '0' && grid[i][j-1] =='0' && grid[i-1][j] == '0' && grid[i+1][j] == '0') {
                        ans++;
                    }
                }
            }
        }
        if(grid[grid.length-1][grid.length-1] == '1') {
            ans++;
        }
        return ans;
    }

}
