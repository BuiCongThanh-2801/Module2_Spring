package model;

import javax.servlet.RequestDispatcher;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
    private String name;
    private Date birthday;
    private String address;
    private String avatar;
    public Customer(String name){
        this.name = name;
    }
    public static List<Customer> getListCustomer() {
        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Mai Văn Hoàn", new Date(1988,01,01) , "address 1", "image/1.PNG"));
        customerList.add(new Customer("Nguyễn Văn Nam", new Date(1989,02,02) , "address 2", "image/2.jpg"));
        return customerList;
    }
    public Customer(String name, Date birthday, String address, String avatar) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
