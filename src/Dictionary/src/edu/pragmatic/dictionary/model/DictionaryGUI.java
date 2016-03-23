package Dictionary.src.edu.pragmatic.dictionary.model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;
import javax.swing.JTable;

public class DictionaryGUI extends JFrame{
Dictionary dictionary = new Dictionary();
	private JPanel contentPane;
	private JTextField searchField;
	private JButton btnSearch = new JButton("Search");
	private JTable table;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DictionaryGUI frame = new DictionaryGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DictionaryGUI() {
		setTitle("Dictionary");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		searchField = new JTextField();
		searchField.setBounds(10, 11, 150, 20);
		getContentPane().add(searchField);
		searchField.setColumns(10);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					search();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		
		btnSearch.setBounds(170, 10, 89, 23);
		getContentPane().add(btnSearch);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(0, 37, 424, 214);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBounds(10, 63, 400, 167);
		getContentPane().add(table);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));	
		contentPane.setLayout(null);
	}
	private void search() throws IOException{
		String word = searchField.getText();
		if(word == null || word.length() == 0){
			JOptionPane.showMessageDialog(this, "No word!");
		}else{
		//	WordEntity wordEntity = dictionary.search(word);
		}
		
		
		
	}
}
