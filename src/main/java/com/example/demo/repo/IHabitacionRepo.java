package com.example.demo.repo;

import com.example.demo.repo.modelo.Habitacion;

public interface IHabitacionRepo {

	public void agregar(Habitacion habitacion);
	public void actualizar(Habitacion habitacion);
	public Habitacion encontrar(Integer id);
	public void eliminar(Integer id);
}
