package exercise;

public class War {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Army a=new Army(3);
			a.w[0]=new Tank();
			a.w[1]=new Filghter();
		    a.w[2]=new WarShip();
			a.attackAll();
			a.moveAll();
	}

}
