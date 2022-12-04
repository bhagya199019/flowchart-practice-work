import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
    
        Scanner s=new Scanner(System.in);
                                        // {45,23,90,55,33};
        System.out.println("Enter array size");
        int size=s.nextInt();
        int rem=0,rev=0;
        int arr[]=new int[size];
        
        System.out.println("Enter "+size+" values");
        for(int i=0;i<size;i++) {
            arr[i]=s.nextInt();
        }
    
        for(int i=0;i<size;i++) {
            int temp=arr[i];
            while(arr[i]!=0) {
                rem=arr[i]%10;
                rev=rev*10+rem;
                arr[i]=arr[i]/10;
            }
            if(rev==temp) {
                System.out.print(rev+" ");
            }
            rev=0;
        }
         
        
        
    }

}