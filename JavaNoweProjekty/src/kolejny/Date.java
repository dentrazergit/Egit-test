package kolejny;

public class Date {

	private int day;
	private int month;
	private int year;
	
	private static final int[] dayInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	public Date(int d, int m, int y){
		month = checkMonth(m);
		year = y;
		day  = checkDay(d);
		
	
		System.out.println("Date object with date : "+this);
		
	}
	private int checkMonth(int m){
		if(m>0&&m<=12){
			return m;
		}else{
			throw new IllegalArgumentException("Wrong month number ");
		}
	}
	private int checkDay(int d){
		if(d>0&&d<=dayInMonth[month]){
			return d;
		}
		if(month == 2 && day== 29 && (year%400==0)||
				(year%4==0&&year%100!=0)){
			return d;
		}else{
			throw new IllegalArgumentException("Wrong day");
		}
	}
	public String toString(){
		return String.format("%d/%d/%d", day,month,year);
	}
}
