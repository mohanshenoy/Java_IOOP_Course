/*
 * Design a Weather java class with a static nested class Forecast. 
 * The Forecast class should predict weather conditions (Sunny, Rainy, Cloudy) based on input data like temperature and humidity. 
 * Use the nested class to predict and display the weather forecast for different cities. 
 */
public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class Weather {

	private static String city;
    
	public static class Forecast {
    	double temperature;
    	double humidity;
    	String weatherCondition;
    
    	public Forecast(String tempCity,double temperature, double humidity) {
    		city = tempCity;
    		this.temperature = temperature;
    		this.humidity = humidity;
    	}
        public void predict() {
        	if(this.temperature > 25 && this.humidity < 60) {
            	weatherCondition = "Sunny";
            }else if (this.humidity >= 60) {
            	weatherCondition ="Rainy";
            }else{
            	weatherCondition = "Cloudy";
            }
        }
        public void display() {
            System.out.println("The forecast for " + city + " is: " + weatherCondition);
        }
    }

    public static void main(String[] args) {
        Weather.Forecast newyorkForecast = new Weather.Forecast("New York",30.0, 45.0);
        newyorkForecast.predict();
        newyorkForecast.display();
        
        Weather.Forecast londonForecast = new Weather.Forecast("London",15.0, 85.0);
        londonForecast.predict();
        londonForecast.display();
    }
}
