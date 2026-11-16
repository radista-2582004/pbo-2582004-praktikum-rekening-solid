public class LaporanBank {

    public static String rupiah(int nilai) {
        String angka = String.format("%,d", Math.abs(nilai)).replace(',', '.');
        return (nilai < 0 ? "-Rp" : "Rp") + angka;
    }

    public void cetakDaftar(String judul, Rekening[] semua) {
        System.out.println("========== " + judul + " ==========");
        for (Rekening r : semua) {
            System.out.println(String.format("%s | %-6s | %12s",
                    r.getNomor(), r.getPemilik(), rupiah(r.getSaldo())));
            System.out.println("      " + r.keterangan());
        }
    }

    public void cetakTotal(Rekening[] semua) {
        int total = 0;
        for (Rekening r : semua) {
            total += r.getSaldo();
        }
        System.out.println("-----------------------------------");
        System.out.println("Total dana bank : " + rupiah(total));
    }
}