package vehicle;

import java.util.Scanner;

public class Harrier extends Diesel {
	
public void showDetail() {
		speed = 180;    //accessing Vehicle class member variable
	    mielage = 15-16;
	    
	    Harrier n = new Harrier();
	    n.setregno("vx-28-2j00");
	    System.out.println("speed is "+speed+" Km/hr" + "\n Mileage is "+mielage+" km/ltr");
	    
	    System.out.println("do you want to print registration no.\n press 'y' for YES \n press 'n' for NO");
	    Scanner sc = new Scanner(System.in);
	    char c = sc.next().charAt(0);
	    
	    if(c == 'y' || c=='Y')
	    {
	    	System.out.println("Registration no is= "+n.getregno());
	    }
	    else
	    {
	    	System.out.println("Invalid Input");
	    }
		
	}

}
