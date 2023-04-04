/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AplicativoSistemaAgendamento;


public class AplicativoSistemaAgendamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel(
            javax.swing.UIManager.getSystemLookAndFeelClassName());
}       catch (Exception e) {
}
       
        
        MenuPrincipal principal = new MenuPrincipal();
        principal.setVisible(true);
    }
    
}
