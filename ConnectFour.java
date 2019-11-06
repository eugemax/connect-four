/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;
import java.util.*;
/**
 *
 * @author J
 */
public class ConnectFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String>list;
        //list=Arrays.asList("A_Red","B_Yellow","A_Red","B_Yellow","A_Red","B_Yellow","G_Red", "B_Yellow");
       /** list=Arrays.asList(
            "C_Yellow",
            "E_Red",
            "G_Yellow",
            "B_Red",
            "D_Yellow",
            "B_Red",
            "B_Yellow",
            "G_Red",
            "C_Yellow",
            "C_Red",
            "D_Yellow",
            "F_Red",
            "E_Yellow",
            "A_Red",
            "A_Yellow",
            "G_Red",
            "A_Yellow",
            "F_Red",
            "F_Yellow",
            "D_Red",
            "B_Yellow",
            "E_Red",
            "D_Yellow",
            "A_Red",
            "G_Yellow",
            "D_Red",
            "D_Yellow",
            "C_Red"
        );
       list=Arrays.asList(
            "A_Yellow",
            "B_Red",
            "B_Yellow",
            "C_Red",
            "G_Yellow",
            "C_Red",
            "C_Yellow",
            "D_Red",
            "G_Yellow",
            "D_Red",
            "G_Yellow",
            "D_Red",
            "F_Yellow",
            "E_Red",
            "D_Yellow"
        ); 
       list=Arrays.asList(
            "C_Yellow",
            "E_Red",
            "G_Yellow",
            "B_Red",
            "D_Yellow",
            "B_Red",
            "B_Yellow",
            "G_Red",
            "C_Yellow",
            "C_Red",
            "D_Yellow",
            "F_Red",
            "E_Yellow",
            "A_Red",
            "A_Yellow",
            "G_Red",
            "A_Yellow",
            "F_Red",
            "F_Yellow",
            "D_Red",
            "B_Yellow",
            "E_Red",
            "D_Yellow",
            "A_Red",
            "G_Yellow",
            "D_Red",
            "D_Yellow",
            "C_Red"
        );*/
       /**list=Arrays.asList(  //yellow
            "A_Yellow",
"F_Red","D_Yellow","G_Red","D_Yellow","F_Red","G_Yellow","D_Red","D_Yellow","F_Red","A_Yellow","A_Red","A_Yellow","D_Red","F_Yellow","D_Red","A_Yellow","B_Red","G_Yellow","B_Red","A_Yellow","B_Red","E_Yellow","C_Red","C_Yellow","G_Red","F_Yellow","G_Red","C_Yellow","F_Red","C_Yellow","E_Red","G_Yellow","C_Red","B_Yellow","B_Red","C_Yellow","E_Red","E_Yellow","E_Red","B_Yellow","E_Red","E_Yellow","C_Red","B_Yellow","E_Red","G_Yellow","F_Red","C_Yellow","G_Red","A_Yellow","B_Red","D_Yellow","F_Red","G_Yellow","C_Red","D_Yellow","B_Red","C_Yellow","F_Red","E_Yellow","G_Red","D_Yellow","B_Red","B_Yellow","D_Red","A_Yellow","D_Red","B_Yellow","E_Red","E_Yellow","G_Red","F_Yellow","E_Red","A_Yellow","C_Red","D_Yellow","G_Red","F_Yellow","C_Red","F_Yellow","A_Red","A_Yellow","A_Red");
       */
       list=Arrays.asList("F_Yellow\n" ,
"E_Red\n" ,
"D_Yellow\n" ,
"D_Red\n" ,
"C_Yellow\n" ,
"D_Red\n" ,
"D_Yellow\n" ,
"A_Red\n" ,
"F_Yellow\n" ,
"G_Red\n" ,
"A_Yellow\n" ,
"A_Red\n" ,
"A_Yellow\n" ,
"F_Red\n" ,
"B_Yellow\n" ,
"D_Red\n" ,
"E_Yellow\n" ,
"B_Red\n" ,
"B_Yellow\n" ,
"A_Red\n" ,
"G_Yellow\n" ,
"B_Red\n" ,
"D_Yellow\n" ,
"F_Red\n" ,
"E_Yellow\n" ,
"E_Red\n" ,
"G_Yellow\n" ,
"G_Red\n" ,
"C_Yellow\n" ,
"G_Red\n" ,
"F_Yellow\n" ,
"C_Red\n" ,
"A_Yellow\n" ,
"B_Red\n" ,
"G_Yellow\n" ,
"E_Red\n" ,
"F_Yellow\n" ,
"C_Red\n" ,
"B_Yellow\n" ,
"C_Red\n" ,
"E_Yellow\n" ,
"C_Red");
        Player red=new Player("Red");
        Player yellow=new Player("Yellow");
        int move=0;
        LOOP: for(int i=0; i<list.size();i++){
           char c=list.get(i).charAt(0);
           int pos=(int)c-65;
           char player=list.get(i).charAt(2);
            if(player=='R'){
               red.makeMove(pos);
               if(red.isWinner()){
                   System.out.println("Red!");
                   break LOOP;
               }
            }else{
               yellow.makeMove(pos);
                   if(yellow.isWinner()){
                       System.out.println("Yellow!");
                       break LOOP;
                   }                  
            }
            move++;
            System.out.println("--'--'-"+move+"-'--'--'--");
        }
       // System.out.println("Draw!");
    }   
}

