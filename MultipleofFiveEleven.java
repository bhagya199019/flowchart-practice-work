public class MultipleofFiveEleven{
  boolean b=false;
  public boolean multiple(int a){
    if((a%5==0) && (a%11==0)){
      b=true;
    }
    return b;
  }

public static void main(String args[]){
  MultipleofFiveEleven m=new MultipleofFiveEleven();
  boolean b=m.multiple(50);
  if(b){
    System.out.println("divisible by 5 and 11");
  }
  else{
    System.out.println("not divisible");
  }
}
}