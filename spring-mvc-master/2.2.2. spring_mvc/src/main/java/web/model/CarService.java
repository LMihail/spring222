package web.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
        public List<Car> getlistCar(){
            List <Car> carList = new ArrayList<>();
            carList.add(new Car(1,"ferrari","supercar", 600));
            carList.add(new Car(2,"rangerover","offroad", 450));
            carList.add(new Car(3,"lada","russiacar", 75));
            return carList;
        }
}
