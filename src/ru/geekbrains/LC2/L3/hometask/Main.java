package ru.geekbrains.LC2.L3.hometask;

// 1.Создать массив с набором слов (20-30 слов, должны встречаться повторяющиеся):
// Найти список слов, из которых состоит текст (дубликаты не считать);
// Посчитать сколько раз встречается каждое слово (использовать HashMap);
//
// 2. Написать простой класс PhoneBook(внутри использовать HashMap):
// В качестве ключа использовать фамилию
// В каждой записи всего два поля: phone, e-mail
// Отдельный метод для поиска номера телефона по фамилии
// (ввели фамилию, получили ArrayList телефонов), и отдельный метод для поиска e-mail по фамилии.
// Следует учесть, что под одной фамилией может быть несколько записей.
// Итого должно получиться 3 класса Main, PhoneBook, Person.

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        System.out.println("Java 2, Lesson 3");

// part 1:
        String[] myTestArray = {
                "Вася",
                "Петя",
                "Вася",
                "Катя",
                "Маша",
                "Иван",
                "Коля",
                "Лена",
                "Томара",
                "Вова",
                "Вася",
                "стол",
                "комод",
                "пианино",
                "форточка",
                "окно"};

        HashMap<String, Integer> myHashMap = new HashMap<>();

        for(String string: myTestArray) {
            Integer count = myHashMap.get(string);

            if (count == null) {
                count = 1;
            } else {
                count += 1;
            }

            myHashMap.put(string, count);
        }
        System.out.println("Part 1 result:");
        System.out.println(myHashMap);

// part 2
        ArrayList<String> email1 = new ArrayList<String>();
        email1.add("testmail@mail.ru");
        email1.add("somemail@mail.ru");

        ArrayList<String> telnumber1 = new ArrayList<String>();
        telnumber1.add("79161234567");
        telnumber1.add("89126123456");
        telnumber1.add("+7 (495) 123-45-67");

        Person person1 = new Person(email1,telnumber1);

//        person1.getEmail();
//        person1.getTelNumber();

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.addInfo("Pshennikov",person1);

        System.out.println("Part 2 result:");
        myPhoneBook.getMail("Pshennikov");
        myPhoneBook.getNumber("Pshennikov");
    }
}
