package vehicle;

import java.util.Scanner;

public class Piaggio extends ThreeWheeler {

	
	public void showDetail() {
		// TODO Auto-generated method stub
		speed = 60;    //accessing Vehicle class member variable
	    Fuel="Diesel";
		mielage = 32;
	    
	   
	    Piaggio p=new Piaggio();
	    p.setregno("cd-fe-3456");
	    System.out.println("speed is "+speed+" Km/hr" + " Fuel type is "+Fuel+"\n Mileage is "+mielage+" km/l");
	    
	    System.out.println("do you want to print registration no.\n press 'y' for YES \n press 'n' for NO");
	    Scanner sc = new Scanner(System.in);
	    char c = sc.next().charAt(0);
	    
	    if(c == 'y' || c=='Y')
	    {
	    	System.out.println("Registration no is= "+p.getregno());
	    }
	    else
	    {
	    	System.out.println("Invalid Input");
	    }
		
	}
}