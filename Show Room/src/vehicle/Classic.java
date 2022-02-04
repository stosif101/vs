package vehicle;

import java.util.Scanner;

public class Classic extends RoyalEnfield {
	public void showDetail() {
		// TODO Auto-generated method stub
		speed = 131;    //accessing Vehicle class member variable
	    mielage = 37;
	    Classic cs=new Classic();
	    cs.setregno("e1-f2-h3g4");
	    
	    System.out.println("speed is "+speed+" Km/hr" + "\n Mileage is "+mielage+" km/l");
	    
	    System.out.println("Do you want to print registration no.\n 1.Press y for YES \n 2.press n for NO");
	    Scanner sc = new Scanner(System.in);
	    char c = sc.next().charAt(0);
	    
	    if(c == 'y' || c=='Y')
	    {
	    	System.out.println("Registration no is= "+cs.getregno());
	    }
	    else
	    {
	    	System.out.println("Invalid Input");
	    }
		
	}

}