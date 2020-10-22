package lesson2;

public class MyArrayDataException extends IllegalArgumentException {
	private int num1;
	private int num2;

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}
	public MyArrayDataException(int num1 , int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	public MyArrayDataException(String s, int num1 , int num2){
		super(s);
		this.num1 = num1;
		this.num2 = num2;
	}
}
