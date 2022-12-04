import java.util.Scanner;
public class Mid {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
// {​​45,23,90,55,33}​​;5/2 ==>2
// {​​45,23,90,55,33,78}​​;(6/2)-1 ==>2, (6/2)-3
System.out.println("Enter array size");
int size=s.nextInt();
int arr[]=new int[size];
System.out.println("Enter "+size+" values");
for(int i=0;i<size;i++) {
arr[i]=s.nextInt();
}
if(size%2==0) {
  System.out.println("even mid value1 is"+arr[(size/2)-1]);
System.out.println("even mid value2 is " +arr[(size/2)]);
}
else {
System.out.println("odd mid value is"+arr[(size/2)]);
}
}
}

