
//server
//menu 
import java.rmi.*;
import java.rmi.server.*;


public class heavyjobImplementationJava extends UnicastRemoteObject implements heavyjob{

		

		public heavyjobImplementationJava() throws RemoteException
		{
		}




		public int functA(int x, int y){

		return x+y;


		}

		public int functB(int x, int y){

		return x-y;

		



		}

		public int functC(int x, int y){

		return x*y;

		



		}





}
