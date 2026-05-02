public class BankBCA extends Bank {

    @Override
    void sukuBunga() {
        System.out.println("Suku Bunga BCA adalah 4.5%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BCA";
        System.out.println("Transfer " + jumlah + " ke " + rekeningTujuan + " di bank " + bankTujuan);
        System.out.println("Biaya transfer: " + hitungBiaya(bankTujuan));
    }
}