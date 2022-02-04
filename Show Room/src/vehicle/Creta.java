package vehicle;

import java.util.Scanner;

public class Creta extends Diesel {
	
public void showDetail() {
		speed = 180;    //accessing Vehicle class member variable
	    mielage = 21.4;
	    
	    Creta n = new Creta();
	    n.setregno("ds-66-6w44");
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



