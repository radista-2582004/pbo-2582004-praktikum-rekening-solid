public class ProsesAkhirBulan {

    public void potongBiayaAdmin(Rekening[] semua) {
        for (Rekening r : semua) {
            int biaya = r.potongBiayaAdmin();
            System.out.println(r.getNomor() + " " + String.format("%-13s", "biaya admin")
                    + ": " + LaporanBank.rupiah(biaya));
        }
    }

    public void tambahBunga(BerBunga[] berbunga) {
        for (BerBunga b : berbunga) {
            int bunga = b.tambahBunga();
            System.out.println(b.getNomor() + " " + String.format("%-13s", "bunga")
                    + ": " + LaporanBank.rupiah(bunga));
        }
    }

    public void autodebet(Rekening[] semua, int jumlah) {
        for (Rekening r : semua) {
            boolean berhasil = r.tarik(jumlah);
            System.out.println(r.getNomor() + " " + String.format("%-13s", "autodebet")
                    + ": " + (berhasil ? LaporanBank.rupiah(jumlah) : "gagal"));
        }
    }
}