package Myprogram;

public class Stringswap_without_thirdstring {

	public static void main(String[] args) {
		String str1="hello";
		String str2="welcome";
		System.out.println("String1 - "+ str1 +"     and  String2 - "+ str2);
		str1=str1+str2;
		
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println("String1 - "+ str1 +"      and  String2 - "+ str2);

	}

}
