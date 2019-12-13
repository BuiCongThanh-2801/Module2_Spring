package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    private static Map<Integer, Customer> customer;
    static {
        customer= new HashMap<>();
        customer.put(1,new Customer(1,"John","john@gmail.com","HaNoi"));
        customer.put(2,new Customer(2,"Thanh","thanh@gmail.com","DaNang"));
        customer.put(3,new Customer(3,"Long","long@gmail.com","HCM"));
        customer.put(4,new Customer(4,"An","an@gmail.com","HaiPhong"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customer.values());
    }

    @Override
    public void save(Customer customer) {
        customer.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customer.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customer.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customer.remove(id);
    }
}
