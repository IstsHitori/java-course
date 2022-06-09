package proyectos;

import java.util.ArrayList;

public class Usuario {
    private String UserID;
    private String PassWord;
    private String LoginStatus;
    private Date RegisterDate;

    public Usuario(){

    }

    public Usuario(String UserID, String PassWord, String LoginStatus, Date RegisterDate){
        this.UserID = UserID;
        this.PassWord = PassWord;
        this.LoginStatus = LoginStatus;
        this.RegisterDate = RegisterDate;
    }

    //Setters y Getters

    public void setUserID(String UserID){
        this.UserID = UserID;
    }

    public String getUserID(){
        return UserID;
    }

    public void setPassWord(String PassWord){
        this.PassWord = PassWord;
    }

    public String getPassWord(){
        return PassWord;
    }

    public void setLoginStatus(String LoginStatus){
        this.LoginStatus = LoginStatus;
    }

    public String getLoginStatus(){
        return LoginStatus;
    }

    public void setRegisterDate(Date RegisterDate){
        this.RegisterDate = RegisterDate;
    }

    public Date getRegisterDate(){
        return RegisterDate;
    }


    public boolean verifyLogin(ArrayList<Cliente> clientes, String user){
        boolean verificar = true;

        if(clientes.contains(user)){
            verificar = true;
        }

        else{
            verificar = false;
        }

        return verificar;
    }

    public String toString(){
        return "USER ID: " + this.UserID;
    }
}
