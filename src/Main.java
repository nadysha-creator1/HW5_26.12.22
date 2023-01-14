import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1.");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека больше 18 или равен " + age + " то, он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека меньше 18 и равен " + age + " то, возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
        //Задача 2
        System.out.println("Задача 2.");
        int t = 4;
        if (t >= 5) {
            System.out.println("На улице " + t + " градусов, сегодня тепло, можно идти без шапки.");
        } else {
            System.out.println("На улице " + t + " градусов, сегодня холодно, нужно надеть шапку.");
        }
        //Задача 3
        System.out.println("Задача 3.");
        int V = 45;
        if (V > 60) {
            System.out.println("Если скорость " + V + " то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + V + " то, можно ездить спокойно.");
        }
        //Задача 4
        System.out.println("Задача 4");
        int menAge = 28;
        if (menAge >= 2 && menAge < 6) {
            System.out.println("Если возраст челоека равен " + menAge + ", то ему нужно ходить в детский сад.");
            }else if (menAge >= 7 && menAge < 18) {
                System.out.println("Если возраст человека равен " + menAge + " , то ему нужно ходить в школу.");
            } else if (menAge >= 18 && menAge < 24) {
                System.out.println("Если возраст человека равен " + menAge + ", то его место в университете.");
            } else if (menAge > 24) {
                System.out.println("Если возраст человека равен "+ menAge + ", то ему пора ходить на работу.");
            }
        //Задача 5
        System.out.println("Задача 5.");
        int babyAge=16;
        if (babyAge<5 && babyAge>0){
            System.out.println("Если возраст ребёнка равен "+babyAge+", то он не может кататься на аттракционе.");
        } else if( menAge>5 && menAge<14) {
            System.out.println("Если  возраст ребёнка равен " + babyAge + ", то он может кататься только в сопровождении взрослого.");
        } else if ( menAge>14){
            System.out.println("Если возраст ребёнка равен "+babyAge+", то он может кататься без сопровождения взрослого.");
        }
        //Задача
        System.out.println("Задача 6.");
        int allPlace=102;
        int seatPlace=60;
        int currentPlace=110;
        if (currentPlace>=allPlace){
            System.out.println("Вагон уже полностью забит.");
        }else if (currentPlace>60 && currentPlace<=102) {
                System.out.println("Есть только стоячее место  вагоне.");
        }else if (currentPlace>=1 && currentPlace<60) {
            System.out.println("Есть сидячее место в вагоне.");
    }
        //Задача 7
        System.out.println("Задача 7");
        int one=8;
        int two=14;
        int three=24;
        if(one>two&&one>three){
            System.out.println("Большее число one равное "+one+".");
        }else if(two>three){
            System.out.println("Большее число two равное "+ two+".");
        } else {
            System.out.println("Большее число three равное "+three+".");
        }

    }
    }





