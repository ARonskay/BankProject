import BankExceptions.DBException;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Bankier extends JFrame {
    public static void main(String[] args) {
        new Bankier();
    }
    //zapis i odczyt ID aby był unikalny
    public String[] getdane(){
        File file = new File("IDDB.txt");
        return null;
    }
    public Bankier(){
        JFrame frame=new JFrame("panel Bankiera");
        frame.setResizable(false);
        frame.setSize(700,740);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.GRAY);

        //Logowanie
        JPanel logowanieBankiera = new JPanel();
        logowanieBankiera.setBackground(Color.GREEN);
        logowanieBankiera.setBounds(150,150,400,400);
        logowanieBankiera.setLayout(null);

        Border blackline = BorderFactory.createLineBorder(Color.black);
        logowanieBankiera.setBorder(blackline);
        logowanieBankiera.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        JLabel IDe = new JLabel("Podaj ID:");
        IDe.setBounds(20,20,120,30);
        IDe.setBackground(Color.GRAY);

        JLabel PASSWORD = new JLabel("Podaj hasło:");
        PASSWORD.setBounds(20,60,120,30);
        PASSWORD.setBackground(Color.GRAY);


        JTextField login= new JTextField();
        login.setBounds(150, 20,200,30);

        JPasswordField pass= new JPasswordField();
        pass.setBounds(150, 60,200,30);

        JButton loguj= new JButton("Loguj");
        loguj.setBounds(150,150,80,40);

        logowanieBankiera.add(IDe);
        logowanieBankiera.add(PASSWORD);
        logowanieBankiera.add(login);
        logowanieBankiera.add(pass);
        logowanieBankiera.add(loguj);

        //zaloogwany panel
        JPanel zalogowanyPanel= new JPanel();
        zalogowanyPanel.setBackground(Color.GREEN);
        zalogowanyPanel.setBounds(150,150,400,400);
        zalogowanyPanel.setLayout(null);
        JButton zalkonto = new JButton("załóż nowe konto");
        zalkonto.setBounds(0,0,200,60);
        JButton zablokusr = new JButton("Zablokuj użytkownika");
        zablokusr.setBounds(0,60,200,60);
        JButton zmianadanych = new JButton("Zmiana danych");
        zmianadanych.setBounds(0,120,200,60);
        JButton wyloguj = new JButton("wyloguj");
        wyloguj.setBounds(0,180,200,60);


        zalogowanyPanel.add(zmianadanych);
        zalogowanyPanel.add(wyloguj);
        zalogowanyPanel.add(zalkonto);
        zalogowanyPanel.add(zablokusr);

        //panel zakladania konta
        JPanel zakladanieKonta= new JPanel();
        zakladanieKonta.setBackground(Color.GREEN);
        zakladanieKonta.setBounds(150,150,400,400);
        zakladanieKonta.setLayout(null);
        JLabel ID = new JLabel("ID:");
        ID.setBounds(20,0,120,30);
        ID.setBackground(Color.GRAY);

        JLabel Haslo = new JLabel("Hasło:");
        Haslo.setBounds(20,30,120,30);
        Haslo.setBackground(Color.GRAY);

        JLabel Imie = new JLabel("Imie:");
        Imie.setBounds(20,60,120,30);
        Imie.setBackground(Color.GRAY);
        JLabel Nazwisko = new JLabel("Nazwisko:");
        Nazwisko.setBounds(20,90,120,30);
        Nazwisko.setBackground(Color.GRAY);
        JLabel email = new JLabel("email:");
        email.setBounds(20,120,120,30);
        email.setBackground(Color.GRAY);
        JLabel adres1 = new JLabel("adres1:");
        adres1.setBounds(20,150,120,30);
        adres1.setBackground(Color.GRAY);
        JLabel adres2 = new JLabel("adres2:");
        adres2.setBounds(20,180,120,30);
        adres2.setBackground(Color.GRAY);
        JLabel adres3 = new JLabel("adres3:");
        adres3.setBounds(20,210,120,30);
        adres3.setBackground(Color.GRAY);
        JLabel adres4 = new JLabel("adres4:");
        adres4.setBounds(20,240,120,30);
        adres4.setBackground(Color.GRAY);
        JLabel PESEL = new JLabel("PESEL:");
        PESEL.setBounds(20,270,120,30);
        PESEL.setBackground(Color.GRAY);
        JLabel PIN = new JLabel("PIN:");
        PIN.setBounds(20,300,120,30);
        PIN.setBackground(Color.GRAY);
        JLabel Nkarty = new JLabel("Nkarty:");
        Nkarty.setBounds(20,330,120,30);
        Nkarty.setBackground(Color.GRAY);
        JLabel NKonta = new JLabel("NKonta:");
        NKonta.setBounds(20,360,120,30);
        NKonta.setBackground(Color.GRAY);




        JTextField ID1 = new JTextField();
        ID1.setBounds(100,0,200,30);
        ID1.setBackground(Color.GRAY);

        JTextField Haslo1 = new JTextField();
        Haslo1.setBounds(100,30,200,30);
        Haslo1.setBackground(Color.GRAY);

        JTextField Imie1 = new JTextField();
        Imie1.setBounds(100,60,200,30);
        Imie1.setBackground(Color.GRAY);
        JTextField Nazwisko1 = new JTextField();
        Nazwisko1.setBounds(100,90,200,30);
        Nazwisko1.setBackground(Color.GRAY);
        JTextField email1 = new JTextField();
        email1.setBounds(100,120,200,30);
        email1.setBackground(Color.GRAY);
        JTextField adres11 = new JTextField();
        adres11.setBounds(100,150,200,30);
        adres11.setBackground(Color.GRAY);
        JTextField adres21 = new JTextField();
        adres21.setBounds(100,180,200,30);
        adres21.setBackground(Color.GRAY);
        JTextField adres31 = new JTextField();
        adres31.setBounds(100,210,200,30);
        adres31.setBackground(Color.GRAY);
        JTextField adres41 = new JTextField();
        adres41.setBounds(100,240,200,30);
        adres41.setBackground(Color.GRAY);
        JTextField PESEL1 = new JTextField();
        PESEL1.setBounds(100,270,200,30);
        PESEL1.setBackground(Color.GRAY);
        JTextField PIN1 = new JTextField();
        PIN1.setBounds(100,300,200,30);
        PIN1.setBackground(Color.GRAY);
        JTextField Nkarty1 = new JTextField();
        Nkarty1.setBounds(100,330,200,30);
        Nkarty1.setBackground(Color.GRAY);
        JTextField NKonta1 = new JTextField();
        NKonta1.setBounds(100,360,200,30);
        NKonta1.setBackground(Color.GRAY);

        JButton cancel= new JButton("Powrót");
        cancel.setBounds(300,300,100,60);
        JButton potwierdz= new JButton("Potwierdz");
        potwierdz.setBounds(300,240,100,60);

        zakladanieKonta.add(ID);
        zakladanieKonta.add(Haslo);
        zakladanieKonta.add(Imie);
        zakladanieKonta.add(Nazwisko);
        zakladanieKonta.add(email);
        zakladanieKonta.add(adres1);
        zakladanieKonta.add(adres2);
        zakladanieKonta.add(adres3);
        zakladanieKonta.add(adres4);
        zakladanieKonta.add(PESEL);
        zakladanieKonta.add(PIN);
        zakladanieKonta.add(Nkarty);
        zakladanieKonta.add(NKonta);
        zakladanieKonta.add(cancel);
        zakladanieKonta.add(potwierdz);




        zakladanieKonta.add(ID1);
        zakladanieKonta.add(Haslo1);
        zakladanieKonta.add(Imie1);
        zakladanieKonta.add(Nazwisko1);
        zakladanieKonta.add(email1);
        zakladanieKonta.add(adres11);
        zakladanieKonta.add(adres21);
        zakladanieKonta.add(adres31);
        zakladanieKonta.add(adres41);
        zakladanieKonta.add(PESEL1);
        zakladanieKonta.add(PIN1);
        zakladanieKonta.add(Nkarty1);
        zakladanieKonta.add(NKonta1);
        //////////////////////////////////////////////////////////
        //Panel blokowania uzytkownika

        JPanel blokowanie= new JPanel();
        blokowanie.setBackground(Color.GREEN);
        blokowanie.setBounds(150,150,400,400);
        blokowanie.setLayout(null);
        JLabel IDb = new JLabel("ID:");
        IDb.setBounds(20,0,120,30);
        IDb.setBackground(Color.GRAY);

        JTextField ID1b = new JTextField();
        ID1b.setBounds(100,0,200,30);
        ID1b.setBackground(Color.GRAY);



        JButton zablokuj= new JButton("zablokuj");
        zablokuj.setBounds(100,100,100,60);

        JButton odblokuj= new JButton("odblokuj");
        odblokuj.setBounds(300,100,100,60);
        //Dokonczyc

        JButton returnn= new JButton("return");
        returnn.setBounds(300,300,100,60);
        //Dokonczyc


        blokowanie.add(IDb);
        blokowanie.add(ID1b);

        blokowanie.add(zablokuj);
        blokowanie.add(odblokuj);
        blokowanie.add(returnn);
        //Uzytkownik.ConstructUserDataBase();

        /////////////////////////////////////////
        //Panel zmiany dancyh
        JPanel pzlog =new JPanel();
        pzlog.setBackground(Color.GREEN);
        pzlog.setBounds(150,150,400,400);
        pzlog.setLayout(null);
        JLabel IDbpzlog = new JLabel("ID:");
        IDbpzlog.setBounds(20,0,120,30);
        IDbpzlog.setBackground(Color.GRAY);

        JTextField IDbpzlog1 = new JTextField();
        IDbpzlog1.setBounds(100,0,200,30);
        IDbpzlog1.setBackground(Color.GRAY);

        JLabel PASSbpzlog = new JLabel("HASŁO:");
        PASSbpzlog.setBounds(20,30,120,30);
        PASSbpzlog.setBackground(Color.GRAY);

        JTextField PASSbpzlog1 = new JTextField();
        PASSbpzlog1.setBounds(100,30,200,30);
        PASSbpzlog1.setBackground(Color.GRAY);

        JButton dalej=new JButton("Dalej");
        dalej.setBounds(300,240,100,60);

        JButton cofnij=new JButton("cofnij");
        cofnij.setBounds(300,300,100,60);

        pzlog.add(IDbpzlog);
        pzlog.add(IDbpzlog1);
        pzlog.add(PASSbpzlog);
        pzlog.add(PASSbpzlog1);
        pzlog.add(dalej);
        pzlog.add(cofnij);
        //////////////////////
        //Zalogowany panel zmiany danych
        JPanel pzzalog= new JPanel();
        pzzalog.setBackground(Color.GREEN);
        pzzalog.setBounds(150,150,400,400);
        pzzalog.setLayout(null);

        JButton cancelpz= new JButton("Powrót");
        cancelpz.setBounds(300,300,100,60);
        JButton potwierdzpz= new JButton("Zapisz");
        potwierdzpz.setBounds(300,240,100,60);

        pzzalog.add(cancelpz);
        pzzalog.add(potwierdzpz);

        JLabel ID2 = new JLabel("ID:");
        ID2.setBounds(20,0,120,30);
        ID2.setBackground(Color.GRAY);

        JLabel Haslo2 = new JLabel("Hasło:");
        Haslo2.setBounds(20,30,120,30);
        Haslo2.setBackground(Color.GRAY);

        JLabel Imie2 = new JLabel("Imie:");
        Imie2.setBounds(20,60,120,30);
        Imie2.setBackground(Color.GRAY);
        JLabel Nazwisko2 = new JLabel("Nazwisko:");
        Nazwisko2.setBounds(20,90,120,30);
        Nazwisko2.setBackground(Color.GRAY);
        JLabel email2 = new JLabel("email:");
        email2.setBounds(20,120,120,30);
        email2.setBackground(Color.GRAY);
        JLabel adres12 = new JLabel("adres1:");
        adres12.setBounds(20,150,120,30);
        adres12.setBackground(Color.GRAY);
        JLabel adres22 = new JLabel("adres2:");
        adres22.setBounds(20,180,120,30);
        adres22.setBackground(Color.GRAY);
        JLabel adres32 = new JLabel("adres3:");
        adres32.setBounds(20,210,120,30);
        adres32.setBackground(Color.GRAY);
        JLabel adres42 = new JLabel("adres4:");
        adres42.setBounds(20,240,120,30);
        adres42.setBackground(Color.GRAY);
        JLabel PESEL2 = new JLabel("PESEL:");
        PESEL2.setBounds(20,270,120,30);
        PESEL2.setBackground(Color.GRAY);
        JLabel PIN2 = new JLabel("PIN:");
        PIN2.setBounds(20,300,120,30);
        PIN2.setBackground(Color.GRAY);
        JLabel Nkarty2 = new JLabel("Nkarty:");
        Nkarty2.setBounds(20,330,120,30);
        Nkarty2.setBackground(Color.GRAY);
        JLabel NKonta2 = new JLabel("NKonta:");
        NKonta2.setBounds(20,360,120,30);
        NKonta2.setBackground(Color.GRAY);




        JTextField ID12 = new JTextField();
        ID12.setBounds(100,0,200,30);
        ID12.setBackground(Color.GRAY);

        JTextField Haslo12 = new JTextField();
        Haslo12.setBounds(100,30,200,30);
        Haslo12.setBackground(Color.GRAY);

        JTextField Imie12 = new JTextField();
        Imie12.setBounds(100,60,200,30);
        Imie12.setBackground(Color.GRAY);
        JTextField Nazwisko12 = new JTextField();
        Nazwisko12.setBounds(100,90,200,30);
        Nazwisko12.setBackground(Color.GRAY);
        JTextField email12 = new JTextField();
        email12.setBounds(100,120,200,30);
        email12.setBackground(Color.GRAY);
        JTextField adres112 = new JTextField();
        adres112.setBounds(100,150,200,30);
        adres112.setBackground(Color.GRAY);
        JTextField adres212 = new JTextField();
        adres212.setBounds(100,180,200,30);
        adres212.setBackground(Color.GRAY);
        JTextField adres312 = new JTextField();
        adres312.setBounds(100,210,200,30);
        adres312.setBackground(Color.GRAY);
        JTextField adres412 = new JTextField();
        adres412.setBounds(100,240,200,30);
        adres412.setBackground(Color.GRAY);
        JTextField PESEL12 = new JTextField();
        PESEL12.setBounds(100,270,200,30);
        PESEL12.setBackground(Color.GRAY);
        JTextField PIN12 = new JTextField();
        PIN12.setBounds(100,300,200,30);
        PIN12.setBackground(Color.GRAY);
        JTextField Nkarty12 = new JTextField();
        Nkarty12.setBounds(100,330,200,30);
        Nkarty12.setBackground(Color.GRAY);
        JTextField NKonta12 = new JTextField();
        NKonta12.setBounds(100,360,200,30);
        NKonta12.setBackground(Color.GRAY);
        pzzalog.add(ID2);
        pzzalog.add(Haslo2);
        pzzalog.add(Imie2);
        pzzalog.add(Nazwisko2);
        pzzalog.add(email2);
        pzzalog.add(adres12);
        pzzalog.add(adres22);
        pzzalog.add(adres32);
        pzzalog.add(adres42);
        pzzalog.add(PESEL2);
        pzzalog.add(PIN2);
        pzzalog.add(Nkarty2);
        pzzalog.add(NKonta2);




        pzzalog.add(ID12);
        pzzalog.add(Haslo12);
        pzzalog.add(Imie12);
        pzzalog.add(Nazwisko12);
        pzzalog.add(email12);
        pzzalog.add(adres112);
        pzzalog.add(adres212);
        pzzalog.add(adres312);
        pzzalog.add(adres412);
        pzzalog.add(PESEL12);
        pzzalog.add(PIN12);
        pzzalog.add(Nkarty12);
        pzzalog.add(NKonta12);

        potwierdzpz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("Zapisz")){
                    try{
                        Uzytkownik.ConstructUserDataBase();
                        Uzytkownik.DBUPDATE(ID12.getText(),Haslo12.getText(),Imie12.getText(),Nazwisko12.getText(),
                                email12.getText(),adres112.getText(),adres212.getText(),adres312.getText(),
                                adres412.getText(),PESEL12.getText(),
                                PIN12.getText(),Nkarty12.getText(), NKonta12.getText());


                        frame.remove(pzzalog);
                        frame.add(zalogowanyPanel);
                        ID12.setText("");Haslo12.setText("");Imie12.setText("");Nazwisko12.setText("");
                        email12.setText("");adres112.setText("");adres212.setText("");adres312.setText("");
                        adres412.setText("");PESEL12.setText("");
                        PIN12.setText("");Nkarty12.setText(""); NKonta12.setText("");
                        ID12.setEditable(true);
                        frame.repaint();
                        Uzytkownik.closeConnection();

                    }
                    catch (Exception exception){System.out.println(exception);
                        JOptionPane.showMessageDialog(frame, exception);}
                }
            }
        });
        cancelpz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("Powrót")){
                    Uzytkownik.ConstructUserDataBase();
                    ID12.setText("");Haslo12.setText("");Imie12.setText("");Nazwisko12.setText("");
                    email12.setText("");adres112.setText("");adres212.setText("");adres312.setText("");
                    adres412.setText("");PESEL12.setText("");
                    PIN12.setText("");Nkarty12.setText(""); NKonta12.setText("");
                    Uzytkownik.closeConnection();
                    frame.remove(pzzalog);
                    frame.add(pzlog);
                    ID12.setEditable(true);
                    frame.repaint();
                }




            }
        });
        cofnij.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("cofnij")){
                    IDbpzlog1.setText("");
                    PASSbpzlog1.setText("");
                    frame.remove(pzlog);
                    frame.add(zalogowanyPanel);
                    frame.repaint();
                }
            }
        });

        dalej.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("Dalej")){
                    try{
                        Uzytkownik.ConstructUserDataBase();
                        Uzytkownik usr=Uzytkownik.loguj(IDbpzlog1.getText(),PASSbpzlog1.getText());
                        if(usr==null){throw new DBException("Błąd!");}
                        ID12.setText(String.valueOf(usr.getID()));
                        Haslo12.setText(usr.getHaslo());
                        Imie12.setText(usr.getImie());
                        Nazwisko12.setText(usr.getNazwisko());
                        email12.setText(usr.geteMail());
                        adres112.setText(usr.getAdres1());
                        adres212.setText(usr.getAdres2());
                        adres312.setText(usr.getAdres3());
                        adres412.setText(usr.getAdres4());
                        PESEL12.setText(usr.getPESEL().toString());
                        PIN12.setText(String.valueOf(usr.getPIN()));
                        Nkarty12.setText(usr.getNumerKarty().toString());
                        NKonta12.setText(usr.getNumerKontaBankowego().toString());
                        Uzytkownik.closeConnection();
                        ID12.setEditable(false);
                        frame.remove(pzlog);
                        frame.add(pzzalog);
                        frame.repaint();
                    }
                    catch (Exception exception){//System.out.println(exception);
                        JOptionPane.showMessageDialog(frame, exception);}
                }
            }
        });

        zmianadanych.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("Zmiana danych")){

                    frame.remove(zalogowanyPanel);
                    frame.add(pzlog);
                    frame.repaint();
                }
            }
        });


