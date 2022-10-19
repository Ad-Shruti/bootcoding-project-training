package Service;

import model.Customer;
import utils.AddressGenerator;
import utils.EmaildGenerator;
import utils.NameGenerator;
import utils.PhoneNumberGenerator;

public class CustomerService {

    public void createDummyCustomer(){
        for (int i = 0; i<100; i++){
            Customer customer = new Customer();
           // customer.setCustomerId(i+1);
            customer.setName(NameGenerator.getName());
            customer.setAddress(AddressGenerator.getAddress());
            customer.setEmailId(EmaildGenerator.getEmailId(customer.getName()));
            customer.setCity("Nagpur");
            customer.setPhoneNo(PhoneNumberGenerator.getPhoneNumber());

            // TODO: insert customer into database
            System.out.println("Customer detail :-");
            System.out.println("Customer name : " + customer.getName());
            System.out.println("Phone Number : " + customer.getPhoneNo());
        }
    }
}
