public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Arsen", "Bekboev", "Java", 4.9);
        Student student2 = new Student("Alex", "Petrov", "C#", 5);

        Aspirant aspirant1 = new Aspirant("Lina", "Bravo", "Java", 4.5);
        Aspirant aspirant2 = new Aspirant("Max", "None", "C#", 4.2);

        Student[] studentsList = {student1, student2, aspirant1, aspirant2};

        for(Student studentList : studentsList) {
            studentList.getScholarship();
        }

        Student.searchStudent(studentsList, "Alex");
        System.out.println(Student.appointmentOfHeadman(studentsList, "Alex"));
        System.out.println("Староста группы: " + Student.getIsElder());
    }
}