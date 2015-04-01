public class LatArrayMxN02 {
  public static void main(String[]args){
    int  [][]data={
    {1,0,0,0,0,0},
    {0,1,0,0,0,0},
    {0,0,1,0,0,0},
    {0,0,0,1,0,0},
    {0,0,0,0,1,1},
    {0,0,0,0,1,1}};
   
     
    
    for(int i=1;i<data.length;i++){
      for (int j=0;j<data[i].length;j++){
        System.out.print((data[i][j]==1)?" # ":" . ");
        
      }
      System.out.println();
    }
   
  }
}