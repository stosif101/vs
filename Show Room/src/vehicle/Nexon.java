package vehicle;

import java.util.Scanner;

public class Nexon extends Electric {
	
public void showDetail() {
		speed = 120;    //accessing Vehicle class member variable
	    mielage = 312;
	    
	    Nexon n = new Nexon();
	    n.setregno("bv-55-6g44");
	    System.out.println("speed is "+speed+" Km/hr" + "\n Mileage is "+mielage+" km/Full Charge");
	    
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
