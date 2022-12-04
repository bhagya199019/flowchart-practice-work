public class Printnvalues {

    public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=s.nextInt();
     int arr[]=new int[n];
     
     for(int i=0;i<=n-1;i++) {
         
         arr[i]=i+1;
        System.out.print(arr[i]+" ");
     }
     
     
        
        
    }

}