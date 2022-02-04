package vehicle;

import java.util.Scanner;

public class PulsarRs extends Bajaj{
	public void showDetail() {
		// TODO Auto-generated method stub
		speed = 140.8;    //accessing Vehicle class member variable
	    mielage = 35;
	    PulsarRs r=new PulsarRs();
	    r.setregno("a1-b2-c3d4");
	    System.out.println("speed is "+speed+" Km/hr" + "\n Mileage is "+mielage+" km/l");
	   
	    System.out.println("do you want to print registration no.\n press y for YES \n press n for NO");
	    Scanner sc = new Scanner(System.in);
	    char c = sc.next().charAt(0);
	    
	    if(c == 'y' || c=='Y')
	    {
	    	System.out.println("Registration no is= "+r.getregno());
	    }
	    else
	    {
	    	System.out.println("Invalid Input");
	    }
		
	}
	

}