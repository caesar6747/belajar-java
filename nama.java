import javax.swing.JOptionPane;

class nama {
    static (String args[]){
        String nama; // Variale String Untuk Menyimpan Input
        //Memunculkan Pesan Dialog serta Menerima Input Dari User
        nama = JOptionPane.showInputDialog("Siapa Nama Kamu?");
        //Menampilkan Pesan kepada User
        JOptionPane.showMessageDialog(null, "Salam Kenal "+nama);
    }
}
