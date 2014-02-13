package com.strings;

public class NumberPatterns {

/*	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++)
			{
				System.out.println(j);
			}
			System.out.println();
		}
		
	}*/
	/* public static void main( String arg[]){
	        for(int i=1;i<=5;i++){
	 
	            for(int j=1;j<=i;j++){
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	    }*/
/*	 public static void main( String arg[]){
	        for(int i=1;i<=5;i++){
	 
	            for(int j=5;j>=i;j--){
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	    }*/
	public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
        // Print leading space
              for (int j = 6 - i; j >= 1; j--)
              System.out.print("   ");
    
              for (int j = i; j >= 1; j--)
              System.out.print(j);
              System.out.println();
              }
System.out.println();


	}

}
