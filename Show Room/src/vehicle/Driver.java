package vehicle;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Welecome to My Vehicle Tosif Show Room...!!!");
		System.out.println("======================================="); 
		
		System.out.println("Choose what kind of Vehicle do you want!");
		System.out.println("---------------------------------------"); 
		System.out.println("1.Two Wheeler");
		System.out.println("2.Three Wheeler");
		System.out.println("3.Four Wheeler");
		
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		
		switch(a)
		{
			case 1 : System.out.println("\nYour interest is in Two wheeler ");
						Vehicle v= new TwoWheeler();
						if(v instanceof TwoWheeler )
						{
						TwoWheeler vv=(TwoWheeler)v;	
						vv.Twowheeler();
						}
						
						
						
						break;
			
			case 2 : System.out.println("\nYour interest is in Three wheeler ");
						Vehicle v1= new ThreeWheeler();
						if(v1 instanceof ThreeWheeler )
						{
						ThreeWheeler vv1=(ThreeWheeler)v1;	
						vv1.Threewheeler();
						}
				 	 	break;
			
			case 3 : System.out.println("\nYour interest is in Four wheeler ");
							Vehicle v2= new FourWheeler();
							if(v2 instanceof FourWheeler )
							{
							FourWheeler vv2=(FourWheeler)v2;	
							vv2.Fourwheeler();
							}
						break;
			
			default : System.out.println("\n Invalid Input");
 				  	  
					 break;
		
		
		}

	}

}
