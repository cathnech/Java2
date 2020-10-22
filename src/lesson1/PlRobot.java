package lesson1;

public class PlRobot implements Players{
	private String name;
	private double JumpLength;
	private double RunHeight;

	public PlRobot(String _name, double _JumpLength, double _RunHeight)
	{
		this.name        =   _name;
		this.JumpLength  =   _JumpLength;
		this.RunHeight   =   _RunHeight;
	}
	@Override
	public void jump() {
		System.out.println("Робот " + name + " прыгает на " + JumpLength + " метров вверх");
	}
	@Override
	public void run() {
		System.out.println("Робот " + name + " пробегает " + RunHeight + " метров");
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
