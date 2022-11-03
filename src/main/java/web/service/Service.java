package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarInterface;
import web.model.Car;
import java.util.List;
@org.springframework.stereotype.Service
public class Service implements ServiceInterface{
    private CarInterface carInterface;
    @Autowired
    public Service(CarInterface carInterface) {
        this.carInterface = carInterface;
    }

    @Override
    public List<Car> show() {
        return carInterface.show();
    }

    @Override
    public List<Car> show(int number) {
        return carInterface.show(number);
    }
}
