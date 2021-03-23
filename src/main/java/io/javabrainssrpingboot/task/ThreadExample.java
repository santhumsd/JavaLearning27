package io.javabrainssrpingboot.task;

import java.util.Scanner;

class Mad implements Runnable {
	 Mad(String name){
		 
	 }
	 public void run() {
		try {
		System.out.println("in mad ");
			Thread.sleep(2000);
			System.out.println("getting out of  mad");
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
class Sad extends Thread {
	Sad(String name){
		super(name);
	}
	 public void run() {
		try {
		System.out.println("in sad "+this.getName());
			Thread.sleep(2000);
			System.out.println("getting out of  sad");
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {
		
		 Mad mad=new Mad("lop12345");
		 Thread t1=new Thread(mad);
		 Sad sad=new Sad("pop");
         t1.setName("lop12345");
         t1.start();
         sad.start();
         System.out.println("enter a string");
       
		Scanner scan=new Scanner(System.in);
         String s=scan.next();
         scan.close();
         int m=s.length();
         char org[]=new char[m];
         char rev[]=new char[m];
         for(int i=0;i<=m-1;i++) {
        	 rev[i]=s.charAt(m-1-i);
        	 org[i]=s.charAt(i);
        	 if(rev[i]==org[i]) {
        		 continue;
        	 }
        	 else {
        		 System.out.println("the given string "+s+" is not polindrome");
        		 System.exit(0);
        	 }
         }
         System.out.println("the given String "+s+" is polindrome");
         
	}

}
