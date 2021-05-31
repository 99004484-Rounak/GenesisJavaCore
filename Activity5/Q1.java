import java.util.*;

abstract class Shape
{
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	abstract void calculateArea(int value);
	
	
}
class Circle extends Shape
{
	void calculateArea(int value)
	{
		System.out.print(Math.PI*value*value);
	}
}
class Square extends Shape
{
	void calculateArea(int value)
	{
		System.out.print(value*value);
	}
}
public class Q1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        int val;
        int choice;
		System.out.println("1. Circle");
		System.out.println("2. Square");
		System.out.println("Your Choice: ");
		choice = sc.nextInt();

		if(choice == 2)
		{
			Square sqr=new Square();
			val=sc.nextInt();
			sqr.calculateArea(val);
		}
		else if (choice == 1)
		{
			Circle cir=new Circle();
			val=sc.nextInt();
			cir.calculateArea(val);
			
		}

        sc.close();
	}
}