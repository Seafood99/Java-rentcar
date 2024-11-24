// Class Car yang mengimplementasikan Rentable
public class Car implements Rentable {
    // Properti private (enkapsulasi)
    private String brand;
    private String model;
    private int dailyRate;

    // Constructor untuk inisialisasi data
    public Car(String brand, String model, int dailyRate) {
        this.brand = brand;
        this.model = model;
        this.dailyRate = dailyRate;
    }

    // Getter untuk properti private
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    // Setter untuk dailyRate
    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }

    // Method untuk menampilkan informasi mobil
    public void displayInfo() {
        System.out.println("Mobil: " + brand + " " + model);
        System.out.println("Harga sewa per hari: Rp" + dailyRate);
    }

    // Implementasi dari Rentable: Menghitung harga sewa
    @Override
    public void calculateRent(int days) {
        int total = dailyRate * days;
        System.out.println("Harga sewa untuk " + days + " hari adalah Rp" + total);
    }
}
