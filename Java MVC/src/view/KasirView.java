/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

/**
 *
 * @author acer
 *//*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class KasirView extends JFrame implements ActionListener{
    JLabel lid_nota = new JLabel("Nota");
    JLabel lid_barang = new JLabel("ID");
    JLabel lharga_barang = new JLabel("Jumlah Barang");
    JLabel ljmlbarang = new JLabel("Harga/pcs");
    
    public JTextField tfid_nota = new JTextField();
    public JTextField tfid_barang = new JTextField();
    public JTextField tfharga_barang = new JTextField();
    public JTextField tfjmlbarang = new JTextField();
  

    public JButton btnTambah = new JButton("Tambah");
    public JButton btnHitung = new JButton("Hitung");


    public JTable tabel2;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"ID", "Harga/pcs", "Jumlah Baranga"};

    public KasirView() {
        this.lid_barang = new JLabel("ID");
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel2 = new JTable(dtm);
        scrollPane = new JScrollPane(tabel2);

        setTitle("Kasir");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setSize(700,400);

        add(scrollPane);
        scrollPane.setBounds(20, 20, 480, 300);

        add( lid_barang);
        lid_barang.setBounds(510, 20, 90, 20);
        add(tfid_barang );
        tfid_barang.setBounds(510, 40, 120, 20);

        add(ljmlbarang);
        ljmlbarang.setBounds(510, 60, 90, 20);
        add(tfjmlbarang);
        tfjmlbarang.setBounds(510, 80, 120, 20);

        add(lharga_barang);
        lharga_barang.setBounds(510, 100, 90, 20);
        add(tfharga_barang);
        tfharga_barang.setBounds(510, 120, 120, 20);
        
        add(lid_nota);
        lid_nota.setBounds(510, 140, 90, 20);
        add(tfid_nota);
        tfid_nota.setBounds(510, 160, 120, 20);

        add(btnTambah);
        btnTambah.setBounds(510, 180, 90, 20);

        
        add(btnHitung);
        btnHitung.setBounds(510, 300, 90, 20);
        btnHitung.addActionListener(this);
    }
    

    public double getid_barang(){
        return Double.valueOf( tfid_barang.getText());
    }

    public double getharga_barang(){
        return Double.valueOf(tfharga_barang.getText());   
    }
    
    public double getjmlbarang(){
        return Double.valueOf(tfjmlbarang.getText());
    }
    
    public double getid_nota(){
        return Double.valueOf(tfid_nota.getText());
    }
    
//    public double getid_nota(){
//        return Double.valueOf(tfid_nota.getText());   
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
//            if(e.getSource() == btnReset){
//               
//            }
    }

}