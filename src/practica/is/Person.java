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
    private static final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

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
        return (int)miMetodo(today.getTime()-cumple.getTime());
    }
    
    private long miMetodo (long millis){
        return millis / MILLISECONDS_PER_YEAR;
    }
}
