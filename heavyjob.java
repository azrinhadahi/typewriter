

//client interface
//menu 
import java.rmi.*;

				//remote is class rmi
public interface heavyjob extends Remote{

		//list of all functions

		public int functA(int x, int y) throws RemoteException;
		public int functB(int x, int y) throws RemoteException;
		public int functC(int x, int y) throws RemoteException;

		
		
}

