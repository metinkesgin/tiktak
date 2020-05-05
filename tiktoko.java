//TİCTACTOE GAME 
//METİN KESGİN
// ALL RİGHT RESERVED :p

import java.util.Random;
import java.util.Scanner;

public class tiktoko {
    static char[][] matrix = new char[3][3];

    public static void main(String[] args) {
        gameboard();
        while(true){
            getPlayerMove();
            getComputerMove();        
            gameboard();
            if(check()){
                System.out.println("Game is OVER!...");
                break;
            }
        }
        
    }

    public static void gameboard() {
        for (int i = 0; i < 3; i++) {
                System.out.println("|"+matrix[0][i] + "|"+matrix[1][i]+"|"+matrix[2][i]+"|");
        
            }
            System.out.println("");
        }
    public static void getPlayerMove(){
        System.out.println("Give The x and y coordinates...");
        Scanner scanner = new Scanner(System.in);
        int i=scanner.nextInt();
        int j=scanner.nextInt();
        if(matrix[i][j]=='O'){
            System.out.println("This is Full Please Choose Another One...");
            getPlayerMove();
        }
        else{
            matrix[i][j]='X';
        }
        

    }    
    public static void getComputerMove(){
        System.out.println("The Computer thinking...");
        Random random = new Random();
        int i1=random.nextInt(3);
        int j1=random.nextInt(3);
        if(matrix[i1][j1]=='X'){
            getComputerMove();
        }
        else{
            matrix[i1][j1]='O';
        }
    }
    public static boolean check(){
        if(matrix[0][0]==matrix[1][1] && matrix[1][1]==matrix[2][2]){
            if(matrix[0][0]=='X'){
                System.out.println("Human Wins...");
                return true;
            }
            if(matrix[0][0]=='O'){
                System.out.println("Computer Wins");
                return true;
            }
        }
        if(matrix[2][0]==matrix[1][1] && matrix[1][1]==matrix[0][2]){
            if(matrix[1][1]=='X'){
                System.out.println("Human Wins...");
                return true;
            }
            if(matrix[1][1]=='O'){
                System.out.println("Computer Wins");
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if(matrix[i][0]==matrix[i][1] && matrix[i][1]==matrix[i][2]){
                if(matrix[i][0]=='X'){
                    System.out.println("Human Wins...");
                    return true;
                }
                if(matrix[i][0]=='O'){
                    System.out.println("Computer Wins");
                    return true;
                }
            }
            if(matrix[0][i]==matrix[1][i] && matrix[1][i]==matrix[2][i]){
                if(matrix[0][i]=='X'){
                    System.out.println("Human Wins...");
                    return true;
                }
                if(matrix[0][i]=='O'){
                    System.out.println("Computer Wins");
                    return true;
                }
            } 
        }
        return false;
    }
}