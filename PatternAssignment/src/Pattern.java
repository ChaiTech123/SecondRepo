
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m=10;
		
		int n=10;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==(n-1) || j==(n-1)/2)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			/*
			 * for(int j=n;j<=2*n;j++) { if(j==n+1 || j==2*n || j==n+1+i) {
			 * System.out.print("*"); } else { System.out.print(" "); } }
			 */
			
			for(int j=0;j<=n;j++) {
				if(j==1 || j==n || j==1+i)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
		   }
			
			
			/*
			 * for(int j=2*n;j<=3*n;j++) { if(j==2*n+1 || i==0 && j>2*n || i==(n-1) && j>2*n
			 * || i==(n-1)/2 && j>2*n) { System.out.print("*"); } else {
			 * System.out.print(" "); } }
			 */
			
			for(int j=0;j<=n;j++) {
				if(j==1 || i==0 && j>0|| i==(n-1) && j>0|| i==(n-1)/2 && j>0)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
		   }
			
			for(int j=0;j<=n;j++) {
				if(j==1 && i!=(n-1) || j==n && i!=(n-1) || i==(n-1) && j>1 && j<n)
				{ 
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
		   }
			
			for(int j=0;j<=n;j++) {
				if(j==1 || i==0 && j>0 && j<n || i==(n-1)/2 && j>0 && j<n || j==n && i!=(n-1)/2 || i>(n-1) && i+j==n/2)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
		   }
			
			
			for(int j=0;j<=n;j++) {
				if(j==1 && i>0 && i!=(n-1) || i==0 && j>1 && j<=(n-1) || j==n && i>0 && i!=(n-1) || i==n-1 && j>1 && j<=(n-1))
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
		   }
			
			for(int j=0;j<=n;j++) {
				if(j==1 || j==n || j==1+i)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
		   }
			System.out.println();
		}

	}

}
