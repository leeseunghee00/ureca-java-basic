package chapter05.section12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		Week today = null;

		Calendar calendar = Calendar.getInstance();
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);

		today = switch (week) {
			case 1 -> Week.SUNDAY;
			case 2 -> Week.MONDAY;
			case 3 -> Week.TUESDAY;
			case 4 -> Week.WEDNESDAY;
			case 5 -> Week.THURSDAY;
			case 6 -> Week.FRIDAY;
			case 7 -> Week.SATURDAY;
			default -> today;
		};

		System.out.println(today);
	}
}
