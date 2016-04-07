import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Toolkit;


public class MainFrame {

	private JFrame frmSecuenti;
	private JTable table;
	private JTextField textFilePath;
	private JTextField textPdfNameField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmSecuenti.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSecuenti = new JFrame();
		frmSecuenti.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Christoffer\\Downloads\\jellyface28.png"));
		frmSecuenti.setTitle("SeCuenti");
		frmSecuenti.setBounds(100, 100, 450, 300);
		frmSecuenti.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSecuenti.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(79, 118, 1, 1);
		frmSecuenti.getContentPane().add(table);
		
		textFilePath = new JTextField();
		textFilePath.setBounds(10, 72, 315, 20);
		frmSecuenti.getContentPane().add(textFilePath);
		textFilePath.setColumns(10);
		
		JButton btnBlddra = new JButton("Bl\u00E4ddra");
		btnBlddra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JFileChooser fc = new JFileChooser ();
				int response = fc.showOpenDialog(OpenFile.this);
			}
		});
		btnBlddra.setBounds(335, 71, 89, 23);
		frmSecuenti.getContentPane().add(btnBlddra);
		
		JLabel lblVljXmlfilAtt = new JLabel("V\u00E4lj XML-fil att konvertera till PDF");
		lblVljXmlfilAtt.setBounds(10, 47, 224, 14);
		frmSecuenti.getContentPane().add(lblVljXmlfilAtt);
		
		JButton btnConvert = new JButton("Konvertera");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnConvert.setBounds(335, 180, 89, 45);
		frmSecuenti.getContentPane().add(btnConvert);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(176, 0, 258, 20);
		frmSecuenti.getContentPane().add(menuBar);
		
		JButton btnPdfDestination = new JButton("V\u00E4lj format f\u00F6r PDF");
		menuBar.add(btnPdfDestination);
		
		JButton btnPdfFormat = new JButton("Mapp d\u00E4r PDF sparas");
		menuBar.add(btnPdfFormat);
		
		textPdfNameField = new JTextField();
		textPdfNameField.setBounds(10, 143, 315, 20);
		frmSecuenti.getContentPane().add(textPdfNameField);
		textPdfNameField.setColumns(10);
		
		JLabel lblSkrivInnskat = new JLabel("Skriv in \u00F6nskat namn p\u00E5 PDF-fil");
		lblSkrivInnskat.setBounds(10, 118, 315, 14);
		frmSecuenti.getContentPane().add(lblSkrivInnskat);
		btnPdfFormat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPdfDestination.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
