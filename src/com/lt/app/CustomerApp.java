package com.lt.app;

import com.lt.bussiness.CustomerOperations;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerOperations co = new CustomerOperations();
		co.createCustomer();
		co.updateCustomer();
		co.deleteCustomer();

	}

}
