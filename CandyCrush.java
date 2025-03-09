/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.candycrush;

/**
 *
 * @author Ali Shan
 */
import java.util.Scanner;
public class CandyCrush {
    String name;
    int level;
    int score;
    
    public String getName(){
        return name;
    }
    
    public int getLevel(){
        return level;
    }
    
    public int getScore(){
        return score;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public void setScore(int score){
        this.score = score;
    }
    
    void playerACTION(){
        Scanner Intsc = new Scanner(System.in);
        System.out.println("***** Action You Cna Perform *****");
        System.out.println("1. For match candies(Add 20 score)");
        System.out.println("2. For clear a row(Add 30 score)");
        System.out.println("3. For complete a level(1 Level up)");
        System.out.print("Choose the action which you want to perform: ");
        int choice = Intsc.nextInt();
        
        switch(choice) {
            case 1 -> score+=20;
            case 2 -> score+=30;
            case 3 -> level+=1;
            default ->System.out.println("Invalid action!!. Please choose a valid action.");
            
        }        
    }
    
    void sHOW(){
        System.out.println("Name: "+this.getName());
        System.out.println("Level: "+this.getLevel());
        System.out.println("Score: "+this.getScore());
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        CandyCrush player = new CandyCrush();
        System.out.print("Enter name: ");
        player.name = sc.nextLine();
        
        player.setLevel(1);
        player.setScore(980);
 
        player.playerACTION();
        player.sHOW();
    }
}
