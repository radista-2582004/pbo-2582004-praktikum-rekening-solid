public class Deposito extends Rekening implements BerBunga {
    private double bunga;

    public Deposito(String nomor, String pemilik, int saldo, double bunga) {
        super(nomor, pemilik, saldo);
        this.bunga = bunga;
    }

    // Exception in thread "main" java.lang.UnsupportedOperationException: Deposito tidak bisa ditarik
    // Diperbaiki: tarik mengembalikan false agar memenuhi kontrak Rekening.tarik
    @Override
    public boolean tarik(int jumlah) {
        // Deposito tidak bisa ditarik sebelum jatuh tempo, jadi tarik mengembalikan false
        return false;
    }

    @Override
    public int biayaAdminBulanan() {
        return 0;
    }

    @Override
    public int tambahBunga() {
        int hasil = (int) Math.round(saldo * bunga / 100);
        saldo += hasil;
        return hasil;
    }

    @Override
    public String keterangan() {
        return "Deposito, bunga " + bunga + "% per bulan";
    }
}