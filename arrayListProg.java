import java.util.ArrayList;

public class arrayListProg {

    public static void main(String[] args) {

        ArrayList<String> teachers = new ArrayList<String>();

        teachers.add("Anthony");
        teachers.add("Barto");
        teachers.add("Paul");
        teachers.add("John");
        teachers.add("Martin");
        teachers.add("Matt");

        System.out.println("Number of teachers: " + teachers.size());
        System.out.println("First teacher on the list: " + teachers.get(0));
        System.out.println("Second teacher on the list: " + teachers.get(1));

        teachers.remove("Barto");

        if (teachers.contains("Barto")) {
            System.out.println("Barto is on the teacher's list");
        }
        else {
            System.out.println("Barto is not on the teacher's list.");
        }
    } // close main


}  // close arrayListProg
