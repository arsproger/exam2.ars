import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private static String isElder;
    private double averageMark;
    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public void getScholarship() {
        if(this.averageMark == 5) {
            System.out.println("Сумма стипендии: " + 1000);
        }
        else {
            System.out.println("Сумма стипендии: " + 800);
        }
    }

    public static void searchStudent(Student[] students, String nameStudent) {
        for(Student student: students) {
            if(student.getFirstName().equals(nameStudent)) {
                System.out.println(student);
            }
        }
    }

    public static boolean appointmentOfHeadman(Student[] students, String nameStudent) {
        for(Student student : students) {
            if(student.getFirstName().equals(nameStudent)) {
                isElder = student.getFirstName();
                return true;
            }
        }
        return false;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public static String getIsElder() {
        return isElder;
    }


    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }


    @Override
    public String toString() {
        return "\nfirstName = '" + firstName +
                "\nlastName = '" + lastName +
                "\ngroup = '" + group +
                "\nisElder = '" + isElder +
                "\naverageMark = " + averageMark;
    }
}
