package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarService {
    static List<Car> getListCars() {
        List<Car> listCars = new ArrayList<>();
        listCars.add(new Car("Tesla", "Model S", 2017));
        listCars.add(new Car("Lexus", "LC 500", 2018));
        listCars.add(new Car("Ferrari", "F8 Tributo", 2019));
        listCars.add(new Car("Porsche", "911 Carrera 4S", 2020));
        listCars.add(new Car("Bugatti", "Centodieci", 2021));
        return listCars;
    }

    static List<Car> getCountCars(Integer count) {
        if (count == null || count < 0 || count >= 5) {
            return getListCars();
        }
        return getListCars().subList(0, count);
    }
}
