import java.util.Arrays;
/**
 * Klasa przeznaczona do przewchowywania numeru Karty
 * @author Baprawski
 */

//UWAGA!! rodzi się przemyślenie, że jednak lepiej by byoło przechowywać wartość nie jako char[] tlyko raczej zwykły String
    //Proszę o ustosunkowanie się, czy warto przebudowywać kod aby wykorzystać tego stringa, czy już lepiej zostawić jak jest????
public class NumerKarty {
    private String stringValue;
    private char[] numerKarty;
    public NumerKarty(String numerKarty) {
        if(numerKarty.length()==16){

            for (char x: numerKarty.toCharArray())
            {if (x<48 || x>57){throw new IllegalArgumentException("To nie Numer Karty");}
            else {
                this.stringValue=numerKarty;
                this.numerKarty = numerKarty.toCharArray();
                }
            }
        }
        else throw new IllegalArgumentException("To nie Numer Karty");


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumerKarty that = (NumerKarty) o;
        return Arrays.equals(numerKarty, that.numerKarty);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(numerKarty);
    }
/*
    @Override
    public String toString() {
        return "NumerKarty{" + Arrays.toString(numerKarty) +
                '}';
    }

 */

    @Override
    public String toString() {
        return this.stringValue;
    }
    public String getStringValue(){
        return this.stringValue;
    }

    public static void main(String[] args) {
        NumerKarty nk= new NumerKarty("1234123412341234");
        System.out.println(nk.toString());
        System.out.println(nk.getStringValue());

    }
}
