/**
 *  From java 1.5 version 
 * 
 *  we can able assign primitive value directly
 * 
 *  Boxing or Auto-Boxing
 * ========================
 * 
 *  conversion of primitive type to correcponding wrapper class object
 * 
 * 
 *  unboxing
 * =========
 * 
 * conversion of  wrapper class object to correcponding primitive type 
 */


class Boxing{
   public static void  showInt(int a){
       System.out.println(a+" int value");
   }

    public static void  showLong(Long a){
       System.out.println(a+" long value");
   }
 public static void main(String []args){
    Integer i = 10; //boxing or auto boxing

    int j = i ;//unboxing it will automatically converting wrapper class object to primitive data type 
   

    System.out.println(j);

    Short s = 20;

    showInt(s);//here show method is of type integer but jvm itself check for short method if there is short thats okay,if not it will do widening to the next level


    //reverse type

    long it = 10;

    showLong(it);

 }/*method main programm execution starts from here*/
}/*class Boxing*/