package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IHabitacionRepo;
import com.example.demo.repo.modelo.Habitacion;

@Service
public class HabitacionServiceImpl implements IHabitacionService{
@Autowired
private IHabitacionRepo habitacionRepo;
	@Override
	public void insertar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.habitacionRepo.agregar(habitacion);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.habitacionRepo.actualizar(habitacion);
	}

	@Override
	public Habitacion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.habitacionRepo.encontrar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.habitacionRepo.eliminar(id);
	}

}
