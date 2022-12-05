import Utils.Menu;
import Utils.Validate;
import model.ManagerPerson;
import model.Person;
import model.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RunMain {
    public static void main(String[] args) {
        BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
        List<Person> personList = new ArrayList<>();
        ManagerPerson mn = new ManagerPerson(personList);
        int i;

        do {
            Menu.menu();
            do {
                i = Validate.getInt(bc,"Choice: ");
                if ((i < 1) || (i > 7))
                    System.out.println("Enter a number from 1 to 7");
            } while ((i < 1) || (i > 7));

            switch (i) {
                case 1-> {
                    mn.addPerson(personList);
                    System.out.println();
                }
                case 2 -> {
                    mn.show(personList);
                    System.out.println();
                }
                case 3 -> {
                    mn.showStudent();
                    System.out.println();
                }
                case 4 -> {
                    mn.showTeacher();
                    System.out.println();

                }
                case 5 -> {
                    mn.sortAverage(personList);
                }
                case 6 -> {
                    mn.sortNameAlphabetical(personList);
                    System.out.println();

                }
                case 7 -> System.out.println("Program is finished");
            }
        } while (i != 7);


    }
}
