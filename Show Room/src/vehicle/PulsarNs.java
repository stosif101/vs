package vehicle;
import java.util.*;

public class PulsarNs extends Bajaj{




public void showDetail() {
	// TODO Auto-generated method stub
	speed = 136;    //accessing Vehicle class member variable
    mielage = 35.6;
   
    PulsarNs n=new PulsarNs();
    n.setregno("ab-cd-1234");
    System.out.println("speed is "+speed+" Km/hr" + "\n Mileage is "+mielage+" km/l");
    
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