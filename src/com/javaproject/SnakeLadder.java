package com.javaproject;

import java.util.Random;

public class SnakeLadder {
	
	static final int noPlay = 0;
	static final int ladder = 1;
	static final int snake = 2;
	
	
	public static void main(String[] args) {
		int position = 0;
		
		Random ran = new Random();
        int dice = ran.nextInt(6)+1;
		System.out.println("dice: "+dice);
        int optCheck = ran.nextInt(3);
		System.out.println("optCheck: "+optCheck);
		
		if (optCheck == ladder) 
		{
			System.out.println("Ladder");
			position = position + dice;
		}
		
		else if (optCheck == snake) 
		{
			System.out.println("Snake");
			position = position - dice;
		}
		else {
			System.out.println("No Play");
		}
		if (position<0)
			position=0;
		System.out.println("position: "+position);
	}

        
        
}
	