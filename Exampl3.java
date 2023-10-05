package oops.com;

import java.util.Scanner;

abstract class Animal
{
	String color;
	String name;
	abstract public void run();
	abstract public void bark();
	String eat="the animal eats veg and nonVeg";
	public void eat()
	{
		System.out.println("the animal eatas " + eat );
	}

}

class Dog extends Animal
{
	private int cost;
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dog name");
		name=sc.nextLine();
		System.out.println("enter the dog color");
     	color=sc.nextLine();
     	System.out.println("the dog cost is");
     	cost=sc.nextInt();
		
	}

	@Override
	public void bark() {
		System.out.println("the dog barking bow bow");
	}
	
}
class Cat extends Animal
{
	private int cost;
    @Override
	public void run() {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cat name");
		name=sc.nextLine();
		System.out.println("enter the cat color");
     	color=sc.nextLine();
     	System.out.println("the cat cost is");
     	cost=sc.nextInt();
    	
    	
    	
    	
	}

	@Override
	public void bark() {
		System.out.println("the cat bark mew mew");
		
	}
	
}

class Food
{
	void permit(Animal ref)
	{
		ref.eat();
		ref.run();
		ref.bark();
	}
}

public class Exampl3 {
	public static void main(String[] args) {
		Dog d=new Dog();
		Cat c=new Cat();
		
		Food f=new Food();
		f.permit(d);
		f.permit(c);
		
	}

}



