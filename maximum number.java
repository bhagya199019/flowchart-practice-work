import java.util.Scanner;
public class Max {

    public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=s.nextInt();
     int arr[]=new int[n];
      int max=arr[0];
     System.out.println("Enter "+n+" values");
     for(int i=0;i<arr.length;i++) {
         
         arr[i]=s.nextInt();
     }
     
     for(int i=0;i<arr.length;i++) {
      
       if(arr[i]>max){
         max=arr[i];
        
         
       }
     }
      System.out.println("max element is" +max);
    }
}