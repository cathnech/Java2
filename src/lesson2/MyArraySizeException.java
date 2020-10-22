package lesson2;

public class MyArraySizeException extends NumberFormatException {
	private int num;

	public int getNum() {
		return num;
	}

	public MyArraySizeException(int num) {
		this.num = num;
	}
	public MyArraySizeException(String s, int num){
		super(s);
		this.num = num;
	}
}
