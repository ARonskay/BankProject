import java.util.LinkedHashSet;

public class HistoriaOperacji {

    private LinkedHashSet<Operacja> ListaOperacji=new LinkedHashSet<Operacja>();


    public void addOperacja(Operacja operacja){
        ListaOperacji.add(operacja);
    }
    public LinkedHashSet<Operacja> getListaOperacji(){
        return ListaOperacji;
    }
    /*
    public static void main(String[] args) throws InterruptedException {
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
        TimeUnit.SECONDS.sleep(3);
        Operacja op2=new Operacja(JanKowalski,nkb,ko+100000000,kp,ts,false,"Na wyzwolenie Bosni");






        HistoriaOperacji ho=new HistoriaOperacji();
        ho.addOperacja(op);ho.addOperacja(op2);
        System.out.println(ho.getListaOperacji());

    }
    */
}
