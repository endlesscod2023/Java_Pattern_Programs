class s13
{
	public static void main(String[] args) 
	{
		for(int j=5;j>=1; j--)
			{
			for(int k=1;k<=j;k++)
				{
				System.out.print(" ");
				}
				for(int i=5; i>=j; i--)
					{
					System.out.print("*");
					}
					System.out.println();
			}
	}
}
/*

Output
     *
    **
   ***
  ****
 *****

*/
