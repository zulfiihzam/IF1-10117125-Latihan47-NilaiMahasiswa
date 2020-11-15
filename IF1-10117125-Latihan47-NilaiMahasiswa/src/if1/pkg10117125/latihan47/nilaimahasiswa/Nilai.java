/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan47.nilaimahasiswa;

/**
 *
 * @author User
 */
public class Nilai {
    private double nQuiz;
    private double nUts;
    private double nUas;
    private String indeks;
    private String keterangan;
    
    public Nilai(double nQuiz, double nUTS, double nUas){
        this.nQuiz = nQuiz;
        this.nUts = nUTS;
        this.nUas = nUas;
    }

    public double getnQuiz() {
        return nQuiz;
    }

    public double getnUts() {
        return nUts;
    }

    public double getnUas() {
        return nUas;
    }

    public double hitungNilaiAkhir(){
        return (nQuiz*0.2)+(nUts*0.3)+(nUas*0.5);
    }
    public String nilaiIndeks ( double parNilaiAkhir){
        if(parNilaiAkhir >= 80 && parNilaiAkhir <= 100){
            indeks = "A";
        }else if(parNilaiAkhir >= 68 && parNilaiAkhir < 80){
            indeks = "B";
        }else if(parNilaiAkhir >= 56 && parNilaiAkhir < 68){
            indeks = "C";
        }else if(parNilaiAkhir >= 45 && parNilaiAkhir < 56){
            indeks = "D";
        }else if(parNilaiAkhir >= 0 && parNilaiAkhir < 45){
            indeks = "E";
    }
    return indeks;

}
    public String indeksKeterangan (String parIndeks){
        if(parIndeks.equals("A")){
            keterangan = "Sangat Baik";
        }else if(parIndeks.equals("B")){
            keterangan = "Baik"; 
        }else if(parIndeks.equals("C")){
            keterangan = "Cukup";
        }else if(parIndeks.equals("D")){
            keterangan = "Kurang";
        }else if(parIndeks.equals("E")){
            keterangan = "Sangat Kurang";       
        }
        return keterangan;
    } 
}
