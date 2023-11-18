package com.examen.controller;


	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import java.util.List;
	import java.util.stream.Collectors;

	@RestController
	@RequestMapping("/amaccs/examen/practico")
	public class AlumnoController {

	    public static class Alumno {
	        private String nombre;
	        private int edad;
			public int getEdad() {
				// TODO Auto-generated method stub
				return 0;
			}

	        // Constructor, getters y setters
	    }

	    @PostMapping("/filtrar-por-edad")
	    public List<Alumno> filtrarPorEdad(@RequestBody List<Alumno> alumnos, int edadFiltro) {
	        return alumnos.stream()
	                .filter(alumno -> alumno.getEdad() >= edadFiltro)
	                .collect(Collectors.toList());
	    }
	}

