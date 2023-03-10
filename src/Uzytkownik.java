import BankExceptions.DBException;
import BankExceptions.SaldoException;

import java.sql.*;


//Poprawiłem przewalutownaie, żeby nie było zwykłym kalkulatorkiem tlyko metoda w klasie
//Wyrzucam historię przelewów- nie poradzę sobie z relacyjną bazą dancyh
//Oprócz tego trzeba się w końcu wziąć za dopisywanie kodu do gui, aby uczynić
//je jakkolwiek funkcjonalnym
//
//Baza danych działa. jeżeli zauwazycie jakieś błędy to piszcie do mnie
/**
 * Klasa przeznaczona do przechowywania informacji o uzytkownikach. Ma też zaimplementowana obsługe bazy dancyh
 * wywołując odpowiednie metody można elegancko się dostać do odpowienich rekordów bazy
 * Ważne! Pamiętac o używaniu metody .zapisz() bo może się to źle skończyć dla banku
 *
 * @author Baprawski
 */
public class Uzytkownik extends Czlowiek {
    private int numberDB = 21372138;
    //private  double SaldoBTN;
    private double SaldoPLN;
    private double SaldoLokatPLN;
    private double SaldoUSD;
    private double SaldoCHF;
    private double SaldoBTC;
    private double SaldoEUR;
    private NumerPESEL PESEL;
    private int PIN;
    private NumerKarty numerKarty;
    private NumerKontaBankowego numerKontaBankowego;
    private boolean BlokadaKonta = false;
    //private HistoriaOperacji historiaOperacji;

    public Uzytkownik(int ID, String haslo, String imie, String nazwisko, String eMail, String adres1, String adres2, String adres3, String adres4,
                      double saldoPLN, double saldoLokatPLN, double saldoUSD, double saldoCHF, double saldoBTC,
                      double saldoEUR, NumerPESEL PESEL, int PIN, NumerKarty numerKarty, NumerKontaBankowego numerKontaBankowego,
                      boolean blokadaKonta //,HistoriaOperacji historiaOperacji
    ) {
        super(ID, haslo, imie, nazwisko, eMail, adres1, adres2, adres3, adres4);
        SaldoPLN = saldoPLN;
        SaldoLokatPLN = saldoLokatPLN;
        SaldoUSD = saldoUSD;
        SaldoCHF = saldoCHF;
        SaldoBTC = saldoBTC;
        SaldoEUR = saldoEUR;
        this.PESEL = PESEL;
        this.PIN = PIN;
        this.numerKarty = numerKarty;
        this.numerKontaBankowego = numerKontaBankowego;
        BlokadaKonta = blokadaKonta;
        //this.historiaOperacji = historiaOperacji;
    }

    public Uzytkownik(Czlowiek czlowiek,
                      double saldoPLN, double saldoLokatPLN, double saldoUSD, double saldoCHF, double saldoBTC,
                      double saldoEUR, NumerPESEL PESEL, int PIN, NumerKarty numerKarty, NumerKontaBankowego numerKontaBankowego,
                      boolean blokadaKonta//, HistoriaOperacji historiaOperacji
    ) {
        super(czlowiek.getID(), czlowiek.getHaslo(), czlowiek.getImie(), czlowiek.getNazwisko(), czlowiek.geteMail(), czlowiek.getAdres1(), czlowiek.getAdres2(), czlowiek.getAdres3(), czlowiek.getAdres4());
        SaldoPLN = saldoPLN;
        SaldoLokatPLN = saldoLokatPLN;
        SaldoUSD = saldoUSD;
        SaldoCHF = saldoCHF;
        SaldoBTC = saldoBTC;
        SaldoEUR = saldoEUR;
        this.PESEL = PESEL;
        this.PIN = PIN;
        this.numerKarty = numerKarty;
        this.numerKontaBankowego = numerKontaBankowego;
        BlokadaKonta = blokadaKonta;
        //this.historiaOperacji = historiaOperacji;
    }


    public double getSaldoPLN() {
        return SaldoPLN;
    }

    public double getSaldoLokatPLN() {
        return SaldoLokatPLN;
    }

    public double getSaldoUSD() {
        return SaldoUSD;
    }

    public double getSaldoCHF() {
        return SaldoCHF;
    }

    public double getSaldoBTC() {
        return SaldoBTC;
    }

    public double getSaldoEUR() {
        return SaldoEUR;
    }

