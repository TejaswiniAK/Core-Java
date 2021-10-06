class Weather{
static int numberOfInstance=0;
WeatherSeason season;
float temperatureinCelsius=28.0f;
String humidity;
boolean feel;
Weather(WeatherSeason season, String humidity){
numberOfInstance++;
this.season=season;
this.humidity=humidity;
}
}