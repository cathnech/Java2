package lesson2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int res = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите размерность массива: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String[][] arr = new String[num1][num2];
		System.out.println("Заполните массив: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("Строка %d столбец %d \n",i+1,j+1);
				arr[i][j] = sc.next();
			}
		}
		checkAllandCalculate(arr);
	}


	public static void checkAllandCalculate(String[][] array) throws MyArraySizeException,MyArrayDataException{
		int res = 0;
		if (array.length !=4) {
			throw new MyArraySizeException("Размерность массива должна быть 4x4", array.length);
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				try {
					int x = Integer.parseInt(array[i][j]);
					res += x;
				} catch (NumberFormatException e) {
					throw new MyArrayDataException("Элемент не является числом", i, j);
				}
			}
		}
			System.out.println("Сумма массива:" + res);
		}
}
