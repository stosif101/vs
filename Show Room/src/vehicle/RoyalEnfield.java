package vehicle;

import java.util.Scanner;

public class RoyalEnfield extends TwoWheeler{
	public void Royalenfield()
	{
		System.out.println("Enter the Royal Enfield bike you want");
		
		System.out.println("1.CONTINENTAL GT 650");
		System.out.println("2.HIMALAYAN");
		System.out.println("3.CLASSIC 350");
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1 : System.out.println("\nCONTINENTAL GT 650 SELECTED ");
					RoyalEnfield g= new Gt();
					if(g instanceof Gt )
					{
					Gt gg=(Gt)g;	
					gg.showDetail();
					}
				
				break;
		
		case 2 : System.out.println("\n HIMALAYAN SELECTED");
							RoyalEnfield h= new Himalayan();
							if(h instanceof Himalayan )
							{
							Himalayan hh=(Himalayan)h;	
							hh.showDetail();
							}
		 			break;

		case 3 : System.out.println("\n CLASSIC 350");
							RoyalEnfield d= new Classic();					
							if(d instanceof Classic )
							{
							Classic dd=(Classic)d;	
							dd.showDetail();
							}
		 			break;

		
		default : System.out.println("\n invalid input");
					break;
	}
	}
}