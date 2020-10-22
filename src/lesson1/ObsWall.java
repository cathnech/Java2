package lesson1;

public class ObsWall implements Obstacles {
	private double WallHeight;

	public ObsWall(double _WallHeight)
	{
		this.WallHeight = _WallHeight;
	}

	@Override
	public void wall(double d) {
		if (WallHeight>d) {
			System.out.println("Перепрыгнул стену " + WallHeight + "м");
		} else System.out.println("Не смог перепрыгнуть стену " + WallHeight + "м");
	}

	@Override
	public void truck(double d) {

	}
}
