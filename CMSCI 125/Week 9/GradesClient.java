/* Grades Client
 * Calculates grades statistics
 * REDACTED
 */
import java.text.DecimalFormat;
public class GradesClient {
    public static void main(String[] args) {
        int[] studentGrades = {56, 97, 85, 78, 97, 88, 98, 97, 62, 75, 75};
        final int NUMBER_OF_STUDENTS = studentGrades.length;
// instatiate an object with 20 students
        Grades g1 = new Grades(NUMBER_OF_STUDENTS);
// call toString
        System.out.println("g1:\n" + g1);
        Grades g2 = new Grades(NUMBER_OF_STUDENTS);
// call accessor
        System.out.println("g2: ");
        int[] grades = g2.getTestGrades();
        for (int i = 0; i < grades.length; i++)
            System.out.print(grades[i] + " ");
        System.out.println();
// test equals
        if (g1.equals(g2))
            System.out.println("Objects are equal");
        else
            System.out.println("Objects are not equal");
// create identical objects using mutator
        System.out.println("\nSetting g1 and g2 arrays to studentGrades");
        g1.setTestGrades(studentGrades);
        g2.setTestGrades(studentGrades);
        System.out.println(g1);
        System.out.println("Comparing g1 and g2 for equality");
// test equals again
        if (g1.equals(g2))
            System.out.println("Objects are equal");
        else
            System.out.println("Objects are not equal");
// sort the grades
        System.out.println("\nSorted grades: ");
        grades = g1.sortGrades();
        for (int i = 0; i < grades.length; i++)
            System.out.print(grades[i] + " ");
        System.out.println();
// find highest grade
        System.out.println("The highest grade is " + g1.highestGrade());
// find average grade
        DecimalFormat gradeAvg = new DecimalFormat("0.00");
        System.out.println("The average grade is "
                + gradeAvg.format(g1.averageGrade()));
// find median grade

        System.out.println("The median grade is " + g1.medianGrade());
// find mode
        System.out.println("The mode is " + g1.modeGrade());
    }
}