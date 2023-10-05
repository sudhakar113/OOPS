/*package oops.com;

class Plane
{
	//Overriden Method
	void TakeOff()
	{
		System.out.println("Plane is taking off");
	}
	void fly()
	{
		System.out.println("Plane Flies");
	}
}
class CargoPlane extends Plane
{
	//Overriden Method
	void fly()
	{
		System.out.println("CargoPlane flies at lower height");
	}
	//Specialized Method
	void CarryCargo()
	{
		System.out.println("CargoPlane carries goods");
	}
}
class PassangerPlane extends Plane
{
	//Overriden Method
	void fly()
	{
		System.out.println("PassangerPlane flies at medium height");
	}
	//Specialized Method
	void CarryPassenger()
	{
		System.out.println("PassengerPlane carry People");
	}
}

class FighterPlane extends Plane
{
	//Overriden Method
	void fly()
	{
		System.out.println("FighterPlaneflies at higher height");
	}
	//Specialized Method
	void CarryWeapons()
	{
		System.out.println("fighterPlane carries Weapons");
	}
}



public class Polymorphism {
public static void main(String[] args) {
	CargoPlane cp=new CargoPlane();
	PassangerPlane pp=new PassangerPlane();
	FighterPlane fp=new FighterPlane();
	
// To achive Polymorphism you have to do loose coupling
//loose cupling:Child class object referring to the Parent class reference
	//is called as loose cupling to achieve PloyMorphsim
	
	Plane ref;
	ref=cp; 
	ref.TakeOff();
	ref.fly();
	
	
//Parent type references cannot access Specialized Method.

//To achieve Specialized Method to do Downcasting.
	
//Downcasting:making a Parent type reference behave like a child type is called dowmcasting.
	
	((CargoPlane)(ref)).CarryCargo();
	
	ref=pp;
	ref.TakeOff();
	ref.fly();//1:3 is a PolyMorphsim

	
	
	((PassangerPlane)(ref)).CarryPassenger();
	
	ref=fp;
	ref.TakeOff();
	ref.fly();
	((FighterPlane)(ref)).CarryWeapons();
	
}
}*/
