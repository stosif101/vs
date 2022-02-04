package vehicle;

import java.util.Scanner;

public class Petrol extends FourWheeler {

	public void petrol() {
		// TODO Auto-generated method stub
		
System.out.println("Enter the Petrol Vehicle you want");
		
		System.out.println("1.WRANGLER");
		System.out.println("2.SWIFT");
		System.out.println("3.ERTIGA");
		System.out.println("4.ALTO");
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1 : System.out.println("\nWRANGLER SELECTED");
		         Petrol pl1 = new Wrangler();
		         if(pl1 instanceof Wrangler)
		         {
		          Wrangler pl2 = (Wrangler)pl1;
		          pl2.showDetail();
		         }
				break;
		
		case 2 : System.out.println("\nSWIFT SELECTED");
		         Petrol sw = new Swift();
		         if(sw instanceof Swift)
		         {
		          Swift sw1 =(Swift)sw;
		          sw1.showDetail();
		         }
		         break;

		case 3 : System.out.println("\nERTIGA SELECTED");
		         Petrol etg = new Ertiga();
		         if(etg instanceof Ertiga)
		         {
		          Ertiga etg1 = (Ertiga)etg;
		          etg1.showDetail();
		         }
					break;

		case 4 : System.out.println("\nALTO SELECTED");
		         Petrol al = new Alto();
		         if(al instanceof Alto)
		         {
		          Alto al1 = (Alto)al;
		          al1.showDetail();
		         }
		  		 break;
		  			
		default : System.out.println("\ninvalid input");
					break;

		}
		
	}

}