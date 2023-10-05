package oops.com;

class Plane1
{
	void TakeOff()
	{
		System.out.println("Plane is taking off");
	}
	void fly()
	{
		System.out.println("Plane is flying");
	}
	void land()
	{
		System.out.println("Plane is landing ");
	}
}


class CargoPlane1 extends Plane1
{
	void TakeOff()
	{
		System.out.println("CargoPlane is taking off longer runways");
	}
	void fly()
	{
		System.out.println("CargoPlane is flying at lower heights");
	}
	void land()
	{
		System.out.println("CargoPlane is landing longer on runway ");
	}
}
class PassengerPlane1 extends Plane1
{
	void TakeOff()
	{
		System.out.println("PassengerPlane is taking off medium runways");
	}
	void fly()
	{
		System.out.println("PassengerPlane is flying at medium heights");
	}
	void land()
	{
		System.out.println("PassengerPlane is landing medium  runway ");
	}
}
class FighterPlane1 extends Plane1
{
	void TakeOff()
	{
		System.out.println("FighterPlane is taking off shorter runways");
	}
	void fly()
	{
		System.out.println("FighterPlane is flying at higher heights");
	}
	void land()
	{
		System.out.println("FighterPlane is landing shorter  runway ");
	}
}

class Airport
{
	void permit(Plane1 ref)
	{
		ref.TakeOff();
		ref.fly();
		ref.land();
	}
}



public class Codeflexibility {
	public static void main(String[] args) {
		CargoPlane1 cp=new CargoPlane1();
		PassengerPlane1 pp=new PassengerPlane1();
		FighterPlane1 fp=new FighterPlane1();
		
		Airport a=new Airport();
		a.permit(cp);
		a.permit(pp);
		a.permit(fp);
	}

}
