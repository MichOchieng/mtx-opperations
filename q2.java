

public class q2{

    private static int[][] mtx = new int[3][3]; 

    public static void cmtx(){
        int n = mtx.length;
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n; j++){
                if(i==0 || j==0 || i == n-1){
                    mtx[i][j] = 1;
                }
            }            
        }

        for(int i = 0;i<n;i++){
            for(int j = 0; j<n; j++){
                System.out.print(mtx[i][j]  + " ");
            }
            System.out.println();
        }
    }

}