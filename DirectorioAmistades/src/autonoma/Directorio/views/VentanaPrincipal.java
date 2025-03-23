
package autonoma.Directorio.views;
import autonoma.Directorio.exceptions.AmigoException;
import autonoma.Directorio.models.Amigo;
import autonoma.Directorio.models.Aplicacion;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class VentanaPrincipal extends javax.swing.JFrame {
     private Aplicacion aplicacion;

    public VentanaPrincipal() {
        initComponents();
        this.aplicacion = new Aplicacion();
        setTitle("Registro de Amigos");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        crearMenu();
    }

    public VentanaPrincipal(Aplicacion aplicacion) {
        initComponents();
        this.aplicacion = aplicacion; // Asignar la aplicación recibida
        setTitle("Registro de Amigos");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear el menú superior
        crearMenu();
    }

    private void crearMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opciones");

        JMenuItem agregarAmigoItem = new JMenuItem("Agregar Amigo");
        agregarAmigoItem.addActionListener(e -> abrirAgregarAmigo());

        JMenuItem buscarAmigoItem = new JMenuItem("Buscar Amigo");
        buscarAmigoItem.addActionListener(e -> abrirBuscarAmigo());

        JMenuItem acercaDeItem = new JMenuItem("Acerca de");
        acercaDeItem.addActionListener(e -> JOptionPane.showMessageDialog(this,
            "Taller: Registro de Amigos\nAsignatura: Programacion Orientada a Objetos\nUniversidad: UAM\nDesarrolladores: [Salomé Carmona- Salomé Toro]",
            "Acerca de", JOptionPane.INFORMATION_MESSAGE));

        menu.add(agregarAmigoItem);
        menu.add(buscarAmigoItem);
        menu.add(acercaDeItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }

    private void abrirAgregarAmigo() {
        // Abrir el diálogo para agregar un amigo
        AgregarAmigo dialog = new AgregarAmigo(this, true, aplicacion);
        dialog.setVisible(true);
    }

    private void abrirBuscarAmigo() {
        // Abrir el diálogo para buscar un amigo
        BuscarAmigo dialog = new BuscarAmigo(this, true, aplicacion);
        dialog.setVisible(true);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 51, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE AMIGOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 0, 255));

        jLabelNombre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 24)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelTelefono.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 24)); // NOI18N
        jLabelTelefono.setText("Telefono:");

        jLabelCorreo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 24)); // NOI18N
        jLabelCorreo.setText("Correo:");

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(72, 72, 72)
                .addComponent(btnLimpiar)
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jLabelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(jTextFieldTelefono)
                    .addComponent(jTextFieldNombre))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTelefono)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCorreo)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnAgregar)
                    .addComponent(btnLimpiar))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jMenu1.setText("Acerca de ..");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        jTextFieldTelefono.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Obtener los datos de los campos de texto
        try{
            String nombre = jTextFieldNombre.getText();
            String telefono = jTextFieldTelefono.getText();
            String correo = jTextFieldCorreo.getText();

            // Validar que los campos no estén vacíos
            if (nombre.isEmpty() || telefono.isEmpty() || correo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Agregar el amigo a la aplicación
            aplicacion.agregarAmigo(new Amigo(nombre, telefono, correo));

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "Amigo agregado correctamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);

            // Limpiar los campos de texto
            limpiarCampos();
        } catch (AmigoException e) {
            // Mostrar mensaje de error si ocurre una excepción
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            // Obtener el correo del campo de texto
            String correo = jTextFieldCorreo.getText();

            // Validar que el campo no esté vacío
            if (correo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un correo para buscar.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Buscar el amigo en la aplicación
            Amigo amigo = aplicacion.buscarAmigo(correo);

            // Mostrar los datos del amigo encontrado
            JOptionPane.showMessageDialog(this,
                "Nombre: " + amigo.getNombre() + "\nTeléfono: " + amigo.getTelefono() + "\nCorreo: " + amigo.getCorreo(),
                "Amigo Encontrado", JOptionPane.INFORMATION_MESSAGE);
        } catch (AmigoException e) {
            // Mostrar mensaje de error si el amigo no se encuentra
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
        }

        private void limpiarCampos() {
            jTextFieldNombre.setText("");
            jTextFieldTelefono.setText("");
            jTextFieldCorreo.setText("");
            // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
