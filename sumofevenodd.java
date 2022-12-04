import java.util.Scanner;

public class Sumofevenodd{

    public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=s.nextInt();
     int arr[]=new int[n];
      int evsum=0,odsum=0;
     System.out.println("Enter "+n+" values");
     for(int i=0;i<arr.length;i++) {
         
         arr[i]=s.nextInt();
     }
     
     for(int i=0;i<arr.length;i++) {
         
        if(arr[i]%2==0){
          evsum=evsum+arr[i];
        }
       else 
       {
          odsum=odsum+arr[i];
       }
       
     }

   System.out.println("sum of even values are"+evsum);
       System.out.println("sum of odd values are"+odsum);

    }
}
      