package lesson1;

public class ObsWall implements Obstacles {
	private double WallHeight;

	public ObsWall(double _WallHeight)
	{
		this.WallHeight = _WallHeight;
	}

	@Override
	public boolean wall(double d) {
		if (WallHeight>d) {
			System.out.println("Перепрыгнул стену " + WallHeight + "м");
			return true;
		} else System.out.println("Не смог перепрыгнуть стену " + WallHeight + "м");
		return false;
	}

	@Override
	public boolean truck(double d) {

		return true;
	}
}
