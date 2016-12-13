package persondetails;
import detailsinterface.DetailsInterface;
public class EmployeeDetails implements DetailsInterface{
   String Ename,Edesg,Eid;

   public void setParms(String Ename,String Edesg,String Eid){
     this.Ename = Ename;
     this.Edesg= Edesg;
     this.Eid = Eid;
   }
   public void input(String x,String y,String z){
      setParms(x,y,z);
      display();
   }

   public void display(){
       System.out.println("Employee Name : "+Ename+"\nEmployee Desegnation: "+Edesg+"\nEmployee Id: "+Eid);
   }
}/*class EmployeeDetails*/