package com.tom;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int card = random.nextInt((13)+1);
		int a = card/4;
		System.out.print(card);
		if(a>=3){
			System.out.println("H");
		}else if(a>=2 && a<3){
			System.out.println("S");
		}else if(a>=1 && a<2){
			System.out.println("D");
		}else{
			System.out.println("C");
		}

		/*public char color(){
			char colorr = 'C';
			switch(card/4){
			case 4:
				colorr = 'H';
				break;
			case 3:
				colorr = 'C';
				break;
			case 2:
				colorr = 'D';
				break;
			default:
				colorr = 'S';
				break;
			}
			return colorr;
		}*/
	}

}
