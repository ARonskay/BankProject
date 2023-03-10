
import BankExceptions.DBException;
import BankExceptions.SaldoException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class stronainternetowa extends JFrame {
    private Uzytkownik user;
    public static void main(String[] args) throws Exception{
        new stronainternetowa();
    }
    public stronainternetowa() throws IOException, InterruptedException {
        JFrame frame = new JFrame("Bankomat");
        frame.setSize(1280, 720);
        frame.getContentPane().setBackground(Color.GRAY);
// dodac wyloguj, ogarnac przelewy
        /////////////////////////////F/////////////////////////////////
        //PANEL STARTOWY
        //////////////////////////////////////////////////////////////

        JPanel panel0 = new JPanel();
        panel0.setBackground(Color.WHITE);
        panel0.setLayout(null);

        frame.getContentPane().setLayout(null);
        panel0.setBounds(35, 30, 1200, 600);
        Border blackline = BorderFactory.createLineBorder(Color.black);
        panel0.setBorder(blackline);
        panel0.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));

        JLabel lwitamy = new JLabel("Witamy w naszym banku");
        lwitamy.setBounds(300, 40, 700, 140);
        lwitamy.setFont(new Font("Arial", Font.BOLD, 40));
        lwitamy.setForeground(Color.BLACK);
        panel0.add(lwitamy);


        JLabel lnrkarty = new JLabel("Wprowadz ID:");
        lnrkarty.setBounds(500, 150, 150, 50);
        lnrkarty.setFont(new Font("Arial", Font.BOLD, 15));
        lnrkarty.setForeground(Color.RED);


        JLabel lpin = new JLabel("Wprowadz hasło:");
        lpin.setBounds(500, 190, 150, 50);
        lpin.setFont(new Font("Arial", Font.BOLD, 15));
        lpin.setForeground(Color.RED);

        JFormattedTextField tkarta = new JFormattedTextField();
        tkarta.setColumns(16);
        tkarta.setBounds(650, 160, 200, 30);
        tkarta.setBackground(Color.lightGray);
        tkarta.setFont(new Font("Arial", Font.BOLD, 15));


        JFormattedTextField tpin = new JFormattedTextField();
        tpin.setBounds(650, 200, 200, 30);
        tpin.setBackground(Color.LIGHT_GRAY);
        tpin.setFont(new Font("Arial", Font.BOLD, 15));


        JButton bdalej = new JButton("Dalej");
        bdalej.setBackground(Color.GREEN);
        bdalej.setBounds(850, 350, 150, 75);
        bdalej.setFont(new Font("Arial", Font.BOLD, 25));
        panel0.add(bdalej);
        panel0.add(lnrkarty);
        panel0.add(lpin);
        panel0.add(tkarta);
        panel0.add(tpin);

        //////////////////////////////////////////////////////////////
        //PANEL GłóWNY
        //////////////////////////////////////////////////////////////

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.WHITE);

        panel1.setBounds(35, 50, 1200, 600);
        panel1.setBorder(blackline);
        panel1.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);

        JPanel panel00 = new JPanel();
        panel00.setBackground(Color.GRAY);

        frame.getContentPane().setLayout(null);
        panel00.setBounds(500, 430, 150, 200);


        JPanel pcash0 = new JPanel();
        pcash0.setBackground(Color.GRAY);
        frame.getContentPane().setLayout(null);
        pcash0.setBounds(35, 460, 166, 200);

        JPanel pcash = new JPanel();
        pcash.setBackground(Color.GRAY);
        frame.getContentPane().setLayout(null);
        pcash.setBounds(35, 460, 166, 200);

        JPanel ppotwierdzenie = new JPanel();
        ppotwierdzenie.setBackground(Color.GRAY);
        frame.getContentPane().setLayout(null);
        ppotwierdzenie.setBounds(35, 460, 166, 200);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.lightGray);
        panel3.setLayout(null);

        panel1.setLayout(null);
        panel3.setBounds(400, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));

        BufferedImage logo = ImageIO.read(new File("logo.png"));
        JLabel logolabel = new JLabel(new ImageIcon(logo));
        add(logolabel);
        logolabel.setBounds(750, 50, 120, 120);


        BufferedImage logo2 = ImageIO.read(new File("logo.png"));
        JLabel logolabel2 = new JLabel(new ImageIcon(logo2));
        add(logolabel2);
        logolabel.setBounds(750, 50, 120, 120);
        logolabel2.setBounds(210, 0, 120, 120);

        JLabel bank = new JLabel("BANK");
        bank.setBounds(75, 25, 150, 70);
        bank.setFont(new Font("Arial", Font.BOLD, 50));
        bank.setForeground(Color.BLACK);
        panel1.add(bank);

        JButton wyloguj = new JButton("Wyloguj");
        wyloguj.setBackground(Color.RED);
        wyloguj.setBounds(1050,20,100,30);
        wyloguj.setFont(new Font("Arial", Font.BOLD, 10));
        panel1.add(wyloguj);


        //////////////////////////////////////////////////////////////
        //PANEL " ZLECENIE PRZELEWU"
        //////////////////////////////////////////////////////////////
        JPanel panelzlecenie = new JPanel();
        panelzlecenie.setBackground(Color.WHITE);


        panelzlecenie.setBounds(300, 150, 800, 400);
        frame.getContentPane().setLayout(null);

        JLabel linnakarta = new JLabel("Wprowadz numer karty");
        linnakarta.setFont(new Font("Arial", Font.BOLD, 17));
        linnakarta.setBounds(250,85,270,30);
        linnakarta.setForeground(Color.BLACK);
        panelzlecenie.add(linnakarta);

        JFormattedTextField tinnakarta = new JFormattedTextField();
        tinnakarta.setColumns(16);
        tinnakarta.setBounds(270, 120, 250, 30);
        tinnakarta.setBackground(Color.lightGray);
        tinnakarta.setFont(new Font("Arial", Font.BOLD, 15));
        panelzlecenie.add(tinnakarta);

        JLabel lkwotazlecenie = new JLabel("Wprowadz kwotę");
        lkwotazlecenie.setFont(new Font("Arial", Font.BOLD, 17));
        lkwotazlecenie.setBounds(265,150,270,30);
        lkwotazlecenie.setForeground(Color.BLACK);
        panelzlecenie.add(lkwotazlecenie);

        JFormattedTextField tkwotazlecenie = new JFormattedTextField();
        tkwotazlecenie.setColumns(16);
        tkwotazlecenie.setBounds(285, 185, 100, 30);
        tkwotazlecenie.setBackground(Color.lightGray);
        tkwotazlecenie.setFont(new Font("Arial", Font.BOLD, 15));
        panelzlecenie.add(tkwotazlecenie);

        JLabel lzł = new JLabel("Zł");
        lzł.setFont(new Font("Arial", Font.BOLD, 17));
        lzł.setBounds(395,185,30,30);
        lzł.setForeground(Color.BLACK);
        panelzlecenie.add(lzł);

        JButton bakceptujzlecenie = new JButton("Akceptuj");
        bakceptujzlecenie.setBackground(Color.GREEN);
        bakceptujzlecenie.setBounds(285,225,100,30);
        bakceptujzlecenie.setFont(new Font("Arial", Font.BOLD, 10));
        panelzlecenie.add(bakceptujzlecenie);

        JLabel lzleceniepomyslnie = new JLabel("Przelew został przeprowadzony pomyślnie");
        lzleceniepomyslnie.setFont(new Font("Arial", Font.BOLD, 17));
        lzleceniepomyslnie.setBounds(120,290,400,30);
        lzleceniepomyslnie.setForeground(Color.GREEN);

        JLabel lzlecenieniepomyslnie = new JLabel("Przelew nie został przeprowadzony pomyślnie");
        lzlecenieniepomyslnie.setFont(new Font("Arial", Font.BOLD, 17));
        lzlecenieniepomyslnie.setBounds(120,290,400,30);
        lzlecenieniepomyslnie.setForeground(Color.RED);

        BufferedImage buttonIcon3 = ImageIO.read(new File("strzałka.png"));
        JButton bpowrotzlecenie = new JButton(new ImageIcon(buttonIcon3));
        bpowrotzlecenie.setBorderPainted(false);
        bpowrotzlecenie.setFocusPainted(false);
        bpowrotzlecenie.setContentAreaFilled(false);
        bpowrotzlecenie.setLayout(null);
        bpowrotzlecenie.setBounds(575, 290, 40, 40);
        panelzlecenie.add(bpowrotzlecenie);

        //////////////////////////////////////////////////////////////
        //PANEL " PRZEWALUTOWANIE"
        //////////////////////////////////////////////////////////////

        JPanel panelprzewalutowanie = new JPanel();
        panelprzewalutowanie.setBackground(Color.WHITE);


        panelprzewalutowanie.setBounds(300, 150, 800, 400);
        frame.getContentPane().setLayout(null);


        JPanel panelprzewalutowanie1 =new JPanel();
        JPanel panelprzewalutowanie2=new JPanel();
        JPanel panelprzewalutowanie3=new JPanel();
        JPanel panelprzewalutowanie4=new JPanel();
        JPanel panelprzewalutowanie5=new JPanel();
        JPanel panelprzewalutowanie6=new JPanel();
        JPanel panelprzewalutowanie7=new JPanel();
        JPanel panelprzewalutowanie8=new JPanel();
        panelprzewalutowanie1.setBackground(Color.LIGHT_GRAY);
        panelprzewalutowanie2.setBackground(Color.LIGHT_GRAY);
        panelprzewalutowanie3.setBackground(Color.LIGHT_GRAY);
        panelprzewalutowanie4.setBackground(Color.LIGHT_GRAY);
        panelprzewalutowanie5.setBackground(Color.LIGHT_GRAY);
        panelprzewalutowanie6.setBackground(Color.LIGHT_GRAY);
        panelprzewalutowanie7.setBackground(Color.LIGHT_GRAY);
        panelprzewalutowanie8.setBackground(Color.LIGHT_GRAY);

        JLabel lpomyślnie = new JLabel("Operacja została wykonana pomyślnie!");
        lpomyślnie.setFont(new Font("Arial", Font.BOLD, 15));
        lpomyślnie.setBounds(60,125,270,30);
        lpomyślnie.setForeground(Color.BLACK);

        JLabel lniepomyślnie = new JLabel("Operacja nie została wykonana pomyślnie!");
        lniepomyślnie.setFont(new Font("Arial", Font.BOLD, 15));
        lniepomyślnie.setBounds(40,125,300,30);
        lniepomyślnie.setForeground(Color.RED);

        JLabel ll1= new JLabel("Wprowadż kwotę");
        ll1.setFont(new Font("Arial", Font.BOLD, 15));
        ll1.setBounds(150,20,130,30);
        ll1.setForeground(Color.BLACK);
        panelprzewalutowanie1.add(ll1);
        JFormattedTextField t1 = new JFormattedTextField();
        t1.setColumns(16);
        t1.setBounds(150, 50, 130, 30);
        t1.setBackground(Color.white);
        t1.setFont(new Font("Arial", Font.BOLD, 15));
        panelprzewalutowanie1.setLayout(null);
        panelprzewalutowanie1.add(t1);
        JLabel l1= new JLabel("Zł");
        l1.setFont(new Font("Arial", Font.BOLD, 15));
        l1.setBounds(290,50,30,30);
        l1.setForeground(Color.BLACK);
        panelprzewalutowanie1.add(l1);
        JButton bb1 = new JButton("Przewalutuj");
        bb1.setBackground(Color.GREEN);
        bb1.setBounds(165,90,100,35);
        bb1.setFont(new Font("Arial", Font.BOLD, 10));
        panelprzewalutowanie1.add(bb1);

        JLabel ll2= new JLabel("Wprowadż kwotę");
        ll2.setFont(new Font("Arial", Font.BOLD, 15));
        ll2.setBounds(150,20,130,30);
        ll2.setForeground(Color.BLACK);
        panelprzewalutowanie2.add(ll2);
        JFormattedTextField t2 = new JFormattedTextField();
        t2.setColumns(16);
        t2.setBounds(150, 50, 130, 30);
        t2.setBackground(Color.white);
        t2.setFont(new Font("Arial", Font.BOLD, 15));
        panelprzewalutowanie2.setLayout(null);
        panelprzewalutowanie2.add(t2);
        JLabel l2= new JLabel("Zł");
        l2.setFont(new Font("Arial", Font.BOLD, 15));
        l2.setBounds(290,50,30,30);
        l2.setForeground(Color.BLACK);
        panelprzewalutowanie2.add(l2);
        JButton bb2 = new JButton("Przewalutuj");
        bb2.setBackground(Color.GREEN);
        bb2.setBounds(165,90,100,35);
        bb2.setFont(new Font("Arial", Font.BOLD, 10));
        panelprzewalutowanie2.add(bb2);

        JLabel ll3= new JLabel("Wprowadż kwotę");
        ll3.setFont(new Font("Arial", Font.BOLD, 15));
        ll3.setBounds(150,20,130,30);
        ll3.setForeground(Color.BLACK);
        panelprzewalutowanie3.add(ll3);
        JFormattedTextField t3 = new JFormattedTextField();
        t3.setColumns(16);
        t3.setBounds(150, 50, 130, 30);
        t3.setBackground(Color.white);
        t3.setFont(new Font("Arial", Font.BOLD, 15));
        panelprzewalutowanie3.setLayout(null);
        panelprzewalutowanie3.add(t3);
        JLabel l3= new JLabel("Zł");
        l3.setFont(new Font("Arial", Font.BOLD, 15));
        l3.setBounds(290,50,30,30);
        l3.setForeground(Color.BLACK);
        panelprzewalutowanie3.add(l3);
        JButton bb3 = new JButton("Przewalutuj");
        bb3.setBackground(Color.GREEN);
        bb3.setBounds(165,90,100,35);
        bb3.setFont(new Font("Arial", Font.BOLD, 10));
        panelprzewalutowanie3.add(bb3);

        JLabel ll4= new JLabel("Wprowadż kwotę");
        ll4.setFont(new Font("Arial", Font.BOLD, 15));
        ll4.setBounds(150,20,130,30);
        ll4.setForeground(Color.BLACK);
        panelprzewalutowanie4.add(ll4);
        JFormattedTextField t4 = new JFormattedTextField();
        t4.setColumns(16);
        t4.setBounds(150, 50, 130, 30);
        t4.setBackground(Color.white);
        t4.setFont(new Font("Arial", Font.BOLD, 15));
        panelprzewalutowanie4.setLayout(null);
        panelprzewalutowanie4.add(t4);
        JLabel l4= new JLabel("Zł");
        l4.setFont(new Font("Arial", Font.BOLD, 15));
        l4.setBounds(290,50,30,30);
        l4.setForeground(Color.BLACK);
        panelprzewalutowanie4.add(l4);
        JButton bb4 = new JButton("Przewalutuj");
        bb4.setBackground(Color.GREEN);
        bb4.setBounds(165,90,100,35);
        bb4.setFont(new Font("Arial", Font.BOLD, 10));
        panelprzewalutowanie4.add(bb4);

        JLabel ll5= new JLabel("Wprowadż kwotę");
        ll5.setFont(new Font("Arial", Font.BOLD, 15));
        ll5.setBounds(150,20,130,30);
        ll5.setForeground(Color.BLACK);
        panelprzewalutowanie5.add(ll5);
        JFormattedTextField t5 = new JFormattedTextField();
        t5.setColumns(16);
        t5.setBounds(150, 50, 130, 30);
        t5.setBackground(Color.white);
        t5.setFont(new Font("Arial", Font.BOLD, 15));
        panelprzewalutowanie5.setLayout(null);
        panelprzewalutowanie5.add(t5);
        JLabel l5= new JLabel("$");
        l5.setFont(new Font("Arial", Font.BOLD, 15));
        l5.setBounds(290,50,30,30);
        l5.setForeground(Color.BLACK);
        panelprzewalutowanie5.add(l5);
        JButton bb5 = new JButton("Przewalutuj");
        bb5.setBackground(Color.GREEN);
        bb5.setBounds(165,90,100,35);
        bb5.setFont(new Font("Arial", Font.BOLD, 10));
        panelprzewalutowanie5.add(bb5);

        JLabel ll6= new JLabel("Wprowadż kwotę");
        ll6.setFont(new Font("Arial", Font.BOLD, 15));
        ll6.setBounds(150,20,130,30);
        ll6.setForeground(Color.BLACK);
        panelprzewalutowanie6.add(ll6);
        JFormattedTextField t6 = new JFormattedTextField();
        t6.setColumns(16);
        t6.setBounds(150, 50, 130, 30);
        t6.setBackground(Color.white);
        t6.setFont(new Font("Arial", Font.BOLD, 15));
        panelprzewalutowanie6.setLayout(null);
        panelprzewalutowanie6.add(t6);
        JLabel l6= new JLabel("£");
        l6.setFont(new Font("Arial", Font.BOLD, 15));
        l6.setBounds(290,50,30,30);
        l6.setForeground(Color.BLACK);
        panelprzewalutowanie6.add(l6);
        JButton bb6 = new JButton("Przewalutuj");
        bb6.setBackground(Color.GREEN);
        bb6.setBounds(165,90,100,35);
        bb6.setFont(new Font("Arial", Font.BOLD, 10));
        panelprzewalutowanie6.add(bb6);

        JLabel ll7= new JLabel("Wprowadż kwotę");
        ll7.setFont(new Font("Arial", Font.BOLD, 15));
        ll7.setBounds(150,20,130,30);
        ll7.setForeground(Color.BLACK);
        panelprzewalutowanie7.add(ll7);
        JFormattedTextField t7 = new JFormattedTextField();
        t7.setColumns(16);
        t7.setBounds(150, 50, 130, 30);
        t7.setBackground(Color.white);
        t7.setFont(new Font("Arial", Font.BOLD, 15));
        panelprzewalutowanie7.setLayout(null);
        panelprzewalutowanie7.add(t7);
        JLabel l7= new JLabel("₿");
        l7.setFont(new Font("Arial", Font.BOLD, 15));
        l7.setBounds(290,50,30,40);
        l7.setForeground(Color.BLACK);
        panelprzewalutowanie7.add(l7);
        JButton bb7 = new JButton("Przewalutuj");
        bb7.setBackground(Color.GREEN);
        bb7.setBounds(165,90,100,35);
        bb7.setFont(new Font("Arial", Font.BOLD, 10));
        panelprzewalutowanie7.add(bb7);

        JLabel ll8= new JLabel("Wprowadż kwotę");
        ll8.setFont(new Font("Arial", Font.BOLD, 15));
        ll8.setBounds(150,20,130,30);
        ll8.setForeground(Color.BLACK);
        panelprzewalutowanie8.add(ll8);
        JFormattedTextField t8 = new JFormattedTextField();
        t8.setColumns(16);
        t8.setBounds(150, 50, 130, 30);
        t8.setBackground(Color.white);
        t8.setFont(new Font("Arial", Font.BOLD, 15));
        panelprzewalutowanie8.setLayout(null);
        panelprzewalutowanie8.add(t8);
        JLabel l8= new JLabel("€");
        l8.setFont(new Font("Arial", Font.BOLD, 15));
        l8.setBounds(290,50,30,30);
        l8.setForeground(Color.BLACK);
        panelprzewalutowanie8.add(l8);
        JButton bb8 = new JButton("Przewalutuj");
        bb8.setBackground(Color.GREEN);
        bb8.setBounds(165,90,100,35);
        bb8.setFont(new Font("Arial", Font.BOLD, 10));
        panelprzewalutowanie8.add(bb8);


        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(200,50,400,200);
        tp.setBackground(Color.pink);
        tp.add("PLN to USD",panelprzewalutowanie1);
        tp.add("PLN to CHF",panelprzewalutowanie2);
        tp.add("PLN to BNC",panelprzewalutowanie3);
        tp.add("PLN to EUR",panelprzewalutowanie4);
        tp.add("USD to PLN",panelprzewalutowanie5);
        tp.add("CHF to PLN",panelprzewalutowanie6);
        tp.add("BTN to PLN",panelprzewalutowanie7);
        tp.add("EUR to PLN",panelprzewalutowanie8);
        panelprzewalutowanie.add(tp);

        BufferedImage buttonIcon4 = ImageIO.read(new File("strzałka.png"));
        JButton bpowrotprzewalutowanie = new JButton(new ImageIcon(buttonIcon4));
        bpowrotprzewalutowanie.setBorderPainted(false);
        bpowrotprzewalutowanie.setFocusPainted(false);
        bpowrotprzewalutowanie.setContentAreaFilled(false);
        bpowrotprzewalutowanie.setLayout(null);
        bpowrotprzewalutowanie.setBounds(600, 350, 40, 40);
        panelprzewalutowanie.add(bpowrotprzewalutowanie);

        //////////////////////////////////////////////////////////////
        //PANEL " ZAPYTANIE O SALDO"
        //////////////////////////////////////////////////////////////


        JPanel panelsaldo = new JPanel();
        panelsaldo.setBackground(Color.WHITE);


        panelsaldo.setBounds(0, 0, 1200, 600);
        panelsaldo.setBorder(blackline);
        panelsaldo.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);
        panel3.setLayout(null);
        panel3.setBounds(400, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        panelsaldo.add(panel3);

        JButton bsaldopln = new JButton("PLN");
        bsaldopln.setBackground(Color.LIGHT_GRAY);
        bsaldopln.setBounds(530, 180, 250, 30);
        bsaldopln.setFont(new Font("Arial", Font.BOLD, 17));
        panelsaldo.add(bsaldopln);

        JButton bsaldousd = new JButton("USD");
        bsaldousd.setBackground(Color.LIGHT_GRAY);
        bsaldousd.setBounds(530, 220, 250, 30);
        bsaldousd.setFont(new Font("Arial", Font.BOLD, 17));
        panelsaldo.add(bsaldousd);

        JButton bsaldochf = new JButton("CHF");
        bsaldochf.setBackground(Color.LIGHT_GRAY);
        bsaldochf.setBounds(530, 260, 250, 30);
        bsaldochf.setFont(new Font("Arial", Font.BOLD, 17));
        panelsaldo.add(bsaldochf);

        JButton bsaldobnc = new JButton("BNC");
        bsaldobnc.setBackground(Color.LIGHT_GRAY);
        bsaldobnc.setBounds(530, 300, 250, 30);
        bsaldobnc.setFont(new Font("Arial", Font.BOLD, 17));
        panelsaldo.add(bsaldobnc);

        JButton bsaldoeur = new JButton("EUR");
        bsaldoeur.setBackground(Color.LIGHT_GRAY);
        bsaldoeur.setBounds(530, 340, 250, 30);
        bsaldoeur.setFont(new Font("Arial", Font.BOLD, 17));
        panelsaldo.add(bsaldoeur);

        JLabel tekscik = new JLabel("Wybierz walutę do wyświetlenia stanu konta:");
        tekscik.setFont(new Font("Arial", Font.BOLD, 25));
        tekscik.setBounds(410,110,570,50);
        tekscik.setForeground(Color.BLACK);
        panelsaldo.add(tekscik);

        JPanel panelsaldopln = new JPanel();
        panelsaldopln.setBackground(Color.WHITE);


        panelsaldopln.setBounds(300, 150, 800, 400);
        frame.getContentPane().setLayout(null);

        JLabel lsaldopln = new JLabel("Twoje saldo wynosi:");
        lsaldopln.setFont(new Font("Arial", Font.BOLD, 25));
        lsaldopln.setBounds(250,90,300,50);
        lsaldopln.setForeground(Color.BLACK);
        panelsaldopln.add(lsaldopln);

        JLabel lsaldoplnkwotazl = new JLabel("Zł");
        lsaldoplnkwotazl .setFont(new Font("Arial", Font.BOLD, 25));
        lsaldoplnkwotazl .setBounds(410,130,300,50);
        lsaldoplnkwotazl .setForeground(Color.BLACK);
        panelsaldopln.add(lsaldoplnkwotazl );




        BufferedImage buttonIconpln = ImageIO.read(new File("strzałka.png"));
        JButton bpowrotsaldopln = new JButton(new ImageIcon(buttonIconpln));
        bpowrotsaldopln.setBorderPainted(false);
        bpowrotsaldopln.setFocusPainted(false);
        bpowrotsaldopln.setContentAreaFilled(false);
        bpowrotsaldopln.setLayout(null);
        bpowrotsaldopln.setBounds(450, 250, 40, 40);
        panelsaldopln.add(bpowrotsaldopln);

        JPanel panelsaldousd = new JPanel();
        panelsaldousd.setBackground(Color.WHITE);


        panelsaldousd.setBounds(300, 150, 800, 400);
        frame.getContentPane().setLayout(null);

        JLabel lsaldousd = new JLabel("Twoje saldo wynosi:");
        lsaldousd.setFont(new Font("Arial", Font.BOLD, 25));
        lsaldousd.setBounds(250,90,300,50);
        lsaldousd.setForeground(Color.BLACK);
        panelsaldousd.add(lsaldousd);


        JLabel lsaldousdkwotausd = new JLabel("$");
        lsaldousdkwotausd .setFont(new Font("Arial", Font.BOLD, 25));
        lsaldousdkwotausd .setBounds(410,130,300,50);
        lsaldousdkwotausd .setForeground(Color.BLACK);
        panelsaldousd.add(lsaldousdkwotausd );


        BufferedImage buttonIconusd = ImageIO.read(new File("strzałka.png"));
        JButton bpowrotsaldousd = new JButton(new ImageIcon(buttonIconusd));
        bpowrotsaldousd.setBorderPainted(false);
        bpowrotsaldousd.setFocusPainted(false);
        bpowrotsaldousd.setContentAreaFilled(false);
        bpowrotsaldousd.setLayout(null);
        bpowrotsaldousd.setBounds(450, 250, 40, 40);
        panelsaldousd.add(bpowrotsaldousd);

        JPanel panelsaldochf = new JPanel();
        panelsaldochf.setBackground(Color.WHITE);


        panelsaldochf.setBounds(300, 150, 800, 400);
        frame.getContentPane().setLayout(null);


        JLabel lsaldochf = new JLabel("Twoje saldo wynosi:");
        lsaldochf.setFont(new Font("Arial", Font.BOLD, 25));
        lsaldochf.setBounds(250,90,300,50);
        lsaldochf.setForeground(Color.BLACK);
        panelsaldochf.add(lsaldochf);


        JLabel lsaldochfkwotachf = new JLabel("£");
        lsaldochfkwotachf .setFont(new Font("Arial", Font.BOLD, 25));
        lsaldochfkwotachf .setBounds(410,130,300,50);
        lsaldochfkwotachf .setForeground(Color.BLACK);
        panelsaldochf.add(lsaldochfkwotachf );


        BufferedImage buttonIconchf = ImageIO.read(new File("strzałka.png"));
        JButton bpowrotsaldochf = new JButton(new ImageIcon(buttonIconchf));
        bpowrotsaldochf.setBorderPainted(false);
        bpowrotsaldochf.setFocusPainted(false);
        bpowrotsaldochf.setContentAreaFilled(false);
        bpowrotsaldochf.setLayout(null);
        bpowrotsaldochf.setBounds(450, 250, 40, 40);
        panelsaldochf.add(bpowrotsaldochf);

        JPanel panelsaldobnc = new JPanel();
        panelsaldobnc.setBackground(Color.WHITE);


        panelsaldobnc.setBounds(300, 150, 800, 400);
        frame.getContentPane().setLayout(null);

        JLabel lsaldobnc = new JLabel("Twoje saldo wynosi:");
        lsaldobnc.setFont(new Font("Arial", Font.BOLD, 25));
        lsaldobnc.setBounds(250,90,300,50);
        lsaldobnc.setForeground(Color.BLACK);
        panelsaldobnc.add(lsaldobnc);


        JLabel lsaldobnckwotabnc = new JLabel("₿");
        lsaldobnckwotabnc .setFont(new Font("Arial", Font.BOLD, 25));
        lsaldobnckwotabnc .setBounds(410,130,300,50);
        lsaldobnckwotabnc .setForeground(Color.BLACK);
        panelsaldobnc.add(lsaldobnckwotabnc );


        BufferedImage buttonIconbnc = ImageIO.read(new File("strzałka.png"));
        JButton bpowrotsaldobnc = new JButton(new ImageIcon(buttonIconbnc));
        bpowrotsaldobnc.setBorderPainted(false);
        bpowrotsaldobnc.setFocusPainted(false);
        bpowrotsaldobnc.setContentAreaFilled(false);
        bpowrotsaldobnc.setLayout(null);
        bpowrotsaldobnc.setBounds(450, 250, 40, 40);
        panelsaldobnc.add(bpowrotsaldobnc);

        JPanel panelsaldoeur = new JPanel();
        panelsaldoeur.setBackground(Color.WHITE);


        panelsaldoeur.setBounds(300, 150, 800, 400);
        frame.getContentPane().setLayout(null);

        JLabel lsaldoeur = new JLabel("Twoje saldo wynosi:");
        lsaldoeur.setFont(new Font("Arial", Font.BOLD, 25));
        lsaldoeur.setBounds(250,90,300,50);
        lsaldoeur.setForeground(Color.BLACK);
        panelsaldoeur.add(lsaldoeur);

        JLabel lsaldoeurkwotaeur = new JLabel("€");
        lsaldoeurkwotaeur .setFont(new Font("Arial", Font.BOLD, 25));
        lsaldoeurkwotaeur .setBounds(410,130,300,50);
        lsaldoeurkwotaeur .setForeground(Color.BLACK);
        panelsaldoeur.add(lsaldoeurkwotaeur );


        BufferedImage buttonIconeur = ImageIO.read(new File("strzałka.png"));
        JButton bpowrotsaldoeur = new JButton(new ImageIcon(buttonIconeur));
        bpowrotsaldoeur.setBorderPainted(false);
        bpowrotsaldoeur.setFocusPainted(false);
        bpowrotsaldoeur.setContentAreaFilled(false);
        bpowrotsaldoeur.setLayout(null);
        bpowrotsaldoeur.setBounds(450, 250, 40, 40);
        panelsaldoeur.add(bpowrotsaldoeur);


        JPanel pczekaj = new JPanel();
        pczekaj.setBackground(Color.WHITE);
        pczekaj.setBounds(35, 50, 630, 350);
        pczekaj.setBorder(blackline);
        pczekaj.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);
        panel3.setLayout(null);
        panel3.setBounds(400, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        pczekaj.add(panel3);

        JLabel lczekaj = new JLabel("Proszę czekać...");
        lczekaj.setFont(new Font("Arial", Font.BOLD, 20));
        lczekaj.setBounds(240,150,300,50);
        lczekaj.setForeground(Color.BLACK);
        pczekaj.add(lczekaj);


        JButton bzlecenie = new JButton("Zlecenie przelewu");
        bzlecenie.setBackground(Color.lightGray);
        bzlecenie.setBounds(35, 250, 250, 50);
        bzlecenie.setFont(new Font("Arial", Font.BOLD, 17));

        JButton bprzewalutowanie = new JButton("Przewalutowanie");
        bprzewalutowanie.setBackground(Color.lightGray);
        bprzewalutowanie.setBounds(35, 180, 250, 50);
        bprzewalutowanie.setFont(new Font("Arial", Font.BOLD, 17));


        panel1.add(panel3);
        panel1.add(bzlecenie);
        panel1.add(bprzewalutowanie);


        panel3.add(logolabel);
        panel1.add(logolabel2);
        panel0.add(logolabel);


        BufferedImage cash = ImageIO.read(new File("cash1.png"));
        JLabel picLabel1 = new JLabel(new ImageIcon(cash));
        picLabel1.setLayout(null);
        picLabel1.setBounds(35, 460, 136, 200);
        pcash.add(picLabel1);

        BufferedImage potwierdzenie = ImageIO.read(new File("potwierdzenie.png"));
        JLabel picLabel2 = new JLabel(new ImageIcon(potwierdzenie));
        picLabel2.setLayout(null);
        picLabel2.setBounds(35, 460, 136, 200);
        ppotwierdzenie.add(picLabel2);


        frame.add(panel0);
        frame.add(panel00);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        bdalej.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Uzytkownik.ConstructUserDataBase();
                try {
                    user = Uzytkownik.loguj(tkarta.getText(),tpin.getText());
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                if(user!=null) {
                    frame.remove(panel00);
                    frame.remove(panel0);
                    frame.add(panel1);
                    panel1.add(panelsaldo);
                    JLabel nrkarty = new JLabel("ID: "+ tkarta.getText());
                    nrkarty.setBounds(235, 5, 180, 60);
                    panel3.add(nrkarty);
                    panelsaldo.setLayout(null);
                    frame.repaint();
                }
                else {
                    System.out.println("Spróbuj ponownie");
                    Uzytkownik.closeConnection();
                }
                Uzytkownik.closeConnection();


            }
        });

        wyloguj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel1);
                frame.add(panel0);
                panel0.setLayout(null);
                frame.add(panel00);
                panel00.setLayout(null);
                tkarta.setText("");
                tpin.setText("");
                frame.repaint();
            }
        });

        bzlecenie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.remove(panelsaldo);
                panel1.add(panelzlecenie);
                panelzlecenie.setLayout(null);
                frame.repaint();


            }
        });

        bpowrotzlecenie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.remove(panelzlecenie);
                panel1.add(panelsaldo);
                panel1.setLayout(null);
                frame.repaint();

            }
        });

        bprzewalutowanie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.remove(panelsaldo);
                panel1.add(panelprzewalutowanie);
                panelprzewalutowanie.setLayout(null);
                frame.repaint();
            }
        });
        bpowrotprzewalutowanie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.remove(panelprzewalutowanie);
                panel1.add(panelsaldo);
                panel1.setLayout(null);
                frame.repaint();

            }
        });
        bb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Uzytkownik.ConstructUserDataBase();
                    user.przewalutujplntousd(0.27,Double.parseDouble(String.format(t1.getText(),"%.3f")));
                    user.zapiszUzytkownik();
                    panelprzewalutowanie1.add(lpomyślnie);
                    frame.repaint();
                    Uzytkownik.closeConnection();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelprzewalutowanie1.remove(lpomyślnie);
                            frame.repaint();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();
                } catch (SaldoException | DBException saldoException) {
                    panelprzewalutowanie1.add(lniepomyślnie);
                    frame.repaint();
                    Uzytkownik.closeConnection();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelprzewalutowanie1.remove(lniepomyślnie);
                            frame.repaint();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();
                    Uzytkownik.closeConnection();
                }
                t1.setText("");

            }

        });
        bb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Uzytkownik.ConstructUserDataBase();
                    user.przewalutujplntochf(0.24,Double.parseDouble(String.format(t2.getText(),"%.3f")));
                    user.zapiszUzytkownik();
                    panelprzewalutowanie2.add(lpomyślnie);
                    frame.repaint();
                    Uzytkownik.closeConnection();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelprzewalutowanie2.remove(lpomyślnie);
                            frame.repaint();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();
                } catch (SaldoException | DBException saldoException) {
                    panelprzewalutowanie2.add(lniepomyślnie);
                    frame.repaint();
                    Uzytkownik.closeConnection();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelprzewalutowanie2.remove(lniepomyślnie);
                            frame.repaint();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();
                    Uzytkownik.closeConnection();
                }
                t2.setText("");

            }

        });
        bb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Uzytkownik.ConstructUserDataBase();
                    user.przewalutujplntobtc(0.0000056,Double.parseDouble(String.format(t3.getText(),"%.3f")));
                    user.zapiszUzytkownik();
                    panelprzewalutowanie3.add(lpomyślnie);
                    frame.repaint();
                    Uzytkownik.closeConnection();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelprzewalutowanie3.remove(lpomyślnie);
                            frame.repaint();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();
                } catch (SaldoException | DBException saldoException) {
                    panelprzewalutowanie3.add(lniepomyślnie);
                    frame.repaint();
                    Uzytkownik.closeConnection();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelprzewalutowanie3.remove(lniepomyślnie);
                            frame.repaint();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();
                    Uzytkownik.closeConnection();
                }
                t3.setText("");

            }

        });
        bb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Uzytkownik.ConstructUserDataBase();
                    user.przewalutujplntoeur(0.22,Double.parseDouble(String.format(t4.getText(),"%.3f")));
                    user.zapiszUzytkownik();
                    panelprzewalutowanie4.add(lpomyślnie);
                    frame.repaint();
                    Uzytkownik.closeConnection();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelprzewalutowanie4.remove(lpomyślnie);
                            frame.repaint();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();
                } catch (SaldoException | DBException saldoException) {
                    panelprzewalutowanie4.add(lniepomyślnie);
                    frame.repaint();
                    Uzytkownik.closeConnection();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelprzewalutowanie4.remove(lniepomyślnie);
                            frame.repaint();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();
                    Uzytkownik.closeConnection();
                }
                t4.setText("");

            }

        });
        bb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Uzytkownik.ConstructUserDataBase();
                    user.przewalutujudstopln(3.73,Double.parseDouble(String.format(t5.getText(),"%.3f")));
                    user.zapiszUzytkownik();
                    panelprzewalutowanie5.add(lpomyślnie);
                    frame.repaint();
                    Uzytkownik.closeConnection();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelprzewalutowanie5.remove(lpomyślnie);
                            frame.repaint();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();
                } catch (SaldoException | DBException saldoException) {
                    panelprzewalutowanie5.add(lniepomyślnie);
                    frame.repaint();
                    Uzytkownik.closeConnection();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelprzewalutowanie5.remove(lniepomyślnie);
                            frame.repaint();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();

                    Uzytkownik.closeConnection();
                }
                t5.setText("");

            }

        });
        bb6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Uzytkownik.ConstructUserDataBase();
                    user.przewalutujchftopln(4.14,Double.parseDouble(String.format(t6.getText(),"%.3f")));
                    user.zapiszUzytkownik();
                    panelprzewalutowanie6.add(lpomyślnie);
                    frame.repaint();
                    Uzytkownik.closeConnection();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelprzewalutowanie6.remove(lpomyślnie);
                            frame.repaint();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();
                } catch (SaldoException | DBException saldoException) {
                    panelprzewalutowanie6.add(lniepomyślnie);
                    frame.repaint();
                    Uzytkownik.closeConnection();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelprzewalutowanie6.remove(lniepomyślnie);
                            frame.repaint();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();
                    //saldoException.printStackTrace();
                    Uzytkownik.closeConnection();
                }
                t6.setText("");

            }

        });
        bb7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Uzytkownik.ConstructUserDataBase();
                    user.przewalutujbtctopln(180452.86,Double.parseDouble(String.format(t7.getText(),"%.3f")));
                    user.zapiszUzytkownik();
                    panelprzewalutowanie7.add(lpomyślnie);
                    frame.repaint();
                    Uzytkownik.closeConnection();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelprzewalutowanie7.remove(lpomyślnie);
                            frame.repaint();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();
                } catch (SaldoException | DBException saldoException) {
                    panelprzewalutowanie7.add(lniepomyślnie);
                    frame.repaint();
                    Uzytkownik.closeConnection();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelprzewalutowanie7.remove(lniepomyślnie);
                            frame.repaint();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();
                    //saldoException.printStackTrace();
                    Uzytkownik.closeConnection();
                }
                t7.setText("");

            }

        });
        bb8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Uzytkownik.ConstructUserDataBase();
                    user.przewalutujeurtopln(4.53,Double.parseDouble(String.format(t8.getText(),"%.3f")));
                    user.zapiszUzytkownik();
                    panelprzewalutowanie8.add(lpomyślnie);
                    frame.repaint();
                    Uzytkownik.closeConnection();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelprzewalutowanie8.remove(lpomyślnie);
                            frame.repaint();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();
                } catch (SaldoException | DBException saldoException) {
                    panelprzewalutowanie8.add(lniepomyślnie);
                    frame.repaint();
                    Uzytkownik.closeConnection();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelprzewalutowanie8.remove(lniepomyślnie);
                            frame.repaint();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();
                    Uzytkownik.closeConnection();
                }
                t8.setText("");

            }

        });
        bakceptujzlecenie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Uzytkownik.ConstructUserDataBase();
                    user.przelejNaNumerKarty(tinnakarta.getText(), Double.parseDouble(tkwotazlecenie.getText()));
                    panelzlecenie.add(lzleceniepomyslnie);
                    frame.repaint();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelzlecenie.remove(lzleceniepomyslnie);
                            frame.repaint();
                            Uzytkownik.closeConnection();
                        }
                    };
                    Timer timer = new Timer(3000, listener);
                    timer.setRepeats(false);
                    timer.start();
                }
                catch (Exception exception){
                    panelzlecenie.add(lzlecenieniepomyslnie);
                    frame.repaint();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelzlecenie.remove(lzlecenieniepomyslnie);
                            frame.repaint();
                            Uzytkownik.closeConnection();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();

                }
                tinnakarta.setText("");
                tkwotazlecenie.setText("");
            }

        });

        bsaldopln.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel lsaldoplnkwota = new JLabel(" "+Double.toString(user.getSaldoPLN()));
                lsaldoplnkwota.setFont(new Font("Arial", Font.BOLD, 25));
                lsaldoplnkwota.setBounds(320,130,150,50);
                lsaldoplnkwota.setForeground(Color.BLACK);
                panelsaldopln.add(lsaldoplnkwota);
                panel1.remove(panelsaldo);
                panel1.add(panelsaldopln);
                panelsaldopln.setLayout(null);
                frame.repaint();
                ActionListener listener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lsaldoplnkwota.setText("");
                    }
                };
                Timer timer = new Timer( 10000, listener );
                timer.setRepeats(false);
                timer.start();
            }
        });
        bpowrotsaldopln.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.remove(panelsaldopln);
                panel1.add(panelsaldo);
                panel1.setLayout(null);
                frame.repaint();

            }
        });

        bsaldochf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel lsaldochfkwota = new JLabel(" "+Double.toString(user.getSaldoCHF()));
                lsaldochfkwota.setFont(new Font("Arial", Font.BOLD, 25));
                lsaldochfkwota.setBounds(320,130,150,50);
                lsaldochfkwota.setForeground(Color.BLACK);
                panelsaldochf.add(lsaldochfkwota);
                panel1.remove(panelsaldo);
                panel1.add(panelsaldochf);
                panelsaldochf.setLayout(null);
                frame.repaint();
                ActionListener listener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lsaldochfkwota.setText("");
                    }
                };
                Timer timer = new Timer( 10000, listener );
                timer.setRepeats(false);
                timer.start();
            }
        });
        bpowrotsaldochf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.remove(panelsaldochf);
                panel1.add(panelsaldo);
                panel1.setLayout(null);
                frame.repaint();

            }
        });

        bsaldousd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel lsaldousdkwota = new JLabel(" "+Double.toString(user.getSaldoUSD()));
                lsaldousdkwota.setFont(new Font("Arial", Font.BOLD, 25));
                lsaldousdkwota.setBounds(320,130,150,50);
                lsaldousdkwota.setForeground(Color.BLACK);
                panelsaldousd.add(lsaldousdkwota);
                panel1.remove(panelsaldo);
                panel1.add(panelsaldousd);
                panelsaldousd.setLayout(null);
                frame.repaint();
                ActionListener listener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lsaldousdkwota.setText("");
                    }
                };
                Timer timer = new Timer( 10000, listener );
                timer.setRepeats(false);
                timer.start();
            }
        });
        bpowrotsaldousd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.remove(panelsaldousd);
                panel1.add(panelsaldo);
                panel1.setLayout(null);
                frame.repaint();

            }
        });

        bsaldobnc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel lsaldobnckwota = new JLabel(" "+Double.toString(user.getSaldoBTC()));
                lsaldobnckwota.setFont(new Font("Arial", Font.BOLD, 25));
                lsaldobnckwota.setBounds(320,130,150,50);
                lsaldobnckwota.setForeground(Color.BLACK);
                panelsaldobnc.add(lsaldobnckwota);
                panel1.remove(panelsaldo);
                panel1.add(panelsaldobnc);
                panelsaldobnc.setLayout(null);
                frame.repaint();
                ActionListener listener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lsaldobnckwota.setText("");
                    }
                };
                Timer timer = new Timer( 10000, listener );
                timer.setRepeats(false);
                timer.start();
            }
        });
        bpowrotsaldobnc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.remove(panelsaldobnc);
                panel1.add(panelsaldo);
                panel1.setLayout(null);
                frame.repaint();

            }
        });

        bsaldoeur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel lsaldoeurkwota = new JLabel(" "+Double.toString(user.getSaldoEUR()));
                lsaldoeurkwota.setFont(new Font("Arial", Font.BOLD, 25));
                lsaldoeurkwota.setBounds(320,130,150,50);
                lsaldoeurkwota.setForeground(Color.BLACK);
                panelsaldoeur.add(lsaldoeurkwota);
                panel1.remove(panelsaldo);
                panel1.add(panelsaldoeur);
                panelsaldoeur.setLayout(null);
                frame.repaint();
                ActionListener listener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lsaldoeurkwota.setText("");
                    }
                };
                Timer timer = new Timer( 10000, listener );
                timer.setRepeats(false);
                timer.start();
            }
        });
        bpowrotsaldoeur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.remove(panelsaldoeur);
                panel1.add(panelsaldo);
                panel1.setLayout(null);

                frame.repaint();

            }
        });


    }
}
