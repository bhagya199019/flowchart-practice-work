import java.util.Scanner;

public class Large {
   
    public int findLargestNumber(int i, int j, int k) {
        
        if(i>j && i>k) {
            return i;
        }
        else if(j>k) {
            return j;
        }
        else {
            return k;
        }
        
        
    }
    
    public static void main(String[] args) {
    
        Large obj=new Large();
        int num=obj.findLargestNumber(123,415,56);
        System.out.println("Largest number: "+num);
    
    }

    
}