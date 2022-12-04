public class VowelConsonent{
  public boolean vowcon(char ch){
  boolean b=false;
  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
    b=true;
  
  }
return b;
  }
public static void main(String args[]){
  VowelConsonent v=new VowelConsonent();
  boolean b=v.vowcon('H');
  if(b){
    System.out.println("vowel");
  }
  else{
    System.out.println("consonent");
  }
}
}