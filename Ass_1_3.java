
public class problem_3 {

	public static void main(String[] args) {

		int n=10;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || (i==1 && j!=(n-1)/2) || (i==2 && j!=(n-1)/2 && j!= ((n-1)/2)+1) && j!= ((n-1)/2)-1 || j==0 || j==n-1 || (i==3 && j!=2 && j!=3 && j!=4 && j!=5 && j!=6)|| (i==4&& j==n-2))
			{
				System.out.print("*");	
			}
			else
			{
				System.out.print(" ");
			}
		}System.out.println();
		}
	}

}
