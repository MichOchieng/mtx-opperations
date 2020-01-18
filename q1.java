import javax.swing.text.View;
import java.util.Random;

public class q1{
    private double x[][];

    public q1(double x[][]){
       this.x = x;
    }

    protected void rowInit(){
        int n = x.length;        
        Random r = new Random();
        long start = System.nanoTime();        
        // start timer
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n; j++){
                x[i][j] = r.nextDouble();
            }            
        }
        long finish = System.nanoTime();       
        System.out.println("Total time: " + (finish-start) + "ns.");
    }

    protected void colInit(){
        int n = x.length;
        Random r = new Random();
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n; j++){
                x[j][i] = r.nextDouble();
            }            
        }
    }

    protected void view(){
        int n = x.length;
        Random r = new Random();
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n; j++){
                System.out.print(x[i][j]  + " ");
            }
            System.out.println();
        }
    }

}