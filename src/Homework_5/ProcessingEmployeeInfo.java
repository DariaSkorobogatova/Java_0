package Homework_5;

public class ProcessingEmployeeInfo {

    public static void main(String[] args) {

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employeesArray[1] = new Employee("George Aaron", "Ballet Dancer", "aaron@mailbox.com", "892374920", 40000, 41);
        employeesArray[2] = new Employee("Oliver Barber", "Flight Attendant", "barber@mailbox.com", "892363902", 50000, 37);
        employeesArray[3] = new Employee("Sara Gold", "Violinist", "gold@mailbox.com", "892339646", 60000, 45);
        employeesArray[4] = new Employee("Ema Light", "Dentist", "light@mailbox.com", "892377739", 70000, 40);

        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].getAge() > 40) {
                System.out.println(employeesArray[i].info());
            }
        }
    }
}
