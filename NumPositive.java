
public class NumPositive{
  public void pos(int a){
    if (a==0){
      System.out.println("a is zero");
    }
    else if(a>0){
      System.out.println("a is positive");
      
    }
    else{
      System.out.println("a is negative");
    }
  }

  public static void main(String args[]){
    NumPositive n= new NumPositive();
    n.pos(5);
    
  }
}