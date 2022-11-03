package web.service;

import web.model.Car;

import java.util.List;

public interface ServiceInterface {
    public List<Car> show();
    public List<Car> show(int number);
}
