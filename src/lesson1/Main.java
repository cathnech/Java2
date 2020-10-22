package lesson1;

public class Main {

	public static void main(String[] args) {

		Players [] players = {
				new PlHuman("Костя", 2,4.7),
				new PlHuman("Миша", 1,3.9),
				new PlCat("Барсик", 2, 3),
				new PlCat("Барсик", 1.7, 8),
				new PlRobot("Тесла", 3.7, 13),
				new PlRobot("Фьюринг", 2.7, 3)
		};
		Obstacles [] obs = {
				new ObsRuntruck(4),
				new ObsWall(2),
				new ObsRuntruck(8),
				new ObsWall(5),
				new ObsRuntruck(2),
				new ObsWall(3)
		};

		for (Players pl : players){
			pl.jump();
			pl.run();
			for (Obstacles ob : obs){
				ob.wall(pl.getJumpLength());
				ob.truck(pl.getRunHeight());
			}
			System.out.println();
		}
	}
}
