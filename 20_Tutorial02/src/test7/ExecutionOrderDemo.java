package test7;

//demo this class
class ExecutionOrder { 
    static {  
		System.out.println("static block #1 executed");   
	} 
    {  
		System.out.println("non-static block #1 executed");  
	} 
    ExecutionOrder() {  
		System.out.println("ExecutionOrder Constructor called");  
	} 
    public static void main(String args[]) { 
        System.out.println("Inside ExecutionOrder.Main() Method"); 
        new ExecutionOrder(); 
    } 
} 
//demo this class


class ExecutionOrderDemo {
    public static void main(String args[]) { 
        System.out.println("Inside Demo.Main() Method"); 
        new ExecutionOrder(); 
    } 	
}