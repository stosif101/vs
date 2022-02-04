package vehicle;

import java.util.Scanner;

public class Tvs extends TwoWheeler{
	public void tvs()
	{
		System.out.println("Enter the TVS bike you want");
		
		System.out.println("1.APACHE RTR 200");
		System.out.println("2.APACHE  RR 310");
		
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1 : System.out.println("\n Apache RTR 200 SELECTED ");
					Tvs rtr= new Rtr();
					if(rtr instanceof Rtr )
					{
					Rtr rtrr=(Rtr)rtr;	
					rtrr.showDetail();
					}
				
				break;
		
		case 2 : System.out.println("\n Apache RR 310 SELECTED ");
							Tvs r= new Rr310();
							if(r instanceof Rr310 )
							{
							Rr310 rr=(Rr310)r;	
							rr.showDetail();
							}
		 			break;

		

		
		default : System.out.println("\n invalid input");
					break;

		}
	}
}