package procesosdeventa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Metodos {
    
    private static ArrayList<Persona> admins = new ArrayList<>();
    
    public static void guardarDatos() {
        try {
            FileOutputStream outStreamAdmin = new FileOutputStream("administradores.dat");
            ObjectOutputStream objOutStreamAdmin = new ObjectOutputStream(outStreamAdmin);
            objOutStreamAdmin.writeObject(admins);
            outStreamAdmin.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void cargarDatos() {
        try {
            FileInputStream inStreamAdmin = new FileInputStream("administradores.dat");
            ObjectInputStream objInStreamAdmin = new ObjectInputStream(inStreamAdmin);
            admins = (ArrayList) objInStreamAdmin.readObject();
            inStreamAdmin.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
