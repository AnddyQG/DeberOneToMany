package com.example.demo.repo.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {

	@Id
	@SequenceGenerator(name = "seq_hotel", sequenceName = "seq_hotel", allocationSize = 1)
	@GeneratedValue(generator = "seq_hotel", strategy = GenerationType.SEQUENCE)
	
	@Column(name="hote_id")
	private Integer id;
	@Column(name="hote_nombre")
	private String nombre;
	@Column(name="hote_direccion")
	private String direccion;
	@OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
	private List<Habitacion>habitacions;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	public List<Habitacion> getHabitacions() {
		return habitacions;
	}
	public void setHabitacions(List<Habitacion> habitacions) {
		this.habitacions = habitacions;
	}
	
	
}
