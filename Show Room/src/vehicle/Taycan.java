package vehicle;

import java.util.Scanner;

public class Taycan extends Electric 
{
	public void showDetail() {
	speed = 260;    //accessing Vehicle class member variable
    mielage = 180 ;
    
    Taycan n = new Taycan();
    n.setregno("gh-ij-5519");
    System.out.println("speed is "+speed+" Km/hr" + "\n Mileage is "+mielage+"km/Full Charge");
    
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



