/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import datos.CasaSoftware;
import java.io.FileNotFoundException;

/**
 *
 * @author Estudiante
 */
public interface CasaSoftwareBD {
    public void escribir(CasaSoftware cs) throws FileNotFoundException;
    public CasaSoftware leer ();
    
}
