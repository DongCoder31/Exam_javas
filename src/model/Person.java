package model;

import Utils.Validate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Person {
    private int id;
    private String name;
    private String phone;
    private String address;


    public Person(){

    }

    public Person(int id,String name,String phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                "name=" + name + "\t" +
                "phone=" + phone +"\t" +
                "address= " + address + "\t";
    }

    public void inputDocument(List<Person> personList){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        this.id = (personList.size() > 0) ? (personList.size() + 1) : 1;
        this.name = Validate.getString(br, "Enter  name: ");
        this.phone = Validate.getPhone(br,"Enter phone:");
        this.address = Validate.getString(br,"Enter adress: ");

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }
}
