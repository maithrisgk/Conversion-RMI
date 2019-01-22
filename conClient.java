import java.rmi.*;
import java.util.*;
public class conClient
{

	public static void main(String[] args)
	{
		int n=0;
		try {
			conInt service=(conInt)Naming.lookup("rmi://"+args[0]+"/conInt");
		while(n==0)
{			
			System.out.println("1.Farenheit to Celcuis");
			System.out.println("2.Celcuis to Farenheit");
			System.out.println("3.Exit");
			Scanner s=new Scanner(System.in);
			int m=s.nextInt();
 			float a;
			switch(m)
			{
			case 1:
			{
			System.out.println("Farenheit to celcius");
		
			System.out.println("Enter the Value :");
			a=s.nextFloat();
			System.out.println("Converted Value is ");
			System.out.println(service.f2c(a));
			break;
			}
			case 2:
			{		
			System.out.println("Celcius to Farenheit");
			System.out.println("Enter the Value :");
			a=s.nextFloat();
			System.out.println("Converted Value is ");
			System.out.println(service.c2f(a));
			break;
			}
			case 3:
			n=1;

			}
			}

		} catch(Exception e ){}	
		
		}}
