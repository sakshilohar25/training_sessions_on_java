package sakshi.com;

public class functions {
	 public static void main(String[] args) {
		 
	 functions obj1=new functions();   //object create
	  add();
	  obj1.sub();  
	  int result=obj1.div();
	  
	  
	  
	 
	  
	 }
	 public static void add() {
		 int a=1;
		 int b=2;
		 int total=a+b;
		 System.out.println("add "+total);
	 }
	 public void sub() {
		 int a=1;
		 int b=2;
		 int total=a-b;
		 System.out.println("sub "+total);
		 
	 }
	 public int div() {
		 int a=1;
		 int b=2;
		 int total=a/b;
		 System.out.println("div "+total);
		 return total;
		 
		 
	 }

}
