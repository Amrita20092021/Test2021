package ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Test3 extends JFrame {
    public Test3() {
        setTitle("ХО Game");
        setSize(600, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JMenuBar jMenuBar = new JMenuBar();
        JMenu game = new JMenu("Game");
        JMenu help = new JMenu("Help");

        jMenuBar.add(game);
        jMenuBar.add(help);

        JMenuItem restart = new JMenuItem("Restart");
        JMenuItem exit = new JMenuItem("Exit");
        JMenuItem about1 = new JMenuItem("About");

        game.add(restart);
        game.add(exit);
        help.add(about1);


        //exit.addActionListener(new AListener());
        //restart.addActionListener(new AListener());
        //about1.addActionListener(new AListener());

        JFrame exitFrame = new JFrame();

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             Object[] options = {"Yes","No"};
             JOptionPane.showOptionDialog(exitFrame,"Exit this is game?","Exit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options [1] );
                //System.out.println("click");
                // System.exit(0);

            }

        });




        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("click");
                restart.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
            }

        });

        JFrame restartJFrame = new JFrame();

        about1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("click");
                JOptionPane.showMessageDialog(restartJFrame,"XO Game_example_Uchaly.Version 1.0.0 Java 8.0 ", "About", JOptionPane.WARNING_MESSAGE);
            }
        });

        setJMenuBar(jMenuBar);
        setVisible(true);
    }



    public static void main(String[] args) throws InvocationTargetException, InterruptedException {
        //Test0 test0 = new Test0();
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                new Test3();
            }
        });

    }
}
