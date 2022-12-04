
import java.util.Scanner;

public class Ispime {
   
    public boolean isPrime(int num) {
         boolean b=false;
         int count=0;
         for(int i=1;i<=num/2;i++) {
             if(num%i==0) {
                 count++;
             }
         }
         if(count==1) {
             b=true;
         }
         
         return b;
        }
    
    public static void main(String[] args) {
    
        Ispime obj=new Ispime();
        boolean b=obj.isPrime(30);
        if(b) {
            System.out.println("prime number");
        }
        else {
            System.out.println("not a prime number");
        }
    }
}