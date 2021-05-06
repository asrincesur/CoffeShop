package com;

import Abstract.BaseCustomerManager;
import Adapter.MerniceServiceAdapter;
import Concrete.NeroCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
     Customer ahmet  = new Customer(1,"asrın","cesur","53524665354", LocalDate.of(1998,10,27));
      BaseCustomerManager customerManager = new NeroCustomerManager(new MerniceServiceAdapter());
      customerManager.Save(ahmet);

    }
}
