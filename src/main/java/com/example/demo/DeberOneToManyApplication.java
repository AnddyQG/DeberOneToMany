package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Habitacion;
import com.example.demo.repo.modelo.Hotel;
import com.example.demo.service.IHabitacionService;
import com.example.demo.service.IHotelService;

@SpringBootApplication
public class DeberOneToManyApplication implements CommandLineRunner{
@Autowired
private IHabitacionService habitacionService;
@Autowired
private IHotelService hotelService;

	public static void main(String[] args) {
		SpringApplication.run(DeberOneToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Hotel hotel= new Hotel();
		hotel.setDireccion("Bellwavista");
		hotel.setNombre("AnddySSS");
		
		
		this.hotelService.insertar(hotel);
		
		Habitacion habitacion= new Habitacion();
		habitacion.setNumero("214B");
		habitacion.setValor(new BigDecimal(100));
		habitacion.setHotel(hotel);
		this.habitacionService.insertar(habitacion);
		
	}

}
