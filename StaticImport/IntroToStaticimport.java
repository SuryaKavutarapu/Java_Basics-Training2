/**
 *   ## static import 
 * 
 *  when ever a package class have some stativ methods and that methods should be access directly    to that current programme.to do that we have to use static import
 * 
 * 
 *  Syntax: 
 * 
 *     import ststic.packagename.ClassName;  
 * 
 * 
*/
import static java.lang.System.*;
//here System is class and it has static methods liks out.println();

/**
 *  In general we use System.out.println(); to print to the console
 * 
 *  but by declaring that Static import we can directly write out.println();
 */ 
class StaticImport{
  public static void main(String []args){
     System.out.println("general syntax");
     

     //this happend because of static import
     out.println("shorthanded syntax");
  }/*method main programm execution starts from here*/
}/*class StaticImport*/

