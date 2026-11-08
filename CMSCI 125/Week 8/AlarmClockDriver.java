import java.util.concurrent.TimeUnit;

public class AlarmClockDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AlarmClock ac1 = new AlarmClock();
		
		ac1.setCurrent(9, 15, true);
		ac1.setAlarm(9, 20, true);
		ac1.toggleActive();
		
		System.out.println(ac1.getCurrent());
		System.out.println(ac1.getAlarm());
		
		System.out.println(ac1.toString());
		int count = 6;
		
		
		for(int i = 0; i < count; i++) {
			System.out.println(ac1.toString());
			ac1.advance();
			TimeUnit.MINUTES.sleep(1);
			
		}
		
	}

}
