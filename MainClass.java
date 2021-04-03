// java code only one main class 
// public void files are called methods(Functions)
//this code is just intro about class and objects....
package oops;

  class cat{
	  boolean hasfur;
	 String colour,breed;
	 int legs,eyes;
	 public void walk() {
		 System.out.println("cat is walking ");
	 }
	 public void eat() {
		 System.out.println("cat is Eating now");
	 }
	 public void description(){
		 System.out.println("my cat "+legs+" and"+eyes+" eyes");
	 }
  }

public class MainClass {

	public static void main(String[] args) {
		
		cat cat1=new cat();
		cat cat2=new cat();
		cat1.walk();
		cat1.eat();
		cat1.legs=4;
		cat2.legs=3;
		cat1.eyes=2;
		cat2.eyes=1;
		cat1.description();
		cat2.description();
		
		
	
	}

}
