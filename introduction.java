//this introduction to methods hat is function
package methods;

public class introduction {
	
	public static void main(String[] args) {
		int first=23;
		int sec=34;
		int result= maxOf(first,sec);
		System.out.println("the greater no. is "+result);

		
}
	static int maxOf(int a , int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
}
