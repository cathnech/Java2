package lesson2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
	public static String[][] arr;

		public static void main(String[] args) {

			int res = 0;
			Scanner sc = new Scanner(System.in);

			System.out.println("Введите размерность массива: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			String[][] arr = new String[num1][num2];

			try {
				checkArraySize(num1);
				checkArraySize(num2);
			} catch (MyArraySizeException e) {
				e.printStackTrace();
				System.out.println(e.getNum());
				return;
			}

			System.out.println("Заполните массив: ");

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.printf("Строка %d столбец %d \n",i+1,j+1);
					arr[i][j] = sc.next();

					try {
						int x = Integer.parseInt(arr[i][j]);
						res += x;
					} catch (NumberFormatException e) {
						throw new MyArrayDataException("Элемент не является числом", i, j);
					}

				}
			}
			System.out.println("Сумма массива:" + res);
		}
		public static void checkArraySize(int n) throws MyArraySizeException {
			if (n != 4){
				throw new MyArraySizeException("Размерность массива должна быть 4x4", n);
			}
		}

}
