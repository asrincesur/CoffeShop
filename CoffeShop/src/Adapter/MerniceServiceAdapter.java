package Adapter;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class MerniceServiceAdapter implements ICustomerCheckService
{

    @Override
    public boolean CheckRealPerson(Customer obj) {
        KPSPublicSoapClient client = mew KPSPublicSoapClient();
        return  client.TcKimlikNoDogrula(obj.getNationalityID(),obj.getFirtsName().toUpperCase(),obj.getLastName().toUpperCase(),obj.getBirthDate().getYear());
    }
}
