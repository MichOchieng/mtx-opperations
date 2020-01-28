import javax.swing.text.View;
import java.util.Random;

public class q2{
    private double x[][];
     

    public q2(double[][] x){
        this.x=x;
    }

    public void cTest(){
        cInit();
        view();
              
    }

    private void cInit(){
        int n = x.length;  
        int y = 1;      
        Random r = new Random();                  
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n; j++){
                if(i==0 || j ==0 || i ==n-1){
                    // Change to r.nextDouble();
                    x[i][j] = y;
                    y++;
                }
            }            
        }          
        
    }

    private void cStore(double result[]){      
        int n = x.length;
        int k = 1;        
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n; j++){                       
                result[j] = x[0][j];          
                if(j==0){
                    r[n+i] = x[k][0];  
                }       
                else if(i==n-1){
                    int p = j;
                    int m = (r.length -1)-j;
                    int w = (n-1)-(p-1);
                    if (j>0) {
                        result[m+1] = x[i][w];
                    }
                }                
            }
            if(k<5){
                k++;                    
            }            
        }        
        for(int i = 0;i<r.length;i++){
            System.out.println(result[i]);
        }
    }

    
    private void view(){
        int n = x.length;
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }

    
}