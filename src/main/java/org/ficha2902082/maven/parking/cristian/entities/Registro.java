package org.ficha2902082.maven.parking.cristian.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {

    //atributos intrinsecos: 
    public LocalDate fechaInicio;
    public LocalTime horaInicio;
    public LocalTime horaFinal;
    public LocalDate fechaFin;
    public Double valor;

    //atributos de relación
    public Carro carro;
    public Cupo cupo;
    public Empleado empleados;

    //Constructor por defecto

    public Registro() {
    }


    public Registro(LocalDate fechaInicio, LocalTime horaInicio, LocalTime horaFinal, LocalDate fechaFin, Double valor,
            Carro carro, Cupo cupo, Empleado empleados) {
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.fechaFin = fechaFin;
        this.valor = valor;
        this.carro = carro;
        this.cupo = cupo;
        this.empleados = empleados;
    }


}
