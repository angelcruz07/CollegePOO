package login;
import java.io.*;
import javax.swing.*;

import javax.swing.JOptionPane;

public class Login {
    private String  user;
    private String password;

    private String USERS_ROUTE = "C:\\Users\\Angel\\IdeaProjects\\POO\\17-Login\\src\\database\\users.txt";

    public void Login(){
    }

    public boolean login(String user, String password){
      try (BufferedReader br = new BufferedReader(new FileReader(USERS_ROUTE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String storedUser = line.trim();
                String storedPassword = br.readLine().trim();
     
                if (storedUser.equals(user) && storedPassword.equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error leyendo el archivo");
        }
        
        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        return false;

    }

    public void register(){
         try (BufferedWriter bw = new BufferedWriter(new FileWriter(USERS_ROUTE, true))) {
            if (userExist(user)) {
                JOptionPane.showMessageDialog(null, "El usuario ya existe");
                return;
            }
            bw.write(user);
            bw.newLine();
            bw.write(password);
            bw.newLine();
            JOptionPane.showMessageDialog(null, "Usuario registrado con éxito");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el usuario");
        }

    }

    private boolean userExist(String user) {
        try (BufferedReader br = new BufferedReader(new FileReader(USERS_ROUTE))) {  
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals(user)) {
                    return true;
                }
                br.readLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error leyendo el archivo");
        }
        return false;
    }
}
