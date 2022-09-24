import javax.swing.*;

class BelajarJava{
    public static void main(String[] args) { 
        System.out.println("Belajar JAVA"); 
        System.out.println("Sangat mudah sekali"); 
        System.out.println("dan sangat menyenangkan");
        
        String input=JOptionPane.showInputDialog( "Anda Sedang belajar apa?"); 
        JOptionPane.showMessageDialog(null, "Belajar "+input+ " sangat mudah"); 
    } 
}