import java.rmi.*;
import java.rmi.server.*;

public class conImpl extends UnicastRemoteObject implements conInt 
{
	public conImpl() throws RemoteException
	{
		super();
	}
	
	public float c2f(float c) throws RemoteException
	{
		return (float)((180.0/100)*c+32);
	}


	public float f2c(float f) throws RemoteException
	{
		return (float)((f-32.0)/180.0*100);
	}
}

