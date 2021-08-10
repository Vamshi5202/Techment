package com.tech.composition;
class Engine{
	int id;
	String type;
	public Engine(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	
}
class Car{
	String name;
	int model;
	Engine engine;
	public Car(String name, int model, Engine engine) {
		super();
		this.name = name;
		this.model = model;
		this.engine = engine;
	}
	void display() {
		System.out.println("name:"+name);
		System.out.println("model:"+model);
		System.out.println("engine id:"+engine.id);
		System.out.println("engine type:"+engine.type);



	}
	
}



public class Main {

	public static void main(String[] args) {
		Engine eng=new Engine(8,"2stock");
		Car car=new Car("honda",2020,eng);
		car.display();

	}

}
