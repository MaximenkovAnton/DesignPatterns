package Creational.Prototype;

import java.util.Map;

public class MainPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Phone phone = new Phone("Samsung", "Galaxy Y", 2014);
        phone.addContact("Bob", "5552515");

        Prototype phonePrototype = phone.clone();
        Phone phoneClone = (Phone) phonePrototype;

        phoneClone.addContact("Max", "3512354");

        System.out.println("PHONE:");
        showRecords(phone.getContactList());

        System.out.println("PHONE CLONE:");
        showRecords(phoneClone.getContactList());
    }

    private static void ShowPhoneInfo(Phone phone){

    }

    private static void showRecords(Map<String, String> records){
        for (Map.Entry<String, String> record : records.entrySet()) {
            System.out.print(record.getKey());
            System.out.print("\t");
            System.out.println(record.getValue());
        }
        System.out.println();
    }
}
