package amaliasoal2;

public class Mobil {
    private String merk;
    private String tahun_keluaran;
    private double harga;
    private int stok;

    public Mobil(String merk, String tahun_keluaran, double harga, int stok){
        this.merk = merk;
        this.tahun_keluaran = tahun_keluaran;
        this.harga = harga;
        this.stok = stok;
    }
    public String getMerk(){
        return merk;
    }
    public String getTahun_keluaran(){
        return tahun_keluaran;
    }
    public double getHarga(){
        return harga;
    }
    public int getStok(){
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void infotersedia(){
        System.out.println("Merk : " + getMerk());
        System.out.println("Harga : " + String.format("%.1f", getHarga()));
        System.out.println("Tahun Keluaran : " + getTahun_keluaran());
        System.out.println("Sisa Stok : " + getStok() + "\n");
    }
}