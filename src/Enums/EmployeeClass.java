package Enums;//package Enums;


//    public enum DaysOfTheWeek {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday};
//
//    static void main() {
//
//        String text = switch (DaysOfTheWeek) {
//            case "Monday" -> "This is 6 letters";
//            case "Tuesday, Thursday" -> "This has 7 letters";
//            case "Wednesday" -> "This has 8 letters";
//        };
//
//        System.out.println(text);
//    }


import java.util.Objects;

public class EmployeeClass {

    private final String name;
    private final int number;

    // To automatically generate getter or setter methods
    // press "alt + insert"
    // also this works for "hasequals()" and "hashcode()" methods
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public EmployeeClass(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeClass that = (EmployeeClass) o;
        return number == that.number && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}