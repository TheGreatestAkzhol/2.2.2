package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDao {
    public List<Car> getCars(){
        Car car1 = new Car(1,"Audi A6",2004);
        Car car2 = new Car(2,"Porsche 911 turbo s",2010);
        Car car3 = new Car(3,"Porsche cayman",2012);
        Car car4 = new Car(4,"Lada priora",2003);
        Car car5 = new Car(5,"Mercedes benz",2014);
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        return cars;
    }
    public List<Car> show(){
        return getCars();
    }
    public List<Car> show(int number){
        List<Car> countCar = getCars();
        if(number>=5) {
            countCar = getCars();
        }else{
            for (int i = 4; i >= number; i--) {
                countCar.remove(i);
            }
        }
        return countCar;
    }
}
