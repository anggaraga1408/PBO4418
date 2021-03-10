public class Luas{
    public class Segitiga{
        double panjang, tinggi;
        
        public Segitiga(){
            panjang = 15;
            tinggi = 5;
        }

        public Segitiga(double newPanjang, double newTinggi){
            panjang = newPanjang;
            tinggi = newTinggi;
        }

        public double getLuas(){
            return 0.5*panjang*tinggi;
        }
    }

    public class Lingkaran{
        double jari;

        public Lingkaran(){
            jari = 6;
        }

        public Lingkaran(double newJari){
            jari = newJari;
        }

        public double getLuas(){
            return Math.PI*jari*jari;
        }
    }

    public class Bujursangkar{
        double sisi;

        public Bujursangkar(){
            sisi = 4;
        }

        public Bujursangkar(double newSisi){
            sisi = newSisi;
        }

        public double getLuas(){
            return sisi*sisi;
        }
    }

    public class Persegipanjang{
        double panjang, lebar;

        public Persegipanjang(){
            panjang = 10;
            lebar = 9;
        }

        public Persegipanjang(double newPanjang, double newLebar){
            panjang = newPanjang;
            lebar = newLebar;
        }

        public double getLuas(){
            return panjang*lebar;
        }
    }
}