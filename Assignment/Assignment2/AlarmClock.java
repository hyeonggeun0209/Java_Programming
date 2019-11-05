
public class AlarmClock {
	private int alarmTime;
	private int numOfAlarm;
	
	public void setAlarmTime(int t) {
		alarmTime = t;
	}
	
	public int getAlarmTime() {
		return alarmTime;
	}
	
	public void setNumOfAlarm(int n) {
		numOfAlarm = n;
	}
	
	public void ring() {
		for (int i=0;i<numOfAlarm;i++)
			System.out.print("Ring!");
			System.out.println();
	}
}
