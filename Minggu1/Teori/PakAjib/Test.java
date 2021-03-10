public class Test{
    public static void main(String[] args){
        Luas luas = new Luas();
        Luas.Segitiga segitiga = luas.new Segitiga();
        System.out.println("Luas Segitigas adalah "+segitiga.getLuas());

        Luas.Lingkaran lingkaran = luas.new Lingkaran();
        System.out.println("Luas Lingkaran adalah "+lingkaran.getLuas());

        Luas.Bujursangkar bujursangkar = luas.new Bujursangkar();
        System.out.println("Luas Bujursangkar adalah "+bujursangkar.getLuas());

        Luas.Persegipanjang persegipanjang = luas.new Persegipanjang();
        System.out.println("Luas Persegipanjang adalah "+persegipanjang.getLuas());
    }
}