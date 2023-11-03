package presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends  JFrame{
    private JPanel pnlPrincipal;
    private JLabel lblCodigo;
    private JTextField textCodigo;
    private JTextField txtNombre;
    private JTextField txtapellido;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JButton btnGuardar;
    private JLabel lblidioma;
    private JComboBox cmbIdioma;

    public IngresarPersona(){
        this.setTitle("Ventana Ingresar Persona");
        this.setContentPane(pnlPrincipal);
        this.setSize(400,300);


        this.setVisible(true);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo= textCodigo.getText();
                String nombre= txtNombre.getText();
                String apellido= txtapellido.getText();
                    String mensaje= "Tus datos son: \n"+
                                    "Código: "+codigo+"\n"+
                                    "Nombre: "+nombre+"\n"+
                                    "Apellido: "+apellido;

                JOptionPane.showMessageDialog(btnGuardar,mensaje);
            }
        });
    }

}
