package lesson1;

import java.util.Random;

public class PlHuman implements Players {
	private String name;
	private double JumpLength;
	private double RunHeight;




	public PlHuman(String _name, double _JumpLength, double _RunHeight)
	{
		this.name        =   _name;
		this.JumpLength  =   _JumpLength;
		this.RunHeight   =   _RunHeight;
	}

	@Override
	public void jump() {
		System.out.println("Человек " + name + " прыгает на " + JumpLength + " метров вверх");
	}
	@Override
	public void run() {
		System.out.println("Человек " + name + " пробегает " + RunHeight + " метров");
	}

	@Override
	public double getJumpLength() {
		return 0;
	}

	@Override
	public double getRunHeight() {
		return 0;
	}
}

