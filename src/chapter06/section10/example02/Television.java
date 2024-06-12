package chapter06.section10.example02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;

	/* static block */
	static {
		System.out.print("static...");
		info = company + "-" + model;
	}

	static {
		System.out.print("static2...");
		info = "승히기업";
	}
}