//Potwierdz  listener działa!!!!!!
        potwierdz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(potwierdz.getActionCommand().equals("Potwierdz")){

                    try{
                        NumerPESEL npesel=new NumerPESEL(PESEL1.getText());
                        NumerKarty nk=new NumerKarty(Nkarty1.getText());
                        NumerKontaBankowego nkb=new NumerKontaBankowego(NKonta1.getText());
                        //System.out.println("Trying to set usr");
                        System.out.println(String.valueOf(Integer.parseInt(ID1.getText())));
                        Uzytkownik usr = new Uzytkownik(Integer.parseInt(ID1.getText()),Haslo1.getText(),Imie1.getText(),
                                Nazwisko1.getText(),email1.getText(),adres11.getText(),adres21.getText(),
                                adres31.getText(),adres41.getText(),
                                0,0,0,0,0,0,
                                npesel,Integer.parseInt(PIN1.getText()),nk,nkb,
                                false);
                        //System.out.println(usr.toString());
                        Uzytkownik.ConstructUserDataBase();
                        usr.insertNewUzytkownik();
                        ID1.setText("");
                        Haslo1.setText("");
                        Imie1.setText("");
                        Nazwisko1.setText("");
                        email1.setText("");
                        adres11.setText("");
                        adres21.setText("");
                        adres31.setText("");
                        adres41.setText("");
                        PESEL1.setText("");
                        PIN1.setText("");
                        Nkarty1.setText("");
                        NKonta1.setText("");
                        Uzytkownik.closeConnection();

                    }
                    catch (Exception exception){System.out.println(exception);
                        JOptionPane.showMessageDialog(frame, exception);}


                }
            }
        });

        zalkonto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(zalkonto.getActionCommand().equals("załóż nowe konto")){//tu moze e zamiast zalkonto
                    frame.remove(zalogowanyPanel);
                    frame.add(zakladanieKonta);
                    frame.repaint();

                }
            }
        });
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cancel.getActionCommand().equals("Powrót")){
                    frame.remove(zakladanieKonta);
                    frame.add(zalogowanyPanel);
                    frame.repaint();


                }
            }
        });

        //Listenery do blokowaniua
        returnn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cancel.getActionCommand().equals("Powrót")){
                    frame.remove(blokowanie);
                    frame.add(zalogowanyPanel);
                    frame.repaint();


                }
            }
        });
        zablokuj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("zablokuj")){
                    try{
                        Uzytkownik.ConstructUserDataBase();
                        Uzytkownik.DBSETBLOKADA(ID1b.getText(),true);
                        Uzytkownik.closeConnection();
                        JOptionPane.showMessageDialog(frame, "Zablokowano");
                    }
                    catch (Exception exception){JOptionPane.showMessageDialog(frame, exception);}


                }
            }
        });
        odblokuj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("odblokuj")){
                    try{
                        Uzytkownik.ConstructUserDataBase();

                        Uzytkownik.DBSETBLOKADA(ID1b.getText(),false);
                        Uzytkownik.closeConnection();
                        JOptionPane.showMessageDialog(frame, "Odblokowano");
                    }
                    catch (Exception exception){JOptionPane.showMessageDialog(frame, exception);}


                }
            }
        });
//koniec listenertów do blokowania

        zablokusr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("Zablokuj użytkownika")){

                    frame.remove(zalogowanyPanel);
                    frame.add(blokowanie);
                    frame.repaint();

                }
            }
        });



        loguj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password="";
                char[] passchar= pass.getPassword();
                for(int i=0; i<passchar.length;i++){
                    password=password+passchar[i];
                }
                if(e.getActionCommand().equals("Loguj")){
                    if(login.getText().equals("admin")&&password.equals("admin")){
                        //System.out.println("SUKCES");
                        login.setText("");
                        pass.setText("");
                        frame.remove(logowanieBankiera);
                        frame.add(zalogowanyPanel);
                        frame.repaint();
                    }

                }
            }
        });





        wyloguj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getActionCommand().equals("wyloguj")){
                    frame.remove(zalogowanyPanel);
                    frame.add(logowanieBankiera);
                    frame.repaint();


                }
            }
        });



        frame.add(logowanieBankiera);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }

}
