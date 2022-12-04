public class Character{
  public boolean alphauppercase(char ch){
    boolean b=false;
    if(ch>='A'&& ch<='Z'){
      b=true;
    }
    return b;
    
  }
  public boolean alphalowercase(char ch){
    boolean c=false;
    if(ch>='a'&& ch<='z'){
      c=true;
  }
    return c;
  }
  public boolean alphabetornot(char ch){
    boolean d=false;
    if((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z')){
      d=true;
    }
      return d;
  }
  public static void main(String args[]){
    Character a=new Character();
    boolean b=a.alphauppercase('B');
    boolean c=a.alphalowercase('c');
    boolean d=a.alphabetornot('d');
    
    if(b){
      System.out.println("uppercase alphabet");
    }
    else{
      System.out.println("lowercase alphabet");
    }
    
   if(c){
       System.out.println("lowercase alphabet");
    }
    else{
      System.out.println("uppercase alphabet");
    }
     if(d){
      System.out.println(" alphabet");
    }
    else{
      System.out.println("not alphabet");
    }
    
    
  }
}
