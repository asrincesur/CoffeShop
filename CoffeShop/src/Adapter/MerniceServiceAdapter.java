package Adapter;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;

import tr.gov.nvi.tckimlik.WS.*;

public class MerniceServiceAdapter implements ICustomerCheckService
{

    @Override
    public boolean CheckRealPerson(Customer obj) {
       
    	
    
    		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
            long tece = Long.parseLong(obj.getNationalityID());
            
          try {
			return  client.TCKimlikNoDogrula(tece,obj.getFirtsName().toUpperCase(),obj.getLastName().toUpperCase(),obj.getBirthDate().getYear());
		} catch (RemoteException e) {
		
			e.printStackTrace();
		}
    
  
    		
    	return false;
    	
    
    
    }
}
