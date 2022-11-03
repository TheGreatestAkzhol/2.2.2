package web.dao;

import web.model.Car;

import java.util.List;

public interface CarInterface {
    public List<Car> getCars();
    public List<Car> show();
    public List<Car> show(int number);

}
