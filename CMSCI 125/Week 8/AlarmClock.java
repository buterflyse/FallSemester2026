
public class AlarmClock {
	private DigitalTime currentTime = new DigitalTime(12, 0, true);
	private DigitalTime alarmTime = new DigitalTime(12, 0, true);
	private boolean alarmOn;
	
	public AlarmClock() {
		alarmOn = false;
	}
	
	//a toString method that creates a String consisting of the current time, the alarm time, and whether or not the alarm is active.
	
	public String toString() {
		return "Current Time: " + currentTime.toString() + ", Alarm Time: " + alarmTime.toString() + ", Alarm Status: " + alarmOn;
	}
	
	//a method called setCurrent that lets you set the current time, passing whatever parameters would be needed. This method should not involve user input.
	
	public void setCurrent(int newHour, int newMin, boolean newAm) {
		currentTime = new DigitalTime(newHour, newMin, newAm);
	}
	
	// a method called setAlarm that lets you set the alarm time, passing whatever parameters are needed. Again this method should not involve user input.
	
	public void setAlarm(int newHour, int newMin, boolean newAm) {
		alarmTime = new DigitalTime(newHour, newMin, newAm);
	}
	
	// a method called toggleActive that changes the alarm from active to not active and vice versa
	
	public void toggleActive() {
		if(alarmOn == true) {
			alarmOn = false;
		} else {
			alarmOn = true;
		}
	}
	
	// accessor methods getCurrent and getAlarm for both the current time and the alarm time (that’s two different methods)
	
	public DigitalTime getCurrent() {
		return currentTime;
	}
	
	public DigitalTime getAlarm() {
		return alarmTime;
	}
	
	// a method called advance that advances the current time and also prints the message “Alarm!!” if the alarm is active and the current time now matches the alarm time
	
	public void advance() {
		
		if(currentTime.toString().equals(alarmTime.toString()) && alarmOn == true) {
			System.out.println("ALARM!!");
			currentTime.plusTime();
		} else {
			currentTime.plusTime();
		}
	}

}
