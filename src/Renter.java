// Class Renter untuk menyimpan informasi penyewa
public class Renter {
    private String name;
    private String phoneNumber;
    private String idCardNumber;

    // Constructor
    public Renter(String name, String phoneNumber, String idCardNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.idCardNumber = idCardNumber;
    }

    // Getter untuk properti private
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    // Menampilkan informasi penyewa
    public void displayInfo() {
        System.out.println("Nama Penyewa: " + name);
        System.out.println("Nomor HP: " + phoneNumber);
        System.out.println("Nomor KTP: " + idCardNumber);
    }
}
