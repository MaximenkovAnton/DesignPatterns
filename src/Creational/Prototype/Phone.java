package Creational.Prototype;

import java.util.HashMap;

public class Phone extends Prototype {
    private String brand;
    private String model;
    private int year;
    private HashMap<String, String> contactList;

    Phone(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        contactList = new HashMap<>();
    }

    void addContact(String name, String phone){
        contactList.put(name, phone);
    }

    HashMap<String, String> getContactList() {
        return contactList;
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        Phone phone = new Phone(brand, model, year);
        phone.contactList = (HashMap<String, String>) contactList.clone();
        return phone;
    }
}
