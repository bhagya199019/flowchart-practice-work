import java.util.Scanner;

public class Print1ton{
  public void asc(){
      Scanner s=new Scanner(System.in);
    System.out.println("enter the number");
    int n=s.nextInt();
    System.out.println("the numbers from 10 to 1 are:");
    for(int i=1;i<=n;i++)
      {
        System.out.println(i);
        
      }
  }
  public void desc(){
      Scanner s=new Scanner(System.in);
    System.out.println("enter the number");
    int n=s.nextInt();
    System.out.println("the numbers from 10 to 1 are:");
    for(int i=n;i>=1;i--)
      {
        System.out.println(i);
        
      }
  }

  public static void main(String args[]){
    Print1ton p=new Print1ton();
   
    p.asc();
    p.desc();
  }
}