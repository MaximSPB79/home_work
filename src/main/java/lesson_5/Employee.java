package lesson_5;

public class Employee {  // поля класса
    private String fullName;
    private String position;
    private String eMail;
    private String telephone;
    private int salary;
    private int age;

    Employee(String employeeName, String employeePosition, String employeeEmail, String employeeTelephone,
             int employeeSalary, int employeeAge) { // конструктор

        this.fullName = employeeName;
        this.position = employeePosition;
        this.eMail = employeeEmail;
        this.telephone = employeeTelephone;
        this.salary = employeeSalary;
        this.age = employeeAge;
    }


    public void info() { // метод класса
        System.out.println("ФИО: " + fullName + "\nДолжность: " + position + "\nПочта: " + eMail + "\nТелефон: "
                + telephone + "\nЗарплата: " + salary + "руб. \nВозраст:" + age + "\n ");
    }

    public static void main(String[] args) {

        Employee[] employeesArray = new Employee[5]; // создаем обьекты класса
        employeesArray[0] = new Employee("Михайлов Михаил Михайлович", "Генеральный директор",
                "mih@mail.ru", "+79998887777", 1500000, 56);
        employeesArray[1] = new Employee("Денисов Денис Дениссович", "Исполнительный директор",
                "din@mail.ru", "+79998886666", 500000, 50);
        employeesArray[2] = new Employee("Исаков Валентин Петрович", "Старший менеджер",
                "val@mail.ru", "+79998885555", 150000, 48);
        employeesArray[3] = new Employee("Куликова Зинаида Федоровна", "Специалист по клинингу",
                "fed@mail.ru", "+79998884444", 30000, 35);
        employeesArray[4] = new Employee("Дядя Вася", "Вахтер",
                "vas@mail.ru", "+79998883333", 25000, 75);
        System.out.println("Сотрудники компании:\n");

        for (int i = 0; i < employeesArray.length; i++) { // выводим информацио о сотрудниках в консоль
            employeesArray[i].info();
        }

        System.out.println("Информация о самых зрелых сотрудниках, кому за 40:\n");
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].age > 40) {
                employeesArray[i].info();
            }
        }
        System.out.println("Молодеж, вами займемся позже!");
    }
}
