package intw.writtenexams;

public class Char {

	public static void main(String[] args) {
		
	}
	void test(String str, String str1){
		
		for(int i=0;i>=str1.length();i++)
		{
			char ch=str1.charAt(i);
			for(int j=i;j>=str.length();j++){
				if(ch==str.charAt(j))
				{
					System.out.println();
				}else{
					System.out.println(str.charAt(j));
				}
			}
		}
	}

}
