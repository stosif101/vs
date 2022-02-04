package vehicle;

import java.util.Scanner;

public class Wrangler extends Petrol{
	public void showDetail() {
		
		speed = 100;    //accessing Vehicle class member variable
	    mielage = 12.1;
	    Wrangler w=new Wrangler();
	    w.setregno("ef-31-9j33");
	    System.out.println("Top speed is "+speed+" Km/hr" + "\n Mileage is "+mielage+" km/l");
	    
	    System.out.println("Do you want to print registration no.\n 1.Press y for YES \n 2.press n for NO");
	    Scanner sc = new Scanner(System.in);
	    char c = sc.next().charAt(0);
	    
	    if(c == 'y' || c=='Y')
	    {
	    	System.out.println("Registration no is= "+w.getregno());
	    }
	    else
	    {
	    	System.out.println("Invalid Input");
	    }
		
	}
}


