package javaCodePractice;

public class CharacterUtils {
public static void main(String[] args) {
	
	String str="abaab";
	// ll
	//lol
	// ellolle
	
	String partStr;
	char init_char;
	String temp = null;
	for (int i = 0; i < str.length()-1; i++) {
	//	init_char=str.charAt(i);
		for (int j = i+1; j < str.length(); j++) {
			if(str.charAt(i)==str.charAt(j))
			{
				temp="";
				partStr= str.substring(i, j+1);
				for (int k =partStr.length(); k >0; k--) {
					temp=temp+partStr.charAt(k-1);
				}
				
				if(partStr.equals(temp))
				{
					System.out.println(partStr);
				}
			}
		}
	}
}
}
