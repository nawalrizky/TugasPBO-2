public class Barang {
    String id;
    String nama;
    int harga;
    int stock;
    int diskon;

    Barang(String id, String nama, int stock, int harga) {
        this.id = id;
        this.nama = nama;
        this.stock = stock;
        this.harga = harga;
        this.diskon = 0;
    }

    boolean barangTersedia() {
        if (stock > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getNama() {
        return nama;
    }
}
