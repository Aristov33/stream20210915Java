package HomeWork5;

public class Information {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Java Developer", "java1@mail.ru", "89279111", 37000, 45);
        employeeArray[1] = new Employee("Sergeev Sergey", "Teamlead", "teamdlead@gmail.ru", "89279222", 39000, 44);
        employeeArray[2] = new Employee("Kirillov Kirill", "QA-Engineer", "qa1@list.ru", "89279333", 38000, 35);
        employeeArray[3] = new Employee("Slinorov Nik", "Java Developer", "java2@yandex.ru", "89279344", 38000, 35);
        employeeArray[4] = new Employee("Dmitriev Dmitriy", "QA-Engineer", "qa2@rambler.ru", "89279555", 38000, 28);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].print();
            }
        }
    }
}
