package vehicle;

import java.util.Scanner;

public class Fortuner extends Diesel {
	
public void showDetail() {
		speed = 176;    //accessing Vehicle class member variable
	    mielage = 14.4;
	    
	    Fortuner n = new Fortuner();
	    n.setregno("gz-12-7n53");
	    System.out.println("speed is "+speed+" Km/hr" + "\n Mileage is "+mielage+" km/ltr");
	    
	    System.out.println("do you want to print registration no.\n press y for YES \n press n for NO");
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
