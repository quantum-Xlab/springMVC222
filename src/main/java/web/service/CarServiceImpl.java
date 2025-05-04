package web.service;

import web.models.Car;

import java.util.List;


public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(List<Car> cars, int count) {

        return cars.stream().limit(count).toList();

    }
}
