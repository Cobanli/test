public class StudentUtil {

    /**
     * Calculates and returns the student's grade percentage.
     * earnedPoints – points the student earned
     * totalPoints  – total points possible (must be > 0)
     * The result is a value from 0.0 to 100.0.
     */
    public static double calcPercentage(int earnedPoints, int totalPoints) {
        /* to be implemented in part (a) */
        return ((double) earnedPoints / totalPoints) * 100.0;
    }

    /**
     * Builds an email address in the form
     * first.lastNN@school.edu, where first and last are the
     * the names (optionally lowercase) and NN is the combined
     * length of the two names.
     */
    public static String genStudentEmail(String firstName, String lastName) {
        /* to be implemented in part (b) */
        int nameLength = firstName.length() + lastName.length();
        return firstName.toLowerCase()+lastName.toLowerCase()+nameLength+"@school.edu";
    }

    /**
     * Creates a six-character student ID made up of the first three
     * letters of lastName (optionally uppercase) followed by a random
     * three-digit number from 100 to 999.
     * Precondition: lastName has at least three characters.
     */
    public static String genStudentID(String lastName) {
        /* to be implemented in part (c) */
        return lastName.substring(0,3).toUpperCase()+((int)(Math.random() * 900) + 100);
    }
}


