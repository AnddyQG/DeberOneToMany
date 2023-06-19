package com.example.demo.service;

import com.example.demo.repo.modelo.Habitacion;

public interface IHabitacionService {

	
	public void insertar(Habitacion habitacion);
	public void actualizar(Habitacion habitacion);
	public Habitacion buscar(Integer id);
	public void borrar(Integer id);
	
}
