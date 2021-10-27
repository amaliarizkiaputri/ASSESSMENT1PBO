package amaliasoal1;

public class Main {
    public static void main(String[] args) {
        //Bagian Asuransi dan Dropship
        KirimBarang brg1 = new KirimBarang(1, "N0001", "JNE", 21000, "Dropship1", "Surabaya", "Bejo", "DayeuhKolot", true, true, 40000);

        //Bagian Asuransi
        KirimBarang brg2 = new KirimBarang(2, "N0003", "J&T", 21000, "Eiger", "Bandung Kopo", "Tini", "DayeuhKolot", true, 40000);

        //Bagian Normal
        KirimBarang brg3 = new KirimBarang(3, "N0004", "Pos Indonesia", 23000, "Eiger", "Bandung Kopo", "Bambang","DayeuhKolot");

        //Bagian Dropship
        KirimBarang brg4 = new KirimBarang(4, "N0002", "siCepat", 24000, "Dropship2", "Pontianak", "Joko","DayeuhKolot", true);
    }

}
