package lt.pi;

import com.pi4j.io.gpio.*;

public class GPIOService {

    // create gpio controller
    final private GpioController gpio = GpioFactory.getInstance();

    GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "Light", PinState.LOW);

    public void light(){
        pin.toggle();
    }



}
