package com.r2d2.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

@Controller
public class LedController {
	
	private static GpioPinDigitalOutput pin;
	
	@RequestMapping("/")
	public String saludo() {
		return "Hello Artur !!";
	}
	
	@RequestMapping("/led")
	public String led(){
		if(pin == null){
			GpioController gpio = GpioFactory.getInstance();
			pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "mi led", PinState.LOW);
		}
		pin.toggle();
		return "OK";
	}
}

