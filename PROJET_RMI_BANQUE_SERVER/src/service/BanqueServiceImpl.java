package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class BanqueServiceImpl extends UnicastRemoteObject implements IBanqueRemote{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	protected BanqueServiceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double conversion(double mt) throws RemoteException {
		
		return 10*mt;
	}


	@Override
	public Date getServerDate() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
