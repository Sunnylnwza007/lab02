import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class oxform {
    private JLabel X;
    private JLabel draw;
    private JLabel O;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JPanel main;
    private ClassOx ox = new ClassOx();
    private int round = 1;

    public static void main (String [] args){
     JFrame frame = new JFrame();
     oxform form = new oxform();
     frame.setContentPane(form.main);
     frame.pack();
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setMaximumSize(new Dimension(800,800));
     frame.setVisible(true);
    }

    public oxform() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button1.getText().equals("-")){
                    button1.setText(ox.CurPlayer());
                    ox.input(0,0);
                    if (ox.CheckWinOrDraw(0,0)){
                        settscore();
                        setbutton();
                    }
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button2.getText().equals("-")){
                    button2.setText(ox.CurPlayer());
                    ox.input(0,1);
                    if (ox.CheckWinOrDraw(0,1)){
                        settscore();
                        setbutton();
                    }
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button3.getText().equals("-")){
                    button3.setText(ox.CurPlayer());
                    ox.input(0,2);
                    if (ox.CheckWinOrDraw(0,2)){
                        settscore();
                        setbutton();
                    }
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button4.getText().equals("-")){
                    button4.setText(ox.CurPlayer());
                    ox.input(1,0);
                    if (ox.CheckWinOrDraw(1,0)){
                        settscore();
                        setbutton();
                    }
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button5.getText().equals("-")){
                    button5.setText(ox.CurPlayer());
                    ox.input(1,1);
                    if (ox.CheckWinOrDraw(1,1)){
                        settscore();
                        setbutton();
                    }
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button6.getText().equals("-")){
                    button6.setText(ox.CurPlayer());
                    ox.input(1,2);
                    if (ox.CheckWinOrDraw(1,2)){
                        settscore();
                        setbutton();
                    }
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button7.getText().equals("-")){
                    button7.setText(ox.CurPlayer());
                    ox.input(2,0);
                    if (ox.CheckWinOrDraw(2,0)){
                        settscore();
                        setbutton();
                    }
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button8.getText().equals("-")){
                    button8.setText(ox.CurPlayer());
                    ox.input(2,1);
                    if (ox.CheckWinOrDraw(2,1)){
                        settscore();
                        setbutton();
                    }
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button9.getText().equals("-")){
                    button9.setText(ox.CurPlayer());
                    ox.input(2,2);
                    if (ox.CheckWinOrDraw(2,2)){
                        settscore();
                        setbutton();
                    }
                }
            }
        });
    }

    public void setbutton(){
        ox.SetTable();
        button1.setText("-");
        button2.setText("-");
        button3.setText("-");
        button4.setText("-");
        button5.setText("-");
        button6.setText("-");
        button7.setText("-");
        button8.setText("-");
        button9.setText("-");
    }

    public void settscore(){

        X.setText("x : "+ox.getCountX());
        O.setText("O : "+ox.getCountO());
        draw.setText("Draw : "+ox.getCountDraw());
    }
}
