package com.examen.service;

import com.examen.controller.AlumnoController;

import java.util.ArrayList;
import java.util.List;

public class AlumnoServiceImpl implements AlumnoService {

    private List<AlumnoController.Alumno> alumnos = new ArrayList<>();

    @Override
    public AlumnoController.Alumno agregarDatosAlumno(AlumnoController.Alumno alumno) {
        // Agrega el nuevo alumno a la lista
        alumnos.add(new Alumno(23, "Andrea", "Bautista", "285522"));
        alumnos.add(new Alumno(30, "Rene", "Zabaleta", "155019"));
        alumnos.add(new Alumno(21, "Jonathan", "Garcia", "074921"));

        return Alumno;
    }
}