package weather;

public class WeatherTracker {
    String currentConditions;
    Phone phone;
    Email email;

    public WeatherTracker() {
        phone = new Phone();
        email = new Email();
    }

    public void setCurrentConditions(String weatherDescription){
        currentConditions = weatherDescription;
        WeatherFactory weatherFactory = new WeatherFactory();
        weatherFactory.setCurrentConditions(currentConditions);
    }

}