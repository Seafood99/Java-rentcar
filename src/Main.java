import java.util.ArrayList;
import java.util.Scanner;

// Main Class
public class Main {
    public static void main(String[] args) {
        // Daftar mobil yang tersedia untuk disewa
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Avanza", 500000));
        carList.add(new Car("Honda", "Civic", 800000));
        carList.add(new Car("Suzuki", "Ertiga", 600000));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Rental Mobil!");
        System.out.println("Daftar mobil yang tersedia:");

        // Menampilkan daftar mobil
        for (int i = 0; i < carList.size(); i++) {
            System.out.println((i + 1) + ". " + carList.get(i).getBrand() + " " + carList.get(i).getModel() +
                               " - Rp" + carList.get(i).getDailyRate() + "/hari");
        }

        // Memilih mobil
        System.out.print("Pilih nomor mobil yang ingin Anda sewa: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline dari input sebelumnya

        if (choice < 1 || choice > carList.size()) {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        Car selectedCar = carList.get(choice - 1);

        // Memasukkan informasi penyewa
        System.out.println("\nSilakan masukkan informasi penyewa:");
        System.out.print("Nama: ");
        String name = scanner.nextLine();

        System.out.print("Nomor HP: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Nomor KTP: ");
        String idCardNumber = scanner.nextLine();

        Renter renter = new Renter(name, phoneNumber, idCardNumber);

        // Menentukan jumlah hari sewa
        System.out.print("\nBerapa hari Anda ingin menyewa mobil? ");
        int days = scanner.nextInt();

        // Menampilkan detail penyewaan
        System.out.println("\nDetail Penyewaan:");
        renter.displayInfo();
        selectedCar.displayInfo();
        selectedCar.calculateRent(days);

        System.out.println("\nTerima kasih telah menggunakan layanan kami!");
        scanner.close();
    }
}
