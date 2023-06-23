package hw7;

public interface MeteoSensor {

    int getId(); // Идентификатор датчика
    double getTemperature(); // Температура
    double getHumidity(); // Влажность
    double getPressure(); // Давление

}