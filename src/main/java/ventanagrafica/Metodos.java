package ventanagrafica;

import com.javacomp.procesosdeventa.Administrador;
import com.javacomp.procesosdeventa.Particular;
import com.javacomp.procesosdeventa.Empresa;
import com.javacomp.procesosdeventa.Producto;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Metodos {
    
    static ArrayList<Administrador> admins = new ArrayList<>();
    static ArrayList<Particular> particulares = new ArrayList<>();
    static ArrayList<Empresa> empresas = new ArrayList<>();
    static ArrayList<Producto> productos = new ArrayList<>();
    static Administrador adminDefault = new Administrador("admin@javacomp.com", "admin");
    
        public static void cargarDatos() {
        try {
            //se cargan los administradores
            FileInputStream istrAdm = new FileInputStream("recursos/CuentasAdmin.dat");
            ObjectInputStream oisAdm = new ObjectInputStream(istrAdm);
            admins = (ArrayList) oisAdm.readObject();
            istrAdm.close();
            //se cargan los particulares
            FileInputStream istrPart = new FileInputStream("recursos/CuentasParticulares.dat");
            ObjectInputStream oisPart = new ObjectInputStream(istrPart);
            particulares = (ArrayList) oisPart.readObject();
            istrPart.close();
            //se cargan las empresas
            FileInputStream istrEmp = new FileInputStream("recursos/CuentasEmpresas.dat");
            ObjectInputStream oisEmp = new ObjectInputStream(istrEmp);
            empresas = (ArrayList) oisEmp.readObject();
            istrEmp.close();
            //se cargan los productos
            FileInputStream istrProd = new FileInputStream("recursos/ListaProductos.dat");
            ObjectInputStream oisProd = new ObjectInputStream(istrProd);
            productos = (ArrayList) oisProd.readObject();
            istrProd.close();            
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
        public static void guardarDatos() {
        try {
            try ( // se guardan los administradores
                    FileOutputStream ostrAdm = new FileOutputStream("recursos/CuentasAdmin.dat")) {
                ObjectOutputStream oosAdm = new ObjectOutputStream(ostrAdm);
                oosAdm.writeObject(admins);
            }
            try ( //se guardan los particulares
                    FileOutputStream ostrPart = new FileOutputStream("recursos/CuentasParticulares.dat")) {
                ObjectOutputStream oosPart = new ObjectOutputStream(ostrPart);
                oosPart.writeObject(particulares);
            }
            try ( //se guardan las empresas
                    FileOutputStream ostrEmp = new FileOutputStream("recursos/CuentasEmpresas.dat")) {
                ObjectOutputStream oosEmp = new ObjectOutputStream(ostrEmp);
                oosEmp.writeObject(empresas);
            }
            try ( //se guardan los productos
                    FileOutputStream ostrProd = new FileOutputStream("recursos/ListaProductos.dat")) {
                ObjectOutputStream oosProd = new ObjectOutputStream(ostrProd);
                oosProd.writeObject(productos);
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
