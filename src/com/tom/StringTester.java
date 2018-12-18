package com.tom;

public class StringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello world";
		//System.out.println(s.substring(2));
		//System.out.println(s.substring(1,5));
		
		/*for(int i = s.length()-1; i>=0; i--){
			String r = "";
			r = r + s.charAt(i);
			System.out.print(r);
		}*/
		
		for(int i = s.length()-1; i>=0; i--){
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println(s.indexOf("o"));
		System.out.println(s.lastIndexOf("l"));
		
		/*String s1 = "Jack Tom Eric";
		s1 = s1.replace("Tom", "Boss");
		System.out.println(s1);*/
		
		String s2 = "Jack Tom Eric";
		/*System.out.print(s2.substring(0, 5));
		System.out.print("Boss");
		System.out.print(s2.substring(8,13));*/
		String name = "Tom";
		int index = s2.indexOf(name);
		System.out.println(index);
		System.out.println(s2.substring(0, index) + "Boss" +s2.substring(index+name.length()));
		
		int n = Integer.parseInt("55");
		n++;
		System.out.println(n);
		float c = Float.parseFloat("56");
		System.out.println(c);
	
		
		
		
		
	}

}
