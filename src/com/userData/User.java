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

public class User {
    public String firstName;
    public String lastName;
    public String email;
    public String phone;
    public String mobilePhone;
    public String password;

    private boolean emailIsOk(String email) {
        char ch;
        boolean ok = true;
        for (int i=0; i<email.length();i++) {
            ch = email.charAt(i);
            if (ch == '@') ok = false;
        }
        return ok;
    }

    private boolean passwordIsOk(String password) {
//        System.out.println(password + " " + password.length());
        if (password.length() < 8 || password.length() > 16) {
            return false;
        }
        return true;
    }

    User(String email, String password) {
        if (this.emailIsOk(email)) {
            System.out.println("Email " + email + " is incorrect!");
        }
        if (!this.passwordIsOk(password)) System.out.println("Password is not correct: more then 16 or less then 8 symbols!");

        this.firstName = "Undefined";
        this.lastName = "Undefined";
        this.email = email;
        this.phone = "Undefined";
        this.mobilePhone = "Undefined";
        this.password = password;
    }
    User(String firstName, String lastName, String email, String phone, String mobilePhone, String password) {
        if (this.emailIsOk(email)) {
            System.out.println("Email " + email + " is incorrect!");
        }
        if (!this.passwordIsOk(password)) System.out.println("Password is not correct: more then 16 or less then 8 symbols!");

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.mobilePhone = mobilePhone;
        this.password = password;
    }

    void displayInfo(){
        System.out.printf("\n--- User Info ---\nfirstName: %s \tlastName: %s E-mail: %s \tPhone: %s \tMobile Phone: %s \tPassword: %s\n",
                this.firstName, this.lastName, this.email, this.phone, this.mobilePhone, this.password);
    }
}