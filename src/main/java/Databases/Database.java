/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Databases;

/**
 *
 * @author baru_san
 */
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.StringTokenizer;


public class Database {
    private static String[] data = new String[1000];
    static StringTokenizer stringtoken;
    private final String fileRegistrasi;
    private final String fileMK;

    public Database(){
        this.fileMK = "src/main/java/Databases/Data_MK.txt";
        this.fileRegistrasi = "src/main/java/Databases/registrasi.txt";
    }

    public String[] cekDataUser(String email, String password) throws IOException{
        try(FileReader fileinput = new FileReader(fileRegistrasi);
            BufferedReader bufferedReader = new BufferedReader(fileinput);) {
                String Data;
                bufferedReader.mark(500);
                bufferedReader.reset();

                while(!(Data = bufferedReader.readLine()).isEmpty()){
                    int i = 0;
                    stringtoken = new StringTokenizer(Data, ",");
                    while (stringtoken.hasMoreTokens()){
                        data[i] = stringtoken.nextToken();
                        i++;
                    }

                    if (email.equals(data[0]) && password.equals(data[2])) {
                        return data;
                    }                
                }
            } catch (Exception e){
                return data;
            }
            return data;
    }

    public String[] cekEmailUser(String email){
        try(FileReader fileinput = new FileReader(fileRegistrasi);
            BufferedReader bufferedReader = new BufferedReader(fileinput);) {
                String Data;
                bufferedReader.mark(500);
                bufferedReader.reset();

                while(!(Data = bufferedReader.readLine()).isEmpty()){
                    int i = 0;
                    stringtoken = new StringTokenizer(Data, ",");
                    while (stringtoken.hasMoreTokens()){
                        data[i] = stringtoken.nextToken();
                        i++;
                    }

                    if (email.equals(data[0])) {
                        return data;
                    }
                }
            } catch(Exception e){
                return data;
            }
            return data;
    }

public List<String[]> DataMK(String user){
  List<String[]> matches = new ArrayList<>();
  try(FileReader fileinput = new FileReader(fileMK);
      BufferedReader bufferedReader = new BufferedReader(fileinput);) {
          String Data;
          bufferedReader.mark(500);
          bufferedReader.reset();

          while(!(Data = bufferedReader.readLine()).isEmpty()){
              StringTokenizer stringtoken = new StringTokenizer(Data, ",");
              int numTokens = stringtoken.countTokens();
              String[] data = new String[numTokens];
              int i = 0;
              while (stringtoken.hasMoreTokens()){
                data[i] = stringtoken.nextToken();
                i++;
              }
              if (user.equals(data[0])) {
                String[] match = Arrays.copyOf(data, data.length);
                matches.add(match);
              }
          }
      } catch(Exception e){
          return matches;
      }
      return matches;
}


    public void tulisDataUser(String nama, String email, String password) throws IOException{
        FileWriter fileOutput = new FileWriter(fileRegistrasi, true);
        try(BufferedWriter bufferOutput = new BufferedWriter(fileOutput);){
            bufferOutput.write(email + "," + nama + "," + password);
            bufferOutput.newLine();
        } catch (Exception e){
        }
    }
    
        public void tulisDataMK(String namaUser, String namaMK, String jam, String ruang) throws IOException{
        FileWriter fileOutput = new FileWriter(fileMK, true);
        try(BufferedWriter bufferOutput = new BufferedWriter(fileOutput);){
            bufferOutput.write(namaUser + "," + namaMK + "," + jam + "," + ruang);
            bufferOutput.newLine();
        } catch (Exception e){
        }
    }


}