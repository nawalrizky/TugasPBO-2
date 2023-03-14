import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Minimarket {
    List<Barang> listBarang;
    String nama;
    Minimarket(String nama) {
        this.nama = nama;
        listBarang = new ArrayList<>();
    }
    Minimarket() {
        listBarang = new ArrayList<>();
    }
    void inputBarang(Barang barang) {
        this.listBarang.add(barang);
    }
    void cekStock (String id){
        for (int i = 0; i < listBarang.size(); i++) {
            Barang currentBarang = listBarang.get(i);
            if (id == currentBarang.id) {
                if (currentBarang.barangTersedia()) {
                    System.out.println("Stock tersedia");
                } else {
                    System.out.println("Stock habis");
                }
            }
        }
    }
    void tampilBarangRestock() {
        System.out.println("Daftar barang yang harus di-restock:");
        boolean adaBarangRestock = false;
        for (int i = 0; i < listBarang.size(); i++) {
            Barang currentBarang = listBarang.get(i);
            if (!currentBarang.barangTersedia()) {
                adaBarangRestock = true;
                    System.out.println(currentBarang.getNama());
            }
        }
        if (!adaBarangRestock) {
            System.out.println("Tidak ada barang yang perlu di-restock.");
        }
    }
    void cariBarang(String namaBarang) {
        System.out.println("Hasil pencarian untuk \"" + namaBarang + "\":");
        boolean adaBarang = false;
        for (int i = 0; i < listBarang.size(); i++) {
            Barang currentBarang = listBarang.get(i);
            if (currentBarang.getNama().toLowerCase().contains(namaBarang.toLowerCase())) {
                adaBarang = true;
                System.out.println(currentBarang.getNama() + " (ID: " + currentBarang.id + ")");
            }
        }
        if (!adaBarang) {
            System.out.println("Tidak ada barang yang cocok.");
        }
    }
}




