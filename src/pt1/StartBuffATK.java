package pt1;

public class StartBuffATK implements BuffATK {

	@Override
	public void doAction(Context context) {
		System.out.println("Player ATK damage has been buffed");
		context.setBuffATK(this);
	}
	public String toString() {
		return "buff applied for one turn";
	}
}
