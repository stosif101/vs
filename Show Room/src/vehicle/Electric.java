package vehicle;

import java.util.Scanner;

public class Electric extends FourWheeler {

	public void electric() {
		
System.out.println("Enter the Electric Vehicle you want :-");
		
		System.out.println("1.NEXON");
		System.out.println("2.PORSCHE TAYCAN");
		System.out.println("3.VOLVO XC40");
		
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1 : System.out.println("\nNEXON SELECTED :-");
		         Electric e1 = new Nexon();
		         if(e1 instanceof Nexon)
		         {
		         Nexon ee1 =(Nexon)e1;
		         ee1.showDetail();
		         }
   				break;
		
		case 2 : System.out.println("\nPORSCHE TAYCAN SELECTED :-");
		         Electric ea = new Taycan();
		         if(ea instanceof Taycan)
		         {
		          Taycan ea1 = (Taycan)ea;
		          ea1.showDetail();
		         }
		         break;

		case 3 : System.out.println("\nVOLVO XC40 SELECTED :-");
		         Electric eb = new Volvo();
		         if(eb instanceof Volvo)
		         {
		           Volvo eb1 = (Volvo)eb;
		           eb1.showDetail();
		         }
		         break;		
		  			
		default : System.out.println("\n invalid input");
					break;

		}
	}

}