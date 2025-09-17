import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /// Task 1
        int age= new Random().nextInt(121);

        System.out.print("Если возраст человека равен " + age);
        if (age<18){
            System.out.println(" он не достиг совершеннолетия, нужно немного подождать");
        }else {
            System.out.println(" он совершеннолетний");
        }

        /// Task 2
        int temperature= new Random().nextInt(50-(-60)+1)+(-60);

        System.out.print("На улице " +temperature+ " градусов");
        if (temperature<5){
            System.out.println(" нужно надеть шапку");
        }if (temperature>5) {
            System.out.println(" можно идти без шапки");
        }

        /// Task 3
        int speed = new Random().nextInt(241);

        System.out.print("Если скорость " +speed+ ", то ");
        if (speed<60){
            System.out.println(" можно ездить спокойно");
        }if (speed>60) {
            System.out.println(" придется заплатить штраф");
        }

        /// Task 4
        System.out.print("Если возраст человека равен "+age+", то ему нужно ходить ");
        if (age>=2&&age<6){
            System.out.println("в детский сад");
        }if (age>=7&&age<17) {
            System.out.println("в школу");
        }if (age>=18&&age<=24) {
            System.out.println("в университет");
        }if (age>24){
            System.out.println("на работу");
        }

        /// Task 5
        System.out.print("Если возраст ребенка равен "+age+", то ему ");
        if (age<5){
            System.out.println("нельзя кататься на аттракционе");
        }if (age>5&&age<14) {
            System.out.println("можно кататься на аттракционе в сопровождении");
        }if (age>14){
            System.out.println("можно кататься на аттракционе без сопровождения взрослого");
        }

        /// Task 6
        int people=new Random().nextInt(103);
        if (people<60){
            System.out.println("в вагоне есть сидячее место");
        }if (people>60&&people<102) {
            System.out.println("в вагоне есть стоячее место");
        }if (people>=102){
            System.out.println("вагон уже полностью забит");
        }

        /// Task 7
        int one=new Random().nextInt(101);
        int two=new Random().nextInt(101);
        int three=new Random().nextInt(101);

        if (one>two&&one>three){
            System.out.println("Наибольшее число one = "+one);
        }if (two>one&&two>three){
            System.out.println("Наибольшее число two = "+two);
        }if (three>two&&one<three){
            System.out.println("Наибольшее число three = "+three);
        }
    }
}