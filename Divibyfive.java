public class Divibyfive{
  public void fiveleven (int a){
    if(a%5==0 && a%11==0){
       System.out.println( "divisible by five and eleven");
    }
    else 
    {
       System.out.println( " not divisible by five and eleven");
    }
    
  }
  public static void main(String args[]){
    Divibyfive d=new Divibyfive();
    d.fiveleven(60);
   
  }
}