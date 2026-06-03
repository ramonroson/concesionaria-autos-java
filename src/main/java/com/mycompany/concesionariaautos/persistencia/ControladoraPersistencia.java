
package com.mycompany.concesionariaautos.persistencia;

import com.mycompany.concesionariaautos.logica.Automoviles;
import com.mycompany.concesionariaautos.persistencia.exceptions.NonexistentEntityException;
import java.util.List;


public class ControladoraPersistencia {
    
    AutomovilesJpaController autoJpa = new AutomovilesJpaController();

    public void agregarAuto(Automoviles autoNuevo) {
        autoJpa.create(autoNuevo);

    }

    public List<Automoviles> traerAutos() {
        return autoJpa.findAutomovilesEntities();
    }

    public void borrarAuto(int numeroAuto) {
        try {
            autoJpa.destroy(numeroAuto);
        } catch (NonexistentEntityException ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        }

    public Automoviles traerAutos(int numeroAuto) {
        return autoJpa.findAutomoviles(numeroAuto);
    }

    public void modificarAuto(Automoviles auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    
    
}
