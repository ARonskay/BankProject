public class Operacja {
    private Czlowiek kontrahent;
    private NumerKontaBankowego numerKontaKontrahenta;
    private double kwotaOperacji;
    private double stanKontaPoOperacji;
    private long dataIGodzinaOperacji;
    private  boolean nieprawidlowosc;
    private String komentarz;

    public Operacja(Czlowiek kontrahent, NumerKontaBankowego numerKontaKontrahenta, double kwotaOperacji, double stanKontaPoOperacji, long dataIGodzinaOperacji, boolean nieprawidlowosc, String komentarz) {
        this.kontrahent = kontrahent;
        this.numerKontaKontrahenta = numerKontaKontrahenta;
        this.kwotaOperacji = kwotaOperacji;
        this.stanKontaPoOperacji = stanKontaPoOperacji;
        this.dataIGodzinaOperacji = dataIGodzinaOperacji;
        this.nieprawidlowosc = nieprawidlowosc;
        this.komentarz = komentarz;
    }

    public Czlowiek getKontrahent() {
        return kontrahent;
    }

    public NumerKontaBankowego getNumerKontaKontrahenta() {
        return numerKontaKontrahenta;
    }

    public double getKwotaOperacji() {
        return kwotaOperacji;
    }

    public double getStanKontaPoOperacji() {
        return stanKontaPoOperacji;
    }

    public long getDataIGodzinaOperacji() {
        return dataIGodzinaOperacji;
    }

    public boolean isNieprawidlowosc() {
        return nieprawidlowosc;
    }

    public String getKomentarz() {
        return komentarz;
    }

    @Override
    public String toString() {
        return "Operacja{" +
                "kontrahent=" + kontrahent +
                ", numerKontaKontrahenta=" + numerKontaKontrahenta +
                ", kwotaOperacji=" + kwotaOperacji +
                ", stanKontaPoOperacji=" + stanKontaPoOperacji +
                ", dataIGodzinaOperacji=" + dataIGodzinaOperacji +
                ", nieprawidlowosc=" + nieprawidlowosc +
                ", komentarz='" + komentarz + '\'' +
                '}';
    }

    public static void main(String[] args) {
        int ide=21372137;
        String  haslo="zaq1@WSX";
        String imie= "Janko";
        String Nazwisko= "Walski";
        String emial= "Walski@Walski.com";
        String adres1="Popławska 24";
        String adres2="Peloponez";
        String adres3= "21-370";
        String adres4="Polska";
        Czlowiek JanKowalski=new Czlowiek(ide,haslo,imie,Nazwisko,emial,adres1,adres2,adres3,adres4);
        NumerKontaBankowego nkb=new NumerKontaBankowego("12345678901234567890123456");
        double ko=1234;
        double kp=12.5;
        long ts=System.currentTimeMillis();
        System.out.println(ts);



        Operacja op=new Operacja(JanKowalski,nkb,ko,kp,ts,false,"Na kwiaty");
        System.out.println(op.toString());
    }
}
