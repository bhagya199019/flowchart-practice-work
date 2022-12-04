import java.util.Scanner;

public class Noofevenodd {

    public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=s.nextInt();
     int arr[]=new int[n];
      int evcount=0,odcount=0;
     System.out.println("Enter "+n+" values");
     for(int i=0;i<arr.length;i++) {
         
         arr[i]=s.nextInt();
     }
     
     for(int i=0;i<arr.length;i++) {
         System.out.print(arr[i]+" ");
        if(arr[i]%2==0){
          evcount++;
        }
       else 
       {
          odcount++;
       }
       
     }

   System.out.println("No of  even values are"+evcount);
       System.out.println("No of odd values are"+odcount);

    }
}
      