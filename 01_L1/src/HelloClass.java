public class HelloClass {

	public String s;
	
	public static void main(String[] args){
		System.out.println("hello peepal..");
		System.out.println("addition result..."+add(1,2));
		HelloClass temp = new HelloClass();
		System.out.println(temp.greet("Priyatham"));
	}

	public HelloClass(){
		
	}
	public static int  add(int a , int b){
		return a+b;
	}	
	private String greet(String name){
		return "Hello "+name;	
	}
}

