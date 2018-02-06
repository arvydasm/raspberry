package lt.pi;

import com.pi4j.io.gpio.*;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

public class GPIOService {



    // create gpio controller
    final private GpioController gpio = GpioFactory.getInstance();



    final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "Light", PinState.LOW);

    final GpioPinDigitalInput input = gpio.provisionDigitalInputPin(RaspiPin.GPIO_02, PinPullResistance.PULL_DOWN);

    public GPIOService() {
        addListeners();
    }


    public void light(){
        pin.toggle();
    }

    private void addListeners() {
        input.addListener((GpioPinListenerDigital)
                (GpioPinDigitalStateChangeEvent event)	->	{
                    //	set	output	state	to	match	the	input	state
                    light();
                });
    }


}
