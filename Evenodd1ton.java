import java.util.Scanner;

public class Evenodd1ton{
  public void even(){
      Scanner s=new Scanner(System.in);
    System.out.println("enter the number");
    int n=s.nextInt();
     System.out.println("the even numbers are:");
 
    for(int i=1;i<=n;i++)
      {
       if(i%2==0){
        System.out.println(i);
        }
        
        
      }
  }
  
   public void odd(){
      Scanner s=new Scanner(System.in);
    System.out.println("enter the number");
    int n=s.nextInt();
     System.out.println("the odd numbers are:");
 
    for(int i=1;i<=n;i++)
      {
       if(i%2!=0){
        System.out.println(i);
        }
        
        
      }
  }

  public static void main(String args[]){
    Evenodd1ton p=new Evenodd1ton();
   
    p.even();
    p.odd();
  }
}