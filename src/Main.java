public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Тебе есть 18 или большее количество лет");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
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
            System.out.println("Если скорость " + speedmin + " , то можно ездить спокойно"); }

            System.out.println("Задача 4");
            int young = 3;
            int school = 14;
            int highSchool = 23;
            int job = 28;
            if (young > 2 && young < 6) {
                System.out.println("Если возраст человека равен " + young + ", то ему нужно ходить в детский садик");
            }
            if (school > 8 && school < 17) {
                System.out.println("Если возраст человека равен " + school + " ,то ему нужно ходить в детский садик");
            }
            if (highSchool >= 18 && highSchool <= 24) {
                System.out.println("Если возраст человека равен " + highSchool + " ,то его место в университете");
            }
            if (job > 24) {
                System.out.println("Если возраст человека равен " + job + " ,то ему пора ходить на работу");
            }
        System.out.println("Задача 5");
        int baby = 3;
        int schoolboy = 12;
        int student = 18;
        if (baby < 5) {
            System.out.println("Если возраст ребенка равен " + baby + " ,то ему нельзя кататься на аттракционе");
            if (schoolboy > 5 || schoolboy < 14) {
                System.out.println("Если возраст ребенка равен " + schoolboy + " ,то ему можно кататься на аттракционе в сопровождении взрослых");
            }
            if (student > 14) {
                System.out.println("Если возраст ребенка равен " + student + " ,то ему можно кататься на аттракционе без взрослых");
            }
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
        int one = 5;
        int two = 101;
        int three = 535;
        if (one > two && three > two) {
            System.out.println("Если первая переменная " + one + " И вторая " + two + " не подошли");
        } else {
            System.out.println("То нам подходит вариант под номером три " + three);
        }
    }
}