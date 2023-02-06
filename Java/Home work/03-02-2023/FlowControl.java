import java.util.Scanner;
class FlowControl
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your Age : ");
		int age = input.nextInt();

		if(age > 8)
		{
			System.out.print("Give yellow color balloon to them. ");
			
		}
		else
		{
			System.out.print("Enter your gender :");
			String gender = input.next(); 

			if (gender.equals("boy"))
			{
				System.out.print("Blue color");
			} 
			else if(gender.equals("girl"))
			{
				System.out.print("Pink color");
			}
			else
			{
				System.out.println("Gender is not found ");
			}


		}

	}
}