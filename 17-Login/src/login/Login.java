package login;
import java.io.*;
import javax.swing.*;

import javax.swing.JOptionPane;

public class Login {
    private String  user;
    private String password;

    private String USERS_ROUTE = "C:\\Users\\Angel\\IdeaProjects\\POO\\17-Login\\src\\database";

    public void Login(){
    }

    public void login(String user, String password){
        


    }

    public void register(){

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
            JOptionPane.showMessageDialog(null, "❌ Error leyendo el archivo");
        }
        return false;
    }
}
