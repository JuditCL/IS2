/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.is;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Person {
    private final String name;
    private final String surname;
    private final Date cumple;

    public Person(String name, String surname, Date cumple) {
        this.name = name;
        this.surname = surname;
        this.cumple = cumple;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getCumple() {
        return cumple;
    }
    public String getFullName(){
        return name +  " " + surname;
    }
    public int getAge(){
        Date today = new Date();
        return (int) ((today.getTime() - cumple.getTime()) / (1000*60*60*24*365.25));
    }
}
