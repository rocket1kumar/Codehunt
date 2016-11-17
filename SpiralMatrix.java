package hackerrank;

/* The Following program will traverse the matrix in the spiral form in the  l>R, T>B, R>L, B>T fashion
 * algorithm for this is*
1. spiralmatrix(a,m,n)// a[][], m and n the size of row and column;
2. top=0,bottom=m-1,left=0,right=n-1, dir=0
3. while(top<=bottom && left<=right)
4. if dir=0
5. for i<-left to right
6. print a[top][i];
7. top++   // initial top=0
8. dir=1;
9. else if dir=1
10. for i<-top to bottom
11. print a[i][r]
12. right--;  // initial right=n-1
13. dir=2;
14. else if dir=2
15. for i<-right to left
16. print a[bottom][i]
17. bottom--;  // initial bottom=m-1;
18. dir=3;
19. else if dir=3
20. for i<-bottom to top
21. print a[i][left]
22. left++ 		// initial left=0
23. dir=0;
 This is coded by Vipul Kumar Maurya
 // to change the fashion of traversal just change the dir integer.
 */
import java.util.Scanner;

public class SpiralMatrix {
// Method spriralMatrix(a,m,n)
	static void spiralMatrix(int[][] x,int m, int n){
	int i;
	int bottom=m-1, top=0,left=0,right=n-1;
	int dir=0;
	// 
	while(left<=right && top<=bottom){
	// Traversing top row ,left to right
		if(dir==0){
			for(i=left;i<=right;i++){
				System.out.print(x[top][i]+" ");
				
				}
			top++;
			
		}	else   
			// Traversing Right Column, top to bottom
		if(dir==1){
			for(i=top;i<=bottom;i++){
				System.out.print(x[i][right]+" ");
							}
			right--;		
		}	else
	// Traversing Bottom row, right to left
		if(dir==2){
			for(i=right;i>=left;i--){
				System.out.print(x[bottom][i]+" ");
						
			}
			bottom--;
			
		}	else
	// Traversing left Column, bottom to up		
		if(dir==3){
			for(i=bottom;i>=top;i--){
				System.out.print(x[i][left]+" ");
			
				}
			left++;
			}
		// this will change the direction. 
		dir=(dir+1)%4;
		}
	
}
	public static void main(String[] args) {
		// Main method for spiral method calling,, *the spiral method must be static because main method is static and a static method cannot access not static method*
		int m,n;
		// taking console input
		Scanner in=new Scanner(System.in);
		m=in.nextInt();
		n=in.nextInt();
int[][] x=new int[m][n];
// for inserting elements into m*n array
for(int i=0;i<m;i++){
	for(int j=0;j<n;j++){
		x[i][j]=in.nextInt();
	}
}
in.close();
// Spiral Method called.
spiralMatrix(x,m,n);
	}

}
