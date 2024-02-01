
public class MyDate {
	private int day, month, year;

	public MyDate(int day, int month, int year) {
		if (day > 0 && day < 32)
			this.day = day;
		else
			this.day = 1;
		if (month > 0 && month < 13)
			this.month = month;
		else
			month = 1;
		if (year > 1900)
			this.year = year;
		else
			year = 1900;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day > 0 && day < 32)
			this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month > 0 && month < 13)
			this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 1900)
			this.year = year;
	}
}
