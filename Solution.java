import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp =n;
		int fcounter=0;
		int rcounter=0;
		
		for(int i=n;temp%10!=0;i++,temp++)
		    fcounter++;
		temp=n;
        for(int i=n;temp%10!=0;i--,temp--)
            rcounter++;
            
        if(fcounter<rcounter)
            System.out.println(n+fcounter);
        else if(rcounter<fcounter)
            System.out.println(n-rcounter);
	}
}
