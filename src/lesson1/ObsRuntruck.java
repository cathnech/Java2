package lesson1;

public class ObsRuntruck implements Obstacles{
	private double TruckLenght;

	public ObsRuntruck(double _TruckLenght)
	{
		this.TruckLenght = _TruckLenght;
	}

	@Override
	public boolean wall(double d) {

		return true;
	}

	@Override
	public boolean truck(double d) {
		if (TruckLenght>d) {
			System.out.println("Пробежал дорожку " + TruckLenght + "м");
			return true;
		} else System.out.println("Не смог пробежать дорожку " + TruckLenght + "м");

		return false;
	}
}
