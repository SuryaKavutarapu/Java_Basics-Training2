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
  }/*method main programm execution starts from here*/
}/*class WrapperClass*/