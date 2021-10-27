package amaliasoal1;

public class KirimBarang {
        private int no_transaksi;
        private String no_resi, namaekspedisi, namapengirim, alamatpengirim, namapenerima, alamatpenerima;
        private double ongkoskirim, nominalasuransi;
        private boolean statusasuransi, statusdropshipper;

        //Bagian Asuransi dan Dropship
        KirimBarang(int notransaksi, String noresi, String namaekspedisi, double ongkoskirim, String namapengirim, String alamatpengirim, String namapenerima, String alamatpenerima, boolean statusdropshipper, boolean statusasuransi, int nominalasuransi){
            this.no_transaksi = notransaksi;
            this.no_resi = noresi;
            this.namaekspedisi = namaekspedisi;
            this.ongkoskirim = ongkoskirim;
            this.namapengirim = namapengirim;
            this.alamatpengirim = alamatpengirim;
            this.namapenerima = namapenerima;
            this.alamatpenerima = alamatpenerima;
            this.statusdropshipper = statusdropshipper;
            this.statusasuransi = statusasuransi;
            this.nominalasuransi = nominalasuransi;

            print(this.statusasuransi, this.statusdropshipper);
        }

        //Bagian Asuransi
        KirimBarang(int notransaksi, String noresi, String namaekspedisi, double ongkoskirim, String namapengirim, String alamatpengirim, String namapenerima, String alamatpenerima, boolean statusasuransi, int nominalasuransi){
            this.no_transaksi = notransaksi;
            this.no_resi = noresi;
            this.namaekspedisi = namaekspedisi;
                if(ongkoskirim > 20000){
                ongkoskirim = ongkoskirim - 5000;
            }
            this.ongkoskirim = ongkoskirim;
            this.namapengirim = namapengirim;
            this.alamatpengirim = alamatpengirim;
            this.namapenerima = namapenerima;
            this.alamatpenerima = alamatpenerima;
            this.statusasuransi = statusasuransi;
            this.nominalasuransi = nominalasuransi;

            print(this.statusasuransi, this.statusdropshipper);
        }

        //Bagian Normal
        KirimBarang(int notransaksi, String noresi, String namaekspedisi, double ongkoskirim, String namapengirim, String alamatpengirim, String namapenerima, String alamatpenerima){
            this.no_transaksi = notransaksi;
            this.no_resi = noresi;
            this.namaekspedisi = namaekspedisi;
            this.ongkoskirim = ongkoskirim;
            this.namapengirim = namapengirim;
            this.alamatpengirim = alamatpengirim;
            this.namapenerima = namapenerima;
            this.alamatpenerima = alamatpenerima;

            print(this.statusasuransi, this.statusdropshipper);
        }

        //Bagian Dropship
        KirimBarang(int notransaksi, String noresi, String namaekspedisi, double ongkoskirim, String namapengirim, String alamatpengirim, String namapenerima, String alamatpenerima, boolean statusdropshipper){
            this.no_transaksi = notransaksi;
            this.no_resi = noresi;
            this.namaekspedisi = namaekspedisi;
            this.ongkoskirim = ongkoskirim;
            this.namapengirim = namapengirim;
            this.alamatpengirim = alamatpengirim;
            this.namapenerima = namapenerima;
            this.alamatpenerima = alamatpenerima;
            this.statusdropshipper = statusdropshipper;

            print(this.statusasuransi, this.statusdropshipper);
        }

        public void print(boolean statusasuransi, boolean statusdropshipper){
            if (statusasuransi==true && statusdropshipper==true){
                System.out.println("\nAsuransi dan Dropship");
                System.out.println("\nNo Transaksi :"+this.no_transaksi+"\nNo Resi : "+this.no_resi+"\nNama Ekspedisi : "+this.namaekspedisi+"\nOngkos Kirim : "+this.ongkoskirim+"\nNama Pengirim : "+this.namapengirim+"\nAlamat Pengirim : "+this.alamatpengirim+"\nNama Penerima : "+this.namapenerima+"\nAlamat Penerima : "+this.alamatpenerima+"\nNominal Asuransi : "+this.nominalasuransi);
            }else if (statusasuransi==true){
                System.out.println("\nAsuransi");
                System.out.println("\nNo Transaksi : "+this.no_transaksi+"\nNo Resi : "+this.no_resi+"\nNama Ekspedisi : "+this.namaekspedisi+"\nOngkos Kirim : "+this.ongkoskirim+"\nNama Pengirim : "+this.namapengirim+"\nAlamat Pengirim : "+this.alamatpengirim+"\nNama Penerima : "+this.namapenerima+"\nAlamat Penerima : "+this.alamatpenerima+"\nNominal Asuransi : "+this.nominalasuransi);
            }else if (statusdropshipper==true){
                System.out.println("\nDropship");
                System.out.println("\nNo Transaksi : "+this.no_transaksi+"\nNo Resi : "+this.no_resi+"\nNama Ekspedisi : "+this.namaekspedisi+"\nOngkos Kirim : "+this.ongkoskirim+"\nNama Pengirim : "+this.namapengirim+"\nAlamat Pengirim : "+this.alamatpengirim+"\nNama Penerima : "+this.namapenerima+"\nAlamat Penerima : "+this.alamatpenerima);
            }else {
                System.out.println("\nNormal");
                System.out.println("\nNo Transaksi : "+this.no_transaksi+"\nNo Resi : "+this.no_resi+"\nNama Ekspedisi : "+this.namaekspedisi+"\nOngkos Kirim : "+this.ongkoskirim+"\nNama Pengirim : "+this.namapengirim+"\nAlamat Pengirim : "+this.alamatpengirim+"\nNama Penerima : "+this.namapenerima+"\nAlamat Penerima : "+this.alamatpenerima);
            }
        }
}

