package vehicle;

import java.util.Scanner;

public class ThreeWheeler extends Vehicle {
	String Fuel;
	public void Threewheeler()
	{
		System.out.println("Enter the company of Three wheeler you want");
		System.out.println("================================"); 
		System.out.println("1.ATUL");
		System.out.println("2.MAHINDRA");
		System.out.println("3. PIAGGIO");
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1 : System.out.println("\nATUL SELECTED");
								ThreeWheeler a1= new Atul();
								if(a1 instanceof Atul )
								{
								Atul aa=(Atul)a1;	
								aa.showDetail();
								}
				
				break;
		
		case 2 : System.out.println("\n MAHINDRA SELECTED");
							ThreeWheeler m= new Mahindra();
							if(m instanceof Mahindra )
							{
							Mahindra mm=(Mahindra)m;	
							mm.showDetail();
							}
		 			break;

		case 3 : System.out.println("\nPIAGGIO Selected");
						ThreeWheeler p= new Piaggio();
						if(p instanceof Piaggio )
						{
						Piaggio pp=(Piaggio)p;	
						pp.showDetail();
						}
		 			break;

		default : System.out.println("\nINVALID INPUT");
		  			break;

		}
	}
	private void showDetail() {
		// TODO Auto-generated method stub
		
	}
}