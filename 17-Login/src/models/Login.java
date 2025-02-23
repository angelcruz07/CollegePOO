package models;
import java.io.*;

public class Login {
    private String  user;
    private String password;

    // Cambia esta variable con la ruta al directorio del users.txt
    private String USERS_ROUTE;

    public Login(String USERS_ROUTE){
        this.USERS_ROUTE = USERS_ROUTE;
    }

    public Response login(String user, String password){
        if(user.isEmpty() && password.isEmpty()) {
            return new Response(false, "Usuario y contraseña no pueden estar vacios, intenta de nuevo");
        } else if(!userExist(user).ok){
            return new  Response(false, "Usuario no registrado");
        }

      try (BufferedReader br = new BufferedReader(new FileReader(USERS_ROUTE))) {
            String line;

            while ((line = br.readLine()) != null) {
                String storedUser = line.trim();
                String storedPassword = br.readLine().trim();
     
                if (storedUser.equals(user) && storedPassword.equals(password)) {
                   return  new Response(true, "Usuario logueado exitosamente");
                }
            }

        } catch (IOException e) {
           return new Response(false, "Error inesperado");
        }

        return new Response(false, "Credenciales incorrectas");
    }

    public Response register(String user, String password){
         if (user.isEmpty() && password.isEmpty())
             return new Response(false, "Usuario y contraseña no pueden esta vacios");
         
         try (BufferedWriter bw = new BufferedWriter(new FileWriter(USERS_ROUTE, true))) {
            if (userExist(user).ok) {
                return new Response(false, "Usuario ya registrado");
            }

            bw.write(user);
            bw.newLine();
            bw.write(password);
            bw.newLine();
            return new Response(true, "Usuario registrado exitosamente");

        } catch (IOException e) {
             return new Response(false,"Ocurrio un error al registrar el usuario, intenta de nuevo");
        }
    }

    private Response userExist(String user) {
        try (BufferedReader br = new BufferedReader(new FileReader(USERS_ROUTE))) {  
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals(user)) {
                    return new Response(true, "Usuario encontrado");
                }
                br.readLine();
            }
        } catch (IOException e) {
            return new Response(false, "Error inesperado");
        }
        return new Response(false, "Usuario no registrado");
    }
}
