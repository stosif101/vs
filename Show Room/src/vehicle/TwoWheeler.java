

package vehicle;

import java.util.Scanner;

public class TwoWheeler extends Vehicle {
	double weight;

	
	public void Twowheeler()
	{
		System.out.println("Enter the company of two wheeler you want");
		
		System.out.println("1.BAJAJ");
		System.out.println("2.ROYAL ENFIELD");
		System.out.println("3.TVS");
		System.out.println("4.KTM");
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1 : System.out.println("\nBAJAJ SELECTED");
					TwoWheeler tw= new Bajaj();
					if(tw instanceof Bajaj )
					{
					Bajaj tww=(Bajaj)tw;	
					tww.bajaj();
					}
				break;
		
		case 2 : System.out.println("\nROYAL ENFIELD SELECTED");
						TwoWheeler tw1= new RoyalEnfield();
						if(tw1 instanceof RoyalEnfield )
						{
						RoyalEnfield tww1=(RoyalEnfield)tw1;	
						tww1.Royalenfield();
						}
		 			break;

		case 3 : System.out.println("\nTVS SELECTED");
						TwoWheeler tw2= new Tvs();
						if(tw2 instanceof Tvs )
						{
						Tvs tww2=(Tvs)tw2;	
						tww2.tvs();
						}
					break;

		case 4 : System.out.println("\nKTM SELECTED");
							TwoWheeler tw3= new Ktm();
							if(tw3 instanceof Ktm )
							{
							Ktm tww3=(Ktm)tw3;	
							tww3.ktm();
							}
		  			break;
		  			
		default : System.out.println("\n invalid input");
					break;

		}
	}
	
	

}
