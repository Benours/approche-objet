package fr.diginamic.dates;

import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, Calendar.MAY);
		calendar.set(Calendar.YEAR, 2016);
		calendar.set(Calendar.DAY_OF_MONTH, 19);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 30);

		System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR));

		Calendar today = Calendar.getInstance(Locale.FRENCH);
		System.out.println(today.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.FRENCH) + "/" + 
				today.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.FRENCH) + "/" + 
				today.get(Calendar.YEAR) + " " +
				today.get(Calendar.HOUR_OF_DAY) + ":" + today.get(Calendar.MINUTE) + ":" + today.get(Calendar.SECOND));

		today = Calendar.getInstance(Locale.GERMAN);
		System.out.println(today.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.GERMAN) + "/" + 
				today.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.FRENCH) + "/" + 
				today.get(Calendar.YEAR) + " " +
				today.get(Calendar.HOUR_OF_DAY) + ":" + today.get(Calendar.MINUTE) + ":" + today.get(Calendar.SECOND));

		today = Calendar.getInstance();
		System.out.println(today.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.SIMPLIFIED_CHINESE) + "/" + 
				today.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.SIMPLIFIED_CHINESE) + "/" + 
				today.get(Calendar.YEAR) + " " +
				today.get(Calendar.HOUR_OF_DAY) + ":" + today.get(Calendar.MINUTE) + ":" + today.get(Calendar.SECOND));

	}

}
