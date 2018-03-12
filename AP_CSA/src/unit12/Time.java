package unit12;

public class Time {
private long hours;
private long minutes;
private long seconds;

public Time(long h, long m, long s){
	setHours(h);
	setMinutes(h);
	setSeconds(s);
}

public long getHours() {
	return hours;
}

public void setHours(long hours) {
	this.hours = hours;
}

public long getMinutes() {
	return minutes;
}

public void setMinutes(long minutes) {
	this.minutes = minutes;
}

public long getSeconds() {
	return seconds;
}

public void setSeconds(long seconds) {
	this.seconds = seconds;
}
}
