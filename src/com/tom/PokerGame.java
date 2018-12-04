package com.tom;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		int[] n = new int[10];
		Card[] c = new Card[10];
		System.out.println(n[0]);
		c[0] = new Card(45);
		System.out.println(c[0].get());
		
		Poker poker = new Poker();
		poker.shuffle();
		poker.print();
		
		
		
		//Card s = new Card(5);
		
		// TODO Auto-generated method stub
		/*int[] flowers = {0x2663, 0x2665, 0x2660, 0x2666};
		int[] nums = new int[5];
		nums[0] = 76;
		nums[4] = 98;
		System.out.println(nums[0]);
		System.out.println(nums.length);
		for(int i = 0; i<nums.length; i++){
			System.out.println(nums[i]);
		}
		char f = 0x2663;
		System.out.println(f);
		
		Random random = new Random();
		int card = random.nextInt(13)+1;
		int flower = random.nextInt(4);
		System.out.print(card);
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
		}
		System.out.println(c);*/
		
		/*int a = card/4;
		System.out.print(card);
		if(a>=3){
			System.out.println("H");
		}else if(a>=2 && a<3){
			System.out.println("S");
		}else if(a>=1 && a<2){
			System.out.println("D");
		}else{
			System.out.println("C");
		}*/

		
	}

}
