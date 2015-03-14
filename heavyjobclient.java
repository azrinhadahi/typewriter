
//order
import java.rmi.*;


public class heavyjobclient
{

	public static void main(String args[]){


	try
	{
					
			heavyjob jobs = (heavyjob)Naming.lookup("rmi://localhost:8888/heavyJobs");
			System.out.println(jobs.functA(34,4));

		
	}catch(Exception e)
	{

		e.printStackTrace();
	
	}




	}





}
