package oops.com;

abstract class Plane
{
	abstract void takeOff();
	abstract void  Fly();
	abstract void Land();
}
 class Cargoplane extends Plane
{
	void takeOff()
	{
		System.out.println("Cargoplane takes off medium height");
	}
   void Fly()
   {
	   System.out.println("the cargoplane flies");
   }
   void Land()
   {
	   System.out.println("the cagoplane flies landing");
   }
}
 class Passangerplane extends Plane
 {
	 void takeOff()
		{
			System.out.println(" Passangerplanetakes off lower height");
		}
	   void Fly()
	   {
		   System.out.println("the Passangerplane flies");
	   }
	   void Land()
	   {
		   System.out.println("the Passangerplane flies landing");
	   }
 }
 class Fighterplane extends Plane
 {
	 void takeOff()
		{
			System.out.println("Fighterplane takes off lower height");
		}
	   void Fly()
	   {
		   System.out.println("the Fighterplane flies");
	   }
	   void Land()
	   {
		   System.out.println("the Fighterplane flies landing");
	   }
 }
 
 class Airport1
 {
	 void permit(Plane ref)
	 {
		 ref.takeOff();
		 ref.Fly();
		 ref.takeOff();
	 }
 }

public class Abstract1 {
public static void main(String[] args) {
	Cargoplane cp=new Cargoplane();
	Passangerplane pp=new Passangerplane();
	Fighterplane fp=new Fighterplane();
	
	Airport1 a=new Airport1();
	
	a.permit(cp);
	a.permit(pp);
	a.permit(fp);
}
}
