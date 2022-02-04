package vehicle;

import java.util.Scanner;

public class Alto extends Petrol{
	public void showDetail() {
		
		speed = 155;    //accessing Vehicle class member variable
	    mielage = 32;
	    Alto ao=new Alto();
	    ao.setregno("ab-12-cd34");
	    System.out.println("Top speed is "+speed+" Km/hr" + "\n Mileage is "+mielage+" km/l");
	    
	    System.out.println("Do you want to print registration no.\n 1.Press y for YES \n 2.press n for NO");
	    Scanner sc = new Scanner(System.in);
	    char c = sc.next().charAt(0);
	    try {
	    if(c == 'y' || c=='Y')
	    {
	    	System.out.println("Registration no is= "+ao.getregno());
	    }
	    else
	    {
	    	System.out.println("Invalid Input");
	    }
	    }
		finally
		{
			System.out.println("Thank You....!!!!!");
		}
	}

}