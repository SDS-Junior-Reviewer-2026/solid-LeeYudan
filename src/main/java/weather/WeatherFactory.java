package weather;

public class WeatherFactory {
    public void setCurrentConditions(String weatherDescription) {
        WeatherTracker weatherTracker = new WeatherTracker();
        if (weatherDescription == "rainy") {
            String alert = weatherTracker.phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = weatherTracker.email.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
