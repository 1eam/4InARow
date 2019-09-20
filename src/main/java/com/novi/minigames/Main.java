/*SHORTCUTS:

 *ctrl + L - open shortcut list
 *ctrl + / = comment selected out
 *ctrl + I = corrigeer indent naar juiste structuur*/

package com.novi.minigames;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner textInput = new Scanner(System.in);
        Scanner currentPlayerInput = new Scanner(System.in);
        
        
        System.out.print("Enter name: Player 1 ");
        String namePlayer1 = textInput.nextLine();											//			Get name of player 1
        
        System.out.print("Enter name: Player 2 ");
        String namePlayer2 = textInput.nextLine();											//			Get name of player 2

        String currentPlayer = namePlayer1;													//			Check Current Player
        
        //Board
        char[][] Bord = new char[6][7];
        for (char x=0 ; x<6; x++){
        	for (char y=0 ; y<7; y++){
        		Bord[x][y]= '.';
        	}
        		
        }
        
        //Print van keuzemenu
        System.out.println("Choose your game");
        System.out.println("[1] 4 In A Row");
        System.out.println("[2] Tic Tac Toe");
        System.out.println("[0] Exit"); 
        
        int selectedGame = textInput.nextInt();												//			Gets chosen game
        	
//        	Start chosen game
        	if (selectedGame == 1) {
        		System.out.println("Lets Play 4 In A Row");
        		System.out.println("Let the game begin..");
//        		PlayingStatus
        		boolean gamePlaying = true;
        		while(gamePlaying) {
//        		Print board (TODO: shrink code)
        		for (char x=0 ; x<6; x++){
                	for (char y=0 ; y<7; y++){
                		System.out.print(Bord[x][y] + " ");
                	}
                	System.out.println();
        		}
        
        		System.out.println("1 2 3 4 5 6 7");        		
        		System.out.println("");//Linebreak
        		System.out.println("Choose a collumn (1-7)");
        		System.out.println("Current player is: " + currentPlayer);
        		int playerInput = textInput.nextInt();
        		
        		Bord[0][playerInput -1 ] = 'x';
        			
            	}
        	}
        	
        	
        	
        	
        	
        	
        	
        		
//        	if(currentPlayerInput.hasNextLine()){
//        		currentPlayer = namePlayer2;

//        	}
        		
        		
  
        		
        		
        		
        		
        		
        		
        		//DENNISCOMMENTS
                //Use:  Dots and/or numbers for fields 
                //      X's and O's for player pawns
                
                //Print current player
                
                //Get chosen field
                //Change field to current player pawn (X or O)
                
                //If game is won
                    //Print board
                    //Winner gets a point
                    //Print scores
                    //Go back to menu
                
                //If game is not won
                    //Switch players
                    //Start next turn
    }
}