package inheritance;

public class main {

	public static void main(String[] args) {
		
		teacher t=new teacher();
		//person p=t; 
		//is a upcasting in inheritance
		
		//teacher t=new teacher();
		// person p=t;
		//teacher t1=(teacher) p;
		//this is downcasting in inhertance
		t.name="mr.harry potter";
		singer s=new singer();
		s.name="Justin bieber";
		t.eat();
		t.walk();
		t.teach();
		s.singer();
		s.eat();

	}

}
