/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author baru_san
 */
import java.io.IOException;

import Databases.Database;

public class Registrasi extends User{
    public final String email;
    public final String password;

    public Registrasi(String email, String password){
        super(email, password);
        this.email = email;
        this.password = password;
    }

    public boolean cekNamaUser() throws IOException{
        String[] data;
        Database database = new Database();
        data = database.cekDataUser(this.email, this.password);
        
        

        if (this.email.equals(data[0]) && this.password.equals(data[2])) {
            setNama(data[1]);
            setPassword(data[2]);
            setEmail(data[0]);
            return true;
        }
        
        return false;
    }

    public boolean cekEmailUser(){
        String[] data;
        Database database = new Database();
        data = database.cekEmailUser(this.email);

        if(this.email.equals(data[0])) {
            setNama(data[1]);
            setPassword(data[2]);
            setEmail(data[0]);
            return true;
        }
        
        return false;
    }

    public void registrasiUser() throws IOException{
        Database database = new Database();
        database.tulisDataUser(getNama(), getEmail(), getPassword());
    }
}