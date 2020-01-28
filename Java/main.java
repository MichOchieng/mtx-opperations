public class main{

    public static void main(String[] args) {
        // Question 1
        double arrSm[][] = new double[4000][4000];         
        double arrMd[][] = new double[8000][8000]; 
        double arrLg[][] = new double[16000][16000]; 
        double cArr[][] = new double[1000][1000]; ;
        int size = (cArr.length * 2) + (cArr.length - 2);  
        double cResult[] = new double[size];

        // QUESTION 1

        q1 x = new q1(arrSm);
        q1 y = new q1(arrMd);
        q1 z = new q1(arrLg);

        System.out.println("Small array: Row");
        x.rowTest();
        System.out.println("Medium array: Row");
        y.rowTest();
        System.out.println("Large array: Row");
        z.rowTest();
        // System.out.println();
        // System.out.println("Small array: Column");
        // x.columnTest();
        // System.out.println("Medium array: Column");
        // y.columnTest();
        // System.out.println("Large array: Column");
        // z.columnTest();

        // QUESTION 2
        
    }
}