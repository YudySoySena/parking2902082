package org.ficha2902082.maven.parking.cristian;

import java.util.List;
import java.util.ArrayList;
import org.ficha2902082.maven.parking.cristian.entities.Carro;
import org.ficha2902082.maven.parking.cristian.entities.Cliente;
import org.ficha2902082.maven.parking.cristian.entities.Cupo;
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

        Carro carrito1 = new Carro("KHD 123", TipoVehiculo.CAMION);
        Carro carrito2 = new Carro("GDH 654", TipoVehiculo.BUS);

        //Instanciar un cliente

        Cliente cli = new Cliente("Yudy", "Garcia", TipoDocumento.TI, 1057186769L, 3201245121L, null);

        //Vincular carros al cliente

        cli.addCar(carrito1);
        cli.addCar(carrito2);
        cli.addCar("HYS 234", TipoVehiculo.CAMIONETA);

        //Declara una lista de registros

        List <Registro> misRegistros = new ArrayList<>();

        //Crear dos registros E/S

        Registro registro1 = new Registro (
            LocalDate.of(2024 , Month.JANUARY , 23),
            LocalTime.of(15 , 30 , 34),
            LocalTime.of(7 , 34 , 23),
            LocalDate.of(2024 , Month.FEBRUARY , 1),
            52000.00, 
            cli.misCarros.get(0),
            cupito1

        );

        Registro registro2 = new Registro(
            LocalDate.of(2024 , Month.FEBRUARY , 05),
            LocalTime.of( 7 , 14 , 15),
            LocalTime.of(15, 45, 03),
            LocalDate.of(2024 , Month.FEBRUARY , 20),
            320000.00,
            cli.misCarros.get(1),
            cupito2
        );

        //vincular los registros a la lista
        //de registros
        misRegistros.add(registro1);

        //recorre la lista de registros

        for(Registro r : misRegistros ){

            System.out.println( "Placa: " + r.carro.placa + "|" + "Cupo: " + r.cupo.letra + "|" + "Valor: " + r.valor + "|" + "Fecha de Inicio: " + r.fechaInicio.toString() + "|" + "Fecha Final: " + r.fechaFin + "|" 

            );


        }

    }
}