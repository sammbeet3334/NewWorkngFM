package javaCodePractice;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String baseStr="ABCD";
		
		String giveStr="CDAB";
		int startpos = 0;
		String partOne;
		String PartTwo;
		
		for (int i = 0; i < baseStr.length(); i++) {
			
			if(giveStr.charAt(0)==baseStr.charAt(i))
			{
				startpos=i;
				
			}
		}
		
		partOne=baseStr.substring(startpos,baseStr.length());
		PartTwo= baseStr.substring(0,startpos);
		
		if(giveStr.equals(partOne+PartTwo))
		{
			System.out.println("working");
		}
		
	}

}
