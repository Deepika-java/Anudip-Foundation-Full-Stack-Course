/* At a birthday party,all children are being given a balloon.
   Children over 8 years old are being given yellow balloons.
   For Children aged 8 or under, girls are being given pink balloons and boys are being given blue balloons.
   Write some code that asks the users for their age, and prints the colour of their balloon.   */


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
