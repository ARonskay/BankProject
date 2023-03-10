import java.util.Arrays;

//uwaga!!!!!!! to do rozbudowania jest, tylko w ramach testu tak zostawiłem
/**
 * Klasa przeznaczona do przewchowywania numeru Konta Bakowego
 * Można dodać jeszce opcję weryfikacji numeru Konta poprzez sprawdzenie sumy kontrolne jednakże może to utrudnić prezentację podobnie jak przy nyumerze PESEL
 * należałoby wpisywać teoretycznie poprawne dane
 * @author Baprawski
 */
public class NumerKontaBankowego {
    private char[] NumerKontaBankowego;
    private String NumerKontaBankowegoString;
    public NumerKontaBankowego(String NumerKontaBankowego) {
        this.NumerKontaBankowegoString=NumerKontaBankowego;
        if(NumerKontaBankowego.length()==26){
            this.NumerKontaBankowego=NumerKontaBankowego.toCharArray();
            for (char x: this.NumerKontaBankowego)
            {if (x<48 || x>57){throw new IllegalArgumentException("To nie Numer Konta Bankowgo");}}
        }
        else throw new IllegalArgumentException("To nie Numer Konta Bankowgo");


    }
/*
    @Override
    public String toString() {
        return "NumerKontaBankowego{"
                 + Arrays.toString(NumerKontaBankowego) +
                '}';
    }

 */
@Override
public String toString() {
    return NumerKontaBankowegoString;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumerKontaBankowego that = (NumerKontaBankowego) o;
        return Arrays.equals(NumerKontaBankowego, that.NumerKontaBankowego);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(NumerKontaBankowego);
    }

}
