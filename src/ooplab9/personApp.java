package ooplab9;

public class personApp {

    public static void main(String[] args) {
        Person person = new Person("yuraisa Runheem",22,
                new Address("217 M.6","suratthani",
                        "84170"),
                new Job("Teacher",15000));
        System.out.println(person.toString());


    }//main
}//class