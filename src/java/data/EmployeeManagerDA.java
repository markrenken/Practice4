/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import business.Person;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author fssco
 */
public class EmployeeManagerDA {

    public static ArrayList<Person> getAllEmployees() {
        ArrayList<Person> all = new ArrayList<Person>();
        all.add(new Person("Aaron", "A", "Aaronson", 65,
                LocalDate.of(1980, Month.JANUARY, 1), LocalDate.of(2013, Month.JANUARY, 2)));

        all.add(new Person("Erin", "E", "Erinson", 66,
                LocalDate.of(1980, Month.JANUARY, 1), LocalDate.of(2012, Month.JANUARY, 1)));

        all.add(new Person("Beatrix", "", "Kiddo", 1313,
                LocalDate.of(1976, Month.FEBRUARY, 28), LocalDate.of(2003, Month.OCTOBER, 10)));

        all.add(new Person("Paul", "Muad'Dib", "Atreides", 2000,
                LocalDate.of(1965, Month.APRIL, 4), LocalDate.of(1984, Month.MAY, 5)));

        all.add(new Person("Marty", "", "McFly", 1985,
                LocalDate.of(1968, Month.JUNE, 12), LocalDate.of(1885, Month.JANUARY, 1)));

        all.add(new Person("Daisy", "", "Domergue", 2015,
                LocalDate.of(1840, Month.JULY, 2), LocalDate.of(1870, Month.APRIL, 21)));

        all.add(new Person("Molly", "", "Millions", 1337,
                LocalDate.of(1984, Month.JULY, 1), LocalDate.of(2000, Month.APRIL, 18)));

        all.add(new Person("Mark", "L", "Renken", 1610,
                LocalDate.of(1990, Month.MARCH, 19), LocalDate.of(2018, Month.APRIL, 28)));
        
        all.add(new Person("David", "", "Valkenet", 1987,
                LocalDate.of(1991, Month.JUNE, 14), LocalDate.of(2018, Month.APRIL, 30)));

        all.add(new Person("Rebecca", "", "Trillions", 1001,
                LocalDate.of(1974, Month.JULY, 15), LocalDate.of(2000, Month.APRIL, 5)));

        all.add(new Person("Victoria", "M", "Colwin", 6526,
                LocalDate.of(1980, Month.MARCH, 17), LocalDate.of(2016, Month.APRIL, 15)));

        return all;
    }

    public static ArrayList<Person> search(LocalDate searchDate, String range) {

        ArrayList<Person> temp = new ArrayList<Person>(); //temp list to add found employees to
        ArrayList<Person> all = getAllEmployees(); //gets all of the employees from the other method

        //adds the employee from all at index 0 to the temp list
        if (range.equals("Before")) {
            int c = 0;
            for (Person p : all) {
                
                if (p.getHireDate().isBefore(searchDate)) {
                    temp.add(all.get(c));
                }
                c++;
            }
        }
        if (range.equals("After")) {
            int c = 0;
            for (Person p : all) {
                if (p.getHireDate().isAfter(searchDate)) {
                    temp.add(all.get(c));
                }
                c++;
            }
        }
        return temp;
    }
}
