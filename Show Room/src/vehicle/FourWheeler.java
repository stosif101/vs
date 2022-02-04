package vehicle;

import java.util.Scanner;

public class FourWheeler extends Vehicle {
	double weight;
	
	public void Fourwheeler()
	{
		System.out.println("Enter the type of Four wheeler you want");
		
		System.out.println("1.PETROL");
		System.out.println("2.DIESEL");
		System.out.println("3. ELECTRIC");
		
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1 : System.out.println("\nPETROL SELECTED");
							FourWheeler p1= new Petrol();
							if(p1 instanceof Petrol )
							{
							Petrol pp1=(Petrol)p1;	
							pp1.petrol();
							}
				break;
		
		case 2 : System.out.println("\nDIESEL SELECTED");
									FourWheeler d= new Diesel();
									if(d instanceof Diesel )
									{
									Diesel dd=(Diesel)d;	
									dd.diesel();
									}
		 			break;

		case 3 : System.out.println("\nELECTRIC SELECTED");
								FourWheeler e9= new Electric();
								if(e9 instanceof Electric )
								{
								Electric ee=(Electric)e9;	
								ee.electric();
								}
								 break;

		default : System.out.println("\n INVALID INPUT");
		  			break;

		}
	}
}