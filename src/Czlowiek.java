import java.util.Objects;
/**
 * Klasa przeznaczona do przewchowywania informacji o potencjalnie kazdym czlowieku związanym z naszym systemem
 *
 * @author Baprawski
 */
public class Czlowiek {
    private int ID;
    private String haslo;
    private String imie;
    private String nazwisko;
    private String eMail;
    private String adres1;
    private String adres2;
    private String adres3;
    private String adres4;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }


    //Uwaga! tu zastanawiam sie, czy może da rade jakoś sensowniej napisać tą część związaną z adresem
    //jeśli macie jakieś pomysły jak to ustandaryzować to kombinujcie, na razie zostawiam jak jest:
    //jest bardzo uniwersalnie, ale możliwe są błędy w adresie.
    public String getAdres1() {
        return adres1;
    }

    public void setAdres1(String adres1) {
        this.adres1 = adres1;
    }

    public String getAdres2() {
        return adres2;
    }

    public void setAdres2(String adres2) {
        this.adres2 = adres2;
    }

    public String getAdres3() {
        return adres3;
    }

    public void setAdres3(String adres3) {
        this.adres3 = adres3;
    }

    public String getAdres4() {
        return adres4;
    }

    public void setAdres4(String adres4) {
        this.adres4 = adres4;
    }

    /**
     * Konstruktor przyjmujący następujące argumenty:
     * @param ID id uzytkownika
     * @param haslo haslo
     * @param imie imie
     * @param nazwisko nazwisko
     * @param eMail adres email
     * @param adres1 pierwsza linijka adersu
     * @param adres2 kolejna linijka adresu
     * @param adres3 kolejna linijka adresu
     * @param adres4 kolejna linijka adresu
     * Zamysł jest taki, że aby załozyć konto uzytkownikowi nalezy podac wszystkie wymienione dane
     */

    public Czlowiek(int ID, String haslo, String imie, String nazwisko, String eMail, String adres1, String adres2, String adres3, String adres4) {
        this.ID = ID;
        this.haslo = haslo;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.eMail = eMail;
        this.adres1 = adres1;
        this.adres2 = adres2;
        this.adres3 = adres3;
        this.adres4 = adres4;
    }

    /**
     * Metoda equals która umozliwia porównanie dwóch ludzi związanych z bankiem
     * @param o
     * @return true jeżeli są to ci sami ludzie
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Czlowiek czlowiek = (Czlowiek) o;
        return ID == czlowiek.ID && haslo.equals(czlowiek.haslo) && imie.equals(czlowiek.imie) && nazwisko.equals(czlowiek.nazwisko) && eMail.equals(czlowiek.eMail) && adres1.equals(czlowiek.adres1) && adres2.equals(czlowiek.adres2) && adres3.equals(czlowiek.adres3) && Objects.equals(adres4, czlowiek.adres4);
    }

    /**
     * Metoda haszująca
     * @return int hashcode
     */

    @Override
    public int hashCode() {
        return Objects.hash(ID, haslo, imie, nazwisko, eMail, adres1, adres2, adres3, adres4);
    }

    /**
     *
     * @return String wypisujący informacje o obiekcie
     */
    @Override
    public String toString() {
        return "Czlowiek{" +
                "ID=" + ID +
                ", haslo='" + haslo + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", eMail='" + eMail + '\'' +
                ", adres1='" + adres1 + '\'' +
                ", adres2='" + adres2 + '\'' +
                ", adres3='" + adres3 + '\'' +
                ", adres4='" + adres4 + '\'' +
                '}';
    }

    /**
     * Funckja testująca
     * @param args nie użyto
     */
    /*
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
        System.out.println(JanKowalski.toString());
    }
    */
}
