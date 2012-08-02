
public class ThisTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleTime time = new SimpleTime(15,12,34);
		System.out.println(time.buildString());
	}
}
	class SimpleTime{
		
		private int hour;
		private int minute;
		private int second;
		
		public SimpleTime(int hour,int minute,int second){
			this.hour = hour;
			this.minute = minute;
			this.second = second;
			
		}
		
		public String buildString(){
			
			return String.format("%24s: %s\n%24s: %s\n", "this.toUniversalTime",this.toUniversalTime(),
					"toUniversalTime",toUniversalTime());
		}
		public String toUniversalTime(){
			return String.format("%02d:%02d:%02d", this.hour,this.minute,this.second);
		}
	}


