import java.util.Arrays;
/**
 * Klasa przeznaczona do przewchowywania numeru PESEL
 * Można dodać jeszce opcję weryfikacji numeru PESEL, póki co celowo z tego zrezygnowano
 * @author Baprawski
 */
public class NumerPESEL {
    /**
     * Pole do przechowywania numeru PESEL
     */
    private char[] pesel;
    private String peselString;
    /**
     * Konstruktor sprawdzający popraowność wpisanego podanego numeru
     * (pod względem długośći i zawartości znaków - tylko cyfry)
     */
    public NumerPESEL(String pesel) {
        if(pesel.length()==11){
        this.pesel=pesel.toCharArray();
        this.peselString=pesel;
        for (char x: this.pesel)
        {if (x<48 || x>57){throw new IllegalArgumentException("To nie pesel");}}
        }
        else throw new IllegalArgumentException("To nie pesel");


    }
    //Uwaga!!! można jeszcze zapimplementować sprawdzanie
    // poprawności oraz np podawanie daty urodzenia i płci na podstawie numeru
    //Ale trzeba się zastanowić które z tych elementów
    // są faktycnie potzrebne a które nie- pewnie wyjdzie w praniu

    //Ten toString będzie do zmiany, narazie zaimplementowałem go jako test tylko i wyłacznie
    //Trzeba zrobić ładny sposób wypisania peselu, chyba, że taki
    // nie przeszkadza, może jest jakaś metoda która to elegancko robi za nas i
    // nie trzeba tak ordynarnie tego wypisywać
/*
    @Override
    public String toString() {
        return "pesel: " +pesel[0]+ pesel[1]+pesel[2] +pesel[3]+pesel[4]
                +pesel[5]+pesel[6] +pesel[7]+pesel[8] +pesel[9]+pesel[10] ;
    }

 */
/*
    @Override
    public String toString() {
        return "pesel: " +pesel[0]+ pesel[1]+pesel[2] +pesel[3]+pesel[4]
                +pesel[5]+pesel[6] +pesel[7]+pesel[8] +pesel[9]+pesel[10] ;
    }

 */
    @Override
    public String toString() {
        return "" +pesel[0]+ pesel[1]+pesel[2] +pesel[3]+pesel[4]
                +pesel[5]+pesel[6] +pesel[7]+pesel[8] +pesel[9]+pesel[10] ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumerPESEL that = (NumerPESEL) o;
        return Arrays.equals(pesel, that.pesel);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(pesel);
    }

    public static void main(String[] args) {
        NumerPESEL piesel = new NumerPESEL("44051401458");
        System.out.println(piesel.toString());

        NumerPESEL piesel2 = new NumerPESEL("44051401458");
        System.out.println(piesel2.toString());

        System.out.println(piesel==piesel2);
        //System.out.println(piesel==piesel);
        System.out.println(piesel.equals(piesel2));
        System.out.println(piesel.hashCode()==piesel2.hashCode());


    }
}
