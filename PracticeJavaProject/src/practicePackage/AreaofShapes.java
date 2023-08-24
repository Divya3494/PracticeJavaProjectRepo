package practicePackage;

import java.awt.geom.Area;
import java.util.Scanner;

public class AreaofShapes {
//commenting to see how pull works
	//2nd push 
	public static void main(String[] args) {
		System.out.println("polymorphism example");
		System.out.println("enter radius ");
	Scanner s = new Scanner(System.in);
	int radius=s.nextInt();
	AreaofShapes obj=new AreaofShapes();
	
	obj.area(radius);

	}
void area(int radius)
{
	System.out.println(3.14*radius*radius);
}

void area(int b, int h)
{
	System.out.println(0.5*b*h);
}

}
