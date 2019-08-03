package pl.sda.weather.controller;

import org.json.JSONObject;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RootController{
    
    @FXML
    private TextField city;
    
    @FXML
    private Button find;
    
    @FXML
    private Label temperature;
    @FXML
    private Label temp_c;
@FXML
    private String temperatureC;

    public void getWeather(ActionEvent actionEvent) {

        temperature.setText(city.getText());

        WeatherService weatherService = new WeatherService(
                "http://api.apixu.com/v1/current.json",
                "8378abafd53249d8bfa81431191307"
        );

        FasterImplementation fasterImplementation = new FasterImplementation(weatherService, city.getText());

        String temperatureC = Float.toString(fasterImplementation.getWeather().getCurrent().getTemp_c());
        temperature.setText(temperatureC);

    }



}
