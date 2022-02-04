package vehicle;

import java.util.Scanner;

public class Mahindra extends ThreeWheeler {
	
	public void showDetail() {
		
		speed = 32;    //accessing Vehicle class member variable
	    Fuel="Diesel";
		mielage = 27;
	    
	   
	    Mahindra m=new Mahindra();
	    m.setregno("bc-de-2345");
	    System.out.println("speed is "+speed+" Km/hr" + "\n Fuel type is "+Fuel+"\n Mileage is "+mielage+" km/l");
	    
	    System.out.println("do you want to print registration no.\n press 'y' for YES \n press 'n' for NO");
	    Scanner sc = new Scanner(System.in);
	    char c = sc.next().charAt(0);
	    
	    if(c == 'y' || c=='Y')
	    {
	    	System.out.println("Registration no is= "+m.getregno());
	    }
	    else
	    {
	    	System.out.println("Invalid Input");
	    }
		
	}

}