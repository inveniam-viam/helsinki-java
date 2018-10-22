public class Main {

    public static void main(String[] args) {

        Person pekka = new Person("Pekka");
        Person andrew = new Person("Andrew");

        pekka.becomeOlder();
        pekka.becomeOlder();

        andrew.becomeOlder();

        System.out.println("Pekka's age: " + pekka.getAge());
        System.out.println("Andrew's age: " + andrew.getAge());


        int total = pekka.getAge() + andrew.getAge();

        System.out.println("Pekka and Andrew total of " + total + " years old.");


    } // end main

}
