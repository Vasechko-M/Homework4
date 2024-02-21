public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Задача 1");

        int age = 19;
        if (age>=18) {
            System.out.println("Если возраст человека равен "+ age +" он совершеннослетний");
        }
        else {
            System.out.println("Если возраст человека равен "+ age +
                    " он не достиг совершеннолетия, нужно немного подождать");
        }

        //task 2
        System.out.println("Задача 2");
        int degrees = 7;
        if (degrees<=5){
            System.out.println("На улице " +degrees+" градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " +degrees+" градусов, можно идти без шапки");
        }
        //task 3
        System.out.println("Задача 3");
        int speed = 61;
        boolean dontPay = speed <=60 || speed >1000;
        if (speed>60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        }
        if (dontPay) {
            System.out.println("Если скорость " +speed+ " , то можно ездить спокойно");
        }
        //task4
        System.out.println("Задача 4");
        int age1 = 1;
        boolean kindergarten = age1 >= 2 && age1 <=6;
        if (kindergarten){
            System.out.println("Если возраст человека равен "+age1+" , то ему нужно ходить" +
                    " в детский сад");
        }
        boolean school = age1 > 6 && age1 <=17;
        if (school) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить" +
                    " в школу");
        }
        boolean university = age1 >= 18 && age1 <=24;
        if (university) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить" +
                    " в университет");
        }
        if (age1>24) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить" +
                    " на работу");
                }
        else {
            System.out.println("Если возраст человека равен " + age1 + " , то " +
                    "сидит с мамкой дома");
        }
        //СЧИТАЮ ТАКОЕ ПРИМЕНЕНИЕ ELSE В ДАННМ ЗАДАНИИ ЕДИНСТВЕННО ВЕРНЫМ,
        // ТАК КАК В ДАННОЙ ЗАДАЧЕ ДИАПОЗОННЫЕ ЗНАЧЕНИЯ.

        //task5
        System.out.println("Задача 5");
        int child = 1;
        if (child<5) {
            System.out.println("Если возраст ребенка равен "+child+" , то ему нельзя " +
                    "кататься на атракционе");
        }
                boolean withAdualts = child >= 5 && child <14;
        if (withAdualts) {
            System.out.println("Если возраст ребенка равен " + child + " , то ему можно" +
                    "кататься в сопровождении взрослого");
        }
        if (child>=14) {
            System.out.println("Если возраст ребенка равен " + child + " , то ему можно" +
                    "кататься на атракционе без сопровождения взрослого");
        }
        //НЕ ЗНАЮ КАК В ДАННОМ ПРИМЕРЕ ИСПОЛЬЗОВА ELSE, ЕСЛИ ЗДЕСЬ ДИАПОЗОННЫЕ ЗНАЧЕНИЯ

        //task 6
        System.out.println("Задача 6");
        int carriageCapacity = 121;
        if (carriageCapacity <= 60) {
            System.out.println("Места в вагоне есть как сидячие, так и стоячие.");
        }
        boolean standing = carriageCapacity > 60 && carriageCapacity < 120;
        if (standing) {
            System.out.println("Места в вагоне есть, но только стоячие");
        }
        else {
            System.out.println("Свободных мест в вагоне нет");
        }
        //task7
        System.out.println("Задача 7");
        int one=99;
        int two=9;
        int three=9;
        if (one>two && one>three) {
            System.out.println("Число one самое большое");
        }
        if (two>one && two>three) {
            System.out.println("Число two самое большое");
        }
        if (three>one && three>two) {
            System.out.println("Число three самое большое");
        }

        if (one == two && one == three ) {
            System.out.println("Все числа равны");
        }
        if (one == two && one > three ) {
            System.out.println("Числа one и two больше");
        }
        if (one == three && one > two ) {
            System.out.println("Числа one и three больше");
        }
        if (two == three && two > one ) {
            System.out.println("Числа two и three больше.");
        }


    }
}