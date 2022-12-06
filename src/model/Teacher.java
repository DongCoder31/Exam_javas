package model;

import Utils.Validate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Teacher extends Person{
    private double salary;
    private int numberWordDay;

    public Teacher(){
        super();
    }

    public Teacher(int id, String name, String phone, String address, double salary, int numberWordDay) {
        super(id, name, phone, address);
        this.salary = salary;
        this.numberWordDay = numberWordDay;
    }

    @Override
    public String toString() {
        return super.toString() + "\t"+
                "salary= " + salary + "\t"+
                "numberWordDay= " + numberWordDay + "\t "
              + "salary teacher= " + getSalarys();
    }

    @Override
    public void inputPerson(List<Person> personList) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        super.inputDocument(personList);
        this.salary = Validate.getDouble(br, "Enter salary: ");
        this.numberWordDay = Validate.getInt(br,"Enter number word day: ");
    }

    public double getSalarys(){
        return this.salary*800.000;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberWordDay() {
        return numberWordDay;
    }

    public void setNumberWordDay(int numberWordDay) {
        this.numberWordDay = numberWordDay;
    }
}

