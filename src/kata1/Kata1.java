package kata1;

import java.time.LocalDate;


public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Jose",LocalDate.of(1999,12,23));
        System.out.println(person.getName()+" tiene " + person.getAge() + " años");
    }    
}
