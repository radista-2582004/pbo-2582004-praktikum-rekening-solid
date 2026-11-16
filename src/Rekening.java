public abstract class Rekening {
    protected String nomor;
    protected String pemilik;
    protected int saldo;

    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public String getNomor() {
        return nomor;
    }

    public String getPemilik() {
        return pemilik;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean tarik(int jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    public abstract int biayaAdminBulanan();

    public int potongBiayaAdmin() {
        int biaya = biayaAdminBulanan();
        saldo -= biaya;
        return biaya;
    }

    public abstract String keterangan();
}
