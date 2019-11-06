/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

//import java.util.List;

/**
 *
 * @author J
 */
public class Field {
//private static int[][]cells=new int[7][6];
private static int[]counters=new int[7];
private Field(){};
private static final Field instance=new Field();
public static Field getInstance(){
    return instance;
}

public void lowerToken(int i){
    //cells[i][counters[i]]=1;
    counters[i]++;
}
/**public int[][] getCells(){
    for(int i=0;i<6;i++){
        for(int j=0;j<counters[i];j++){
            cells[i][j]=1;
        }
    }  
    return cells;
}*/
public int getCounters( int i){
    return counters[i];
}

}
