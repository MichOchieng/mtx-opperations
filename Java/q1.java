import javax.swing.text.View;
import java.util.Random;

public class q1{
    private double x[][];

    public q1(double x[][]){
       this.x = x;
    }

    public void rowTest(){
        rowInit();
    }

    public void columnTest(){
        colInit();
    }

    private void rowInit(){
        int n = x.length;        
        Random r = new Random();
        long start = System.currentTimeMillis();       
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n; j++){
                x[i][j] = r.nextDouble();
            }            
        }
        long finish = System.currentTimeMillis();       
        System.out.println(" Total time: " + (finish-start) + "ms.");
    }

    private void colInit(){
        int n = x.length;
        Random r = new Random();
        long start = System.currentTimeMillis();  
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n; j++){
                x[j][i] = r.nextDouble();
            }            
        }
        long finish = System.currentTimeMillis();   
        System.out.println(" Total time: " + (finish-start) + "ms.");
    }


}