package vehicle;

import java.util.Scanner;

public class Ktm extends TwoWheeler{
	public void ktm()
	{
		System.out.println("Enter the ktm bike you want");
		
		System.out.println("1. KTM RC 390");
		System.out.println("2.KTM DUKE 390");
		System.out.println("3.KTM ADVENTURE 390");
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1 : System.out.println("\nKTM RC 390 SELECTED");
					Ktm kc= new KtmRc();
					if(kc instanceof KtmRc )
					{
					KtmRc kcc=(KtmRc)kc;	
					kcc.showDetail();
					}
				
				break;
		
		case 2 : System.out.println("\n KTM DUKE 390 SELECTED");
							Ktm kd= new KtmDuke();
							if(kd instanceof KtmDuke )
							{
							KtmDuke kdd=(KtmDuke)kd;	
							kdd.showDetail();
							}
		 			break;

		case 3 : System.out.println("\n KTM ADVENTURE 390 SELECTED");
							Ktm ad= new Ktmad();
							if(ad instanceof Ktmad )
							{
							Ktmad add=(Ktmad)ad;	
							add.showDetail();
							}
		 			break;

		
		default : System.out.println("\n invalid input");
					break;

		}
	}

}