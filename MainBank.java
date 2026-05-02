public class MainBank {
    public static void main(String[] args) {

        Bank bank = new Bank();
        BankBNI bni = new BankBNI();
        BankBCA bca = new BankBCA();

        System.out.println("=== BANK BIASA ===");
        bank.transferUang(100000, "12345");
        bank.transferUang(200000, "12345", "Mandiri");
        bank.transferUang(300000, "12345", "BRI", "Bayar hutang");

        bank.sukuBunga();

        System.out.println("\n=== BANK BNI ===");
        bni.sukuBunga();
        bni.transferUang(500000, "67890", "bebas");

        System.out.println("\n=== BANK BCA ===");
        bca.sukuBunga();
        bca.transferUang(700000, "67890", "bebas");
    }
}