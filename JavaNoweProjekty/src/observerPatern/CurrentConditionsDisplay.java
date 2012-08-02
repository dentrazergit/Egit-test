package observerPatern;

public class CurrentConditionsDisplay implements DisplayElement, Observer{

	private float temperature;
	private float humidity;
	private Subject WeatherData;
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.WeatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
	this.temperature = temp;
	this.humidity = humidity;
	display();
		
	}

}
