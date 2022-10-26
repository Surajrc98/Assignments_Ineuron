
public class Assignment_4 {

	public static void main(String[] args) {
	
		int n=9;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || (i==0 ) || (i==n-1 ) || (i==(n-1)/2 && j<1 ) || (i==((n-1)/2)+1 && j<2 ) || (i==((n-1)/2)-1 && j<2 ) || (i==((n-1)/2)+2 && j<3) ||  (i==((n-1)/2)-2 && j<3) || (i==((n-1)/2)+3 && j<4) ||  (i==((n-1)/2)-3 && j<4))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			}
			System.out.println();
		}

	}

}
