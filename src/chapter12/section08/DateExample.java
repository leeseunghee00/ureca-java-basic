package chapter12.section08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();

		System.out.println(now);

		// 날짜 포맷
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow = sdf.format(now);

		System.out.println(strNow);
	}
}
