import java.util.Scanner;
public class Max{
  public void big2(int a,int b){
  if(a>b){
    System.out.println("a is big");
  }
    else{
      System.out.println("b is big");
      
    }
  
  
}
  public void big3(int a,int b,int c){
    if(a>b && a>c){
      System.out.println("a is big");
      
    }
    else if(b>c){
      System.out.println("b is big");
    }
    else
    {
      System.out.println("c is big");
    }
      
    }
  
  public static void main(String args[]){
    Max m=new Max();
    m.big2(1,2);
    m.big3(1,2,3);
    
  }
}