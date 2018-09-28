package windowBuilder.common;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GetTime {
	Calendar calendar = new GregorianCalendar();
	Instant now = Instant.now();
	LocalDateTime ldt = LocalDateTime.ofInstant(now, ZoneId.systemDefault());
	
	@SuppressWarnings("deprecation")
	public int getHour() {
		Date startDate = new Date();
		return startDate.getHours();
	}
	
	@SuppressWarnings("deprecation")
	public int getMinute() {
		Date startDate = new Date();
		return startDate.getMinutes();
	}
	
	@SuppressWarnings("deprecation")
	public int getSecond() {
		Date startDate = new Date();
		return startDate.getSeconds();
	}
}