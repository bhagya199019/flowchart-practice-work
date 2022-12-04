import java.util.Scanner;

public class Ad4 {
   
     public int add(int a,int b,int c,int d) {
         int e=0;
         e=a+b+c+d;
         return e;
     }
    
    public static void main(String[] args) {
    
        Ad4 obj=new Ad4();
        int sum=obj.add(10, 20, 30, 40);
        System.out.println(sum);
    }
}