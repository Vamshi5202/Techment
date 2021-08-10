package com.tech.oopassignment;
interface Polygon{
	void calcArea();
	void calcPeri();
}
class Square implements Polygon{
	float side;

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println("Square Area:"+side*side);
		
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		System.out.println("Square perimeter:"+4*side);
	}
}
class Rectangle implements Polygon{
	float length;
	float breadth;
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Area:"+breadth*length);
	}
	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Perimeter:"+2*(length+breadth));
	}
}


public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Square square=new Square();
     square.side=20;
     square.calcArea();
     square.calcPeri();
     
     Rectangle rectangle=new Rectangle();
     rectangle.breadth=20;
     rectangle.length=89;
     rectangle.calcArea();
     rectangle.calcPeri();
	}

}
