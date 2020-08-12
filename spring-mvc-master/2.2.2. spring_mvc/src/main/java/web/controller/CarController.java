package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.model.CarService;

import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "locale", required = false) String isLocale, ModelMap model) {

        CarService carService = new CarService();
        List<Car> carList = carService.getlistCar();

        if (!(isLocale == null) && (isLocale.equals("ru"))) {
            model.addAttribute("title", "МАШИНЫ");
        } else {
            model.addAttribute("title", "CARS");
        }
        model.addAttribute("cars", carList);
        return "cars";
    }
}

