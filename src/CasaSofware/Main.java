/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasaSofware;
import Dao.Archivo;
import datos.Admon;
import datos.CasaSoftware;
import datos.Consultor;
import datos.Contrato;
import datos.Lider;
import datos.Programador;
import excepciones.LenguajeExcepcion;
import excepciones.NombreExcepcion;
import excepciones.SalarioExcepcion;
import java.io.FileNotFoundException;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
       CasaSoftware cs = new CasaSoftware();
       Contrato c2 = null;
       Contrato c3 = null;
       Contrato c4 = null;

        try {
            Contrato c1 = new Consultor(1,"ing");
            cs.adicionarContrato(c1);
            c2= new Admon(2,"Fgrfhgjfykuyk",804560);
            cs.adicionarContrato(c2);
            c3= new Programador(3,"1fxghtdyjujyuj",805560,"java");
            cs.adicionarContrato(c3);
            c4 = new Lider (4,"Vyhjtjytjkuykjyfk",978900, "java");
            cs.adicionarContrato(c4);
             System.out.println(cs.mostrarInformacion());
        System.out.println(cs.calcularSalarioTotal());
        
        Archivo db = new Archivo();
        db.escribir(cs);
        } catch (NombreExcepcion ex) {
            ex.printStackTrace();
        } catch (SalarioExcepcion ex) {
            ex.printStackTrace();
        }catch (LenguajeExcepcion ex) {
            ex.printStackTrace();  
        }catch(FileNotFoundException ex){
    ex.printStackTrace();
    }        
    }}
