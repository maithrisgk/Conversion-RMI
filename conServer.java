import java.rmi.*;

public class conServer
{
	
	public static void main(String[] args) throws Exception
	{	
		try{
			conImpl srv = new conImpl();
		
			Naming.rebind("conInt",srv);
			System.out.println("binding complete..\n");
		}catch(Exception e){}
	}
}

