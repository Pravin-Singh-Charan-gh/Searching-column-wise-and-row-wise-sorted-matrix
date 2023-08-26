class Solution {
    public boolean searchMatrix(int[][] arr, int item) {
			// Stair case algorithm
			// CB page no 10
  int row=0, col=arr[0].length-1;
	while(row<arr.length && col>=0)
		if(arr[row][col]==item)
			return true;
		else if(arr[row][col]>item)
			col--;
		else 
			row++;
	
	return false;
    }
}
