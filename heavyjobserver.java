//waiter

import java.rmi.*;
import java.rmi.registry.*;

public class heavyjobserver
{


	public static void main(String args[])
	{

		try
		{

			//heavyjob.java		//heavyJobImplementationJava.java
			heavyjob jobs = new heavyjobImplementationJava();
			Naming.rebind("rmi://localhost:8888/heavyJobs",jobs);	//can be anything
			
			
		}catch(Exception e)
		{


			e.printStackTrace();

		}




	}



}
