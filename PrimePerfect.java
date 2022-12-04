    import java.util.Scanner;


public class PrimePerfect {

 
 public void isPrime() {
     Scanner s=new Scanner(System.in);
  System.out.println("enter the number");
  int n=s.nextInt();
    int count=0;
     for(int i=1;i<=n/2;i++){
  if(n%i==0){
    count++;
  }
     }
    if(count==1){
      
    System.out.println("n is prime");
      
    }
    else{
      System.out.println("n is not prime");
    }
  }
    
    
public void isPerfect() {
    Scanner s=new Scanner(System.in);
  System.out.println("enter the number");
  int n=s.nextInt();
  int sum=0;
  int temp=n;
  for(int i=1;i<=n/2;i++){
    if(n%i==0){
      sum=sum+i;
      
    }
  }
    System.out.println("sum of factors are"+sum);
    if(sum==temp){
      System.out.println("number is perfect");
    }
    else{
      System.out.println("number is not perfect");
    
  }
}

public void FindFactors()
{
    Scanner s=new Scanner(System.in);
  System.out.println("enter the number");
  int n=s.nextInt();
  for(int i=1;i<=n/2;i++){
    if(n%i==0){
      System.out.println(i);
    }
  }
}
  

  
public void programs() {
   Scanner s=new Scanner(System.in);
System.out.println("1. Prime number");
System.out.println("2. Perfect number");
System.out.println("3. find factors number");
System.out.println(" choose your options");
int option=s.nextInt();
  if(option==1){
    isPrime();
  }
  else if(option==2)
  {
    isPerfect();
  }
  else if(option==3)
  {
    FindFactors();
  }
else{
  System.out.println("invalid option");
}
  
    
  }


public static void main(String[] args) {
  Primeperfect obj=new Primeperfect();

  
obj.programs();
}
}
