import java.util.*;

class Time{
	int hour;
	int minute;
	int second;

	Time(){
		hour = 0;
		minute = 0;
		second = 0;
	}

     Time (int hour, int minute, int second){
		this.second = second;
		this.minute = minute;
		this.hour = hour;

	}

	void addTime(Time t){

		this.second += t.second;

		this.minute += t.minute;

		this.hour += t.hour;

		this.second += t.second;
		while(this.second >= 60){
			this.minute++;
			
			this.second -= 60;

		}
		this.minute += t.minute;
		while(this.minute >= 60){
			this.hour++;
			this.minute -= 60;
		}

		this.hour += t.hour;

		}

		public void PrintTime(){
			System.out.println(hour+":"+minute+":"+second);
		} 

	
}

public class Lab5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Time in hour,minute,seconds : ");
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		Time t1 = new Time(h,m,s);
		System.out.print("Enter add Time in hour,minute,seconds : ");
		 h = sc.nextInt();
		 m = sc.nextInt();
		 s = sc.nextInt();
		 Time t2 = new Time(h,m,s);

		t1.addTime(t2);
		t1.PrintTime();

	}
}