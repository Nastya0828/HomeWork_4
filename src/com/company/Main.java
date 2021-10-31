package com.company;

public class Main {

    public static void main(String[] args) {
        Coworkers[] persArray = new Coworkers[5];
        persArray[0] = new Coworkers("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30, true);
        persArray[1] = new Coworkers("Petrov Petr", "Manager", "petr@mailbox.com", "456898201", 80000, 35, true);
        persArray[2] = new Coworkers("Alexandrov Alexandr", "Accountant", "alex@mailbox.com", "412391122", 79000, 40, false);
        persArray[3] = new Coworkers("Nikolaev Nikolay", "Developer", "kolya@mailbox.com", "98658930123", 150000, 30, false);
        persArray[4] = new Coworkers("Kuznetcov Kuzya", "Cook", "kuzya@mailbox.com", "111202556", 17000, 55, true);

        // вывод на консоль вакцинированных
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].vaccination) {
                System.out.println(persArray[i].toString());
            }
        }
    }
}




