package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager
{


    ICustomerCheckService _ICustomerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService _ICustomerCheckService) {
        this._ICustomerCheckService = _ICustomerCheckService;
    }

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
