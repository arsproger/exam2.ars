public class Aspirant extends Student {
    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public void getScholarship() {
        if(this.getAverageMark() == 5) {
            System.out.println("Сумма стипендии: " + 2000);
        }
        else {
            System.out.println("Сумма стипендии: " + 1800);
        }
    }


    @Override
    public String toString() {
        return "Aspirant{}";
    }
}
