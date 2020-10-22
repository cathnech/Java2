package lesson1;

public class ObsRuntruck implements Obstacles{
	private double TruckLenght;

	public ObsRuntruck(double _TruckLenght)
	{
		this.TruckLenght = _TruckLenght;
	}

	@Override
	public void wall(double d) {

	}

	@Override
	public void truck(double d) {
		if (TruckLenght>d) {
			System.out.println("Пробежал дорожку " + TruckLenght + "м");
		} else System.out.println("Не смог пробежать дорожку " + TruckLenght + "м");

	}
}
