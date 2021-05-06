package com;

import Abstract.BaseCustomerManager;
import Adapter.MerniceServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
     Customer ahmet  = new Customer(1,"Muhammed Asrın","cesur","53524665354", LocalDate.of(1998,10,27));
      BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
      customerManager.Save(ahmet);

    }
}
