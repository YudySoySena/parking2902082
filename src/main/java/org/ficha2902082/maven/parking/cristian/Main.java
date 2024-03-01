package org.ficha2902082.maven.parking.cristian;

import java.util.List;
import java.util.ArrayList;
import org.ficha2902082.maven.parking.cristian.entities.Carro;
import org.ficha2902082.maven.parking.cristian.entities.Cliente;
import org.ficha2902082.maven.parking.cristian.entities.Cupo;
import org.ficha2902082.maven.parking.cristian.entities.Empleado;
import org.ficha2902082.maven.parking.cristian.entities.Registro;
import org.ficha2902082.maven.parking.cristian.entities.TipoDocumento;
import org.ficha2902082.maven.parking.cristian.entities.TipoVehiculo;
import java.time.*;

public class Main {
    public static void main(String[] args) {

        Cupo cupito1 = new Cupo();
        cupito1.ancho = 1.0;
        cupito1.largo = 4.5;
        cupito1.letra = 'A';

        Cupo cupito2 = new Cupo('B', 5.0, 2.5);
        Cupo cupito3 = new Cupo('C', 6.0, 2.5);

        Carro carrito1 = new Carro("KHD 123", TipoVehiculo.CAMION);
        Carro carrito2 = new Carro("GDH 654", TipoVehiculo.BUS);

        //Instancias de empleado
 
        Empleado empleadito1 = new Empleado("manuela", 5458L);
        Empleado empleadito2 = new Empleado("mario", 1547L);
        Empleado empleadito3 = new Empleado("camilo", 5458L);

        //Instanciar un cliente

        Cliente cli = new Cliente("Yudy", "Garcia", TipoDocumento.TI, 1057186769L, 3201245121L, null);

        //Vincular carros al cliente

        cli.addCar(carrito1);
        cli.addCar(carrito2);
        cli.addCar("HYS 234", TipoVehiculo.CAMIONETA);

        //Declara una lista de registros

        List <Registro> misRegistros = new ArrayList<>();

        //Crear/instanciar dos registros E/S

        Registro registro1 = new Registro (
            LocalDate.of(2024 , Month.JANUARY , 23),
            LocalTime.of(15 , 30 , 34),
            LocalTime.of(7 , 34 , 23),
            LocalDate.of(2024 , Month.FEBRUARY , 1),
            52000.00, 
            cli.misCarros.get(0),
            cupito1, empleadito1

        );

        Registro registro2 = new Registro(
            LocalDate.of(2024 , Month.FEBRUARY , 05),
            LocalTime.of( 7 , 14 , 15),
            LocalTime.of(15, 45, 03),
            LocalDate.of(2024 , Month.FEBRUARY , 20),
            320000.00,
            cli.misCarros.get(1),
            cupito2, empleadito2
        );
        

        LocalDate fi1 = LocalDate.of(2023 , Month.MARCH , 24);
        LocalTime hi1 = LocalTime.of(16 , 30 , 27);

        LocalDate ff1 = LocalDate.of(2024 , Month.MARCH , 14);
        LocalTime hf1 = LocalTime.of(22 , 13 , 27);

        Double valorR3 = 50000.0;

        Registro registro3 = new Registro(fi1 , hi1 , hf1 , ff1 , valorR3 , cli.misCarros.get(0) , cupito3, empleadito3);

        Registro registro4 = new Registro(
            LocalDate.of(2022, Month.APRIL, 25),
            LocalTime.of(14 , 45, 23),
            LocalTime.of(5,23,13),
            LocalDate.of(2024,Month.AUGUST,15),
            300000.00,
            cli.misCarros.get(0),
            cupito1, empleadito1
        );

        Registro registro5 = new Registro(
            LocalDate.of(2023, Month.APRIL, 15),
            LocalTime.of(1 , 25, 23),
            LocalTime.of(13,23,43),
            LocalDate.of(2024,Month.AUGUST,25),
            200000.00,
            cli.misCarros.get(0),
            cupito2, empleadito2
        );       
        

        //vincular los registros a la lista
        //de registros
        misRegistros.add(registro1);
        misRegistros.add(registro2);
        misRegistros.add(registro3);
        misRegistros.add(registro4);
        misRegistros.add(registro5);

        //recorre la lista de registros

        for(Registro r : misRegistros ){

            System.out.println( "Placa: " + r.carro.placa + "|" + "Cupo: " + r.cupo.letra + "|" + "Valor: " + r.valor + "|" + "Fecha de Inicio: " + r.fechaInicio.toString() + "|" + "Fecha Final: " + r.fechaFin + "|" + " Empleado: " + r.empleados.nombre + "|" + " codigo: " + r.empleados.codigo

            );


        
        }



        }

}