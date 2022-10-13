import java.util.Scanner;

public class Calculator {
    private static Scanner read;

    public static void main(String[] args) {
        int choose = 1;
        Scanner scunner = new Scanner(System.in);

        while (choose<6){
        System.out.println("5 - Квадратичное уравнение");
        System.out.println("4 - Сочетание");
        System.out.println("3 - Вычитание");
        System.out.println("2 - Деление");
        System.out.println("1 - Умножение");
        System.out.println("Или введите любую другую цифру для выхода");
        choose = scunner.nextInt();

            if (choose == 5) {
                five();
            }
            if (choose == 4) {
                four();
            }
            if (choose == 3) {
                three();
            }
            if (choose == 2) {
                two();
            }
            if (choose == 1) {
                one();
            }else if(choose<1){
                break;
            }
        }

//        Scanner scunner = new Scanner(System.in);
    }
    static void five(){
        Scanner scunner = new Scanner(System.in);

        double itog = 0;
        System.out.println("Число C - ");
        int first = scunner.nextInt();
        System.out.println("Число B - ");
        int second = scunner.nextInt();
        System.out.println("Число A - ");
        int numA = scunner.nextInt();
        int numDiv = (second*second) - 4*(numA*first);
        if (numDiv<0){
            System.out.println("Корней нет");
        }else if(numDiv==0){
            itog = ((-1)*second)/(numA*2);
            System.out.println("X= "+itog);
        }else{
            itog=(((-1)*second)+Math.sqrt(numDiv))/(first*2);
            double itog2=(((-1)*second)- Math.sqrt(numDiv))/(first*2);
            System.out.println("x1 = "+itog);
            System.out.println("x2 = "+itog2);
        }
        }
    static void four(){

        int itog = 0;
        Scanner scunner = new Scanner(System.in);
        System.out.println("Первое слагаемое - ");
        int first = scunner.nextInt();
        System.out.println("Второе слагаемое - ");
        int second = scunner.nextInt();
        itog = first + second;
        System.out.println("Сумма - " + itog);
    }
    static void three(){

        Scanner scunner = new Scanner(System.in);
        int itog = 0;
        System.out.println("Уменьшаемое - ");
        int first = scunner.nextInt();
        System.out.println("Вычитаемое - ");
        int second = scunner.nextInt();
        itog = first - second;
        System.out.println("Разность - " + itog);
    }
    static void two(){

        Scanner scunner = new Scanner(System.in);
        int itog = 0;
        System.out.println("Делимое - ");
        int first = scunner.nextInt();
        System.out.println("Делитель - ");
        int second = scunner.nextInt();
        itog = first / second;
        System.out.println("Частность - " + itog);
    }
    static void one(){

        Scanner scunner = new Scanner(System.in);
        int itog = 0;
        System.out.println("Первый множитель - ");
        int first = scunner.nextInt();
        System.out.println("Второй множитель - ");
        int second = scunner.nextInt();
        itog = first * second;
        System.out.println("Произведение - " + itog);
    }
}