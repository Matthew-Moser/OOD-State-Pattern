package pt1;

public class StopBuffATK implements BuffATK {

	@Override
	public void doAction(Context context) {
		System.out.println("Player attack damage buff has expired");
		context.setBuffATK(this);
		}
	public String toString() {
		return "Player attack damage has returned to normal value";
	}

}