    public void changeSaldo(double changesSaldo) throws SaldoException {
        if (changesSaldo < 0 && -changesSaldo > this.SaldoPLN) {
            throw new SaldoException("Za małe saldo");
        }
        this.SaldoPLN = this.SaldoPLN + changesSaldo;
    }

    public void changeSaldoUSD(double changesSaldo) throws SaldoException {
        if (changesSaldo < 0 && -changesSaldo > this.SaldoUSD) {
            throw new SaldoException("Za małe saldo");
        }
        this.SaldoUSD = this.SaldoUSD + changesSaldo;
    }

    public void changeSaldoCHF(double changesSaldo) throws SaldoException {
        if (changesSaldo < 0 && -changesSaldo > this.SaldoCHF) {
            throw new SaldoException("Za małe saldo");
        }
        this.SaldoCHF = this.SaldoCHF + changesSaldo;
    }

    public void changeSaldoBTC(double changesSaldo) throws SaldoException {
        if (changesSaldo < 0 && -changesSaldo > this.SaldoBTC) {
            throw new SaldoException("Za małe saldo");
        }
        this.SaldoBTC = this.SaldoBTC + changesSaldo;
    }

    public void changeSaldoEUR(double changesSaldo) throws SaldoException {
        if (changesSaldo < 0 && -changesSaldo > this.SaldoEUR) {
            throw new SaldoException("Za małe saldo");
        }
        this.SaldoEUR = this.SaldoEUR + changesSaldo;
    }


    public NumerPESEL getPESEL() {
        return PESEL;
    }

