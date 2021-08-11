package com.tech.day8.test;

abstract class Animal{
	abstract void animalShout();
}
class Dog extends Animal{

	@Override
	void animalShout() {
System.out.println("bow bow....");		
	}
	
}
class Horse extends Animal{

	@Override
	void animalShout() {
		System.out.println("he he he...");
	}
	
}
class Cat extends Animal{

	@Override
	void animalShout() {
  System.out.println("meow meow...");		
	}
	
}


public class TestProgram4 {

	public static void main(String[] args) {
       Animal dog=new Dog();
       dog.animalShout();
       Animal horse=new Horse();
       horse.animalShout();
       Animal cat=new Cat();
       cat.animalShout();
       
	}

}
