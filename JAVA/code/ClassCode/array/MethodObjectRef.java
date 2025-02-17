import java.util.Scanner;

class MethodObjectRef {
	
	static MethodObjectRef objRef(MethodObjectRef o){
		o = MethodObjectRef.m;
		System.out.println(o);
	}
	
	public static void main(String[] args){
		
		MethodObjectRef m = new MethodObjectRef();
		objRef(m);
	}
}