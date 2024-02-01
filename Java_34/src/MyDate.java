
public class MyDate {
	private int  day, month, year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day > 0 && day < 32) 
			this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month > 0 && month < 13)
			this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year > 1900)
			this.year = year;
	}
	
	@Override
	public String toString() {
		return day + " - " + month + " - " + year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	
}
