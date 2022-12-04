import java.util.Scanner;
public class Prime{

    public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=s.nextInt();
     int arr[]=new int[n];
      int fcount=0;
      int i;
    
     System.out.println("Enter "+n+" values");
     for( i=0;i<arr.length;i++) {
         
         arr[i]=s.nextInt();
     }
      for( i=0;i<arr.length;i++)
        {
           for(int j=1;j<=arr[i]/2;j++)
           {
             if(arr[i]%j==0)
             {
              fcount++;
        }
      }
        
        
        
      if(fcount==1)
      {
        System.out.println("prime numbers are"+arr[i]);
      }
          fcount=0;
        
        }
        
      }
}