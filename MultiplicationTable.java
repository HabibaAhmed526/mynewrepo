package task3;

public class MultiplicationTable {

	public static void main(String[] args) {
		int z ;
		for(int x=1; x<=10 ;x++) 
		{
			for(int y=1 ; y<=x ;y++)
			{
				z=x*y;
				System.out.print(z);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
