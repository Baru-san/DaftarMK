/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package Classes;

    import java.util.StringTokenizer;

    /**
     *
     * @author baru_san
     */
    public class Mata_Kuliah {
        private String namaUser;
        private String namaMK;
        private String jam;
        private String ruang;

        public Mata_Kuliah(String namaUser, String namaMK,String jam,String ruang){
            this.namaUser = namaUser;
            this.namaMK = namaMK;
            this.jam = jam;
            this.ruang = ruang;
        }

        public Mata_Kuliah(String data){
            try {
                String Data[] = new String[10];
                int i =0;
                StringTokenizer sToken = new StringTokenizer(data, ",");

                while (sToken.hasMoreTokens()){
                    Data[i++] = sToken.nextToken();
                }

                this.namaMK = Data[0];
                this.jam = Data[1];
                this.ruang = Data[2];
            } catch(Exception e){
            }
        }

        public String getNamaMK(){
            return this.namaMK;
        }

        public String getJam(){
            return this.jam;
        }

        public String getRuang(){
            return this.ruang;
        }

        public String getNamaUser(){
            return this.namaUser;
        }

    }
