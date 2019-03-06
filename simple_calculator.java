package simple_calculator;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class simple_calculator {
    public static void main(String args[]) throws java.io.IOException {
        double z,x1,y1;
        char read;
        String x,y;
        BufferedReader x3,y3;

        System.out.println("Введите 2 числа используя Enter");
        x3 = new BufferedReader(new InputStreamReader(System.in));
        y3 = new BufferedReader(new InputStreamReader(System.in));
        x = x3.readLine();
        if (x.equalsIgnoreCase("")) {
            System.out.println("Пустое значение!");
        }
        y = y3.readLine();
        if (y.equalsIgnoreCase("")) {
            System.out.println("Пустое значение!");
        }
        if (x.equalsIgnoreCase("") && y.equalsIgnoreCase("")) {
            System.out.println("Программа завершена!");
            System.exit(0);
        }
        try{
            x1 = Double.parseDouble(x);
            y1 = Double.parseDouble(y);

            System.out.println(" "+x1+'\n'+" "+y1);

            System.out.println("Выберите действие:\n1.+\n2.-\n3.*\n4./");
            read = (char) System.in.read();
            switch(read){
                case '1':
                    z =x1+y1;
                    System.out.println(" "+z);
                    break;
                case '2':
                    z =x1-y1;
                    System.out.println(" "+z);
                    break;
                case '3':
                    z =x1*y1;
                    System.out.println(" "+z);
                    break;
                case '4':
                    if(y1 == 0) {
                        System.out.println("Нельзя делить на 0");
                    } else {
                        z =x1/y1;
                        System.out.println(" "+z);
                    }
                    break;
                default :
                    System.out.println("Неверный номер операции!");
            }
        } catch(NumberFormatException exc) {
            System.out.println("Неправильное число!");
        }
    }
    }









