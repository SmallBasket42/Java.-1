package Home_work_2;

public class Main {
/*1. Задать целочисленный=int массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла for и условия заменить 0 на 1, 1 на 0*/

    public static void main(String[] args) {
       /* int[] array = {1, 1, 0, 0, 1, 0};
        int arrll = array.length;
        for (int i = 0; i < arrll; i++) {
            if (array[i] == 1) array[i] = 0;
            else array[i] = 1;
        }
        System.out.println(" ");
        for (int i = 0; i < arrll; i++) {
            System.out.println(i + " " + array[i]);
        }*/

       /* 2. Задать пустой целочисленный массив размером 8.
        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21*/

      /*  int[] array = new int[8];
        int j = 0;
        int fill = array.length;
        System.out.println(" ");
        System.out.println(" ");

        for (int i = 0; i < fill; ++i, j = j + 3) {
            array[i] = j;
            System.out.print(+array[i] + " ");
            System.out.println(" ");*/



       /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        пройти по нему циклом, и числа меньшие 6 умножить на 2.*/

       /* int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arr3 = array3.length;
        for (int i = 0; i < arr3; i++) {
            if (array3[i] < 6)
                array3[i] = array3[i] * 2;
        }
        System.out.println(" ");
        System.out.print(" ");

        for (int i = 0; i < arr3; i++) {

            System.out.print(+array3[i] + ", ");*/


       /*4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
                и с помощью цикла(-ов) заполнить его диагональные элементы единицами*/
        /*int[][] sqArr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i < j) {
                    sqArr[i][j] = 0;
                } else if (i > j) {
                    sqArr[i][j] = 1;
                } else {
                    sqArr[i][j] = 1;
                }
                System.out.print(sqArr[i][j] + " ");
            }
            System.out.println();
            }
        }
    }*/


    }