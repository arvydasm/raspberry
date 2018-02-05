package lt.pi.rest;

import lt.pi.GPIOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GPIORestController {

    @Autowired
    private GPIOService gpioService;

    @RequestMapping("/")
    public String hello() {
        return "Hello world!";
    }

    @RequestMapping(value = "/light", method = RequestMethod.POST)
    public String light() {
        gpioService.light();
        return "ok";
    }


}
