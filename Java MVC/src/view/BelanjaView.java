package view;


import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class BelanjaView extends JFrame implements ActionListener{
    JLabel lid_barang = new JLabel("ID");
    JLabel lnama_barang = new JLabel("Nama");
    JLabel lharaga_barang = new JLabel("Harga/pcs");
    

    public JTextField tfid_barang = new JTextField();
    public JTextField tfnama_barang = new JTextField();
    public JTextField tfharga_barang = new JTextField();
  

    public JButton btnTambah = new JButton("Tambah");
    public JButton btnUpdate = new JButton("Update");
    public JButton btnDelete = new JButton("Delete");
    public JButton btnReset = new JButton("Clear");
    public JButton btnKasir = new JButton("Kasir");

    public JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"ID", "Nama", "Harga/pcs"};

    public BelanjaView() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);

        setTitle("Data Barang");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setSize(700,600);

        add(scrollPane);
        scrollPane.setBounds(20, 20, 480, 300);

        add( lid_barang);
        lid_barang.setBounds(510, 20, 90, 20);
        add(tfid_barang );
        tfid_barang.setBounds(510, 40, 120, 20);

        add(lnama_barang);
        lnama_barang.setBounds(510, 60, 90, 20);
        add(tfnama_barang);
        tfnama_barang.setBounds(510, 80, 120, 20);

        add(lharaga_barang);
        lharaga_barang.setBounds(510, 100, 90, 20);
        add(tfharga_barang);
        tfharga_barang.setBounds(510, 120, 120, 20);

        add(btnTambah);
        btnTambah.setBounds(110, 510, 90, 20);

        add(btnUpdate);
        btnUpdate.setBounds(210, 510, 90, 20);

        add(btnDelete);
        btnDelete.setBounds(310, 510, 90, 20);

        add(btnReset);
        btnReset.setBounds(410, 510, 90, 20);
        btnReset.addActionListener(this);
        
        add(btnKasir);
        btnKasir.setBounds(510, 510, 90, 20);
        btnKasir.addActionListener(this);
    }
    
    
    public void actionPerformed(ActionEvent e) {
     if(e.getSource() == btnReset){
            tfid_barang.setText("");
            tfnama_barang.setText("");
            tfharga_barang.setText("");
        }
     else if(e.getSource() == btnKasir){
            KasirView kasir = new KasirView();
            kasir.setVisible(true);
            this.setVisible(false);
        }
     
     }



    public double getid_barang(){
        return Double.valueOf( tfid_barang.getText());
    }

    public String getnama_barang(){
        return tfnama_barang.getText();
    }

    public double getharga_barang(){
        return Double.valueOf(tfharga_barang.getText());   
    }

}