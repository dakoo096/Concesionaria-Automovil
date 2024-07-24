package com.automovilproyecto.automovil.persistencia;

import com.automovilproyecto.automovil.logica.Automovil;
import com.automovilproyecto.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    AutomovilJpaController automovilJPA = new AutomovilJpaController();

    public void guardar(Automovil auto) {
        automovilJPA.create(auto);
    }

    public List<Automovil> traerAutos() {
        return automovilJPA.findAutomovilEntities();
    }

    public void borrarAuto(int idAuto) {
        try {
            automovilJPA.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int idAuto) {
        return automovilJPA.findAutomovil(idAuto);
    }

    public void modificarAutomovil(Automovil auto) {
        try {
            automovilJPA.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
