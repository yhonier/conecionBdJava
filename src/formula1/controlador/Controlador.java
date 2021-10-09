/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1.controlador;

import formula1.modelo.ModeloBd;
import formula1.vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author 505
 */
public class Controlador implements ActionListener{
    
    ModeloBd modelo=new ModeloBd();
    Vista vista= new Vista();

    public Controlador(ModeloBd modelo, Vista vista) {
        
        this.modelo=modelo;
        this.vista=vista;
        
        vista.boton.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        modelo.conectarBd();
       
        
        
    }
    
    
    
    
}
