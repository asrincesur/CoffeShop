package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager
{

    public NeroCustomerManager(ICustomerCheckService _ICustomerCheckService) {
        this._ICustomerCheckService = _ICustomerCheckService;
    }

    ICustomerCheckService _ICustomerCheckService;



    @Override
    public void Save(Customer obj) throws Exception {
        if(_ICustomerCheckService.CheckRealPerson(obj)){
            super.Save(obj);
        }
        else
        {
            throw new Exception("Not existing person");
        }

    }

}
