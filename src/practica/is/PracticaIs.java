/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.is;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class PracticaIs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola");
        
        Person p1;
        //Date birth = new Date (94,6,24);
        Calendar birth = GregorianCalendar.getInstance();
        birth.set(1994,6,24);
        p1 = new Person("Judit", "Correa", birth);
        System.out.println(p1.getFullName());
        System.out.println(p1.getCumple().getTime());
        System.out.println(p1.getAge());
        System.out.println("fin ");
    }
}
