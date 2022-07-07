package Practica;

public class Admin {
    private final String user = "Fran";
    private final String password = "Korone12";

    public Admin(){

    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public boolean iniciarSesion(String user, String password){
        boolean verificar = true;

        if(user.equals(getUser()) && password.equals(getPassword())){
            verificar = true;
        }
        else{
            verificar = false;
        }
        return verificar;
    }
}
