package javaCodePractice;

import java.util.Random;

public class RandomString {
	public static void main(String[] args) {

		int stringLength = 10;
		Random ran = new Random();
		String random = "";
		char curr = 0;
		int count=0;
			while (count<10) {			

			int ranNum = ran.nextInt(90);
			if (ranNum >= 65) {
				curr = (char) ranNum;
				random = random + curr;
				count++;
			}

		}
		System.out.println(random);
	}
}
