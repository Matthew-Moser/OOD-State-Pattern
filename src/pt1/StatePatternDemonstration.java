package pt1;

public class StatePatternDemonstration {

	public static void main(String[] args) {
		Context context = new Context();
		StartBuffATK startbuffatk = new StartBuffATK();
		startbuffatk.doAction(context);
		
		System.out.println(context.getBuffATK().toString());
		
		StopBuffATK stopbuffatk = new StopBuffATK();
		stopbuffatk.doAction(context);
		
		System.out.println(context.getBuffATK().toString());

	}

}
