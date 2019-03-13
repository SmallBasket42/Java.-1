package employee;

public class employee {

    String firstname, name, middlename, position, email;
    int salary, age;

    employee(String firstname,
             String name,
             String middlename,
             String position,
             String email,
             int salary,
             int age) {
        this.firstname = firstname;
        this.name = name;
        this.middlename = middlename;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    void getFullInfo() {
        System.out.println("Фамилия: " + firstname + " | Имя: " + name
                + " | Отчество: " + middlename + " | Должность: " + position
                + " | email: " + email + " | Зарплата: " + salary + " | Возраст: "
                + age);
    }

    int getAge() {
        return age;
    }


    public static void main(String[] args) {
        employee[] employees = new employee[5];
        employees[0] = new employee("Попов", "Михаил", "Васильевич",
                "Директор", "popov_mv@mail.ru", 300000, 50);
        employees[1] = new employee("Сноу", "Джон", "Эдуардович", "кризис-менеджер",
                "john_s@mail.ru", 100000, 33);
        employees[2] = new employee("Айлисман", "Моисей", "Лазаревич",
                "начальник склада", "ailisman_m@mail.ru", 90000, 29);
        employees[3] = new employee("Швацнеггер", "Арнольд", "Петрович",
                "начальник СБ", "terminator_1984@mail.ru", 110000, 45);
        employees[4] = new employee("Гадот", "Галина", "Андреевна",
                "маркетолог", "gadot_ga@MAIL.RU", 150000, 28);

        for (employee e : employees)
           if (e.getAge() > 40) e.getFullInfo();
    }
}
