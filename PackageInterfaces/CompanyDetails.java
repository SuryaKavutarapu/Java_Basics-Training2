import persondetails.EmployeeDetails;
import persondetails.StudentDetails;

class CompanyDetails{
  public static void main(String []args){
     System.out.println("===============Orcheys IT Services==================");

      System.out.println("\n#Eductaion Details");
      new StudentDetails().input(args[0],args[1],args[2]);
      System.out.println("\n#Employee Details");
      new EmployeeDetails().input(args[3],args[4],args[5]);
      System.out.println("\n===============Orcheys IT Services==================");
  }/*method main programm execution starts from here*/
}/*class CompanyDetails*/