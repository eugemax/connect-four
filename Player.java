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
public class Player {
    
    private int[][]arrangement=new int[7][6];
    private final String color;
    public Player(String color){
        this.color=color;
    /**    for(int[] a:arrangement){
         for(int i: a)
             System.out.print(i+" ");
             System.out.println();
         
         
    }*/
        
    }
    public void makeMove(int i){
        Field field=Field.getInstance();
        if(field.getCounters(i)<=5){
            arrangement[i][field.getCounters(i)]=1;
            //System.out.println(arrangement[i][2]);
            field.lowerToken(i);    
        }
    }
    private  int[] findLeftBottom(int[][]arr){
    int[]cell=new int[2];
    PARENT_LOOP:for(int i=0; i<arr.length;i++){
       for (int j=0;j<arr[i].length;j++){
           if(arr[i][j]==1){
               cell[0]=i;
               cell[1]=j;
               break PARENT_LOOP;
           }  
       }
    }
       return cell;
    }
    private int sum(int[][]arr){
        int sum=0;
        for(int i=0;i<7;i++)
            for(int j=0;j<6;j++)
                sum+=arr[i][j];
        return sum;

}
        
    
    public boolean isWinner(){
        int[][]arrCopy=new int[7][6];
       /** for(int[]arr:arrCopy)
            for(int num:arr)
                num=0;
        */
       System.out.println(this.color);
        for(int i=0;i<7;i++){
            for(int j=0;j<6;j++){
                System.out.print(arrangement[i][j]+" ");
                
                arrCopy[i][j]=arrangement[i][j];
            }
            System.out.println();
        }
    /**int sum=0;
     for(int i=0;i<7;i++)
     for(int j=0;j<6;j++)
         sum+=arrCopy[i][j];*/
   // if(sum(arrCopy)>=4){
        while(sum(arrCopy)>=4){ 
          /**  sum=0;
     for(int i=0;i<7;i++)
     for(int j=0;j<6;j++)
         sum+=arrCopy[i][j];   */     
    int i=findLeftBottom(arrCopy)[0];
    int j=findLeftBottom(arrCopy)[1];
    //try to find line up to 4
    if( (j+3)<=5     )
     if(arrCopy[i][j+3]==1)
     if( arrCopy[i][j+1]==1&&arrCopy[i][j+2]==1 )
             return true;
         
    
    //try to find it diagonally up
    if(i+3<=6&&j+3<=5){
        if(arrCopy[i+3][j+3]==1){
            if( arrCopy[i+1][j+1]==1 && arrCopy[i+2][j+2]==1  )
                return true;
        }   
    }
    //rightward
    if(i+3<=6){
        if(arrCopy[i+3][j]==1){
             if( arrCopy[i+1][j]==1 &&arrCopy[i+2][j]==1  )
                 return true;
        }
    }
    //diagonally downward
    if(i+3<=6&&j-3>=0)
        if(arrCopy[i+3][j-3]==1)
            if(arrCopy[i+1][j-1]==1 && arrCopy[i+2][j-2]==1)
                return true;
       arrCopy[i][j]=0;
    } 
     
        return false;
    }
       
    }
    
    
    

