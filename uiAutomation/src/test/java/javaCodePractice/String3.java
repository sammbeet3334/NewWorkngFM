package javaCodePractice;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given="Hello World GFG Welcomes You";
		String currentString;
		String CrrentrevString = "";
		
		String Output;
		String []parts = given.split(" ");
		Output=parts[parts.length-1];
		for (int i = parts.length-2; i > 0; i--) {
			currentString= parts[i];
			CrrentrevString="";
			for (int j = currentString.length()-1; j >= 0 ; j--) {
				CrrentrevString=CrrentrevString+currentString.charAt(j);
			}
			
			Output= Output+" "+ CrrentrevString;
		}
		
		Output= Output+" "+parts[0];
		
		System.out.println(Output);
	}

}
