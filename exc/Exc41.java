package com.tech.exc;

import java.util.*;

class StackUsingArray{
	int size=5;
	int arr[]=new int [size];
	int top;
	/*public StackUsingArray(int size, int i, int top) {
		super();
		this.size = size;
		this.arr = i;
		this.top = top;
	}*/
	
	public boolean isEmpty() {
		if(top<0) {
			return true;
		}
		else {
			return false;
		}
	}
	void Stack(){
		top=-1;
	}
	public int peek() {
		return arr[top];
	}
	public boolean push(int num) {
		if(top>(size-1)) {
			System.out.println("stack is full");
			return false;
		}
		else {
			arr[++top]=num;
			System.out.println("elements inserted"+num);
			return true;
		}
	}
	public int pop() {
      if(top<0) {
    	  System.out.println("underflow");
    	  return 0;
      }
		
		else {
			int elm=arr[top--];
			
			return elm;
		}
	
	}
	
}


public class Exc41 {

	public static void main(String[] args) {
		
		StackUsingArray stack=new StackUsingArray();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		
		stack.pop();
		stack.pop();
		


	}

}
