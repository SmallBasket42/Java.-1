package Home_work_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

   // byte getbyte;
    //getbyte = 2;

    //short code = 2345;

    //int min = -2342;

    //long nights = 365;
    //long seconds;
    //seconds = nights * 6 * 60 * 60;

    //float usd = 65.6f;

    //double pi = 3.14;

      //  char ch = 'L';
        //int intCh = (int) ch;

        //System.out.println("L соответствует "+ intCh);

        //boolean a = true;

    //String string = new String(" Какой прекрасный день ");





        //Scanner scanner  = new Scanner(System.in);
        //System.out.println("Введите превое число:");
        //int a = scanner.nextInt();
        //System.out.println("Введите второе число:");
        //int b = scanner.nextInt();
        //System.out.println("Введите третье число:");
        //int c = scanner.nextInt();
        //System.out.println("Введите четвертое число:");
        //int d = scanner.nextInt();

        //int result;

        //result = a * (b + (c / d));

        //System.out.println("Результат = " + result);




//Scanner scanner = new Scanner(System.in);
//System.out.println("Первое число:");
       // int x = scanner.nextInt();
//System.out.println("Второе число:");
       // int y = scanner.nextInt();

       // if ((x + y)>10 && (x + y)<20 )  {
       //     System.out.println(x + y);
      //  } else {
       //     System.err.println("Условие не входит в рамки");
     //   }




        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите число:");
        //int number = scanner.nextInt();
        //if (number>=0) {
          //  System.out.println("Число положительное");
        //} else
          //  System.out.println("Число отрицательное");





        //static boolean ifnegavive(int number) {       рабочую версию собрать не удалось
          //  return num < 0;
        //}


    //Scanner scanner = new Scanner(System.in);
    //System.out.println("Введите имя: ");
    //String name = scanner.nextLine();
    //System.out.println("Привет!, "+ name);






        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();


        if (year %100==0 && year %400 ==0 )
            System.out.println("Год високосный");

        else if (year % 4 == 0 && year % 100 > 0)
            System.out.println("Год високосный");

        else if (year % 100 == 0)
            System.out.println("Год обычный");

        else
            System.out.println("Год обычный");

    }
}
