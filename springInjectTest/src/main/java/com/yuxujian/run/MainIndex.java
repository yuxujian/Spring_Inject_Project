package com.yuxujian.run;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springInjectTest.Car2;
import springInjectTest.Car;

public class MainIndex {
	
	@Test
	public void demo1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car.getName());
	}
	
	@Test
	public void demo2() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
		Car2 car2 = (Car2) applicationContext.getBean("car2");
		System.out.println(car2.getName());
	}
	
}
