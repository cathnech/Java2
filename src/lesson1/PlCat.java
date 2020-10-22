package lesson1;

import java.sql.SQLOutput;

public class PlCat implements Players,Runnable {
	private String name;
	private double JumpLength;
	private double RunHeight;

	public PlCat(String _name, double _JumpLength, double _RunHeight)
	{
		this.name        =   _name;
		this.JumpLength  =   _JumpLength;
		this.RunHeight   =   _RunHeight;
	}
	@Override
	public void jump() {
		System.out.println("Кот " + name + " прыгает на " + JumpLength + " метров вверх");
	}
	@Override
	public void run() {
		System.out.println("Кот " + name + " пробегает " + RunHeight + " метров");
	}
	@Override
	public double getJumpLength() {
		return JumpLength;
	}
	@Override
	public double getRunHeight() {
		return RunHeight;
	}
}
