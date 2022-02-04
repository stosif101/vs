package vehicle;

import java.util.Scanner;

public class Bajaj extends TwoWheeler{
	
	
	public void bajaj()
	{
		System.out.println("Enter the bajaj bike you want");
		
		System.out.println("1.PULSAR NS200");
		System.out.println("2.PULSAR RS200");
		System.out.println("3. DOMINAR 400");
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1 : System.out.println("\nPULSAR NS200 SELECTED");
					Bajaj ps= new PulsarNs();
					if(ps instanceof PulsarNs)
					{
					PulsarNs pss=(PulsarNs)ps;	
					pss.showDetail();
					}
				
				break;
		
		case 2 : System.out.println("\n PULSAR RS200 SELECTED");
							Bajaj rs= new PulsarRs();
							if(rs instanceof PulsarRs )
							{
							PulsarRs rss=(PulsarRs)rs;	
							rss.showDetail();
							}
		 			break;

		case 3 : System.out.println("\n DOMINAR 400 SELECTED");
							Bajaj d= new Dominar();
							if(d instanceof Dominar )
							{
							Dominar dd=(Dominar)d;	
							dd.showDetail();
							}
		 			break;

		
		default : System.out.println("\n invalid input");
					break;

		}
	}

}
