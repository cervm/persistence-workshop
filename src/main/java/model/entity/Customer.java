package model.entity;

import model.CustomerGroup;
import model.IDataAccessObject;

import java.util.List;

/**
 * Created by rajmu on 17.03.28.
 */
public class Customer extends ContactDetails implements IDataAccessObject<Customer> {
    private int cid;
    private CustomerGroup group; //TODO: needs to be somehow initialized
    private String name;

    public Customer(int id, String phone, String email, String address, String postcode, String city, String country, int id1, String name) {
        super(id, phone, email, address, postcode, city, country);
        this.cid = id1;
        this.name = name;
    }

    public int getCid() {
        return cid;
    }

    public CustomerGroup getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    @Override
    protected int getContactId() {
        return super.getContactId();
    }

    @Override
    protected String getPhone() {
        return super.getPhone();
    }

    @Override
    protected String getEmail() {
        return super.getEmail();
    }

    @Override
    protected String getAddress() {
        return super.getAddress();
    }

    @Override
    protected String getPostcode() {
        return super.getPostcode();
    }

    @Override
    protected String getCity() {
        return super.getCity();
    }

    @Override
    protected String getCountry() {
        return super.getCountry();
    }

    @Override
    public List<Customer> getAll() {
        return null; //TODO: to be implemented
    }

    @Override
    public Customer getById(int id) {
        return null; //TODO: to be implemented
    }

    @Override
    public void create(Customer object) {
        //TODO: to be implemented
    }

    @Override
    public void update(Customer object) {
        //TODO: to be implemented
    }

    @Override
    public void delete(Customer object) {
        //TODO: to be implemented
    }
}
