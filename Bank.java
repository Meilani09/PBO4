public class Bank {

    // BONUS: method hitung biaya
    int hitungBiaya(String bankTujuan) {
        if (bankTujuan.equals("BNI")) {
            return 4000;
        } else if (bankTujuan.equals("BCA")) {
            return 6500;
        } else {
            return 3000;
        }
    }

    // overloading 1
    void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer " + jumlah + " ke " + rekeningTujuan);
    }

    // overloading 2
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer " + jumlah + " ke " + rekeningTujuan + " di bank " + bankTujuan);
        System.out.println("Biaya transfer: " + hitungBiaya(bankTujuan));
    }

    // overloading 3
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        System.out.println("Transfer " + jumlah + " ke " + rekeningTujuan + " di bank " + bankTujuan);
        System.out.println("Berita: " + berita);
        System.out.println("Biaya transfer: " + hitungBiaya(bankTujuan));
    }

    void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }
}