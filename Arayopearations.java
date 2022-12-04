import java.util.Scanner;

public class ArayOperations {
   
    int arr[]=new int[100];
    Scanner s=new Scanner(System.in);
    int n=0;
  int i=0;
    
    public void insertFirst() {
        System.out.println("Enter value");
        int value=s.nextInt();
        if(n==0) {
            arr[0]=value;
            n++;
        }
        else {
            for(int i=n;i>0;i--) {
                arr[i]=arr[i-1];
            }
            arr[0]=value;
            n++;
        }
    }

   public void insertLast() {
     
        System.out.println("Enter value");
        int value=s.nextInt();
        if(n==0) {
            arr[0]=value;
            n++;
        }
        else {
          
            arr[n]=value;
          n++;
            
        }
    }
  public void insertSpecific() {    // 23 12 90 44 22 55
        System.out.println("Enter index and value");
  //System.out.println("n value is:"+n);
    
        int index=s.nextInt();  //3
        int value=s.nextInt();  //40
        if(index<=n) {
            if(index==0) {
                arr[0]=value;
                n++;
            }
            else {
               for(int i=n;i>index;i--) {
                arr[i]=arr[i-1];
            
              }
               arr[index]=value;
                n++;
            }
        }
        else {
            System.out.println("invalid index");
        }
        
    }
  public void deletefirst(){
    for(int i=0;i<n;i++){
        arr[i]=arr[i+1];
          }
             n--;
           
  }
  public void deletelast(){
    n--;
  }
  

    public void display() {
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public void viewOptions() {
        int option=0;
        do {
        System.out.println("\n1. insert first");
        System.out.println("2. insert last");
        System.out.println("3. insert specific");
        System.out.println("4.Delete First");
        System.out.println("5.Delete Last");
        System.out.println("0. EXIT");
        System.out.println("Choose your option");
        option=s.nextInt();
        if(option==1) {
            insertFirst();
            display();
        }
          if(option==2){
            insertLast();
            display();
          }
        
          if(option==3){
          insertSpecific();
          display();
          
          }
           if(option==4){
          deletefirst();
          display();
          
          }
          
           if(option==5){
          deletelast();
          display();
          
          }
        }
        while(option!=0);
        
        
    }
    
    public static void main(String[] args) {
    
        ArayOperations obj=new ArayOperations();
        obj.viewOptions();
        
   
    }

}