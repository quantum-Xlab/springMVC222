package web.models;

public class Car {
    private String carModel;
    private String carColor;
    private int engineCapacity;

    public Car(String carModel, String carColor, int engineCapacity) {
        this.carModel = carModel;
        this.carColor = carColor;
        this.engineCapacity = engineCapacity;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarColor() {
        return this.carColor;
    }

    public void setEngineCapacity(int capacity) {
        this.engineCapacity = capacity;
    }

    public int getEngineCapacity() {
        return this.engineCapacity;
    }
}
