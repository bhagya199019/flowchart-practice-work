import java.util.Scanner;

public class Operations {

    public void add() {
        int a=10,b=20;
        int c=a+b;
        System.out.println("addition is: "+c);
    }

    public void sub() {
        int a=10,b=20;
        int c=a-b;
        System.out.println("substration is: "+c);
    }

    public void mul() {
        int a=10,b=20;
        int c=a*b;
        System.out.println("multiplication is: "+c);
    }
    public void div() {
        int a=10,b=20;
        int c=a/b;
        System.out.println("division is: "+c);
    }
    public void viewOptions() {
        Scanner s=new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. multiplication");
        System.out.println("4. Division");
        System.out.println("choose your option");
        int option=s.nextInt();
        if(option==1) {
            add();
        }
        else if(option==2) {
            sub();
        }
        else if(option==3) {
            mul();
        }
        else if(option==4) {
            div();
        }
        else {
            System.out.println("invalid option");
        }
        
    }
    public static void main(String[] args) {
    
        Operations obj=new Operations();   
        obj.viewOptions();
    }
}