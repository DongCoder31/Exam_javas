package model;

import Utils.Validate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManagerPerson implements IPerson {
    private  List<Person> personList;

    private List<Person> studenList = new ArrayList<>();

    public ManagerPerson(List<Person> personList){
        this.personList = personList;
    }

    //3
    @Override
    public void addPerson(List<Person> personList){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ch;
        System.out.println("Select Person:\n(0) Student.\n (1) Teacher.");
        ch = Validate.getInt(br, "Enter select: ");
        switch (ch){
            case 0:
                System.out.println("Enter Information student:");
                Person student = new Student();
                student.inputPerson(personList);
                personList.add(student);

                System.out.println("Succsesfunlly add student.");
                break;

            case 1:
                System.out.println("Enter Information teach:");
                Person teacher = new Teacher();
                teacher.inputPerson(personList);
                personList.add(teacher);
                System.out.println("Succsesfunlly add teacher.");
                break;

        }


    }

   @Override
    public void show(List<Person> personList) {
        System.out.println("Show all person: ");
        for (Person p : personList)
        {
            if(p instanceof Student){
                Student student = (Student) p;
                System.out.println(student.toString());
            } else if(p instanceof Teacher){
                Teacher teacher = (Teacher) p;
                System.out.println(teacher.toString());
            }
        }

    }
    //4
    @Override

    public void showStudent() {
        System.out.println("Show all student: ");
        for (Person p : personList)
        {
            if(p instanceof Student){
                Student student = (Student) p;
                System.out.println(student.toString());
            }
        }

    }

    //5
    @Override
    public void showTeacher() {
        System.out.println("Show all teacher: ");
        for (Person p : personList)
        {
            if(p instanceof Teacher){
                Teacher teacher = (Teacher) p;
                System.out.println(teacher.toString());
            }
        }

    }
    //8
    @Override
    public void sortAverage(List<Person> personList){
        for (Person p : personList)
        {
            if(p instanceof Student){
                Student student = (Student) p;
                studenList.add(p);
            }
        }

        Collections.sort(studenList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
               Student student1 = (Student) o1;
               Student student2 = (Student) o2;
                if (student1.getAvgMark() > student2.getAvgMark())
                    return 1;
                else  if (student1.getAvgMark() < student2.getAvgMark())
                    return -1;
                else
                    return 0;
            }
        });
          show(studenList);
          studenList.clear();
    }

    //9
    @Override
    public void sortNameAlphabetical(List<Person> personList){
        Collections.sort(personList, new Comparator<Person>(){
            @Override
            public int compare(Person p1, Person p2){
                if (p1.getName().compareToIgnoreCase(p2.getName()) > 0)
                    return 1;
                else if (p1.getName().compareToIgnoreCase(p2.getName()) < 0)
                    return -1;
                else {
                    return 0;
                }
            }
        });

        show(personList);
    }
}
