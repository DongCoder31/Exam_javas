package model;

import Utils.Validate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Student extends Person{
    private String batch;
    private double Mark1;
    private double Mark2;

    public Student(){
        super();
    }

    public Student(int id, String name, String phone, String address, String batch, double mark1, double mark2) {
        super(id, name, phone, address);
        this.batch = batch;
        Mark1 = mark1;
        Mark2 = mark2;
    }

    @Override
    public String toString() {
        return super.toString()+ "\t"+
                "batch= '" + batch +  "\t"+
                "Mark1= " + Mark1 + "\t"+
                "Mark2= " + Mark2 + "aveger= " + getAvgMark();
    }

    @Override
    public void inputPerson(List<Person> personList) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        super.inputDocument(personList);
        this.batch = Validate.getString(br,"Enter bacth: ");
        this.Mark1 = Validate.getDouble(br, "Enter mark1: ");
        this.Mark2 = Validate.getDouble(br, "Enter mark2: ");
    }

    public double getAvgMark(){
        return (this.Mark1+this.Mark2)/2;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getMark1() {
        return Mark1;
    }

    public void setMark1(double mark1) {
        Mark1 = mark1;
    }

    public double getMark2() {
        return Mark2;
    }

    public void setMark2(double mark2) {
        Mark2 = mark2;
    }
}
