package model;

import java.util.List;

public interface IPerson {
    void  addPerson(List<Person> personList);
    void  show(List<Person> personList);
    void showStudent();
    void showTeacher();
    void sortAverage(List<Person> personList);
    void sortNameAlphabetical(List<Person> personList);
}
