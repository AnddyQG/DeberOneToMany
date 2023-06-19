package com.example.demo.service;

import com.example.demo.repo.modelo.Hotel;

public interface IHotelService {
	
	public void insertar(Hotel hotel);
	public void actualizar(Hotel hotel);
	public Hotel buscar(Integer id);
	public void borrar(Integer id);
}
