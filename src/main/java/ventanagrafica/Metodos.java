package ventanagrafica;

import com.javacomp.procesosdeventa.Administrador;
import com.javacomp.procesosdeventa.Particular;
import com.javacomp.procesosdeventa.Empresa;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Metodos {
    
    static ArrayList<Administrador> admins = new ArrayList<Administrador>();
    static ArrayList<Particular> particulares = new ArrayList<Administrador>();
    static ArrayList<Empresa> empresas = new ArrayList<Administrador>();
    static Administrador adminDefault = new Administrador("admin@javacomp.com", "admin");
    
        public static void cargarDatosAdmin() {
        try {
            FileInputStream istrAdm = new FileInputStream("recursos/CuentasAdmin.dat");
            ObjectInputStream oisAdm = new ObjectInputStream(istrAdm);
            admins = (ArrayList) oisAdm.readObject();
            istrAdm.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        if (admins.isEmpty()) {
            admins.add(adminDefault);
        }
        }
        public static void guardarDatosAdmin() {
        try {
            FileOutputStream ostrAdm = new FileOutputStream("recursos/CuentasAdmin.dat");
            ObjectOutputStream oosAdm = new ObjectOutputStream(ostrAdm);
            oosAdm.writeObject(admins);
            ostrAdm.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
        public static void cargarDatosParticulares() {
        try {
            FileInputStream istrPart = new FileInputStream("recursos/CuentasParticulares.dat");
            ObjectInputStream oisPart = new ObjectInputStream(istrPart);
            particulares = (ArrayList) oisPart.readObject();
            istrPart.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        }
        public static void guardarDatosParticulares() {
        try {
            FileOutputStream ostrPart = new FileOutputStream("recursos/CuentasParticulares.dat");
            ObjectOutputStream oosPart = new ObjectOutputStream(ostrPart);
            oosPart.writeObject(particulares);
            ostrPart.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
        public static void cargarDatosEmpresas() {
        try {
            FileInputStream istrEmp = new FileInputStream("recursos/CuentasEmpresas.dat");
            ObjectInputStream oisEmp = new ObjectInputStream(istrEmp);
            empresas = (ArrayList) oisEmp.readObject();
            istrEmp.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        }
        public static void guardarDatosEmpresas() {
        try {
            FileOutputStream ostrEmp = new FileOutputStream("recursos/CuentasEmpresas.dat");
            ObjectOutputStream oosEmp = new ObjectOutputStream(ostrEmp);
            oosEmp.writeObject(particulares);
            ostrEmp.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
