public class StudentRunner {

        public static void main(String[] args)
        {
            // Student information to test methods
            String studentFirst = "Gabbi";
            String studentLast = "Martinez";
            int earned = 340;
            int possible = 400;

            // Note: students could create variables for each method call
            // and then print those variables
            System.out.println(StudentUtil.genStudentEmail(studentFirst, studentLast));
            System.out.println(StudentUtil.genStudentID(studentLast));
            System.out.println(StudentUtil.calcPercentage(earned, possible));
        }
}
