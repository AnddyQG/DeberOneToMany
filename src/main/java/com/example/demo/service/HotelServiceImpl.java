package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IHotelRepo;
import com.example.demo.repo.modelo.Hotel;
@Service
public class HotelServiceImpl implements IHotelService{
@Autowired
private IHotelRepo hotelRepo;
	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepo.agregar(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepo.actualizar(hotel);
	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.hotelRepo.encontrar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.hotelRepo.eliminar(id);
	}

}
