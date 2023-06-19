package com.example.demo.repo;

import com.example.demo.repo.modelo.Hotel;

public interface IHotelRepo {

	
	public void agregar(Hotel hotel);
	public void actualizar(Hotel hotel);
	public Hotel encontrar(Integer id);
	public void eliminar(Integer id);
	
}
