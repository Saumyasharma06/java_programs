import java.util.*;
class Exception{
	static void abc() throws ArithmeticException{
	int a=10;
	int b=a/0;
	System.out.println(b);
	}
public static void main(String args[]){
try{
	abc();
	System.out.println("cannot divide by zero");
}
catch(ArithmeticException e){
System.out.println(e);
}
}
}



