
import static java.lang.Integer.*;
/**
 *   note : Don't confuse with syntax  i'm using static import to use method name directly
 * 
 *    insted of using Integer.methodname;
 *  
 */

class WrapperClass{
  public static void main(String []args){
    //# int wrapping and un wrapping
    int a = 10;  
    Integer i  = new Integer("1000");  //wrapper
    int b = i.intValue();//un wrapping into int value
    //narrowing i.e converting higher range to lower range
    byte by = i.byteValue();//un wrapping into byte value
    //widening  i.e converting lower range value to higher range
    long l = i.longValue();
    System.out.println("\n============ with out explictly type casting=======================\n");
    System.out.println(b+" An it value will be outputed");
    System.out.println(by+" byte value should be outputed and also there is some data loss");
    System.out.println("\n================ with explictly type casting=======================\n");
    /**
     *  in case we want to assign that interger value without data loss we have to explicitly typecaste
     * 
     *   byte by = i.intValue();
     *   // we will get error that incompatable data type because byte cannot hold int value so 
     *   
     * 
     *    we have to explictly like this 
     * 
     *    
     */
     //explicitly typecasting

     byte Bt = (byte) i.intValue();
     int  It = (int)i.longValue();
    System.out.println(Bt+" Byte value from integer\n"+It+" Integervalue from long");

    /**
     *  Comparing of objects is only posible with .equals method 
     */
    
    Integer x  = new Integer("1000");
    Integer y  = new Integer("100");
    //both has two differnt values so we get false when use equals()
System.out.println("\n================comparing objects with .equals method==================\n");
    System.out.println("Comparing objects using .equals method : "+x.equals(y));
System.out.println("\n================Max and min final variables ===========================\n");
    //## max value and Min value
    Integer range = new Integer("1000");
    System.out.println(range.MAX_VALUE);
    System.out.println(range.MIN_VALUE);
    
   /**
    *  valueOf method is similar  to parse method but there is some more additional functionality
       and conversion we can pase sting value and we covert int Binary,Octal,Decimal and hexadecimal
    */

    System.out.println("\n================valueOf method explained ==========================\n");
    //first type
    Integer e = valueOf(10);//integer type  
    //second type
    Integer F = valueOf("100");//string passing and conveting into int
    //third type
    Integer octal =valueOf("1010",8);
    Integer binary = valueOf("1010",2);
    Integer decimal = valueOf("1010",10);
    Integer hexadecimal = valueOf("1010",16);
    System.out.println(octal+" : coverted 10 in octal form\n"+binary+" : coverted 10 to binary\n"+decimal+" : coverted 10 in decimal form\n"+hexadecimal+" : coverted 10 in hexadecimal form");
    
    System.out.println("\n================ toString  method==================================\n");
    
    //type 1 converting int to string
    Integer tostring = valueOf("10");
    
    String Sdecimal = Integer.toString(tostring);
    String Sbinary = toBinaryString(tostring);
    String Shexadecimal = toHexString(tostring);
    String Soctal = toOctalString(tostring);

    System.out.println(Soctal+" : coverted 10 in octal form\n"+Sbinary+" : coverted 10 to binary\n"+Sdecimal+" : coverted 10 in decimal form\n"+Shexadecimal+" : coverted 10 in hexadecimal form");

     
  }/*method main programm execution starts from here*/
}/*class WrapperClass*/