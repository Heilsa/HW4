public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 23;
        if (age >= 18) {
            System.out.println("Если возраст человека равен  " + age + " ,то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен  " + age + " ,то совершеннолетие еще не наступило, нужно немного подождать");
        }
        System.out.println("Задача 2");
        int cold = 3;
        int warm = 9;
        if (cold < 5) {
            System.out.println("На улице " + cold + " градусов, нужно надеть шапку");
        }
        if (warm > 5) {
            System.out.println("На улице " + warm + " градусов, можно идти без шапки");
        }
        System.out.println("Задача 3");
        int speedmax = 68;
        int speedmin = 34;
        if (speedmax > 60) {
            System.out.println("Если скорость " + speedmax + " , то придётся заплатить штраф");
        }
        if (speedmin < 60) {
            System.out.println("Если скорость " + speedmin + " , то можно ездить спокойно");
        }

        System.out.println("Задача 4");
        int ages = 9;
        if (ages >= 2 && ages <= 6) {
            System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить в детский сад.");
        } else if (ages >= 7 && ages <= 17) {
            System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить в школу.");
        } else if (ages >= 18 && ages <= 24) {
            System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить в университет.");
        } else if (ages > 24) {
            System.out.println("Если возраст человека равен " + ages + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Возраст не соответствует ни одной категории.");
        }
        System.out.println("Задача 5");
        int people = 14;
        if (people < 5) {
            System.out.println("Если возраст ребенка равен " + people + ", то ему нельзя кататься на аттракционе.");
        } else if (people >= 5 && people < 14) {
            System.out.println("Если возраст ребенка равен " + people + ", то ему можно кататься на аттракционе только в сопровождении взрослого.");
        } else if (people >= 14) {
            System.out.println("Если возраст ребенка равен " + people + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        } else {
            System.out.println("Возраст не соответствует ни одной категории.");
        }
        System.out.println("Задача 6");
        int trainCarriage = 102;
        int seatedPlaces = 60;
        int standingPlaces = trainCarriage - seatedPlaces;
        int occupiedSeats = 0;
        if (occupiedSeats < seatedPlaces) {
            System.out.println("Люди будут ехать сидя");
        } else if (occupiedSeats < trainCarriage) {
            System.out.println("Людям придётся ехать стоя");
        } else {
            System.out.println("Вагон уже полностью забит");
        }
        System.out.println("Задача 7");
        int one = 21;
        int two = 233;
        int three = 99;
        if (one > two && one > three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число: " +  two);
        } else if (three > one && three > two) {
            System.out.println("Наибольшее число: " + three);
        }
    }
}