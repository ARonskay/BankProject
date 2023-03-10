import java.util.Objects;
/**
 * Klasa przeznaczona do przewchowywania informacji o pracownikach banku
 *
 * @author Baprawski
 */
public class PracownikBanku extends Czlowiek{

    private NumerPESEL PESEL;
    private double stawkaMiesieczna;
    //Póki co nie ma klasy NumerKontaBankowego (na dzien 8.05.2021)
    private NumerKontaBankowego numerKontaBankowego;
    private boolean mozliwoscBlokowaniaKont;
    private boolean mozliwoscZmianyPersonaliow;


    /**
     * Konstruktor przyjmujący następujące argumenty:
     *
     * @param ID id uzytkownika
     * @param haslo haslo
     * @param imie imie
     * @param nazwisko nazwisko
     * @param eMail adres email
     * @param adres1 pierwsza linijka adersu
     * @param adres2 kolejna linijka adresu
     * @param adres3 kolejna linijka adresu
     * @param adres4 kolejna linijka adresu
     */
    public PracownikBanku(int ID, String haslo, String imie, String nazwisko, String eMail, String adres1, String adres2, String adres3, String adres4) {
        super(ID, haslo, imie, nazwisko, eMail, adres1, adres2, adres3, adres4);
    }

    /**
     * Konstruktor dla klasy pracownik banku
     * @param ID id uzytkownika
     * @param haslo haslo
     * @param imie imie
     * @param nazwisko nazwisko
     * @param eMail adres email
     * @param adres1 pierwsza linijka adersu
     * @param adres2 kolejna linijka adresu
     * @param adres3 kolejna linijka adresu
     * @param adres4 kolejna linijka adresu
     * @param PESEL numer pesel
     * @param stawkaMiesieczna placa miesieczna
     * @param numerKontaBankowego numer konta bankowego
     * @param mozliwoscBlokowaniaKont mozliwosc blokowania kont
     * @param mozliwoscZmianyPersonaliow mozliwosc zmiany personaliow
     */

    public PracownikBanku(int ID, String haslo, String imie, String nazwisko, String eMail, String adres1, String adres2, String adres3, String adres4, NumerPESEL PESEL, double stawkaMiesieczna, NumerKontaBankowego numerKontaBankowego, boolean mozliwoscBlokowaniaKont, boolean mozliwoscZmianyPersonaliow) {
        super(ID, haslo, imie, nazwisko, eMail, adres1, adres2, adres3, adres4);
        this.PESEL = PESEL;
        this.stawkaMiesieczna = stawkaMiesieczna;
        this.numerKontaBankowego = numerKontaBankowego;
        this.mozliwoscBlokowaniaKont = mozliwoscBlokowaniaKont;
        this.mozliwoscZmianyPersonaliow = mozliwoscZmianyPersonaliow;
    }

    public NumerPESEL getPESEL() {
        return PESEL;
    }

    public void setPESEL(NumerPESEL PESEL) {
        this.PESEL = PESEL;
    }

    public double getStawkaMiesieczna() {
        return stawkaMiesieczna;
    }

    public void setStawkaMiesieczna(double stawkaMiesieczna) {
        this.stawkaMiesieczna = stawkaMiesieczna;
    }

    public NumerKontaBankowego getNumerKontaBankowego() {
        return numerKontaBankowego;
    }

    public void setNumerKontaBankowego(NumerKontaBankowego numerKontaBankowego) {
        this.numerKontaBankowego = numerKontaBankowego;
    }

    public boolean isMozliwoscBlokowaniaKont() {
        return mozliwoscBlokowaniaKont;
    }

    public void setMozliwoscBlokowaniaKont(boolean mozliwoscBlokowaniaKont) {
        this.mozliwoscBlokowaniaKont = mozliwoscBlokowaniaKont;
    }

    public boolean isMozliwoscZmianyPersonaliow() {
        return mozliwoscZmianyPersonaliow;
    }

    public void setMozliwoscZmianyPersonaliow(boolean mozliwoscZmianyPersonaliow) {
        this.mozliwoscZmianyPersonaliow = mozliwoscZmianyPersonaliow;
    }

    /**
     * equals
     * @param o obiekt do porównania
     * @return true gdy są jednakowe lub false w przeciwnym wypadu
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PracownikBanku that = (PracownikBanku) o;
        return Double.compare(that.stawkaMiesieczna, stawkaMiesieczna) == 0 && mozliwoscBlokowaniaKont == that.mozliwoscBlokowaniaKont && mozliwoscZmianyPersonaliow == that.mozliwoscZmianyPersonaliow && PESEL.equals(that.PESEL) && numerKontaBankowego.equals(that.numerKontaBankowego);
    }

    /**
     * hashcode
     * @return hashcode int
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), PESEL, stawkaMiesieczna, numerKontaBankowego, mozliwoscBlokowaniaKont, mozliwoscZmianyPersonaliow);
    }

    /**
     * toString
     * @return string z wszystkimi niezbędnymi informacjami
     */
    @Override
    public String toString() {
        return "PracownikBanku{" +
                "ID=" + super.getID() +
                ", haslo='" + super.getHaslo() + '\'' +
                ", imie='" + super.getImie() + '\'' +
                ", nazwisko='" + super.getNazwisko() + '\'' +
                ", eMail='" + super.geteMail() + '\'' +
                ", adres1='" + super.getAdres1() + '\'' +
                ", adres2='" + super.getAdres2() + '\'' +
                ", adres3='" + super.getAdres3() + '\'' +
                ", adres4='" + super.getAdres4() + '\'' +
                "PESEL=" + PESEL +
                ", stawkaMiesieczna=" + stawkaMiesieczna +
                ", numerKontaBankowego=" + numerKontaBankowego +
                ", mozliwoscBlokowaniaKont=" + mozliwoscBlokowaniaKont +
                ", mozliwoscZmianyPersonaliow=" + mozliwoscZmianyPersonaliow +
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
        NumerPESEL piesel = new NumerPESEL("44051401458");
        double stawka=10000.00;
        NumerKontaBankowego nkb= new NumerKontaBankowego("14114010100000524444001007");


        Czlowiek JanKowalski=new PracownikBanku(ide,haslo,imie,Nazwisko,emial,adres1,adres2,adres3,adres4,piesel,stawka,nkb,true,true);
        System.out.println(JanKowalski.toString());
    }




}
