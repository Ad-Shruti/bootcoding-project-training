package main.app;

import main.Customer;
import main.Order;
import main.OrderMenuItem;
import main.Vendor;

import java.util.Date;

public class Application {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Shruti");
        customer.setCity("Nagpur");
        customer.setState("Maharashtra");
        customer.setAddress("16,Sudarshan nagar ");
        customer.setPhoneNo(8788797455L);
        System.out.println("Customer name : " + customer.getName());
        System.out.println("Phone Number : " + customer.getPhoneNo());


        Vendor vendor = new Vendor();
        vendor.setAddress("Nagpur");
        vendor.setName("Dominos");
        vendor.setPureVeg(true);
        vendor.setPhoneNo(8798968698L);
        System.out.println("Vendor name :" + vendor.getName());
        System.out.println("PURE VEG : "+ vendor.isPureVeg());


        Order order = new Order();
        order.setCustomer(customer);
        order.setOrderDate(new Date());
        System.out.println("Customer : " + order.getCustomer());
        System.out.println("Order Date : " + order.getOrderDate());


        OrderMenuItem orderMenuItem = new OrderMenuItem();
        orderMenuItem.setMenuItem("paneer");
        orderMenuItem.setPrice(300L);
        orderMenuItem.setQuantity(5);
        System.out.println("Menu Item : " + orderMenuItem.getMenuItem());
        System.out.println("Price : " + orderMenuItem.getPrice());
        System.out.println("Quantity : " + orderMenuItem.getQuantity());

    }

}
