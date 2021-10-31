package com.company;

public class Coworkers {
    String name; // ФИО
    String position; //должность
    String email; //eмеил
    String phone;// телефон
    int salary;//зарплата
    int age;//возраст
    boolean vaccination; //вакцинирован или нет

// Конструктор
        Coworkers (String name, String position, String email, String phone, int salary, int age, boolean vaccination){
            this.name= name;
            this.position=position;
            this.email=email;
            this.phone=phone;
            this.salary=salary;
            this.age=age;
            this.vaccination=vaccination;
        }

    public String toString(){

        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n \t Вакцинирован : %b",
                name, position, email, phone, salary, age, vaccination);
        }

    // выводим на консоль
    public void print(){
        System.out.println(this);
    }

//    public void main(String[] args)  {

//        Coworkers[] persArray = new Coworkers[5];
//        persArray[0] = new Coworkers("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30, true);
//        persArray[1] = new Coworkers("Petrov Petr", "Manager", "petr@mailbox.com", "456898201", 80000, 35, true);
//        persArray[2] = new Coworkers("Alexandrov Alexandr", "Accountant", "alex@mailbox.com", "412391122", 79000, 40, false);
//        persArray[3] = new Coworkers("Nikolaev Nikolay", "Developer", "kolya@mailbox.com", "98658930123", 150000, 30, false);
//        persArray[4] = new Coworkers("Kuznetcov Kuzya", "Cook", "kuzya@mailbox.com", "111202556", 17000, 55, true);
//
//        // вывод на консоль вакцинированных
//        for (int i=0; i < persArray.length; i++){
//            if (persArray[i].vaccination) {
//                persArray[i].toString();         }
//        }
//            String key = Coworkers.binarySearch (array, "yes"); // ищем key - число 5 в отсортированном массиве.
//        //метод binarySearch выдаст индекс элемента остортированного массива, в котором "спрятано" искомое число
//        System.out.println(key);//распечатываем индекс искомого числа


            //    if (persArray[i] == "yes") persArray[i].print();

//    }
}

