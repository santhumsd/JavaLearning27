package io.javabrainssrpingboot.task;


class A{
	 int i;
	A(){
		
	}
}
public class StringExample extends A{
     static int san;
     int i;
	public StringExample() {
		
		// TODO Auto-generated constructor stub
	}
	public StringExample(int x) {
		super();
		super.i=90;
		i=x;
		// TODO Auto-generated constructor stub
	}
	public StringExample(int x,int y) {
		super.i=x;
		i=y;
		// TODO Auto-generated constructor stub
	}
	{
		san+=1;
	}
	public static void main(String ...args) {
		
	  StringBuilder s1=new StringBuilder("hello1233");
	  String s2="hello";
        s1.append("kjsajshsakjkjsajsaksjk");
	
	  s2="lmans";
	  StringExample a = new StringExample(3);
	  System.out.println(s2);
	  System.out.println(s1);
	  StringExample s11=new StringExample();
	  StringExample s12=new StringExample();
	  StringExample s13=new StringExample();
	  StringExample s14=new StringExample(3);
	  StringExample s17=new StringExample(1,2);
	  System.out.println(san);
	  System.out.println(a.i);
	  System.out.println(s17.i);
	  
}
}
