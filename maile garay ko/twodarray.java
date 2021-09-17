class twodarray
{
	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		int i,j,k=1;
		for(i=0;i<4;i++)
			for (j=0;j<i+1 ;j++ ) {
			 	arr[i][j]=k;
			 	k=k+2;
			 } 
		for(i=0;i<4;i++){
			for (j=0;j<i+1 ;j++ ) {
				System.out.print (arr[i][j]+" ");
				System.out.println();
			}
		}	 
	}

}