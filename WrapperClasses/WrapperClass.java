class WrapperClass{
  public static void main(String []args){

    int a = 10;
   String S = Integer.toString(a); 
    
    Integer i  = new Integer("100");  //wrapper

    String A = i+"this is an string";//un wrapping

    System.out.println( i +"Here i is an object holding\n A value:"+a);
     System.out.println(S.length());
     System.out.println(A.length());
  }/*method main programm execution starts from here*/
}/*class WrapperClass*/