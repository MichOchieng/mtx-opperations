public class main{

    public static void main(String[] args) {
        // Question 1
        double arrSm[][] = new double[20][20];         
        double arrMd[][] = new double[200][200]; 
        double arrLg[][] = new double[5000][5000]; 
        q1 x = new q1(arrSm);
        q1 y = new q1(arrMd);
        q1 z = new q1(arrLg);
        System.out.println("Small array: Row");
        x.rowInit();
        System.out.println("Medium array: Row");
        y.rowInit();
        System.out.println("Large array: Row");
        z.rowInit();

        System.out.println("Small array: Column");
        x.colInit();
        System.out.println("Medium array: Column");
        y.colInit();
        System.out.println("Large array: Column");
        z.colInit();
        
    }
}