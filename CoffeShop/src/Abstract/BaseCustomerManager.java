package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService
{
    @Override
    public  void Save(Customer obj) throws Exception {
        System.out.println("Saved to db: "+ obj.getFirtsName()+" " + obj.getLastName());
    }
}
