
import BankExceptions.DBException;
import BankExceptions.SaldoException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class BankomatView extends JFrame {
    private Uzytkownik user;

    public static void main(String[] args) throws Exception{
        new BankomatView();
    }
    public BankomatView() throws IOException, InterruptedException {
        JFrame frame = new JFrame("Bankomat");
        frame.setSize(700, 740);
        frame.getContentPane().setBackground(Color.GRAY);

        //////////////////////////////////////////////////////////////
        //PANEL STARTOWY
        //////////////////////////////////////////////////////////////

        JPanel panel0 = new JPanel();
        panel0.setBackground(Color.BLUE);
        panel0.setLayout(null);

        frame.getContentPane().setLayout(null);
        panel0.setBounds(35, 50, 630, 350);
        Border blackline = BorderFactory.createLineBorder(Color.black);
        panel0.setBorder(blackline);
        panel0.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));



        JLabel lwitamy = new JLabel("Witamy w bankomacie");
        lwitamy.setBounds(175, 20, 300, 70);
        lwitamy.setFont(new Font("Arial", Font.BOLD, 25));
        lwitamy.setForeground(Color.lightGray);
        panel0.add(lwitamy);


        JLabel lnrkarty = new JLabel("Wprowadz № karty:");
        lnrkarty.setBounds(150, 100, 150, 50);
        lnrkarty.setFont(new Font("Arial", Font.BOLD, 15));
        lnrkarty.setForeground(Color.MAGENTA);


        JLabel lpin = new JLabel("Wprowadz pin:");
        lpin.setBounds(150, 140, 150, 50);
        lpin.setFont(new Font("Arial", Font.BOLD, 15));
        lpin.setForeground(Color.MAGENTA);

        JFormattedTextField tkarta = new JFormattedTextField();

        tkarta.setColumns(16);
        tkarta.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tkarta.getText().length() >= 16 )
                    e.consume();
            }
        });

        tkarta.setBounds(300, 110, 150, 30);
        tkarta.setBackground(Color.lightGray);
        tkarta.setFont(new Font("Arial", Font.BOLD, 15));





        JPasswordField tpin = new JPasswordField();
        tpin.setEchoChar('*');
        tpin.setColumns(4);
        tpin.setBounds(300, 150, 150, 30);
        tpin.setBackground(Color.LIGHT_GRAY);
        tpin.setFont(new Font("Arial", Font.BOLD, 15));
        tpin.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tpin.getText().length() >= 4 )
                    e.consume();
            }
        });



        JButton bdalej = new JButton("Dalej");
        bdalej.setBackground(Color.GREEN);
        bdalej.setBounds(265, 220, 100, 50);
        bdalej.setFont(new Font("Arial", Font.BOLD, 17));
        panel0.add(bdalej);
        panel0.add(lnrkarty);
        panel0.add(lpin);
        panel0.add(tkarta);
        panel0.add(tpin);

        //////////////////////////////////////////////////////////////
        //PANEL GłóWNY
        //////////////////////////////////////////////////////////////

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLUE);

        panel1.setBounds(35, 50, 630, 350);
        panel1.setBorder(blackline);
        panel1.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);

        JPanel panel00 = new JPanel();
        panel00.setBackground(Color.GRAY);

        frame.getContentPane().setLayout(null);
        panel00.setBounds(500, 430, 150, 200);

        JPanel pkarta = new JPanel();
        frame.getContentPane().setLayout(null);
        pkarta.setBounds(500, 430, 150, 200);
        pkarta.setBackground(Color.GRAY);

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



        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.BLACK);
        frame.getContentPane().setLayout(null);
        panel2.setBounds(0, 0, 700, 20);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.lightGray);
        panel3.setLayout(null);

        panel1.setLayout(null);
        panel3.setBounds(35, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));

        BufferedImage logo = ImageIO.read(new File("logo.png"));
        JLabel logolabel = new JLabel(new ImageIcon(logo));
        add(logolabel);
        logolabel.setBounds(5, 5, 60, 60);





        //////////////////////////////////////////////////////////////
        //PANEL " WYPłATA PIENIĘdDZY"
        //////////////////////////////////////////////////////////////

        JPanel panelwyplata = new JPanel();
        panelwyplata.setBackground(Color.BLUE);

        JLabel lwybkwota0 =new JLabel("Proszę wybrać kwotę");
        lwybkwota0.setFont(new Font("Arial", Font.BOLD, 20));
        lwybkwota0.setBounds(205,90,300,50);
        lwybkwota0.setForeground(Color.LIGHT_GRAY);

        JButton bwypłata20= new JButton("20 PLN");
        bwypłata20.setBounds(50,160,250,35);
        bwypłata20.setBackground(Color.LIGHT_GRAY);
        bwypłata20.setFont(new Font("Arial", Font.BOLD, 17));

        JButton bwypłata50= new JButton("50 PLN");
        bwypłata50.setBounds(50,205,250,35);
        bwypłata50.setBackground(Color.LIGHT_GRAY);
        bwypłata50.setFont(new Font("Arial", Font.BOLD, 17));

        JButton bwypłata80= new JButton("80 PLN");
        bwypłata80.setBounds(50,250,250,35);
        bwypłata80.setBackground(Color.LIGHT_GRAY);
        bwypłata80.setFont(new Font("Arial", Font.BOLD, 17));

        JButton bwypłata100= new JButton("100 PLN");
        bwypłata100.setBounds(340,160,250,35);
        bwypłata100.setBackground(Color.LIGHT_GRAY);
        bwypłata100.setFont(new Font("Arial", Font.BOLD, 17));

        JButton bwypłata150= new JButton("150 PLN");
        bwypłata150.setBounds(340,205,250,35);
        bwypłata150.setBackground(Color.LIGHT_GRAY);
        bwypłata150.setFont(new Font("Arial", Font.BOLD, 17));

        JButton bwypłatainna= new JButton("Inna kwota");
        bwypłatainna.setBounds(340,250,250,35);
        bwypłatainna.setBackground(Color.LIGHT_GRAY);
        bwypłatainna.setFont(new Font("Arial", Font.BOLD, 17));


        panelwyplata.setBounds(35, 50, 630, 350);
        panelwyplata.setBorder(blackline);
        panelwyplata.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);
        panel3.setLayout(null);
        panel3.setBounds(35, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        panelwyplata.add(panel3);

        BufferedImage buttonIcon = ImageIO.read(new File("strzałka.png"));
        JButton bpowrot = new JButton(new ImageIcon(buttonIcon));
        bpowrot.setBorderPainted(false);
        bpowrot.setFocusPainted(false);
        bpowrot.setContentAreaFilled(false);
        bpowrot.setLayout(null);
        bpowrot.setBounds(575, 290, 40, 40);
        panelwyplata.add(bpowrot);
        panelwyplata.add(lwybkwota0);
        panelwyplata.add(bwypłata20);
        panelwyplata.add(bwypłata50);
        panelwyplata.add(bwypłata80);
        panelwyplata.add(bwypłata100);
        panelwyplata.add(bwypłata150);
        panelwyplata.add(bwypłatainna);


        //////////////////////////////////////////////////////////////
        //PANEL " WPłATA PIENIĘdDZY"
        //////////////////////////////////////////////////////////////
        JPanel panelwplata = new JPanel();
        panelwplata.setBackground(Color.BLUE);


        panelwplata.setBounds(35, 50, 630, 350);
        panelwplata.setBorder(blackline);
        panelwplata.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);
        panel3.setLayout(null);
        panel3.setBounds(35, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        panelwplata.add(panel3);

        JLabel lwybkwota =new JLabel("Proszę wybrać kwotę");
        lwybkwota.setFont(new Font("Arial", Font.BOLD, 20));
        lwybkwota.setBounds(205,90,300,50);
        lwybkwota.setForeground(Color.LIGHT_GRAY);

        JButton bwpłata20= new JButton("20 PLN");
        bwpłata20.setBounds(50,160,250,35);
        bwpłata20.setBackground(Color.LIGHT_GRAY);
        bwpłata20.setFont(new Font("Arial", Font.BOLD, 17));

        JButton bwpłata50= new JButton("50 PLN");
        bwpłata50.setBounds(50,205,250,35);
        bwpłata50.setBackground(Color.LIGHT_GRAY);
        bwpłata50.setFont(new Font("Arial", Font.BOLD, 17));

        JButton bwpłata80= new JButton("80 PLN");
        bwpłata80.setBounds(50,250,250,35);
        bwpłata80.setBackground(Color.LIGHT_GRAY);
        bwpłata80.setFont(new Font("Arial", Font.BOLD, 17));

        JButton bwpłata100= new JButton("100 PLN");
        bwpłata100.setBounds(340,160,250,35);
        bwpłata100.setBackground(Color.LIGHT_GRAY);
        bwpłata100.setFont(new Font("Arial", Font.BOLD, 17));

        JButton bwpłata150= new JButton("150 PLN");
        bwpłata150.setBounds(340,205,250,35);
        bwpłata150.setBackground(Color.LIGHT_GRAY);
        bwpłata150.setFont(new Font("Arial", Font.BOLD, 17));

        JButton bwpłatainna= new JButton("Inna kwota");
        bwpłatainna.setBounds(340,250,250,35);
        bwpłatainna.setBackground(Color.LIGHT_GRAY);
        bwpłatainna.setFont(new Font("Arial", Font.BOLD, 17));


        BufferedImage buttonIcon2 = ImageIO.read(new File("strzałka.png"));
        JButton bpowrotwplata = new JButton(new ImageIcon(buttonIcon2));
        bpowrotwplata.setBorderPainted(false);
        bpowrotwplata.setFocusPainted(false);
        bpowrotwplata.setContentAreaFilled(false);
        bpowrotwplata.setLayout(null);
        bpowrotwplata.setBounds(575, 290, 40, 40);
        panelwplata.add(bpowrotwplata);
        panelwplata.add(lwybkwota);
        panelwplata.add(bwpłata20);
        panelwplata.add(bwpłata50);
        panelwplata.add(bwpłata80);
        panelwplata.add(bwpłata100);
        panelwplata.add(bwpłata150);
        panelwplata.add(bwpłatainna);

        //////////////////////////////////////////////////////////////
        //PANEL INNA KWOTA WPłATA
        //////////////////////////////////////////////////////////////

        JPanel panelinnakwotaw = new JPanel();
        panelinnakwotaw.setBackground(Color.BLUE);


        panelinnakwotaw.setBounds(35, 50, 630, 350);
        panelinnakwotaw.setBorder(blackline);
        panelinnakwotaw.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);
        panel3.setLayout(null);
        panel3.setBounds(35, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        panelinnakwotaw.add(panel3);

        JLabel info1w = new JLabel("<html>Wpłata banknotami<br>w nominalach:<br> 10 PLN<br> 20 PLN<br>50 PLN<br>100 PLN</html>");
        info1w.setFont(new Font("Arial", Font.BOLD, 15));
        info1w.setBounds(90,50,300,200);
        info1w.setForeground(Color.LIGHT_GRAY);
        panelinnakwotaw.add(info1w);

        JLabel info2w = new JLabel("<html>1000 PLN maksymalna kwota wpłaty<br>rekomendowana dla jednej transakcji</html>");
        info2w.setFont(new Font("Arial", Font.BOLD, 15));
        info2w.setBounds(200,200,350,200);
        info2w.setForeground(Color.LIGHT_GRAY);
        panelinnakwotaw.add(info2w);

        JFormattedTextField tinnaw = new JFormattedTextField();
        tinnaw.setColumns(16);
        tinnaw.setBounds(260, 190, 130, 30);
        tinnaw.setBackground(Color.lightGray);
        tinnaw.setFont(new Font("Arial", Font.BOLD, 15));
        panelinnakwotaw.add(tinnaw);

        JButton bakceptujw = new JButton("Akceptuj");
        bakceptujw.setBackground(Color.GREEN);
        bakceptujw.setBounds(260,230,130,35);
        bakceptujw.setFont(new Font("Arial", Font.BOLD, 17));
        panelinnakwotaw.add(bakceptujw);

        //////////////////////////////////////////////////////////////
        //PANEL INNA KWOTA WYPłATA
        //////////////////////////////////////////////////////////////

        JPanel panelinnakwotawy = new JPanel();
        panelinnakwotawy.setBackground(Color.BLUE);


        panelinnakwotawy.setBounds(35, 50, 630, 350);
        panelinnakwotawy.setBorder(blackline);
        panelinnakwotawy.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);
        panel3.setLayout(null);
        panel3.setBounds(35, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        panelinnakwotawy.add(panel3);

        JLabel info1wy = new JLabel("<html>Wypłata banknotami<br>w nominalach:<br> 10 PLN<br> 20 PLN<br>50 PLN<br>100 PLN</html>");
        info1wy.setFont(new Font("Arial", Font.BOLD, 15));
        info1wy.setBounds(90,50,300,200);
        info1wy.setForeground(Color.LIGHT_GRAY);
        panelinnakwotawy.add(info1wy);

        JLabel info2wy = new JLabel("<html>1000 PLN maksymalna kwota wypłaty<br>rekomendowana dla jednej transakcji</html>");
        info2wy.setFont(new Font("Arial", Font.BOLD, 15));
        info2wy.setBounds(200,200,350,200);
        info2wy.setForeground(Color.LIGHT_GRAY);
        panelinnakwotawy.add(info2wy);

        JFormattedTextField tinnawy = new JFormattedTextField();
        tinnawy.setColumns(16);
        tinnawy.setBounds(260, 190, 130, 30);
        tinnawy.setBackground(Color.lightGray);
        tinnawy.setFont(new Font("Arial", Font.BOLD, 15));
        panelinnakwotawy.add(tinnawy);


        JButton bakceptujwy = new JButton("Akceptuj");
        bakceptujwy.setBackground(Color.GREEN);
        bakceptujwy.setBounds(260,230,130,35);
        bakceptujwy.setFont(new Font("Arial", Font.BOLD, 17));
        panelinnakwotawy.add(bakceptujwy);



        //////////////////////////////////////////////////////////////
        //PANEL " ZLECENIE PRZELEWU"
        //////////////////////////////////////////////////////////////
        JPanel panelzlecenie = new JPanel();
        panelzlecenie.setBackground(Color.BLUE);


        panelzlecenie.setBounds(35, 50, 630, 350);
        panelzlecenie.setBorder(blackline);
        panelzlecenie.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);
        panel3.setLayout(null);
        panel3.setBounds(35, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        panelzlecenie.add(panel3);

        JLabel linnakarta = new JLabel("Wprowadz numer karty");
        linnakarta.setFont(new Font("Arial", Font.BOLD, 17));
        linnakarta.setBounds(200,115,270,30);
        linnakarta.setForeground(Color.BLACK);
        panelzlecenie.add(linnakarta);

        JFormattedTextField tinnakarta = new JFormattedTextField();
        tinnakarta.setColumns(16);
        tinnakarta.setBounds(170, 150, 250, 30);
        tinnakarta.setBackground(Color.lightGray);
        tinnakarta.setFont(new Font("Arial", Font.BOLD, 15));
        panelzlecenie.add(tinnakarta);
        tinnakarta.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tinnakarta.getText().length() >= 16 )
                    e.consume();
            }
        });

        JLabel lkwotazlecenie = new JLabel("Wprowadz kwotę");
        lkwotazlecenie.setFont(new Font("Arial", Font.BOLD, 17));
        lkwotazlecenie.setBounds(215,180,270,30);
        lkwotazlecenie.setForeground(Color.BLACK);
        panelzlecenie.add(lkwotazlecenie);

        JFormattedTextField tkwotazlecenie = new JFormattedTextField();
        tkwotazlecenie.setColumns(16);
        tkwotazlecenie.setBounds(235, 215, 100, 30);
        tkwotazlecenie.setBackground(Color.lightGray);
        tkwotazlecenie.setFont(new Font("Arial", Font.BOLD, 15));
        panelzlecenie.add(tkwotazlecenie);


        JLabel lzł = new JLabel("Zł");
        lzł.setFont(new Font("Arial", Font.BOLD, 17));
        lzł.setBounds(345,215,30,30);
        lzł.setForeground(Color.BLACK);
        panelzlecenie.add(lzł);

        JButton bakceptujzlecenie = new JButton("Akceptuj");
        bakceptujzlecenie.setBackground(Color.GREEN);
        bakceptujzlecenie.setBounds(235,255,100,30);
        bakceptujzlecenie.setFont(new Font("Arial", Font.BOLD, 10));
        panelzlecenie.add(bakceptujzlecenie);

        JLabel lzleceniepomylnie = new JLabel("Przelew został przeprowadzony pomyślnie");
        lzleceniepomylnie.setFont(new Font("Arial", Font.BOLD, 17));
        lzleceniepomylnie.setBounds(120,290,400,30);
        lzleceniepomylnie.setForeground(Color.GREEN);

        JLabel lzlecenieniepomylnie = new JLabel("Przelew nie został przeprowadzony pomyślnie");
        lzlecenieniepomylnie.setFont(new Font("Arial", Font.BOLD, 17));
        lzlecenieniepomylnie.setBounds(120,290,400,30);
        lzlecenieniepomylnie.setForeground(Color.RED);





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
        panelprzewalutowanie.setBackground(Color.BLUE);


        panelprzewalutowanie.setBounds(35, 50, 630, 350);
        panelprzewalutowanie.setBorder(blackline);
        panelprzewalutowanie.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);
        panel3.setLayout(null);
        panel3.setBounds(35, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        panelprzewalutowanie.add(panel3);

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
        ll1.setBounds(120,20,130,30);
        ll1.setForeground(Color.BLACK);
        panelprzewalutowanie1.add(ll1);

        JFormattedTextField t1 = new JFormattedTextField();
        t1.setColumns(16);
        t1.setBounds(120, 50, 130, 30);
        t1.setBackground(Color.white);
        t1.setFont(new Font("Arial", Font.BOLD, 15));
        panelprzewalutowanie1.setLayout(null);
        panelprzewalutowanie1.add(t1);
        JLabel l1= new JLabel("Zł");
        l1.setFont(new Font("Arial", Font.BOLD, 15));
        l1.setBounds(260,50,30,30);
        l1.setForeground(Color.BLACK);
        panelprzewalutowanie1.add(l1);
        JButton bb1 = new JButton("Przewalutuj");
        bb1.setBackground(Color.GREEN);
        bb1.setBounds(135,90,100,35);
        bb1.setFont(new Font("Arial", Font.BOLD, 10));
        panelprzewalutowanie1.add(bb1);

        JLabel ll2= new JLabel("Wprowadż kwotę");
        ll2.setFont(new Font("Arial", Font.BOLD, 15));
        ll2.setBounds(120,20,130,30);
        ll2.setForeground(Color.BLACK);
        panelprzewalutowanie2.add(ll2);
        JFormattedTextField t2 = new JFormattedTextField();
        t2.setColumns(16);
        t2.setBounds(120, 50, 130, 30);
        t2.setBackground(Color.white);
        t2.setFont(new Font("Arial", Font.BOLD, 15));
        panelprzewalutowanie2.setLayout(null);
        panelprzewalutowanie2.add(t2);
        JLabel l2= new JLabel("Zł");
        l2.setFont(new Font("Arial", Font.BOLD, 15));
        l2.setBounds(260,50,30,30);
        l2.setForeground(Color.BLACK);
        panelprzewalutowanie2.add(l2);
        JButton bb2 = new JButton("Przewalutuj");
        bb2.setBackground(Color.GREEN);
        bb2.setBounds(135,90,100,35);
        bb2.setFont(new Font("Arial", Font.BOLD, 10));
        panelprzewalutowanie2.add(bb2);

        JLabel ll3= new JLabel("Wprowadż kwotę");
        ll3.setFont(new Font("Arial", Font.BOLD, 15));
        ll3.setBounds(120,20,130,30);
        ll3.setForeground(Color.BLACK);
        panelprzewalutowanie3.add(ll3);
        JFormattedTextField t3 = new JFormattedTextField();
        t3.setColumns(16);
        t3.setBounds(120, 50, 130, 30);
        t3.setBackground(Color.white);
        t3.setFont(new Font("Arial", Font.BOLD, 15));
        panelprzewalutowanie3.setLayout(null);
        panelprzewalutowanie3.add(t3);
        JLabel l3= new JLabel("Zł");
        l3.setFont(new Font("Arial", Font.BOLD, 15));
        l3.setBounds(260,50,30,30);
        l3.setForeground(Color.BLACK);
        panelprzewalutowanie3.add(l3);
        JButton bb3 = new JButton("Przewalutuj");
        bb3.setBackground(Color.GREEN);
        bb3.setBounds(135,90,100,35);
        bb3.setFont(new Font("Arial", Font.BOLD, 10));
        panelprzewalutowanie3.add(bb3);

        JLabel ll4= new JLabel("Wprowadż kwotę");
        ll4.setFont(new Font("Arial", Font.BOLD, 15));
        ll4.setBounds(120,20,130,30);
        ll4.setForeground(Color.BLACK);
        panelprzewalutowanie4.add(ll4);
        JFormattedTextField t4 = new JFormattedTextField();
        t4.setColumns(16);
        t4.setBounds(120, 50, 130, 30);
        t4.setBackground(Color.white);
        t4.setFont(new Font("Arial", Font.BOLD, 15));
        panelprzewalutowanie4.setLayout(null);
        panelprzewalutowanie4.add(t4);
        JLabel l4= new JLabel("Zł");
        l4.setFont(new Font("Arial", Font.BOLD, 15));
        l4.setBounds(260,50,30,30);
        l4.setForeground(Color.BLACK);
        panelprzewalutowanie4.add(l4);
        JButton bb4 = new JButton("Przewalutuj");
        bb4.setBackground(Color.GREEN);
        bb4.setBounds(135,90,100,35);
        bb4.setFont(new Font("Arial", Font.BOLD, 10));
        panelprzewalutowanie4.add(bb4);

        JLabel ll5= new JLabel("Wprowadż kwotę");
        ll5.setFont(new Font("Arial", Font.BOLD, 15));
        ll5.setBounds(120,20,130,30);
        ll5.setForeground(Color.BLACK);
        panelprzewalutowanie5.add(ll5);
        JFormattedTextField t5 = new JFormattedTextField();
        t5.setColumns(16);
        t5.setBounds(120, 50, 130, 30);
        t5.setBackground(Color.white);
        t5.setFont(new Font("Arial", Font.BOLD, 15));
        panelprzewalutowanie5.setLayout(null);
        panelprzewalutowanie5.add(t5);
        JLabel l5= new JLabel("$");
        l5.setFont(new Font("Arial", Font.BOLD, 15));
        l5.setBounds(260,50,30,30);
        l5.setForeground(Color.BLACK);
        panelprzewalutowanie5.add(l5);
        JButton bb5 = new JButton("Przewalutuj");
        bb5.setBackground(Color.GREEN);
        bb5.setBounds(135,90,100,35);
        bb5.setFont(new Font("Arial", Font.BOLD, 10));
        panelprzewalutowanie5.add(bb5);

        JLabel ll6= new JLabel("Wprowadż kwotę");
        ll6.setFont(new Font("Arial", Font.BOLD, 15));
        ll6.setBounds(120,20,130,30);
        ll6.setForeground(Color.BLACK);
        panelprzewalutowanie6.add(ll6);
        JFormattedTextField t6 = new JFormattedTextField();
        t6.setColumns(16);
        t6.setBounds(120, 50, 130, 30);
        t6.setBackground(Color.white);
        t6.setFont(new Font("Arial", Font.BOLD, 15));
        panelprzewalutowanie6.setLayout(null);
        panelprzewalutowanie6.add(t6);
        JLabel l6= new JLabel("£");
        l6.setFont(new Font("Arial", Font.BOLD, 15));
        l6.setBounds(260,50,30,30);
        l6.setForeground(Color.BLACK);
        panelprzewalutowanie6.add(l6);
        JButton bb6 = new JButton("Przewalutuj");
        bb6.setBackground(Color.GREEN);
        bb6.setBounds(135,90,100,35);
        bb6.setFont(new Font("Arial", Font.BOLD, 10));
        panelprzewalutowanie6.add(bb6);

        JLabel ll7= new JLabel("Wprowadż kwotę");
        ll7.setFont(new Font("Arial", Font.BOLD, 15));
        ll7.setBounds(120,20,130,30);
        ll7.setForeground(Color.BLACK);
        panelprzewalutowanie7.add(ll7);
        JFormattedTextField t7 = new JFormattedTextField();
        t7.setColumns(16);
        t7.setBounds(120, 50, 130, 30);
        t7.setBackground(Color.white);
        t7.setFont(new Font("Arial", Font.BOLD, 15));
        panelprzewalutowanie7.setLayout(null);
        panelprzewalutowanie7.add(t7);
        JLabel l7= new JLabel("₿");
        l7.setFont(new Font("Arial", Font.BOLD, 15));
        l7.setBounds(260,50,30,40);
        l7.setForeground(Color.BLACK);
        panelprzewalutowanie7.add(l7);
        JButton bb7 = new JButton("Przewalutuj");
        bb7.setBackground(Color.GREEN);
        bb7.setBounds(135,90,100,35);
        bb7.setFont(new Font("Arial", Font.BOLD, 10));
        panelprzewalutowanie7.add(bb7);

        JLabel ll8= new JLabel("Wprowadż kwotę");
        ll8.setFont(new Font("Arial", Font.BOLD, 15));
        ll8.setBounds(120,20,130,30);
        ll8.setForeground(Color.BLACK);
        panelprzewalutowanie8.add(ll8);
        JFormattedTextField t8 = new JFormattedTextField();
        t8.setColumns(16);
        t8.setBounds(120, 50, 130, 30);
        t8.setBackground(Color.white);
        t8.setFont(new Font("Arial", Font.BOLD, 15));
        panelprzewalutowanie8.setLayout(null);
        panelprzewalutowanie8.add(t8);
        JLabel l8= new JLabel("€");
        l8.setFont(new Font("Arial", Font.BOLD, 15));
        l8.setBounds(260,50,30,30);
        l8.setForeground(Color.BLACK);
        panelprzewalutowanie8.add(l8);
        JButton bb8 = new JButton("Przewalutuj");
        bb8.setBackground(Color.GREEN);
        bb8.setBounds(135,90,100,35);
        bb8.setFont(new Font("Arial", Font.BOLD, 10));
        panelprzewalutowanie8.add(bb8);





        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(130,100,400,200);
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
        bpowrotprzewalutowanie.setBounds(575, 290, 40, 40);
        panelprzewalutowanie.add(bpowrotprzewalutowanie);

        //////////////////////////////////////////////////////////////
        //PANEL " ZAPYTANIE O SALDO"
        //////////////////////////////////////////////////////////////


        JPanel panelsaldo = new JPanel();
        panelsaldo.setBackground(Color.BLUE);


        panelsaldo.setBounds(35, 50, 630, 350);
        panelsaldo.setBorder(blackline);
        panelsaldo.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);
        panel3.setLayout(null);
        panel3.setBounds(35, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        panelsaldo.add(panel3);

        JButton bsaldopln = new JButton("PLN");
        bsaldopln.setBackground(Color.LIGHT_GRAY);
        bsaldopln.setBounds(300, 110, 250, 30);
        bsaldopln.setFont(new Font("Arial", Font.BOLD, 17));
        panelsaldo.add(bsaldopln);

        JButton bsaldousd = new JButton("USD");
        bsaldousd.setBackground(Color.LIGHT_GRAY);
        bsaldousd.setBounds(300, 150, 250, 30);
        bsaldousd.setFont(new Font("Arial", Font.BOLD, 17));
        panelsaldo.add(bsaldousd);

        JButton bsaldochf = new JButton("CHF");
        bsaldochf.setBackground(Color.LIGHT_GRAY);
        bsaldochf.setBounds(300, 190, 250, 30);
        bsaldochf.setFont(new Font("Arial", Font.BOLD, 17));
        panelsaldo.add(bsaldochf);

        JButton bsaldobnc = new JButton("BNC");
        bsaldobnc.setBackground(Color.LIGHT_GRAY);
        bsaldobnc.setBounds(300, 230, 250, 30);
        bsaldobnc.setFont(new Font("Arial", Font.BOLD, 17));
        panelsaldo.add(bsaldobnc);

        JButton bsaldoeur = new JButton("EUR");
        bsaldoeur.setBackground(Color.LIGHT_GRAY);
        bsaldoeur.setBounds(300, 270, 250, 30);
        bsaldoeur.setFont(new Font("Arial", Font.BOLD, 17));
        panelsaldo.add(bsaldoeur);



        BufferedImage buttonIcon5 = ImageIO.read(new File("strzałka.png"));
        JButton bpowrotsaldo = new JButton(new ImageIcon(buttonIcon5));
        bpowrotsaldo.setBorderPainted(false);
        bpowrotsaldo.setFocusPainted(false);
        bpowrotsaldo.setContentAreaFilled(false);
        bpowrotsaldo.setLayout(null);
        bpowrotsaldo.setBounds(575, 290, 40, 40);
        panelsaldo.add(bpowrotsaldo);


        JPanel panelsaldopln = new JPanel();
        panelsaldopln.setBackground(Color.BLUE);


        panelsaldopln.setBounds(35, 50, 630, 350);
        panelsaldopln.setBorder(blackline);
        panelsaldopln.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);
        panel3.setLayout(null);
        panel3.setBounds(35, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        panelsaldopln.add(panel3);

        JLabel lsaldopln = new JLabel("Twoje saldo wynosi:");
        lsaldopln.setFont(new Font("Arial", Font.BOLD, 25));
        lsaldopln.setBounds(170,140,300,50);
        lsaldopln.setForeground(Color.lightGray);
        panelsaldopln.add(lsaldopln);



        JLabel lsaldoplnkwotazl = new JLabel("Zł");
        lsaldoplnkwotazl .setFont(new Font("Arial", Font.BOLD, 25));
        lsaldoplnkwotazl .setBounds(330,180,300,50);
        lsaldoplnkwotazl .setForeground(Color.lightGray);
        panelsaldopln.add(lsaldoplnkwotazl );




        BufferedImage buttonIconpln = ImageIO.read(new File("strzałka.png"));
        JButton bpowrotsaldopln = new JButton(new ImageIcon(buttonIconpln));
        bpowrotsaldopln.setBorderPainted(false);
        bpowrotsaldopln.setFocusPainted(false);
        bpowrotsaldopln.setContentAreaFilled(false);
        bpowrotsaldopln.setLayout(null);
        bpowrotsaldopln.setBounds(575, 290, 40, 40);
        panelsaldopln.add(bpowrotsaldopln);

        JPanel panelsaldousd = new JPanel();
        panelsaldousd.setBackground(Color.BLUE);


        panelsaldousd.setBounds(35, 50, 630, 350);
        panelsaldousd.setBorder(blackline);
        panelsaldousd.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);
        panel3.setLayout(null);
        panel3.setBounds(35, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        panelsaldousd.add(panel3);

        JLabel lsaldousd = new JLabel("Twoje saldo wynosi:");
        lsaldousd.setFont(new Font("Arial", Font.BOLD, 25));
        lsaldousd.setBounds(170,140,300,50);
        lsaldousd.setForeground(Color.lightGray);
        panelsaldousd.add(lsaldousd);



        JLabel lsaldousdkwotausd = new JLabel("$");
        lsaldousdkwotausd .setFont(new Font("Arial", Font.BOLD, 25));
        lsaldousdkwotausd .setBounds(330,180,300,50);
        lsaldousdkwotausd .setForeground(Color.lightGray);
        panelsaldousd.add(lsaldousdkwotausd );


        BufferedImage buttonIconusd = ImageIO.read(new File("strzałka.png"));
        JButton bpowrotsaldousd = new JButton(new ImageIcon(buttonIconusd));
        bpowrotsaldousd.setBorderPainted(false);
        bpowrotsaldousd.setFocusPainted(false);
        bpowrotsaldousd.setContentAreaFilled(false);
        bpowrotsaldousd.setLayout(null);
        bpowrotsaldousd.setBounds(575, 290, 40, 40);
        panelsaldousd.add(bpowrotsaldousd);

        JPanel panelsaldochf = new JPanel();
        panelsaldochf.setBackground(Color.BLUE);


        panelsaldochf.setBounds(35, 50, 630, 350);
        panelsaldochf.setBorder(blackline);
        panelsaldochf.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);
        panel3.setLayout(null);
        panel3.setBounds(35, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        panelsaldochf.add(panel3);

        JLabel lsaldochf = new JLabel("Twoje saldo wynosi:");
        lsaldochf.setFont(new Font("Arial", Font.BOLD, 25));
        lsaldochf.setBounds(170,140,300,50);
        lsaldochf.setForeground(Color.lightGray);
        panelsaldochf.add(lsaldochf);



        JLabel lsaldochfkwotachf = new JLabel("£");
        lsaldochfkwotachf .setFont(new Font("Arial", Font.BOLD, 25));
        lsaldochfkwotachf .setBounds(330,180,300,50);
        lsaldochfkwotachf .setForeground(Color.lightGray);
        panelsaldochf.add(lsaldochfkwotachf );


        BufferedImage buttonIconchf = ImageIO.read(new File("strzałka.png"));
        JButton bpowrotsaldochf = new JButton(new ImageIcon(buttonIconchf));
        bpowrotsaldochf.setBorderPainted(false);
        bpowrotsaldochf.setFocusPainted(false);
        bpowrotsaldochf.setContentAreaFilled(false);
        bpowrotsaldochf.setLayout(null);
        bpowrotsaldochf.setBounds(575, 290, 40, 40);
        panelsaldochf.add(bpowrotsaldochf);

        JPanel panelsaldobnc = new JPanel();
        panelsaldobnc.setBackground(Color.BLUE);


        panelsaldobnc.setBounds(35, 50, 630, 350);
        panelsaldobnc.setBorder(blackline);
        panelsaldobnc.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);
        panel3.setLayout(null);
        panel3.setBounds(35, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        panelsaldobnc.add(panel3);

        JLabel lsaldobnc = new JLabel("Twoje saldo wynosi:");
        lsaldobnc.setFont(new Font("Arial", Font.BOLD, 25));
        lsaldobnc.setBounds(170,140,300,50);
        lsaldobnc.setForeground(Color.lightGray);
        panelsaldobnc.add(lsaldobnc);



        JLabel lsaldobnckwotabnc = new JLabel("₿");
        lsaldobnckwotabnc .setFont(new Font("Arial", Font.BOLD, 25));
        lsaldobnckwotabnc .setBounds(330,180,300,50);
        lsaldobnckwotabnc .setForeground(Color.lightGray);
        panelsaldobnc.add(lsaldobnckwotabnc );


        BufferedImage buttonIconbnc = ImageIO.read(new File("strzałka.png"));
        JButton bpowrotsaldobnc = new JButton(new ImageIcon(buttonIconbnc));
        bpowrotsaldobnc.setBorderPainted(false);
        bpowrotsaldobnc.setFocusPainted(false);
        bpowrotsaldobnc.setContentAreaFilled(false);
        bpowrotsaldobnc.setLayout(null);
        bpowrotsaldobnc.setBounds(575, 290, 40, 40);
        panelsaldobnc.add(bpowrotsaldobnc);

        JPanel panelsaldoeur = new JPanel();
        panelsaldoeur.setBackground(Color.BLUE);


        panelsaldoeur.setBounds(35, 50, 630, 350);
        panelsaldoeur.setBorder(blackline);
        panelsaldoeur.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);
        panel3.setLayout(null);
        panel3.setBounds(35, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        panelsaldoeur.add(panel3);

        JLabel lsaldoeur = new JLabel("Twoje saldo wynosi:");
        lsaldoeur.setFont(new Font("Arial", Font.BOLD, 25));
        lsaldoeur.setBounds(170,140,300,50);
        lsaldoeur.setForeground(Color.lightGray);
        panelsaldoeur.add(lsaldoeur);



        JLabel lsaldoeurkwotaeur = new JLabel("€");
        lsaldoeurkwotaeur .setFont(new Font("Arial", Font.BOLD, 25));
        lsaldoeurkwotaeur .setBounds(330,180,300,50);
        lsaldoeurkwotaeur .setForeground(Color.lightGray);
        panelsaldoeur.add(lsaldoeurkwotaeur );


        BufferedImage buttonIconeur = ImageIO.read(new File("strzałka.png"));
        JButton bpowrotsaldoeur = new JButton(new ImageIcon(buttonIconeur));
        bpowrotsaldoeur.setBorderPainted(false);
        bpowrotsaldoeur.setFocusPainted(false);
        bpowrotsaldoeur.setContentAreaFilled(false);
        bpowrotsaldoeur.setLayout(null);
        bpowrotsaldoeur.setBounds(575, 290, 40, 40);
        panelsaldoeur.add(bpowrotsaldoeur);





        JPanel pczekaj = new JPanel();
        pczekaj.setBackground(Color.BLUE);
        pczekaj.setBounds(35, 50, 630, 350);
        pczekaj.setBorder(blackline);
        pczekaj.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);
        panel3.setLayout(null);
        panel3.setBounds(35, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        pczekaj.add(panel3);

        JLabel lczekaj = new JLabel("Proszę czekać...");
        lczekaj.setFont(new Font("Arial", Font.BOLD, 20));
        lczekaj.setBounds(240,150,300,50);
        lczekaj.setForeground(Color.LIGHT_GRAY);
        pczekaj.add(lczekaj);

        JPanel pwyjątek = new JPanel();
        pwyjątek.setBackground(Color.BLUE);
        pwyjątek.setBounds(35, 50, 630, 350);
        pwyjątek.setBorder(blackline);
        pwyjątek.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(10.0f)));
        frame.getContentPane().setLayout(null);
        panel3.setLayout(null);
        panel3.setBounds(35, 20, 560, 70);
        panel3.setBorder(blackline);
        panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        pwyjątek.add(panel3);

        JLabel wyjątekinnakwotawy = new JLabel("Przepraszamy, operacja nie może być zrealizowana");

        wyjątekinnakwotawy.setFont(new Font("Arial", Font.BOLD, 15));
        wyjątekinnakwotawy.setBounds(150,80,370,200);
        wyjątekinnakwotawy.setForeground(Color.RED);
        pwyjątek.add(wyjątekinnakwotawy);







        JButton bwyplata = new JButton("Wypłata pieniędzy");
        bwyplata.setBackground(Color.LIGHT_GRAY);
        bwyplata.setBounds(35, 110, 250, 50);
        bwyplata.setFont(new Font("Arial", Font.BOLD, 17));

        JButton bwplata = new JButton("Wpłata pieniędzy");
        bwplata.setBackground(Color.LIGHT_GRAY);
        bwplata.setBounds(35, 180, 250, 50);
        bwplata.setFont(new Font("Arial", Font.BOLD, 17));

        JButton bzlecenie = new JButton("Zlecenie przelewu");
        bzlecenie.setBackground(Color.LIGHT_GRAY);
        bzlecenie.setBounds(35, 250, 250, 50);
        bzlecenie.setFont(new Font("Arial", Font.BOLD, 17));

        JButton bprzewalutowanie = new JButton("Przewalutowanie");
        bprzewalutowanie.setBackground(Color.LIGHT_GRAY);
        bprzewalutowanie.setBounds(345, 110, 250, 50);
        bprzewalutowanie.setFont(new Font("Arial", Font.BOLD, 17));

        JButton bb = new JButton("Zapytanie o saldo");
        bb.setBackground(Color.LIGHT_GRAY);
        bb.setBounds(345, 180, 250, 50);
        bb.setFont(new Font("Arial", Font.BOLD, 17));

        JButton bwyjdz = new JButton("Weż kartę i wyjdż");
        bwyjdz.setBackground(Color.LIGHT_GRAY);
        bwyjdz.setBounds(345, 250, 250, 50);
        bwyjdz.setFont(new Font("Arial", Font.BOLD, 17));



        panel1.add(panel3);
        panel1.add(bwyplata);
        panel1.add(bwplata);
        panel1.add(bzlecenie);
        panel1.add(bprzewalutowanie);
        panel1.add(bb);
        panel1.add(bwyjdz);

        panel3.add(logolabel);




        BufferedImage karta = ImageIO.read(new File("karta2.png"));
        JLabel picLabel = new JLabel(new ImageIcon(karta));
        picLabel.setLayout(null);
        picLabel.setBounds(500, 430, 150, 200);
        pkarta.add(picLabel);

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


        JPanel klaw = new JPanel();
        klaw.setBackground(Color.DARK_GRAY);
        frame.getContentPane().setLayout(null);
        klaw.setBounds(225, 430, 250, 226);

        JButton b1 = new JButton("1");
        b1.setPreferredSize(new Dimension(50, 50));
        b1.setBackground(Color.lightGray);
        b1.setFont(new Font("Arial", Font.BOLD, 25));
        JButton b2 = new JButton("2");
        b2.setPreferredSize(new Dimension(50, 50));
        b2.setBackground(Color.lightGray);
        b2.setFont(new Font("Arial", Font.BOLD, 25));
        JButton b3 = new JButton("3");
        b3.setPreferredSize(new Dimension(50, 50));
        b3.setBackground(Color.lightGray);
        b3.setFont(new Font("Arial", Font.BOLD, 25));
        JButton bcancel = new JButton("Cancel");
        bcancel.setPreferredSize(new Dimension(75, 50));
        bcancel.setFont(new Font("Arial", Font.BOLD, 11));
        bcancel.setBackground(Color.RED);
        bcancel.setHorizontalAlignment(SwingConstants.LEFT);
        JButton b4 = new JButton("4");
        b4.setPreferredSize(new Dimension(50, 50));
        b4.setBackground(Color.lightGray);
        b4.setFont(new Font("Arial", Font.BOLD, 25));
        JButton b5 = new JButton("5");
        b5.setPreferredSize(new Dimension(50, 50));
        b5.setBackground(Color.lightGray);
        b5.setFont(new Font("Arial", Font.BOLD, 25));
        JButton b6 = new JButton("6");
        b6.setPreferredSize(new Dimension(50, 50));
        b6.setBackground(Color.lightGray);
        b6.setFont(new Font("Arial", Font.BOLD, 25));
        JButton bclear = new JButton("Clear");
        bclear.setPreferredSize(new Dimension(75, 50));
        bclear.setFont(new Font("Arial", Font.BOLD, 11));
        bclear.setBackground(Color.yellow);
        JButton b7 = new JButton("7");
        b7.setPreferredSize(new Dimension(50, 50));
        b7.setBackground(Color.lightGray);
        b7.setFont(new Font("Arial", Font.BOLD, 25));
        JButton b8 = new JButton("8");
        b8.setPreferredSize(new Dimension(50, 50));
        b8.setBackground(Color.lightGray);
        b8.setFont(new Font("Arial", Font.BOLD, 25));
        JButton b9 = new JButton("9");
        b9.setPreferredSize(new Dimension(50, 50));
        b9.setBackground(Color.lightGray);
        b9.setFont(new Font("Arial", Font.BOLD, 25));
        JButton benter = new JButton("Enter");
        benter.setPreferredSize(new Dimension(75, 50));
        benter.setFont(new Font("Arial", Font.BOLD, 11));
        benter.setBackground(Color.GREEN);
        JButton bp = new JButton(" ");
        bp.setPreferredSize(new Dimension(50, 50));
        bp.setBackground(Color.lightGray);
        JButton b0 = new JButton("0");
        b0.setPreferredSize(new Dimension(50, 50));
        b0.setBackground(Color.lightGray);
        b0.setFont(new Font("Arial", Font.BOLD, 25));
        JButton bp1 = new JButton(".");
        bp1.setPreferredSize(new Dimension(50, 50));
        bp1.setBackground(Color.lightGray);
        bp1.setFont(new Font("Arial", Font.BOLD, 25));
        JButton bp2 = new JButton("");
        bp2.setPreferredSize(new Dimension(75, 50));
        bp2.setBackground(Color.lightGray);


        klaw.add(b1);
        klaw.add(b2);
        klaw.add(b3);
        klaw.add(bcancel);
        klaw.add(b4);
        klaw.add(b5);
        klaw.add(b6);
        klaw.add(bclear);
        klaw.add(b7);
        klaw.add(b8);
        klaw.add(b9);
        klaw.add(benter);
        klaw.add(bp);
        klaw.add(b0);
        klaw.add(bp1);
        klaw.add(bp2);


        frame.add(panel0);
        frame.add(panel00);
        frame.add(panel2);
        frame.add(picLabel);

        frame.add(klaw);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        b4.setFocusable(false);
        b5.setFocusable(false);
        b6.setFocusable(false);
        b7.setFocusable(false);
        b8.setFocusable(false);
        b9.setFocusable(false);
        b0.setFocusable(false);
        bp1.setFocusable(false);
        bclear.setFocusable(false);
        bcancel.setFocusable(false);
        bp2.setFocusable(false);
        benter.setFocusable(false);


        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (tkarta.hasFocus())
                    tkarta.setText(tkarta.getText() + b1.getText());
                if (tpin.hasFocus())
                    tpin.setText(tpin.getText() + b1.getText());
                if(tinnakarta.hasFocus())
                    tinnakarta.setText(tinnakarta.getText() + b1.getText());
                if(tinnaw.hasFocus())
                    tinnaw.setText(tinnaw.getText() + b1.getText());
                if(tinnawy.hasFocus())
                    tinnawy.setText(tinnawy.getText() + b1.getText());
                if(tkwotazlecenie.hasFocus())
                    tkwotazlecenie.setText(tkwotazlecenie.getText() + b1.getText());
                if(t1.hasFocus())
                    t1.setText(t1.getText() + b1.getText());
                if(t2.hasFocus())
                    t2.setText(t2.getText() + b1.getText());
                if(t3.hasFocus())
                    t3.setText(t3.getText() + b1.getText());
                if(t4.hasFocus())
                    t4.setText(t4.getText() + b1.getText());
                if(t5.hasFocus())
                    t5.setText(t5.getText() + b1.getText());
                if(t6.hasFocus())
                    t6.setText(t6.getText() + b1.getText());
                if(t7.hasFocus())
                    t7.setText(t7.getText() + b1.getText());
                if(t8.hasFocus())
                    t8.setText(t8.getText() + b1.getText());

            }
        });




        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tkarta.hasFocus())
                    tkarta.setText(tkarta.getText() + b2.getText());
                if (tpin.hasFocus())
                    tpin.setText(tpin.getText() + b2.getText());
                if(tinnakarta.hasFocus())
                    tinnakarta.setText(tinnakarta.getText() + b2.getText());
                if(tinnaw.hasFocus())
                    tinnaw.setText(tinnaw.getText() + b2.getText());
                if(tinnawy.hasFocus())
                    tinnawy.setText(tinnawy.getText() + b2.getText());
                if(tkwotazlecenie.hasFocus())
                    tkwotazlecenie.setText(tkwotazlecenie.getText() + b2.getText());
                if(t1.hasFocus())
                    t1.setText(t1.getText() + b2.getText());
                if(t2.hasFocus())
                    t2.setText(t2.getText() + b2.getText());
                if(t3.hasFocus())
                    t3.setText(t3.getText() + b2.getText());
                if(t4.hasFocus())
                    t4.setText(t4.getText() + b2.getText());
                if(t5.hasFocus())
                    t5.setText(t5.getText() + b2.getText());
                if(t6.hasFocus())
                    t6.setText(t6.getText() + b2.getText());
                if(t7.hasFocus())
                    t7.setText(t7.getText() + b2.getText());
                if(t8.hasFocus())
                    t8.setText(t8.getText() + b2.getText());

            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tkarta.hasFocus())
                    tkarta.setText(tkarta.getText() + b3.getText());
                if (tpin.hasFocus())
                    tpin.setText(tpin.getText() + b3.getText());
                if(tinnakarta.hasFocus())
                    tinnakarta.setText(tinnakarta.getText() + b3.getText());
                if(tinnaw.hasFocus())
                    tinnaw.setText(tinnaw.getText() + b3.getText());
                if(tinnawy.hasFocus())
                    tinnawy.setText(tinnawy.getText() + b3.getText());
                if(tkwotazlecenie.hasFocus())
                    tkwotazlecenie.setText(tkwotazlecenie.getText() + b3.getText());
                if(t1.hasFocus())
                    t1.setText(t1.getText() + b3.getText());
                if(t2.hasFocus())
                    t2.setText(t2.getText() + b3.getText());
                if(t3.hasFocus())
                    t3.setText(t3.getText() + b3.getText());
                if(t4.hasFocus())
                    t4.setText(t4.getText() + b3.getText());
                if(t5.hasFocus())
                    t5.setText(t5.getText() + b3.getText());
                if(t6.hasFocus())
                    t6.setText(t6.getText() + b3.getText());
                if(t7.hasFocus())
                    t7.setText(t7.getText() + b3.getText());
                if(t8.hasFocus())
                    t8.setText(t8.getText() + b3.getText());

            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tkarta.hasFocus())
                    tkarta.setText(tkarta.getText() + b4.getText());
                if (tpin.hasFocus())
                    tpin.setText(tpin.getText() + b4.getText());
                if(tinnakarta.hasFocus())
                    tinnakarta.setText(tinnakarta.getText() + b4.getText());
                if(tinnaw.hasFocus())
                    tinnaw.setText(tinnaw.getText() + b4.getText());
                if(tinnawy.hasFocus())
                    tinnawy.setText(tinnawy.getText() + b4.getText());
                if(tkwotazlecenie.hasFocus())
                    tkwotazlecenie.setText(tkwotazlecenie.getText() + b4.getText());
                if(t1.hasFocus())
                    t1.setText(t1.getText() + b4.getText());
                if(t2.hasFocus())
                    t2.setText(t2.getText() + b4.getText());
                if(t3.hasFocus())
                    t3.setText(t3.getText() + b4.getText());
                if(t4.hasFocus())
                    t4.setText(t4.getText() + b4.getText());
                if(t5.hasFocus())
                    t5.setText(t5.getText() + b4.getText());
                if(t6.hasFocus())
                    t6.setText(t6.getText() + b4.getText());
                if(t7.hasFocus())
                    t7.setText(t7.getText() + b4.getText());
                if(t8.hasFocus())
                    t8.setText(t8.getText() + b4.getText());
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tkarta.hasFocus())
                    tkarta.setText(tkarta.getText() + b5.getText());
                if (tpin.hasFocus())
                    tpin.setText(tpin.getText() + b5.getText());
                if(tinnakarta.hasFocus())
                    tinnakarta.setText(tinnakarta.getText() + b5.getText());
                if(tinnaw.hasFocus())
                    tinnaw.setText(tinnaw.getText() + b5.getText());
                if(tinnawy.hasFocus())
                    tinnawy.setText(tinnawy.getText() + b5.getText());
                if(tkwotazlecenie.hasFocus())
                    tkwotazlecenie.setText(tkwotazlecenie.getText() + b5.getText());
                if(t1.hasFocus())
                    t1.setText(t1.getText() + b5.getText());
                if(t2.hasFocus())
                    t2.setText(t2.getText() + b5.getText());
                if(t3.hasFocus())
                    t3.setText(t3.getText() + b5.getText());
                if(t4.hasFocus())
                    t4.setText(t4.getText() + b5.getText());
                if(t5.hasFocus())
                    t5.setText(t5.getText() + b5.getText());
                if(t6.hasFocus())
                    t6.setText(t6.getText() + b5.getText());
                if(t7.hasFocus())
                    t7.setText(t7.getText() + b5.getText());
                if(t8.hasFocus())
                    t8.setText(t8.getText() + b5.getText());

            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tkarta.hasFocus())
                    tkarta.setText(tkarta.getText() + b6.getText());
                if (tpin.hasFocus())
                    tpin.setText(tpin.getText() + b6.getText());
                if(tinnakarta.hasFocus())
                    tinnakarta.setText(tinnakarta.getText() + b6.getText());
                if(tinnaw.hasFocus())
                    tinnaw.setText(tinnaw.getText() + b6.getText());
                if(tinnawy.hasFocus())
                    tinnawy.setText(tinnawy.getText() + b6.getText());
                if(tkwotazlecenie.hasFocus())
                    tkwotazlecenie.setText(tkwotazlecenie.getText() + b6.getText());
                if(t1.hasFocus())
                    t1.setText(t1.getText() + b6.getText());
                if(t2.hasFocus())
                    t2.setText(t2.getText() + b6.getText());
                if(t3.hasFocus())
                    t3.setText(t3.getText() + b6.getText());
                if(t4.hasFocus())
                    t4.setText(t4.getText() + b6.getText());
                if(t5.hasFocus())
                    t5.setText(t5.getText() + b6.getText());
                if(t6.hasFocus())
                    t6.setText(t6.getText() + b6.getText());
                if(t7.hasFocus())
                    t7.setText(t7.getText() + b6.getText());
                if(t8.hasFocus())
                    t8.setText(t8.getText() + b6.getText());

            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tkarta.hasFocus())
                    tkarta.setText(tkarta.getText() + b7.getText());
                if (tpin.hasFocus())
                    tpin.setText(tpin.getText() + b7.getText());
                if(tinnakarta.hasFocus())
                    tinnakarta.setText(tinnakarta.getText() + b7.getText());
                if(tinnaw.hasFocus())
                    tinnaw.setText(tinnaw.getText() + b7.getText());
                if(tinnawy.hasFocus())
                    tinnawy.setText(tinnawy.getText() + b7.getText());
                if(tkwotazlecenie.hasFocus())
                    tkwotazlecenie.setText(tkwotazlecenie.getText() + b7.getText());
                if(t1.hasFocus())
                    t1.setText(t1.getText() + b7.getText());
                if(t2.hasFocus())
                    t2.setText(t2.getText() + b7.getText());
                if(t3.hasFocus())
                    t3.setText(t3.getText() + b7.getText());
                if(t4.hasFocus())
                    t4.setText(t4.getText() + b7.getText());
                if(t5.hasFocus())
                    t5.setText(t5.getText() + b7.getText());
                if(t6.hasFocus())
                    t6.setText(t6.getText() + b7.getText());
                if(t7.hasFocus())
                    t7.setText(t7.getText() + b7.getText());
                if(t8.hasFocus())
                    t8.setText(t8.getText() + b7.getText());

            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tkarta.hasFocus())
                    tkarta.setText(tkarta.getText() + b8.getText());
                if (tpin.hasFocus())
                    tpin.setText(tpin.getText() + b8.getText());
                if(tinnakarta.hasFocus())
                    tinnakarta.setText(tinnakarta.getText() + b8.getText());
                if(tinnaw.hasFocus())
                    tinnaw.setText(tinnaw.getText() + b8.getText());
                if(tinnawy.hasFocus())
                    tinnawy.setText(tinnawy.getText() + b8.getText());
                if(tkwotazlecenie.hasFocus())
                    tkwotazlecenie.setText(tkwotazlecenie.getText() + b8.getText());
                if(t1.hasFocus())
                    t1.setText(t1.getText() + b8.getText());
                if(t2.hasFocus())
                    t2.setText(t2.getText() + b8.getText());
                if(t3.hasFocus())
                    t3.setText(t3.getText() + b8.getText());
                if(t4.hasFocus())
                    t4.setText(t4.getText() + b8.getText());
                if(t5.hasFocus())
                    t5.setText(t5.getText() + b8.getText());
                if(t6.hasFocus())
                    t6.setText(t6.getText() + b8.getText());
                if(t7.hasFocus())
                    t7.setText(t7.getText() + b8.getText());
                if(t8.hasFocus())
                    t8.setText(t8.getText() + b8.getText());

            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tkarta.hasFocus())
                    tkarta.setText(tkarta.getText() + b9.getText());
                if (tpin.hasFocus())
                    tpin.setText(tpin.getText() + b9.getText());
                if(tinnakarta.hasFocus())
                    tinnakarta.setText(tinnakarta.getText() + b9.getText());
                if(tinnaw.hasFocus())
                    tinnaw.setText(tinnaw.getText() + b9.getText());
                if(tinnawy.hasFocus())
                    tinnawy.setText(tinnawy.getText() + b9.getText());
                if(tkwotazlecenie.hasFocus())
                    tkwotazlecenie.setText(tkwotazlecenie.getText() + b9.getText());
                if(t1.hasFocus())
                    t1.setText(t1.getText() + b9.getText());
                if(t2.hasFocus())
                    t2.setText(t2.getText() + b9.getText());
                if(t3.hasFocus())
                    t3.setText(t3.getText() + b9.getText());
                if(t4.hasFocus())
                    t4.setText(t4.getText() + b9.getText());
                if(t5.hasFocus())
                    t5.setText(t5.getText() + b9.getText());
                if(t6.hasFocus())
                    t6.setText(t6.getText() + b9.getText());
                if(t7.hasFocus())
                    t7.setText(t7.getText() + b9.getText());
                if(t8.hasFocus())
                    t8.setText(t8.getText() + b9.getText());

            }
        });
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tkarta.hasFocus())
                    tkarta.setText(tkarta.getText() + b0.getText());
                if (tpin.hasFocus())
                    tpin.setText(tpin.getText() + b0.getText());
                if(tinnakarta.hasFocus())
                    tinnakarta.setText(tinnakarta.getText() + b0.getText());
                if(tinnaw.hasFocus())
                    tinnaw.setText(tinnaw.getText() + b0.getText());
                if(tinnawy.hasFocus())
                    tinnawy.setText(tinnawy.getText() + b0.getText());
                if(tkwotazlecenie.hasFocus())
                    tkwotazlecenie.setText(tkwotazlecenie.getText() + b0.getText());
                if(t1.hasFocus())
                    t1.setText(t1.getText() + b0.getText());
                if(t2.hasFocus())
                    t2.setText(t2.getText() + b0.getText());
                if(t3.hasFocus())
                    t3.setText(t3.getText() + b0.getText());
                if(t4.hasFocus())
                    t4.setText(t4.getText() + b0.getText());
                if(t5.hasFocus())
                    t5.setText(t5.getText() + b0.getText());
                if(t6.hasFocus())
                    t6.setText(t6.getText() + b0.getText());
                if(t7.hasFocus())
                    t7.setText(t7.getText() + b0.getText());
                if(t8.hasFocus())
                    t8.setText(t8.getText() + b0.getText());

            }
        });
        bp1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(tinnaw.hasFocus())
                    tinnaw.setText(tinnaw.getText() + bp1.getText());
                if(tinnawy.hasFocus())
                    tinnawy.setText(tinnawy.getText() + bp1.getText());
                if(tkwotazlecenie.hasFocus())
                    tkwotazlecenie.setText(tkwotazlecenie.getText() + bp1.getText());
                if(t1.hasFocus())
                    t1.setText(t1.getText() + bp1.getText());
                if(t2.hasFocus())
                    t2.setText(t2.getText() + bp1.getText());
                if(t3.hasFocus())
                    t3.setText(t3.getText() + bp1.getText());
                if(t4.hasFocus())
                    t4.setText(t4.getText() + bp1.getText());
                if(t5.hasFocus())
                    t5.setText(t5.getText() + bp1.getText());
                if(t6.hasFocus())
                    t6.setText(t6.getText() + bp1.getText());
                if(t7.hasFocus())
                    t7.setText(t7.getText() + bp1.getText());
                if(t8.hasFocus())
                    t8.setText(t8.getText() + bp1.getText());

            }
        });
        bcancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tkarta.hasFocus())
                    tkarta.setText(tkarta.getText().substring(0, tkarta.getText().length() - 1));
                if (tpin.hasFocus())
                    tpin.setText(tpin.getText().substring(0, tpin.getText().length() - 1));
                if(tinnakarta.hasFocus())
                    tinnakarta.setText(tinnakarta.getText().substring(0, tinnakarta.getText().length() - 1));
                if(tinnaw.hasFocus())
                    tinnaw.setText(tinnaw.getText().substring(0, tinnaw.getText().length() - 1));
                if(tinnawy.hasFocus())
                    tinnawy.setText(tinnawy.getText().substring(0, tinnawy.getText().length() - 1));
                if(tkwotazlecenie.hasFocus())
                    tkwotazlecenie.setText(tkwotazlecenie.getText().substring(0, tkwotazlecenie.getText().length() - 1));
                if(t1.hasFocus())
                    t1.setText(t1.getText().substring(0, t1.getText().length() - 1));
                if(t2.hasFocus())
                    t2.setText(t2.getText().substring(0, t2.getText().length() - 1));
                if(t3.hasFocus())
                    t3.setText(t3.getText().substring(0, t3.getText().length() - 1));
                if(t4.hasFocus())
                    t4.setText(t4.getText().substring(0, t4.getText().length() - 1));
                if(t5.hasFocus())
                    t5.setText(t5.getText().substring(0, t5.getText().length() - 1));
                if(t6.hasFocus())
                    t6.setText(t6.getText().substring(0, t6.getText().length() - 1));
                if(t7.hasFocus())
                    t7.setText(t7.getText().substring(0, t7.getText().length() - 1));
                if(t8.hasFocus())
                    t8.setText(t8.getText().substring(0, t8.getText().length() - 1));

            }
        });

        bclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tkarta.hasFocus())
                    tkarta.setText(" ");
                if (tpin.hasFocus())
                    tpin.setText("");
                if(tinnakarta.hasFocus())
                    tinnakarta.setText(" ");
                if(tinnaw.hasFocus())
                    tinnaw.setText(" ");
                if(tinnawy.hasFocus())
                    tinnawy.setText(" ");
                if(tkwotazlecenie.hasFocus())
                    tkwotazlecenie.setText(" ");
                if(t1.hasFocus())
                    t1.setText(" ");
                if(t2.hasFocus())
                    t2.setText(" ");
                if(t3.hasFocus())
                    t3.setText(" ");
                if(t4.hasFocus())
                    t4.setText(" ");
                if(t5.hasFocus())
                    t5.setText(" ");
                if(t6.hasFocus())
                    t6.setText(" ");
                if(t7.hasFocus())
                    t7.setText(" ");
                if(t8.hasFocus())
                    t8.setText(" ");

            }
        });
        benter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                char[] tablica=tpin.getPassword();
                Uzytkownik.ConstructUserDataBase();
                try {
                    user=Uzytkownik.loguj(tkarta.getText(),1000*(tablica[0]-48)+100*(tablica[1]-48)+10*(tablica[2]-48)+(tablica[3]-48));
                    //user=Uzytkownik.loguj("21372139","zaq1@WSX");
                    // System.out.println("jestesmy1");
                } catch (DBException dbException) {
                   // dbException.printStackTrace();
                }
                //System.out.println(1000*(tablica[0]-48)+100*(tablica[1]-48)+10*(tablica[2]-48)+(tablica[3]-48));
                //System.out.println(tkarta.getText());
                if(user!=null) {
                    //System.out.println("jestesmy3");
                    frame.remove(panel00);
                    frame.remove(panel0);
                    frame.add(panel1);
                    frame.add(pkarta);
                    frame.repaint();
                    JLabel nrkarty = new JLabel("Karta \n№: "+ tkarta.getText());
                    nrkarty.setBounds(85, 5, 180, 60);
                    panel3.add(nrkarty);
                }
                else {
                    //System.out.println("Spróbuj ponownie");
                    Uzytkownik.closeConnection();
                }
                Uzytkownik.closeConnection();


            }
        });



        bdalej.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                char[] tablica=tpin.getPassword();
                Uzytkownik.ConstructUserDataBase();
                try {
                    user=Uzytkownik.loguj(tkarta.getText(),1000*(tablica[0]-48)+100*(tablica[1]-48)+10*(tablica[2]-48)+(tablica[3]-48));
                    //user=Uzytkownik.loguj("21372139","zaq1@WSX");
                    // System.out.println("jestesmy1");
                } catch (DBException | ArrayIndexOutOfBoundsException dbException ) {
                    //dbException.printStackTrace();
                }
                //System.out.println(1000*(tablica[0]-48)+100*(tablica[1]-48)+10*(tablica[2]-48)+(tablica[3]-48));
                // System.out.println(tkarta.getText());
                if(user!=null) {
                    //System.out.println("jestesmy3");
                    frame.remove(panel00);
                    frame.remove(panel0);
                    frame.add(panel1);
                    frame.add(pkarta);
                    frame.repaint();
                    JLabel nrkarty = new JLabel("Karta \n№: "+ tkarta.getText());
                    nrkarty.setBounds(85, 5, 180, 60);
                    panel3.add(nrkarty);
                }
                else {
                    //System.out.println("Spróbuj ponownie");
                    Uzytkownik.closeConnection();
                }
                Uzytkownik.closeConnection();


            }
        });
        bwyplata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.remove(panel1);
                frame.remove(panel3);
                frame.add(panelwyplata);
                panelwyplata.setLayout(null);
                panel3.setBounds(35, 20, 560, 70);
                panel3.setBorder(blackline);
                panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));

                panelwyplata.add(panel3);
                panelwyplata.setLayout(null);
                frame.repaint();


            }
        });
        bpowrot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panelwyplata);
                frame.add(panel1);
                panel1.add(panel3);
                panel1.setLayout(null);

                frame.repaint();

            }
        });
        bwplata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel1);
                frame.remove(panel3);
                frame.add(panelwplata);
                panelwplata.setLayout(null);
                panel3.setBounds(35, 20, 560, 70);
                panel3.setBorder(blackline);
                panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));

                panelwplata.add(panel3);
                panelwplata.setLayout(null);
                frame.repaint();


            }
        });
        bpowrotwplata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panelwplata);
                frame.add(panel1);
                panel1.add(panel3);
                panel1.setLayout(null);

                frame.repaint();

            }
        });
        bzlecenie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel1);
                frame.remove(panel3);
                frame.add(panelzlecenie);
                panelzlecenie.setLayout(null);
                panel3.setBounds(35, 20, 560, 70);
                panel3.setBorder(blackline);
                panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));

                panelzlecenie.add(panel3);
                panelzlecenie.setLayout(null);
                frame.repaint();


            }
        });
        bb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel1);
                frame.remove(panel3);
                frame.add(panelsaldo);
                panelsaldo.setLayout(null);
                panel3.setBounds(35, 20, 560, 70);
                panel3.setBorder(blackline);
                panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));

                panelsaldo.add(panel3);
                panelsaldo.setLayout(null);
                frame.repaint();


            }
        });
        bpowrotzlecenie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panelzlecenie);
                frame.add(panel1);
                panel1.add(panel3);
                panel1.setLayout(null);

                frame.repaint();

            }
        });

        bprzewalutowanie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel1);
                frame.remove(panel3);
                frame.add(panelprzewalutowanie);
                panelprzewalutowanie.setLayout(null);
                panel3.setBounds(35, 20, 560, 70);
                panel3.setBorder(blackline);
                panel3.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));

                panelprzewalutowanie.add(panel3);
                panelprzewalutowanie.setLayout(null);
                frame.repaint();


            }
        });
        bpowrotprzewalutowanie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panelprzewalutowanie);
                frame.add(panel1);
                panel1.add(panel3);
                panel1.setLayout(null);

                frame.repaint();

            }
        });
        bpowrotsaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panelsaldo);
                frame.add(panel1);
                panel1.add(panel3);
                panel1.setLayout(null);

                frame.repaint();


            }
        });

        bwyjdz.addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent et) {
                user=null;//po mojemu to musi być, bo przy wylogowywaniu bez tego mozna klikajac przycisk dlaej zalogoewac sie ponownie bez wpisywania danych
                tkarta.setText("");
                tpin.setText("");
                JLabel lsaldoplnkwota = new JLabel(" ");
                lsaldoplnkwota.setFont(new Font("Arial", Font.BOLD, 25));
                lsaldoplnkwota.setBounds(170,180,150,50);
                lsaldoplnkwota.setForeground(Color.lightGray);
                panelsaldopln.add(lsaldoplnkwota);


                frame.remove(pkarta);

                frame.remove(panel1);
                frame.remove(panel3);
                frame.remove(pkarta);

                frame.add(panel0);
                frame.add(panel00);
                panel0.setLayout(null);
                panel00.setLayout(null);
                panel00.setBounds(500, 430, 150, 200);

                frame.repaint();
                user.closeConnection();




            }});
        bwypłata20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Uzytkownik.ConstructUserDataBase();
                    user.wyplac(20);


                    frame.remove(panelwyplata);
                    frame.add(pczekaj);
                    pczekaj.add(panel3);
                    pczekaj.setLayout(null);
                    frame.repaint();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            frame.remove(pczekaj);
                            frame.remove(pcash0);
                            frame.add(panel1);
                            frame.add(picLabel1);

                            frame.add(pcash);
                            panel1.add(panel3);
                            frame.repaint();
                            Uzytkownik.closeConnection();
                        }
                    };
                    Timer timer = new Timer(5000, listener);
                    timer.setRepeats(false);
                    timer.start();
                }
                catch  (Exception exception) {
                    //System.out.println(exception);
                    tinnawy.setText("");

                    frame.remove(panelwyplata);
                    frame.add(pwyjątek);
                    pczekaj.add(panel3);
                    pczekaj.setLayout(null);
                    frame.repaint();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            frame.remove(pwyjątek);
                            frame.remove(pcash0);
                            frame.add(panel1);
                            //frame.add(picLabel1);

                            //frame.add(pcash);
                            panel1.add(panel3);
                            frame.repaint();
                            Uzytkownik.closeConnection();
                        }
                    };
                    Timer timer = new Timer(5000, listener);
                    timer.setRepeats(false);
                    timer.start();
                }

            }
        });
        bwypłata50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Uzytkownik.ConstructUserDataBase();
                    user.wyplac(50);


                    frame.remove(panelwyplata);
                    frame.add(pczekaj);
                    pczekaj.add(panel3);
                    pczekaj.setLayout(null);
                    frame.repaint();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            frame.remove(pczekaj);
                            frame.remove(pcash0);
                            frame.add(panel1);
                            frame.add(picLabel1);

                            frame.add(pcash);
                            panel1.add(panel3);
                            frame.repaint();
                            Uzytkownik.closeConnection();
                        }
                    };
                    Timer timer = new Timer(5000, listener);
                    timer.setRepeats(false);
                    timer.start();
                }
                catch  (Exception exception) {
                    //System.out.println(exception);
                    tinnawy.setText("");

                    frame.remove(panelwyplata);
                    frame.add(pwyjątek);
                    pczekaj.add(panel3);
                    pczekaj.setLayout(null);
                    frame.repaint();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            frame.remove(pwyjątek);
                            frame.remove(pcash0);
                            frame.add(panel1);
                            //frame.add(picLabel1);

                            //frame.add(pcash);
                            panel1.add(panel3);
                            frame.repaint();
                            Uzytkownik.closeConnection();
                        }
                    };
                    Timer timer = new Timer(5000, listener);
                    timer.setRepeats(false);
                    timer.start();
                }

            }
        });
        bwypłata80.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Uzytkownik.ConstructUserDataBase();
                    user.wyplac(80);


                    frame.remove(panelwyplata);
                    frame.add(pczekaj);
                    pczekaj.add(panel3);
                    pczekaj.setLayout(null);
                    frame.repaint();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            frame.remove(pczekaj);
                            frame.remove(pcash0);
                            frame.add(panel1);
                            frame.add(picLabel1);

                            frame.add(pcash);
                            panel1.add(panel3);
                            frame.repaint();
                            Uzytkownik.closeConnection();
                        }
                    };
                    Timer timer = new Timer(5000, listener);
                    timer.setRepeats(false);
                    timer.start();
                }
                catch  (Exception exception) {
                    //System.out.println(exception);
                    tinnawy.setText("");

                    frame.remove(panelwyplata);
                    frame.add(pwyjątek);
                    pczekaj.add(panel3);
                    pczekaj.setLayout(null);
                    frame.repaint();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            frame.remove(pwyjątek);
                            frame.remove(pcash0);
                            frame.add(panel1);
                            //frame.add(picLabel1);

                            //frame.add(pcash);
                            panel1.add(panel3);
                            frame.repaint();
                            Uzytkownik.closeConnection();
                        }
                    };
                    Timer timer = new Timer(5000, listener);
                    timer.setRepeats(false);
                    timer.start();
                }

            }
        });
        bwypłata100.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Uzytkownik.ConstructUserDataBase();
                    user.wyplac(100);


                    frame.remove(panelwyplata);
                    frame.add(pczekaj);
                    pczekaj.add(panel3);
                    pczekaj.setLayout(null);
                    frame.repaint();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            frame.remove(pczekaj);
                            frame.remove(pcash0);
                            frame.add(panel1);
                            frame.add(picLabel1);

                            frame.add(pcash);
                            panel1.add(panel3);
                            frame.repaint();
                            Uzytkownik.closeConnection();
                        }
                    };
                    Timer timer = new Timer(5000, listener);
                    timer.setRepeats(false);
                    timer.start();
                }
                catch  (Exception exception) {
                    //System.out.println(exception);
                    tinnawy.setText("");

                    frame.remove(panelwyplata);
                    frame.add(pwyjątek);
                    pczekaj.add(panel3);
                    pczekaj.setLayout(null);
                    frame.repaint();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            frame.remove(pwyjątek);
                            frame.remove(pcash0);
                            frame.add(panel1);
                            //frame.add(picLabel1);

                            //frame.add(pcash);
                            panel1.add(panel3);
                            frame.repaint();
                            Uzytkownik.closeConnection();
                        }
                    };
                    Timer timer = new Timer(5000, listener);
                    timer.setRepeats(false);
                    timer.start();
                }

            }
        });
        bwypłata150.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Uzytkownik.ConstructUserDataBase();
                    user.wyplac(150);


                    frame.remove(panelwyplata);
                    frame.add(pczekaj);
                    pczekaj.add(panel3);
                    pczekaj.setLayout(null);
                    frame.repaint();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            frame.remove(pczekaj);
                            frame.remove(pcash0);
                            frame.add(panel1);
                            frame.add(picLabel1);

                            frame.add(pcash);
                            panel1.add(panel3);
                            frame.repaint();
                            Uzytkownik.closeConnection();
                        }
                    };
                    Timer timer = new Timer(5000, listener);
                    timer.setRepeats(false);
                    timer.start();
                }
                catch  (Exception exception) {
                    //System.out.println(exception);
                    tinnawy.setText("");

                    frame.remove(panelwyplata);
                    frame.add(pwyjątek);
                    pczekaj.add(panel3);
                    pczekaj.setLayout(null);
                    frame.repaint();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            frame.remove(pwyjątek);
                            frame.remove(pcash0);
                            frame.add(panel1);
                            //frame.add(picLabel1);

                            //frame.add(pcash);
                            panel1.add(panel3);
                            frame.repaint();
                            Uzytkownik.closeConnection();
                        }
                    };
                    Timer timer = new Timer(5000, listener);
                    timer.setRepeats(false);
                    timer.start();
                }

            }
        });
        bwpłata20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Uzytkownik.ConstructUserDataBase();
                try {
                    user.wplac(20);
                } catch (Exception exception) {
                    //exception.printStackTrace();
                }
                frame.remove(panelwplata);
                frame.add(pczekaj);
                pczekaj.add(panel3);
                pczekaj.setLayout(null);
                frame.repaint();
                ActionListener listener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.remove(pczekaj);
                        frame.remove(pcash0);
                        frame.add(panel1);
                        frame.add(picLabel2);

                        frame.add(ppotwierdzenie);
                        panel1.add(panel3);
                        frame.repaint();
                        Uzytkownik.closeConnection();
                    }
                };
                Timer timer = new Timer( 5000, listener );
                timer.setRepeats(false);
                timer.start();

            }
        });
        bwpłata50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Uzytkownik.ConstructUserDataBase();
                try {
                    user.wplac(50);
                } catch (DBException dbException) {
                   // dbException.printStackTrace();
                }
                frame.remove(panelwplata);
                frame.add(pczekaj);
                pczekaj.add(panel3);
                pczekaj.setLayout(null);
                frame.repaint();
                ActionListener listener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.remove(pczekaj);
                        frame.remove(pcash0);
                        frame.add(panel1);
                        frame.add(picLabel2);

                        frame.add(ppotwierdzenie);
                        panel1.add(panel3);
                        frame.repaint();
                        Uzytkownik.closeConnection();
                    }
                };
                Timer timer = new Timer( 5000, listener );
                timer.setRepeats(false);
                timer.start();

            }
        });
        bwpłata80.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Uzytkownik.ConstructUserDataBase();
                try {
                    user.wplac(80);
                } catch (DBException dbException) {
                    //dbException.printStackTrace();
                }
                frame.remove(panelwplata);
                frame.add(pczekaj);
                pczekaj.add(panel3);
                pczekaj.setLayout(null);
                frame.repaint();
                ActionListener listener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.remove(pczekaj);
                        frame.remove(pcash0);
                        frame.add(panel1);
                        frame.add(picLabel2);

                        frame.add(ppotwierdzenie);
                        panel1.add(panel3);
                        frame.repaint();
                        Uzytkownik.closeConnection();
                    }
                };
                Timer timer = new Timer( 5000, listener );
                timer.setRepeats(false);
                timer.start();

            }
        });
        bwpłata100.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Uzytkownik.ConstructUserDataBase();
                try {
                    user.wplac(100);
                } catch (DBException dbException) {
                    //dbException.printStackTrace();
                }
                frame.remove(panelwplata);
                frame.add(pczekaj);
                pczekaj.add(panel3);
                pczekaj.setLayout(null);
                frame.repaint();
                ActionListener listener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.remove(pczekaj);
                        frame.remove(pcash0);
                        frame.add(panel1);
                        frame.add(picLabel2);

                        frame.add(ppotwierdzenie);
                        panel1.add(panel3);
                        frame.repaint();
                        Uzytkownik.closeConnection();
                    }
                };
                Timer timer = new Timer( 5000, listener );
                timer.setRepeats(false);
                timer.start();

            }
        });
        bwpłata150.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Uzytkownik.ConstructUserDataBase();
                try {
                    user.wplac(150);
                } catch (DBException dbException) {
                    //dbException.printStackTrace();
                }
                frame.remove(panelwplata);
                frame.add(pczekaj);
                pczekaj.add(panel3);
                pczekaj.setLayout(null);
                frame.repaint();
                ActionListener listener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.remove(pczekaj);
                        frame.remove(pcash0);
                        frame.add(panel1);
                        frame.add(picLabel2);

                        frame.add(ppotwierdzenie);
                        panel1.add(panel3);
                        frame.repaint();
                        Uzytkownik.closeConnection();
                    }
                };
                Timer timer = new Timer( 5000, listener );
                timer.setRepeats(false);
                timer.start();

            }
        });
        bwpłatainna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panelwplata);
                frame.add(panelinnakwotaw);
                panelinnakwotaw.add(panel3);
                panelinnakwotaw.setLayout(null);
                frame.repaint();
            }
        });
        bakceptujw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Uzytkownik.ConstructUserDataBase();
                try{
                    user.wplac(Double.parseDouble(tinnaw.getText()));
                }
                catch  (Exception exception) {
                    System.out.println("dddd");
                }

                frame.remove(panelinnakwotaw);
                frame.add(pczekaj);
                pczekaj.add(panel3);
                pczekaj.setLayout(null);
                frame.repaint();
                ActionListener listener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.remove(pczekaj);
                        frame.remove(pcash0);
                        frame.add(panel1);
                        frame.add(picLabel2);

                        frame.add(ppotwierdzenie);
                        panel1.add(panel3);
                        frame.repaint();
                        Uzytkownik.closeConnection();
                    }
                };
                Timer timer = new Timer( 5000, listener );
                timer.setRepeats(false);
                timer.start();
                tinnaw.setText("");

            }


        });
        bwypłatainna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panelwyplata);
                frame.add(panelinnakwotawy);
                panelinnakwotawy.add(panel3);
                panelinnakwotawy.setLayout(null);
                frame.repaint();
            }
        });
        bakceptujwy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    Uzytkownik.ConstructUserDataBase();
