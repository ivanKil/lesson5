public class Les5 {

    public static void main(String[] args) {
        //Задание 4
        Employee[] arr = {new Employee("Иванов И.В.", "повар", "ivanov@mail.ru", "8912222516", 100000.0f, 44),
                new Employee("Петров Ф.В.", "водитель", "petrov@mail.ru", "89128345556", 200000.0f, 30),
                new Employee("Сидоров И.У.", "дворник", "sidorov@mail.ru", "891238347516", 300000.0f, 20),
                new Employee("Бочкарёв Д.В.", "учитель", "bochkarev@mail.ru", "89167334756", 400000.0f, 42),
                new Employee("Козлов А.В.", "юрист", "kozlov@mail.ru", "8912834890", 500000.0f, 18)};

        //Задание 5
        System.out.println("Сотрудники старше 40 лет:");
        for (Employee e : arr)
            if (e.getAge() >= 40)
                System.out.println(e);
    }
}

