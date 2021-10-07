package Exercise3;

public class Exercise3App {
    public static void main(String[] args) {
        //call static method1
        System.out.println(Exercise3.displayInfo("Centennial College"));
        System.out.println("-------------------------");
        //call static method2
        System.out.println(Exercise3.displayInfo("Centennial College",
                                                "Software Engineering"));
        System.out.println("-------------------------");
        //call static method3
        System.out.println(Exercise3.displayInfo("Centennial College",
                                                "Software Engineering",
                                                "TuHanren"));
    }
}
