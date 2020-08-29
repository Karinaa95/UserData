/*
User data;
У пользователя должны быть поля все кроме
- gender
- position
Пользователя можно создать двумя способами
- Все поля обязательные
- Емаил и пароль
Сделать валидацию для полей которая будет сразу проверять валидны они или нет
- емайл убедится что там есть сабака(Не используем регулярные выржения)
- Пароль длина минимум 8, максимум 16.
Сделать класс потомок
- У него будут доп поля(salary, сколько пользователь проработал)
- Методы (поднять ЗП -> если пользователь проработал до 2x лет тогда ЗП увеличивается на 5%,
если проработал 2 - 5 включительно лет то на 10% и более 5 лет на 15%)
 */

package com.userData;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------------------------- Creating new user --------------------------");
	    User user1 = new User("User1","Pupkin", "ipup.test@gmail.com", "+1762387923", "+1234523532524", "user1#2d");
	    user1.displayInfo();
        System.out.println("-------------------------- Creating new user --------------------------");
        User user2 = new User("mestest@gmail.com", "user2%#$2d");
        user2.displayInfo();
        System.out.println("-------------------------- Creating new user --------------------------");
        User user3 = new User("sdftest#gmail.com", "user3%#$2d1233342");
        user3.displayInfo();
        System.out.println("-------------------------- Creating new user --------------------------");
        User user4 = new User("sdftest#gmail.com","user43s$df43kds");
        user3.displayInfo();

        System.out.println("-------------------------- Creating new user --------------------------");
        Worker worker1 = new Worker("Worker1","Pupkin", "ipup.test@gmail.com", "+1762387923", "+1234523532524", "Worker1d", 100,1);
        worker1.increaseSalary();
        worker1.displayInfo();

        worker1.setWorkExp(2);
        worker1.setSalary(100);
        worker1.increaseSalary();
        worker1.displayInfo();

        worker1.setWorkExp(5);
        worker1.setSalary(100);
        worker1.increaseSalary();
        worker1.displayInfo();

        worker1.setWorkExp(7);
        worker1.setSalary(100);
        worker1.increaseSalary();
        worker1.displayInfo();
    }
}
