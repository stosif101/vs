package vehicle;

import java.util.Scanner;

public class Swift extends Petrol{
	
	public void showDetail() {
		
		speed = 165;    //accessing Vehicle class member variable
	    mielage = 23;
	    Swift s1=new Swift();
	    s1.setregno("ab-12-cd34");
	    System.out.println("Top speed is "+speed+" Km/hr" + "\n Mileage is "+mielage+" km/l");
	    
	    System.out.println("Do you want to print registration no.\n 1.Press y for YES \n 2.press n for NO");
	    Scanner sc = new Scanner(System.in);
	    char c = sc.next().charAt(0);
	    
	    if(c == 'y' || c=='Y')
	    {
	    	System.out.println("Registration no is= "+s1.getregno());
	    }
	    else
	    {
	    	System.out.println("Invalid Input");
	    }
		
	}

}