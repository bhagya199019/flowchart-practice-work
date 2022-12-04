public class Leap{
  public void year(int a){
    if((a%4==0&&a%100!=0)||(a%400==0)){
      System.out.println("a is leapyear");
      
    }
    else{
      System.out.println("a is not leapyear");
  }
  }
  public static void main(String args[]){
    Leap l=new Leap();
    l.year(2022);
  }
}