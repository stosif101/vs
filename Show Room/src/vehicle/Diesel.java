package vehicle;

import java.util.Scanner;

public class Diesel extends FourWheeler {

	public void diesel() {
		
		
System.out.println("Enter the Diesel Vehicle you want :-");
		
		System.out.println("1.FORTUNER");
		System.out.println("2.SCORPIO");
		System.out.println("3.CRETA");
		System.out.println("4.HARRIER");
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1 : System.out.println("\nFORTUNER SELECTED :-");
				Diesel ft = new Fortuner();
				if(ft instanceof Fortuner)
				{
				 Fortuner ft1 = (Fortuner)ft;
				 ft1.showDetail();
				}
					
				break;
		
		case 2 : System.out.println("\nSCORPIO SELECTED :-");
		         Diesel sp = new Scorpio();
		         if(sp instanceof Scorpio)
		         {
		          Scorpio sp1 = (Scorpio)sp;
		          sp1.showDetail();
		         }
						
		 			break;

		case 3 : System.out.println("\nCRETA SELECTED :-");
				 Diesel cr = new Creta();
				 if(cr instanceof Creta)
				 {
				  Creta cr1 =(Creta)cr;
				  cr1.showDetail();
				 }
						
					break;

		case 4 : System.out.println("\nHARRIER SELECTED :-");
				 Diesel hr = new Harrier();
				 if(hr instanceof Harrier)
				 {
				  Harrier hr1 = (Harrier)hr;
				  hr1.showDetail();
				 }
							
		  			break;
		  			
		default : System.out.println("\n invalid input");
					break;

		}
		
	}

}