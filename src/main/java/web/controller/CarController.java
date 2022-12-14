package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.service.ServiceInterface;

import java.util.Optional;

@Controller
@RequestMapping("/cars")
public class CarController {
    private ServiceInterface serviceInterface;
    @Autowired
    public CarController(ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    @GetMapping()
    public String showCars(@RequestParam(value="count",required = false) String count,
            Model model){
        Optional<String> opt = Optional.ofNullable(count);
        if(!opt.isPresent()) {
            model.addAttribute("cars", serviceInterface.show());
        }else {
            System.out.println(count);
            showSomeCars(Integer.parseInt(count),model);
        }
        return "view.car/cars";
    }
    @GetMapping("/{number}")
    public String showSomeCars(@PathVariable("number") int id, Model model) {
            model.addAttribute("cars",serviceInterface.show(id));
            return "view.car/show";
        }
}
