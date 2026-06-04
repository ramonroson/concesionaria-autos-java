
package com.mycompany.concesionariaautos.logica;

import com.mycompany.concesionariaautos.persistencia.ControladoraPersistencia;
import java.util.List;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardarAuto(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        
        //SETEAMAOS LOS VALORES AL NUEVO AUTO, ES DECIR LOS VALORES QUE RECIBIMOS POR PARAMETRO, LOS DE ARRIBA, SE LOS ASIGANMOS A UN NUEVO AUTO
        Automoviles autoNuevo = new Automoviles();
        autoNuevo.setModelo(modelo);
        autoNuevo.setMarca(marca);
        autoNuevo.setMotor(motor);
        autoNuevo.setColor(color);
        autoNuevo.setPatente(patente);
        autoNuevo.setCantPuertas(cantPuertas);
        
        //LLAMAMOS A LA PERSISTENCIA PARA QUE PUEDA CREAR UN NUEVO AUTO
        this.controlPersis.agregarAuto(autoNuevo);  
    }
    
   public void editarAuto(Automoviles auto){
       controlPersis.modificarAuto(auto);
   }

    public List<Automoviles> traerAutos() {
        return controlPersis.traerAutos();
    }

    public void borrarAuto(int numeroAuto) {
        controlPersis.borrarAuto(numeroAuto);
    }

    public Automoviles traerAuto(int numeroAuto) {
        return controlPersis.traerAuto(numeroAuto);
    }

    public void modificarAuto(Automoviles auto,String modelo, String marca, String motor, String color, String patente, int cantidadPuertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantidadPuertas);
        this.editarAuto(auto);
        controlPersis.modificarAuto(auto);
    }
    
}
