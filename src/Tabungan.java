public class Tabungan extends Rekening implements BerBunga {
    private double bunga;

    public Tabungan(String nomor, String pemilik, int saldo, double bunga) {
        super(nomor, pemilik, saldo);
        this.bunga = bunga;
    }

    @Override
    public int biayaAdminBulanan() {
        return saldo >= 1000000 ? 0 : 5000;
    }

    @Override
    public int tambahBunga() {
        int nilai = (int) Math.round(saldo * bunga / 100);
        saldo += nilai;
        return nilai;
    }

    @Override
    public String keterangan() {
        return "Tabungan, bunga " + bunga + "% per bulan";
    }
}