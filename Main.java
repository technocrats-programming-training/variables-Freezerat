public class Main {
    public static void main(final String[] args) {
        // DO NOT CHANGE 
        final String firstName = args[0];
        final String lastName = args[1];
        int age = 0;
        try {
            age = Integer.parseInt(args[2]);
        } catch (final NumberFormatException ex) {
            ex.printStackTrace();
        }
         boolean areNamesSame;
         boolean age3;
         int age2;
         boolean isAgeEven;
         areNamesSame = firstName == lastName;
         age2 = age % 2; 
           isAgeEven = 0 == age2;
         age3 = age > 0; 
        System.out.print("Hello, I am " +firstName+ " " +lastName+ "and I am " +age+ " " + "years old, is my age even? " +isAgeEven+ "is my age greater than zero? " +age3+ " are my first and last names the same? " +areNamesSame );
        
       
         
        // Print out the following string: "Hello, I am <firstName> <lastName>, and I am <age> years old"

        // Print out whether age is even

        // Print out whether firstName equals lastName

        // Print out whether age is greater than 0

    }
}
