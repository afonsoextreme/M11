package Principal;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class T4 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private Clip clip;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    T4 frame = new T4();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public T4() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 596, 455);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnPlay = new JButton("Play");
        btnPlay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    AudioInputStream audioInputStream = AudioSystem
                            .getAudioInputStream(new File("C:\\Users\\25872\\Documents\\Musica\\Frolic.wav"));

                    clip = AudioSystem.getClip();

                    clip.open(audioInputStream);

                    clip.start();

                } catch (Exception exc) {
                    System.out.println("Erro" + exc.getMessage());
                }
            }
        });
        btnPlay.setBounds(10, 53, 89, 23);
        contentPane.add(btnPlay);

        JButton btnStop = new JButton("Stop");
        btnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clip.stop();
            }
        });
        btnStop.setBounds(10, 121, 89, 23);
        contentPane.add(btnStop);

        JButton btnPause = new JButton("Pause");
        btnPause.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (clip != null && clip.isRunning()) {
                    clip.stop(); // Pausa o áudio
                } else if (clip != null) {
                    clip.start(); // Retoma o áudio
                }
            }
        });
        btnPause.setBounds(10, 87, 89, 23);
        contentPane.add(btnPause);
		
		JButton btnNewButton = new JButton("Do");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

	                   AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\25872\\Documents\\Musica\\do.wav"));

	                   Clip clip=AudioSystem.getClip();

	                   clip.open(audioInputStream);

	                   clip.start();;

	               }

	               catch(Exception exc) {

	                   System.out.println("Erro"+exc.getMessage());

	               }
			
			}
		});
		btnNewButton.setBounds(10, 200, 61, 184);
		contentPane.add(btnNewButton);
		
		JButton btnRe = new JButton("Re");
		btnRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

	                   AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\25872\\Documents\\Musica\\re.wav"));

	                   Clip clip=AudioSystem.getClip();

	                   clip.open(audioInputStream);

	                   clip.start();;

	               }

	               catch(Exception exc) {

	                   System.out.println("Erro"+exc.getMessage());

	               }
			}
		});
		btnRe.setBounds(81, 200, 61, 184);
		contentPane.add(btnRe);
		
		JButton btnNewButton_1_1 = new JButton("Mi");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

	                   AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\25872\\Documents\\Musica\\mi.wav"));

	                   Clip clip=AudioSystem.getClip();

	                   clip.open(audioInputStream);

	                   clip.start();;

	               }

	               catch(Exception exc) {

	                   System.out.println("Erro"+exc.getMessage());

	               }
			}
		});
		btnNewButton_1_1.setBounds(152, 200, 61, 184);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Fa");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

	                   AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\25872\\Documents\\Musica\\fa.wav"));

	                   Clip clip=AudioSystem.getClip();

	                   clip.open(audioInputStream);

	                   clip.start();;

	               }

	               catch(Exception exc) {

	                   System.out.println("Erro"+exc.getMessage());

	               }
			}
		});
		btnNewButton_1_2.setBounds(223, 200, 61, 184);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Sol");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

	                   AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\25872\\Documents\\Musica\\sol.wav"));

	                   Clip clip=AudioSystem.getClip();

	                   clip.open(audioInputStream);

	                   clip.start();;

	               }

	               catch(Exception exc) {

	                   System.out.println("Erro"+exc.getMessage());

	               }
			}
		});
		btnNewButton_1_3.setBounds(294, 200, 61, 184);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("La");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

	                   AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\25872\\Documents\\Musica\\la.wav"));

	                   Clip clip=AudioSystem.getClip();

	                   clip.open(audioInputStream);

	                   clip.start();;

	               }

	               catch(Exception exc) {

	                   System.out.println("Erro"+exc.getMessage());

	               }
			}
		});
		btnNewButton_1_4.setBounds(365, 200, 61, 184);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("Si");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

	                   AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\25872\\Documents\\Musica\\si.wav"));

	                   Clip clip=AudioSystem.getClip();

	                   clip.open(audioInputStream);

	                   clip.start();;

	               }

	               catch(Exception exc) {

	                   System.out.println("Erro"+exc.getMessage());

	               }
			}
		});
		btnNewButton_1_5.setBounds(436, 200, 61, 184);
		contentPane.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_5_1 = new JButton("Re");
		btnNewButton_1_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

	                   AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(new File("C:\\Users\\25872\\Documents\\Musica\\re.wav"));

	                   Clip clip=AudioSystem.getClip();

	                   clip.open(audioInputStream);

	                   clip.start();;

	               }

	               catch(Exception exc) {

	                   System.out.println("Erro"+exc.getMessage());

	               }
			}
		});
		btnNewButton_1_5_1.setBounds(507, 200, 61, 184);
		contentPane.add(btnNewButton_1_5_1);
	}
}
