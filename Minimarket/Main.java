public class Main {
    public static void main(String[] args) {
        Minimarket minimarket = new Minimarket("Aceng Madura");
        Barang barang1 = new Barang("i1", "Teh Botol", 5, 5000);
        Barang barang2 = new Barang("i2", "Aqua", 1, 3000);
        Barang barang3 = new Barang("i3", "Indomie", 0, 3000);
        Barang barang4 = new Barang("i4", "Mie Sedap", 12, 3000);
        Barang barang5 = new Barang("i5", "Ultramilk", 12, 5000);
        Barang barang6 = new Barang("i6", "Teh Pucuk", 5, 5000);
        Barang barang7 = new Barang("i7", "Yupi", 5, 2000);

        minimarket.inputBarang(barang1);
        minimarket.inputBarang(barang2);
        minimarket.inputBarang(barang3);
        minimarket.inputBarang(barang4);
        minimarket.inputBarang(barang5);
        minimarket.inputBarang(barang6);

        minimarket.tampilBarangRestock();
        minimarket.cariBarang("botol");
        minimarket.cariBarang("teh");
        minimarket.cariBarang("mie");
    }
}
