import java.util.Scanner;
public class Min{

    public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=s.nextInt();
     int arr[]=new int[n];
    
     System.out.println("Enter "+n+" values");
     for(int i=0;i<arr.length;i++) {
         
         arr[i]=s.nextInt();
     }
       int min=arr[0];
     for(int i=0;i<arr.length;i++) {
       if(arr[i]<min){
         min=arr[i];
       }
     }
      System.out.println("min element is" +min);
    }
}