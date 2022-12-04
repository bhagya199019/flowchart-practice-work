  import java.util.Scanner;
public class Max2 {

    public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=s.nextInt();
     int arr[]=new int[n];
      int max1=arr[0];
      int max2=arr[0];
     System.out.println("Enter "+n+" values");
     for(int i=0;i<arr.length;i++) {
         
         arr[i]=s.nextInt();
     }
     
     for(int i=0;i<arr.length;i++) {
       
       if(arr[i]>max1){
         max2=max1;
         max1=arr[i];

       }
       else {
         max2=arr[i];
       }
        
         
       }
     
      System.out.println("max element is" +max1);
   System.out.println(" second max element is" +max2);
    }
}