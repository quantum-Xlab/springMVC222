package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarsController {

    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada sedan", "baklazhan", 1));
        cars.add(new Car("Moskvich Svyatogor", "s ozinkovkoy", 1));
        cars.add(new Car("Xiaomi", "red", 0));
        cars.add(new Car("Tesla", "grey", 0));
        cars.add(new Car("Mercedes", "anthracite", 6));

        cars = carService.getCars(cars, count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}