    public void setPESEL(NumerPESEL PESEL) {
        this.PESEL = PESEL;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public NumerKarty getNumerKarty() {
        return numerKarty;
    }

    public void setNumerKarty(NumerKarty numerKarty) {
        this.numerKarty = numerKarty;
    }

    public NumerKontaBankowego getNumerKontaBankowego() {
        return numerKontaBankowego;
    }

    public void setNumerKontaBankowego(NumerKontaBankowego numerKontaBankowego) {
        this.numerKontaBankowego = numerKontaBankowego;
    }

    public boolean isZablokowane() {
        return BlokadaKonta;
    }

    public void setBlokadaKonta(boolean blokadaKonta) {
        this.BlokadaKonta = blokadaKonta;
    }


    public double przewalutujplntousd(double kursusd, double ilosc) throws SaldoException {
        if (this.getSaldoPLN() > ilosc) {
            this.changeSaldo(-ilosc);
            this.changeSaldoUSD(kursusd * ilosc);
            return kursusd * ilosc;
        } else {
            throw new SaldoException("brak środków");
        }

    }

    public double przewalutujplntochf(double kurschf, double ilosc) throws SaldoException {
        if (this.getSaldoPLN() > ilosc) {
            this.changeSaldo(-ilosc);
            this.changeSaldoCHF(kurschf * ilosc);
            return kurschf * ilosc;
        } else {
            throw new SaldoException("brak środków");

        }
    }

    public double przewalutujplntobtc(double kursbtc, double ilosc) throws SaldoException {
        if (this.getSaldoPLN() > ilosc) {
            this.changeSaldo(-ilosc);
            this.changeSaldoCHF(kursbtc * ilosc);
            return kursbtc * ilosc;
        } else {
            throw new SaldoException("brak środków");
        }
    }

    public double przewalutujplntoeur(double kurseur, double ilosc) throws SaldoException {

        if (this.getSaldoPLN() > ilosc) {
            this.changeSaldo(-ilosc);
            this.changeSaldoEUR(kurseur * ilosc);
            return kurseur * ilosc;
        } else {
            throw new SaldoException("brak środków");
        }
    }

    public double przewalutujudstopln(double kursplnusd, double ilosc) throws SaldoException {

        if (this.getSaldoUSD() > ilosc) {
            this.changeSaldoUSD(-ilosc);
            this.changeSaldo(kursplnusd * ilosc);
            return kursplnusd * ilosc;
        } else {
            throw new SaldoException("brak środków");
        }
    }

    public double przewalutujchftopln(double kursplnchf, double ilosc) throws SaldoException {

        if (this.getSaldoCHF() > ilosc) {
            this.changeSaldoCHF(-ilosc);
            this.changeSaldo(kursplnchf * ilosc);
            return kursplnchf * ilosc;
        } else {
            throw new SaldoException("brak środków");
        }
    }

    public double przewalutujbtctopln(double kursplnbtc, double ilosc) throws SaldoException {

        if (this.getSaldoBTC() > ilosc) {
            this.changeSaldoBTC(-ilosc);
            this.changeSaldo(kursplnbtc * ilosc);
            return kursplnbtc * ilosc;
        } else {
            throw new SaldoException("brak środków");
        }
    }

    public double przewalutujeurtopln(double kursplneur, double ilosc) throws SaldoException {

        if (this.getSaldoEUR() > ilosc) {
            this.changeSaldoEUR(-ilosc);
            this.changeSaldo(kursplneur * ilosc);
            return kursplneur * ilosc;
        } else {
            throw new SaldoException("brak środków");
        }
    }

    // od tąd eskperymenty z bazą danych

    public static final String DRIVER = "org.sqlite.JDBC";
    public static final String DB_URL = "jdbc:sqlite:users.db";

    private static Connection conn;
    private static Statement stat;

    /**
     * Konstruktor naszej bazy danych
     */

    public static void ConstructUserDataBase() {
        try {
            Class.forName(Uzytkownik.DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.println("Zainstaluj Sterownik JDBC");
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(DB_URL);
            stat = conn.createStatement();
        } catch (SQLException e) {
            System.err.println("Nie udało sie otworzyć połączenia");
            e.printStackTrace();
        }

        createTables();
    }

    /**
     * Metoda słuząca do kreowania tabeli w mySQL
     *
     * @return code false gdy wtstąpi błąd
     */
    public static boolean createTables() {
        String createCzytelnicy = "CREATE TABLE IF NOT EXISTS users (id_uzytkownika INTEGER PRIMARY KEY," +
                "haslo varchar(255) ,"
                + "imie varchar(255), " +
                " nazwisko varchar(255), " +
                " eMail varchar(255) ," +
                " adres1 varchar(255) ," +
                " adres2 varchar(255), " + " adres3 varchar(255), " + " adres4 varchar(255), "
                + "saldoPLN real, "
                + "saldoLokatPLN real, "
                + "saldoUSD real,  "
                + "saldoCHF real, "
                + "saldoBTC real, "
                + "saldoEUR real, "
                + " PESEL varchar(255), "
                + "PIN integer, "
                + " NumerKarty varchar(255), "
                + " NumerKontaBankowego varchar(255), "
                + "blokadaKonta integer "//tu nie wiadomo jak
                + ")";
        try {
            stat.execute(createCzytelnicy);
        } catch (SQLException e) {
            System.err.println("Blad przy tworzeniu tabeli");
            e.printStackTrace();
            return false;
        }
        return true;
    }


    /**
     * Motoda służy do dopisania użytkownika do bazy danych. Uwaaga! wykorzystać tylko raz
     *
     * @return code true gdy się powiedzie i false gdy nie powiedzie się
     */
    public boolean insertNewUzytkownik() {

        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "insert into users values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            prepStmt.setString(1, String.valueOf(this.getID()));
            prepStmt.setString(2, this.getHaslo());
            prepStmt.setString(3, this.getImie());
            prepStmt.setString(4, this.getNazwisko());
            prepStmt.setString(5, this.geteMail());
            prepStmt.setString(6, this.getAdres1());
            prepStmt.setString(7, this.getAdres2());
            prepStmt.setString(8, this.getAdres3());
            prepStmt.setString(9, this.getAdres4());
            prepStmt.setString(10, String.valueOf(this.getSaldoPLN()));
            prepStmt.setString(11, String.valueOf(this.getSaldoLokatPLN()));
            prepStmt.setString(12, String.valueOf(this.getSaldoUSD()));
            prepStmt.setString(13, String.valueOf(this.getSaldoCHF()));
            prepStmt.setString(14, String.valueOf(this.getSaldoBTC()));
            prepStmt.setString(15, String.valueOf(this.getSaldoEUR()));
            prepStmt.setString(16, this.getPESEL().toString());
            prepStmt.setString(17, String.valueOf(this.getPIN()));
            prepStmt.setString(18, this.getNumerKarty().toString());
            prepStmt.setString(19, this.getNumerKontaBankowego().toString());
            if (this.isZablokowane()) {
                prepStmt.setString(20, "1");
            } else {
                prepStmt.setString(20, "0");
            }

            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy wstawianiu uzytkownika");
            //e.printStackTrace();
            return false;
        }
        return true;


    }

    /**
     * Metoda do zapisywania uzytkownika w tabeli np do nadpisywania danych
     *
     * @return true or false w zależności czy operacja się powiedzie
     */
    public boolean zapiszUzytkownik() throws DBException {


        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "UPDATE users SET haslo= ?,imie= ?,nazwisko= ?,eMail= ?,adres1= ?,adres2= ?,adres3= ?,adres4= ?,saldoPLN= ?," +
                            "saldoLokatPLN= ?,saldoUSD= ?,saldoCHF= ?,saldoBTC= ?,saldoEUR= ?,PESEL= ?,PIN= ?,NumerKarty= ?,NumerKontaBankowego= ?,blokadaKonta= ? WHERE id_uzytkownika= ?");

            prepStmt.setString(1, this.getHaslo());
            prepStmt.setString(2, this.getImie());
            prepStmt.setString(3, this.getNazwisko());
            prepStmt.setString(4, this.geteMail());
            prepStmt.setString(5, this.getAdres1());
            prepStmt.setString(6, this.getAdres2());
            prepStmt.setString(7, this.getAdres3());
            prepStmt.setString(8, this.getAdres4());
            prepStmt.setString(9, String.valueOf(this.getSaldoPLN()));
            prepStmt.setString(10, String.valueOf(this.getSaldoLokatPLN()));
            prepStmt.setString(11, String.valueOf(this.getSaldoUSD()));
            prepStmt.setString(12, String.valueOf(this.getSaldoCHF()));
            prepStmt.setString(13, String.valueOf(this.getSaldoBTC()));
            prepStmt.setString(14, String.valueOf(this.getSaldoEUR()));
            prepStmt.setString(15, this.getPESEL().toString());
            prepStmt.setString(16, String.valueOf(this.getPIN()));
            prepStmt.setString(17, this.getNumerKarty().toString());
            prepStmt.setString(18, this.getNumerKontaBankowego().toString());
            if (this.isZablokowane()) {
                prepStmt.setString(19, "1");
            } else {
                prepStmt.setString(19, "0");
            }
            prepStmt.setString(20, String.valueOf(this.getID()));

            prepStmt.execute();
        } catch (SQLException e) {
            //System.err.println("Blad przy aktualizacji uzytkownika");
            //e.printStackTrace();
            throw new DBException("błąd w zapisie");
        }
        return true;


    }


    /**
     * Metoda do aktualizacji uzytkownika
     *
     * @param wyplacanaKwota jak wypłacamy 100zł to argumentem ma być 100 a nie -100
     * @return true jak sie uda i false jak nie
     */
    public boolean wyplac(double wyplacanaKwota) throws SaldoException, DBException {
        try {
            this.changeSaldo(-wyplacanaKwota);
            this.zapiszUzytkownik();
            return true;
        } catch (SaldoException e) {
            //e.printStackTrace();
            throw new SaldoException("Za małe saldo");
        }

    }

    /**
     * Metoda do aktualizacji uzytkownika
     *
     * @param wplacanaKwota jak wypłacamy 100zł to argumentem ma być 100 a nie -100
     * @return true jak sie uda i false jak nie
     */
    public boolean wplac(double wplacanaKwota) throws DBException {
        try {
            this.changeSaldo(wplacanaKwota);
            this.zapiszUzytkownik();
            return true;
        } catch (SaldoException e) {
            e.printStackTrace();
            return false;
        }

    }


    public static boolean DBUPDATE(String ID, String haslo, String Imie, String Nazwisko, String email,
                                   String adres1, String adres2, String adres3, String adres4, String pesel, String pin, String nkarty,
                                   String nkonta) {


        try {
            PreparedStatement prepStmt = conn.prepareStatement(
                    "UPDATE users SET haslo= ?,imie= ?,nazwisko= ?,eMail= ?,adres1= ?,adres2= ?,adres3= ?,adres4= ?" +
                            ",PESEL= ?,PIN= ?,NumerKarty=?,NumerKontaBankowego= ? WHERE id_uzytkownika= ?");

            prepStmt.setString(1, haslo);
            prepStmt.setString(2, Imie);
            prepStmt.setString(3, Nazwisko);
            prepStmt.setString(4, email);
            prepStmt.setString(5, adres1);
            prepStmt.setString(6, adres2);
            prepStmt.setString(7, adres3);
            prepStmt.setString(8, adres4);
            prepStmt.setString(9, pesel);
            prepStmt.setString(10, pin);
            prepStmt.setString(11, nkarty);
            prepStmt.setString(12, nkonta);
            prepStmt.setString(13, ID);


            prepStmt.execute();
        } catch (SQLException e) {
            System.err.println("Blad przy aktualizacji uzytkownika");
            //e.printStackTrace();
            return false;
        }
        return true;


    }


    /**
     * Metoda do logowania uzytkownika w ramach terminala lub czegoś podobnego- nie bankomatu.
     *
     * @param Id    to ID uzytkownika
     * @param Haslo to hasło uzytkownika
     * @return null gdy niepoprawne dane logowania albo obiekt uzytkownika, gdy logowanie powiodło się
     */
    public static Uzytkownik loguj(String Id, String Haslo) {

        try {
            ResultSet result = stat.executeQuery("SELECT * FROM users where id_uzytkownika=" + Id);
            int ID = result.getInt("id_uzytkownika");
            String haslo = result.getString("haslo");
            String imie = result.getString("imie");
            String nazwisko = result.getString("nazwisko");
            String eMail = result.getString("eMail");
            String adres1 = result.getString("adres1");
            String adres2 = result.getString("adres2");
            String adres3 = result.getString("adres3");
            String adres4 = result.getString("adres4");
            double saldoPLN = result.getDouble("saldoPLN");
            double saldoLokatPLN = result.getDouble("saldoLokatPLN");
            double saldoUSD = result.getDouble("saldoUSD");
            double saldoCHF = result.getDouble("saldoCHF");
            double saldoBTC = result.getDouble("saldoBTC");
            double saldoEUR = result.getDouble("saldoEUR");
            NumerPESEL PESEL = new NumerPESEL(result.getString("PESEL"));
            int PIN = result.getInt("PIN");
            NumerKarty numerKarty = new NumerKarty(result.getString("NumerKarty"));
            NumerKontaBankowego numerKontaBankowego = new NumerKontaBankowego(result.getString("NumerKontaBankowego"));
            int flag = result.getInt("blokadaKonta");
            boolean blokadaKonta;
            if (flag == 0) {
                blokadaKonta = false;
            }//tu równe a nie różne
            else {
                blokadaKonta = true;
            }

            Uzytkownik user = new Uzytkownik(ID, haslo, imie, nazwisko, eMail, adres1, adres2, adres3, adres4,
                    saldoPLN, saldoLokatPLN, saldoUSD, saldoCHF, saldoBTC,
                    saldoEUR, PESEL, PIN, numerKarty, numerKontaBankowego,
                    blokadaKonta);
            if (user.getHaslo().equals(Haslo)) {
                return user;
            } else {
                return null;
            }


        } catch (SQLException e) {
            //e.printStackTrace();
            return null;
        }


    }

    /**
     * Metoda do logowania uzytkownika w ramach bankomatu
     *
     * @param Numerkarty to numer karty uzytkownika
     * @param PIN2       to hasło uzytkownika
     * @return null gdy niepoprawne dane logowania albo obiekt uzytkownika, gdy logowanie powiodło się
     */
    public static Uzytkownik loguj(String Numerkarty, int PIN2) throws DBException {


        try {
            ResultSet result = stat.executeQuery("SELECT * FROM users where NumerKarty=" + Numerkarty);
            int ID = result.getInt("id_uzytkownika");
            String haslo = result.getString("haslo");
            String imie = result.getString("imie");
            String nazwisko = result.getString("nazwisko");
            String eMail = result.getString("eMail");
            String adres1 = result.getString("adres1");
            String adres2 = result.getString("adres2");
            String adres3 = result.getString("adres3");
            String adres4 = result.getString("adres4");
            double saldoPLN = result.getDouble("saldoPLN");
            double saldoLokatPLN = result.getDouble("saldoLokatPLN");
            double saldoUSD = result.getDouble("saldoUSD");
            double saldoCHF = result.getDouble("saldoCHF");
            double saldoBTC = result.getDouble("saldoBTC");
            double saldoEUR = result.getDouble("saldoEUR");
            NumerPESEL PESEL = new NumerPESEL(result.getString("PESEL"));
            int PIN = result.getInt("PIN");
            NumerKarty numerKarty = new NumerKarty(result.getString("NumerKarty"));
            NumerKontaBankowego numerKontaBankowego = new NumerKontaBankowego(result.getString("NumerKontaBankowego"));
            int flag = result.getInt("blokadaKonta");
            boolean blokadaKonta;
            if (flag == 0) {
                blokadaKonta = false;
            }//tu równe a noie różne
            else {
                blokadaKonta = true;
            }

            Uzytkownik user = new Uzytkownik(ID, haslo, imie, nazwisko, eMail, adres1, adres2, adres3, adres4,
                    saldoPLN, saldoLokatPLN, saldoUSD, saldoCHF, saldoBTC,
                    saldoEUR, PESEL, PIN, numerKarty, numerKontaBankowego,
                    blokadaKonta);
            // System.out.println(user.getPIN());
            // System.out.println(PIN2);


            if (user.getPIN() == PIN2) {
                //System.out.println("jestesmy");
                return user;
            } else {
                return null;
            }


        } catch (SQLException e) {
            System.out.println("Wyjaek");
            e.printStackTrace();
            return null;
        }


    }

    /**
     * Metoda do przelewania pieniędzy
     *
     * @param numerkonta numer konta docelowego
     * @param kwota      kwota przelewu
     * @return true jak się uda i false jak sie nie uda
     */

    public boolean przelej(String numerkonta, double kwota) throws DBException {

        try {
            this.changeSaldo(-kwota);
            PreparedStatement prepStmt = conn.prepareStatement(
                    "UPDATE users SET saldoPLN=saldoPLN+ ? WHERE NumerKontaBankowego= ?");


            prepStmt.setString(1, String.valueOf(kwota));

            prepStmt.setString(2, numerkonta);

            prepStmt.execute();
            this.zapiszUzytkownik();
        } catch (SQLException | SaldoException e) {
            //System.err.println("Blad przy aktualizacji uzytkownika");
            //e.printStackTrace();
            throw new DBException("Blad w przelewie");
        }
        return true;

    }


    public boolean przelejNaNumerKarty(String numerkarty, double kwota) throws DBException {

        try {
            this.changeSaldo(-kwota);
            PreparedStatement prepStmt = conn.prepareStatement(
                    "UPDATE users SET saldoPLN=saldoPLN+ ? WHERE NumerKarty= ?");


            prepStmt.setString(1, String.valueOf(kwota));

            prepStmt.setString(2, numerkarty);

            prepStmt.execute();
            this.zapiszUzytkownik();
        } catch (SQLException | SaldoException | DBException e) {
            //System.err.println("Blad przy aktualizacji uzytkownika");
            //e.printStackTrace();
            throw new DBException("brak srodkow albo blad polaczneia");
        }
        return true;

    }


    /**
     * Metoda do wykorzystywania przez bank do blokowania uzytkowników
     *
     * @param IDE ID uzytkownika
     * @param tf  true jezeli ma byc zablokowane
     * @return true lub false w zaleznosci czy sie powiedzie
     */

    public static boolean DBSETBLOKADA(String IDE, boolean tf) {

        try {

            PreparedStatement prepStmt = conn.prepareStatement(
                    "UPDATE users SET blokadaKonta=? WHERE id_uzytkownika= ?");

            if (tf) {
                prepStmt.setString(1, String.valueOf(1));
            } else {
                prepStmt.setString(1, String.valueOf(0));
            }
            prepStmt.setString(2, IDE);

            prepStmt.execute();

        } catch (SQLException e) {
            //System.err.println("Blad przy aktualizacji uzytkownika");
            //e.printStackTrace();
            return false;
        }
        return true;

    }


