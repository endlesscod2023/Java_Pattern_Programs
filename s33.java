class s33
{
	public static void main(String args[])
		{
		for(int i=1; i<=5; i++)
			{
			for(int j=1; j<=5-i+1; j++)
				{
				System.out.print("-");
				}
				for(int k=1; k<=2*i-1; k++)
					{
					if(k==1 || k==2*i-1 || i==5)
						{
						System.out.print("*");
						}
					else
						{
						System.out.print(" ");
						}
					}
					System.out.println(" ");
			}
		}
}
/*

Output
-----*
----* *
---*   *
--*     *
-*********

*/
