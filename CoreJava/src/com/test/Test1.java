package com.test;

class Exec0 extends Exception{
	
}
class Exec1 extends Exec0{
	
}
public class Test1 {

	public static void main(String[] args) {
		try{
			throw new Exec1();
		}catch(Exec0 e0){
			System.out.println("Ex0 cought");
		}catch (Exception e) {
			System.out.println("Exception cought");
		}
		/*finally{
			System.out.println("o0000000000");
		}*/
	}

}
