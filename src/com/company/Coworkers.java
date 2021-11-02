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
}

