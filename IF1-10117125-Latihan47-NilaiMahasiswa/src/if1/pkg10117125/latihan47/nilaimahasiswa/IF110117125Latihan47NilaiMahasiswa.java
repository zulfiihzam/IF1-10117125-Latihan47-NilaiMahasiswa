/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan47.nilaimahasiswa;

/**
 * Nama : Zulfi Ihzam Rahmat
 * Kelas: IF-1
 * NIM  : 10117125
 *Deskripsi Program : program ini berisi program yang nilai mahasiswa beserta
 *                    indexnya
 */
public class IF110117125Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai mahasiswa = new Nilai(75, 45, 34);
        System.out.println("QUIZ : " + mahasiswa.getnQuiz());
        System.out.println("UTS : " + mahasiswa.getnUts());
        System.out.println("UAS : " + mahasiswa.getnUas());
        System.out.println("");
        System.out.println("Nilai Akhir : " + mahasiswa.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Indeks : " + mahasiswa.nilaiIndeks(mahasiswa.hitungNilaiAkhir()));
        System.out.println("Keterangan : " + mahasiswa.indeksKeterangan(mahasiswa.nilaiIndeks(mahasiswa.hitungNilaiAkhir())));
        System.out.println("");
    
        Nilai mahasiswa2 = new Nilai(60, 80, 75);
        System.out.println("QUIZ : " + mahasiswa2.getnQuiz());
        System.out.println("UTS : " + mahasiswa2.getnUts());
        System.out.println("UAS : " + mahasiswa2.getnUas());
        System.out.println("");
        System.out.println("Nilai Akhir : " + mahasiswa2.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Indeks : " + mahasiswa2.nilaiIndeks(mahasiswa2.hitungNilaiAkhir()));
        System.out.println("Keterangan : " + mahasiswa2.indeksKeterangan(mahasiswa2.nilaiIndeks(mahasiswa2.hitungNilaiAkhir())));
        System.out.println("");

        Nilai mahasiswa3 = new Nilai(30, 80, 40);
        System.out.println("QUIZ : " + mahasiswa3.getnQuiz());
        System.out.println("UTS : " + mahasiswa3.getnUts());
        System.out.println("UAS : " + mahasiswa3.getnUas());
        System.out.println("");
        System.out.println("Nilai Akhir : " + mahasiswa3.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Indeks : " + mahasiswa3.nilaiIndeks(mahasiswa3.hitungNilaiAkhir()));
        System.out.println("Keterangan : " + mahasiswa3.indeksKeterangan(mahasiswa3.nilaiIndeks(mahasiswa3.hitungNilaiAkhir())));
        System.out.println("");
    }
    
}
