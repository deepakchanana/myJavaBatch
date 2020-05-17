package pkg1;

public class doubleLoop {
	
	public static void main(String[] args) 
	{
	 for(int i=1;i<=5;i++)  // loop for rows i---5
	 {
		 for(int j=1;j<=i;j++)  // 1 to 5
		 {
			 System.out.print("*"); // it will print five star in same row
		 }
		 System.out.println(); // it will move cursor to next line
	 }
	}

}
