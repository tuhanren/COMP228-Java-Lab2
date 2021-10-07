package Exercise3;

public class Exercise3 {
    //constructor
    public Exercise3() {}
    //method1
    public static String displayInfo(String schoolName) {
        return "\nThe school name is: " + schoolName;
    }
    //method2
    public static String displayInfo(String schoolName, String programName) {
        return "The school name is: " + schoolName + "\n" +
                "The program name is: " + programName;
    }
    //method3
    public static String displayInfo(String schoolName, String programName, String studentName) {
        return "The school name is: " + schoolName + "\n" +
                "The program name is: " + programName + "\n" +
                "The student name is: " + studentName;
    }
}
