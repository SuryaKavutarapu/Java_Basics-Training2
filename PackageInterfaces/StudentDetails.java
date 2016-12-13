package persondetails;
import detailsinterface.DetailsInterface;
public class StudentDetails implements DetailsInterface{
   String Sname,Sbranch,Sid;

   public void setParms(String Sname,String Sbranch,String Sid){
     this.Sname= Sname;
     this.Sbranch= Sbranch;
     this.Sid = Sid;
   }
   public void input(String x,String y,String z){
      setParms(x,y,z);
      display();
   }

   public void display(){
       System.out.println("Student NamS: "+Sname+"\nStudent Branch: "+Sbranch+"\nStudent Id: "+Sid);
   }
}/*class StudentDetails*/