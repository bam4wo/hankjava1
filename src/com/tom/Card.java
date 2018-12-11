package com.tom;

public class Card {
	char[] suits = {'\u2663', '\u2665', '\u2660', '\u2666'};
	//String suitss = "\u2663\u2665\u2660\u2666";
	int value;
	int symbol;
	int suit;
	
	public Card(int value){
		this.value = value;
	}
	
	/*public String gett(){
		int type = value/13;
		int num = value%13 +1;
		return num + "" + suits.charAt(type);
	}*/
	
	public String get(){
		String s = value%13+1 + "" + suits[value/13];
		return s;
	}
}
