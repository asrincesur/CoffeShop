package Abstract;

import Entities.Customer;

public class CustomerCheckManager implements  ICustomerCheckService
{
    @Override
    public boolean CheckRealPerson(Customer obj) {
        return true;
    }
}
