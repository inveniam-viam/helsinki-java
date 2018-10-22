public class OtherStrings {

    public static void main(String[] args) {

        String word = "Supercalifragilisticexpialidocious";
        System.out.println(word.substring(14));
        System.out.println(word.substring(9, 20));

        String book = "Mary Poppins";
        String endpart = book.substring(5);
        System.out.println("Harry " + endpart);

        String wordTwo = "aesthetically";

        int index = wordTwo.indexOf("tic");
        System.out.println(wordTwo.substring(index));

        index = wordTwo.indexOf("ally");
        System.out.println(wordTwo.substring(index));

        index = wordTwo.indexOf("book");
        System.out.println(index);
        System.out.println(wordTwo.substring(index));


    } // close main

} // close class
