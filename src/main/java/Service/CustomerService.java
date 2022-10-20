package Service;

import dao.CustomerDao;
import model.Customer;
import utils.AddressGenerator;
import utils.EmaildGenerator;
import utils.NameGenerator;
import utils.PhoneNumberGenerator;

public class CustomerService {
    private CustomerDao customerDao;
    public CustomerService(){
        customerDao = new CustomerDao();
    }

    public void createDummyCustomer(){
        for (int i = 0; i<100; i++){
            Customer customer = new Customer();
            customer.setId(i+1);
            customer.setName(NameGenerator.getName());
            customer.setAddress(AddressGenerator.getAddress());
            customer.setEmailId(EmaildGenerator.getEmailId(customer.getName()));
            customer.setCity("Nagpur");
            customer.setPhoneNo(PhoneNumberGenerator.getPhoneNumber());

            // TODO: insert customer into database
            customerDao.insertCustomer(customer);
            System.out.println("Customer detail :-");
            System.out.println("Customer name : " + customer.getName());
            System.out.println("Phone Number : " + customer.getPhoneNo());
        }
    }
}
