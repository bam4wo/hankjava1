package com.tom;

import java.util.Random;

public class Poker {
	Card[] cards = new Card[52];
	/*int[] cards = new int[52];*/
	public Poker(){
		for(int i = 0; i < 52; i++){
			cards[i] = new Card(i);
		}
	}
	public void shuffle(){
		for(int i = 0; i<52; i++){
			int r = new Random().nextInt(52);
			Card tem = cards[i];
			cards[i] = cards[r];
			cards[r] = tem;
		}
	}

	public void print(){
		for(int i = 0; i<52; i++){
			/*int flower = cards[i]/13;
			char c = 0;
			switch(flower){
			case 0:
				c = 'C';
				break;
			case 1:
				c = 'H';
				break;
			case 2:
				c = 'S';
				break;
			default:
				c = 'D';
				break;
			}*/
			System.out.print(cards[i].get() +" ");
			
			if(i%13 == 12){
				System.out.println();
			}
		}
	}

}
