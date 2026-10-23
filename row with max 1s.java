//binary search on 2d lc 2643 t.c ->O(m*n) s.c ->O(1)
class Solution {
    
    public int[] rowAndMaximumOnes(int[][] mat) {
        // int n= mat.length;
        // int ind = 0;
        // int max_cnt = 0;
        // for(int i=0;i<n;i++){
        //     int cnt_row = 0;
        //     for(int j=0;j<mat[i].length;j++){
                
        //         if(mat[i][j] == 1){
        //             cnt_row++;
        //         }
        //         if(cnt_row>max_cnt){
        //             max_cnt = cnt_row;
        //             ind = i;
        //         }
        //     }
        // }
        // return new int[] {ind,max_cnt};
        int[] res = {0, 0};
        int row = mat.length;

        for (int i = 0; i < row; i++){
            int count = 0;
            for (int j = 0; j < mat[i].length; j++){
                count += mat[i][j];
            }
            if (count > res[1]){
                res[0] = i;
                res[1] = count;
            }
        }
        return res;
    }
}
