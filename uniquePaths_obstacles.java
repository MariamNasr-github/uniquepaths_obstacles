// unique path II LEETCODE with obstacles 
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int row,col=0;
        
        if(obstacleGrid.length==1 && obstacleGrid[0].length==1){
            if (obstacleGrid[0][0]==1){ // if only 1 square with obstacle
                return 0;
            }
            else if (obstacleGrid[0][0]==0){ // if only 1 square without obstacle
                return 1;
            }
        }
        if (obstacleGrid[0][0]==1) // if first square is not an obstacle
                    { 
                        return 0;
                    }
        
         
        for (row = 0; row < obstacleGrid.length; row++) //iterate through rows
        {
            for (col = 0; col < obstacleGrid[row].length; col++) //iterate through columns
            {
                if (obstacleGrid[0][0]==0) // if first square is not an obstacle
                    { 
                        obstacleGrid[0][0]=1;
                        continue;
                    }
                if (obstacleGrid[row][col] == 1)// if it is an obstacle
                 {
                    obstacleGrid[row][col] = 0; 
                 }
                
                 
               else if (obstacleGrid[row][col] !=1)
                 {
                    if (row-1 ==-1 && col-1==-1) // if row and col = -1 
                    {
                        obstacleGrid[row][col]=1;   
                    } 
                    else if (row-1 !=-1 && col-1 !=-1)
                    {
                      obstacleGrid[row][col] = obstacleGrid[row][col-1]+obstacleGrid[row-1][col]; //change col and row
                    }
                    else if (row-1==-1) //cant be -1 so change col only
                    {
                      obstacleGrid[row][col]= obstacleGrid[row][col-1];
                    } 
                    else if (col-1==-1) //cant be -1 so change row only
                    {
                       obstacleGrid[row][col]= obstacleGrid[row-1][col]; 
                    } 
                    
                 }
           
               
               
   
            }//end 2nd for
              
            }// end 1st for
        return (obstacleGrid[row-1][col-1]);
             
        } //end function
        
} //end class
