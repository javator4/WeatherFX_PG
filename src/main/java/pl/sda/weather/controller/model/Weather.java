package pl.sda.weather.controller.model;

import lombok.Data;
import pl.sda.weather.controller.model.Current;
import pl.sda.weather.controller.model.Location;

@Data
public class  Weather {

    private Location location;
    private Current current;

}