//    public static void dropdatabase() throws SQLException {
//
//        ResultSet result = stat.executeQuery("SELECT * FROM users");
//        while(result.next()){
//            String haslo= result.getString("haslo");
//
//            System.out.println(haslo);
//        }
//    }


    /**
     * Metoda do zamykania połączenia z bazą danych
     */

    public static void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.err.println("Problem z zamknieciem polaczenia");
            //e.printStackTrace();
        }
    }


    /**
     * Testowanie mozliwosci klasy Uzytkownik
     *
     * @param args not used
     */

    public static void main(String[] args) throws SaldoException, DBException, InterruptedException {

        double kursusd = 0.27;
        double kurschf = 0.24;
        double kursbtc = 0.0000056;
        double kurseur = 0.22;
        double kursplnusd = 3.73;
        double kursplnchf = 4.14;
        double kursplnbtc = 180452.86;
        double kursplneur = 4.53;
//        int ide=21372138;
//        String  haslo="zaq1@WSX";
//        String imie= "Bielko";
//        String Nazwisko= "Bielski";
//        String emial= "Bielski@Walski.com";
//        String adres1="Popławska 240";
//        String adres2="Peloponez";
//        String adres3= "21-370";
//        String adres4="Polska";
//        NumerPESEL piesel= new NumerPESEL("09812369691");
//        NumerKarty nk= new NumerKarty("1243123412341234");
//        NumerKontaBankowego nkb=new NumerKontaBankowego("43215678912345678912345678");
//
//
//
//        Czlowiek JanKowalski=new Czlowiek(ide,haslo,imie,Nazwisko,emial,adres1,adres2,adres3,adres4);
//        Uzytkownik Janko =new Uzytkownik(JanKowalski,1000,1000,1000,1000,1000,100,piesel,2137,nk,nkb,false);
//        System.out.println(Janko.getSaldoPLN());
//        System.out.println(Janko.getSaldoEUR());
//        Janko.przewalutujplntoeur(kurseur,300);
//        System.out.println(Janko.getSaldoPLN());
//        System.out.println(Janko.getSaldoEUR());
//        ConstructUserDataBase();
//        //Janko.insertNewUzytkownik();
//        Uzytkownik usr2=loguj("21372138","zaq1@WSX");
//        Uzytkownik usr=loguj("21372140","zaq1@WSX");
//        usr.getNumerKontaBankowego().toString();
//        //Uzytkownik usr3=loguj("21372139","zaq1@WSX");
//        System.out.println("...........................");
//        System.out.println(Janko.toString());
//        System.out.println(usr.toString());
//        usr2.setBlokadaKonta(true);
//        usr2.setPIN(2137);
//        System.out.println("Wpłacanie");
//        System.out.println(usr2.getSaldoPLN());
//        usr2.wplac(2137);
//        System.out.println(usr2.getSaldoPLN());
//        System.out.println("Wypłacanie");
//        System.out.println(usr2.getSaldoPLN());
//        usr2.wyplac(2137);
//        System.out.println(usr2.getSaldoPLN());
//
//        usr2.zapiszUzytkownik();
//        usr2=loguj("21372138","zaq1@WSX");
//        System.out.println(usr2.getPIN());
//        System.out.println(usr.getSaldoPLN());
//        System.out.println(usr2.getSaldoPLN());
//        System.out.println(".......................");
//        System.out.println(usr.isZablokowane());
//        System.out.println(usr2.isZablokowane());

        //usr2.przelej(usr.getNumerKontaBankowego().toString(),100);

//        ConstructUserDataBase();
//        Uzytkownik usr2=loguj("21372138","zaq1@WSX");
//        System.out.println(usr2.getSaldoPLN());
//        usr2.wplac(200);
//        System.out.println(usr2.getSaldoPLN());
//        usr2.zapiszUzytkownik();
//
//        Uzytkownik usr3=loguj("21372139","zaq1@WSX");
//        System.out.println(usr2.getSaldoPLN());
//        System.out.println(usr3.getSaldoPLN());
//        //usr2.przelej(usr3.getNumerKontaBankowego().toString(),199.99);
//        usr3=loguj("21372139","zaq1@WSX");
//        usr3.wyplac(190);
//        System.out.println(usr2.getSaldoPLN());
//        System.out.println(usr3.getSaldoPLN());
//
//

        while(true) {

            Uzytkownik.ConstructUserDataBase();
            Uzytkownik user1 = loguj("4444444444444444", 2137);
            Uzytkownik user2 = loguj("4444444444444445", 2137);
            System.out.println("Saldo usera1 przed przelewem  " + user1.getSaldoPLN());
            System.out.println("Saldo usera2 przed przelewem  " + user2.getSaldoPLN());
            //user1.przelejNaNumerKarty("4444444444444445",10);
            Uzytkownik.closeConnection();
            Thread.sleep(10000);

            Uzytkownik.ConstructUserDataBase();
            user1 = loguj("4444444444444444", 2137);
            user2 = loguj("4444444444444445", 2137);
            System.out.println("Saldo usera1 po przelewie  " + user1.getSaldoPLN());
            System.out.println("Saldo usera2 po przelewie  " + user2.getSaldoPLN());
            Uzytkownik.closeConnection();
            Thread.sleep(10000);

        }



    }
}