//                        System.out.println("trying");
//                        System.out.println(tinnawy.getText());
//                        System.out.println(Double.parseDouble(tinnawy.getText())-1);
                    user.wyplac(Double.parseDouble(tinnawy.getText()));

                    frame.remove(panelinnakwotawy);
                    frame.add(pczekaj);
                    pczekaj.add(panel3);
                    pczekaj.setLayout(null);
                    frame.repaint();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            frame.remove(pczekaj);
                            frame.remove(pcash0);
                            frame.add(panel1);
                            frame.add(picLabel1);

                            frame.add(pcash);
                            panel1.add(panel3);
                            frame.repaint();
                            Uzytkownik.closeConnection();
                        }
                    };
                    Timer timer = new Timer( 5000, listener );
                    timer.setRepeats(false);
                    timer.start();

                }

                catch  (Exception exception) {
                    //System.out.println(exception);
                    tinnawy.setText("");

                    frame.remove(panelinnakwotawy);
                    frame.add(pwyjątek);
                    pwyjątek.add(panel3);
                    pwyjątek.setLayout(null);
                    frame.repaint();
                    Uzytkownik.closeConnection();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            frame.remove(pwyjątek);
                            frame.add(panel1);
                            panel1.add(panel3);
                            frame.repaint();
                            Uzytkownik.closeConnection();
                        }
                    };
                    Timer timer = new Timer( 3000, listener );
                    timer.setRepeats(false);
                    timer.start();
                }
                tinnawy.setText("");

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
                    //saldoException.printStackTrace();
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
                    //saldoException.printStackTrace();
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
                    //saldoException.printStackTrace();
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
                   // saldoException.printStackTrace();
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
                   // saldoException.printStackTrace();
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
                    //saldoException.printStackTrace();
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
                    panelzlecenie.add(lzleceniepomylnie);
                    frame.repaint();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelzlecenie.remove(lzleceniepomylnie);
                            frame.repaint();
                            Uzytkownik.closeConnection();
                        }
                    };
                    Timer timer = new Timer(3000, listener);
                    timer.setRepeats(false);
                    timer.start();
                }
                catch (Exception exception){
                    panelzlecenie.add(lzlecenieniepomylnie);
                    frame.repaint();
                    ActionListener listener = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panelzlecenie.remove(lzlecenieniepomylnie);
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
                lsaldoplnkwota.setBounds(170,180,150,50);
                lsaldoplnkwota.setForeground(Color.lightGray);
                panelsaldopln.add(lsaldoplnkwota);
                frame.remove(panelsaldo);
                frame.add(panelsaldopln);
                panelsaldopln.add(panel3);
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
                frame.remove(panelsaldopln);
                frame.add(panel1);
                panel1.add(panel3);
                panel1.setLayout(null);



                frame.repaint();

            }
        });

        bsaldochf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel lsaldochfkwota = new JLabel(" "+Double.toString(user.getSaldoCHF()));
                lsaldochfkwota.setFont(new Font("Arial", Font.BOLD, 25));
                lsaldochfkwota.setBounds(170,180,150,50);
                lsaldochfkwota.setForeground(Color.lightGray);
                panelsaldochf.add(lsaldochfkwota);
                frame.remove(panelsaldo);
                frame.add(panelsaldochf);
                panelsaldochf.add(panel3);
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
                frame.remove(panelsaldochf);
                frame.add(panel1);
                panel1.add(panel3);
                panel1.setLayout(null);

                frame.repaint();

            }
        });

        bsaldousd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel lsaldousdkwota = new JLabel(" "+Double.toString(user.getSaldoUSD()));
                lsaldousdkwota.setFont(new Font("Arial", Font.BOLD, 25));
                lsaldousdkwota.setBounds(170,180,150,50);
                lsaldousdkwota.setForeground(Color.lightGray);
                panelsaldousd.add(lsaldousdkwota);
                frame.remove(panelsaldo);
                frame.add(panelsaldousd);
                panelsaldousd.add(panel3);
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
                frame.remove(panelsaldousd);
                frame.add(panel1);
                panel1.add(panel3);
                panel1.setLayout(null);

                frame.repaint();

            }
        });

        bsaldobnc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel lsaldobnckwota = new JLabel(" "+Double.toString(user.getSaldoBTC()));
                lsaldobnckwota.setFont(new Font("Arial", Font.BOLD, 25));
                lsaldobnckwota.setBounds(170,180,150,50);
                lsaldobnckwota.setForeground(Color.lightGray);
                panelsaldobnc.add(lsaldobnckwota);
                frame.remove(panelsaldo);
                frame.add(panelsaldobnc);
                panelsaldobnc.add(panel3);
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
                frame.remove(panelsaldobnc);
                frame.add(panel1);
                panel1.add(panel3);
                panel1.setLayout(null);

                frame.repaint();

            }
        });

        bsaldoeur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel lsaldoeurkwota = new JLabel(" "+Double.toString(user.getSaldoEUR()));
                lsaldoeurkwota.setFont(new Font("Arial", Font.BOLD, 25));
                lsaldoeurkwota.setBounds(170,180,150,50);
                lsaldoeurkwota.setForeground(Color.lightGray);
                panelsaldoeur.add(lsaldoeurkwota);
                frame.remove(panelsaldo);
                frame.add(panelsaldoeur);
                panelsaldoeur.add(panel3);
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
                frame.remove(panelsaldoeur);
                frame.add(panel1);
                panel1.add(panel3);
                panel1.setLayout(null);

                frame.repaint();

            }
        });



        pcash.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                frame.remove(pcash);
                frame.remove(picLabel1);
                frame.repaint();
            }

        });
        ppotwierdzenie.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                frame.remove(ppotwierdzenie);
                frame.remove(picLabel2);
                frame.repaint();
            }

        });

    }


}