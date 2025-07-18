/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Credenciales;

//Importar Clases y Funciones
import Estudiante.*;
import Profesor.*;
import Principal.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author pamel
 */
public class Registro_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Credenciales
     */
    public Registro_Usuario() {
        //Llamar método
        initComponents();
        this.lbl_materia.setVisible(false);
        this.txt_encargado.setVisible(false);
        this.lbl_encargado.setVisible(false);
        this.cmb_escuela.setVisible(false);
        this.lbl_escuela.setVisible(false);
        this.cmb_grado.setVisible(false);
        this.lbl_grado.setVisible(false);
        this.cmb_materia.setVisible(false);

        // Carga el ícono
        ImageIcon icono = new ImageIcon("src/img/proteccion.png");

        // Establece el ícono de la ventana
        setIconImage(icono.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_bienvenido = new javax.swing.JPanel();
        lbl_bienvenido = new javax.swing.JLabel();
        jp_campos = new javax.swing.JPanel();
        lbl_username = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        pass_password = new javax.swing.JPasswordField();
        btn_clean = new javax.swing.JButton();
        lbl_logo = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        btn_registro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_cedula = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        lbl_role = new javax.swing.JLabel();
        cmb_role = new javax.swing.JComboBox<>();
        cmb_escuela = new javax.swing.JComboBox<>();
        lbl_escuela = new javax.swing.JLabel();
        lbl_grado = new javax.swing.JLabel();
        cmb_grado = new javax.swing.JComboBox<>();
        lbl_encargado = new javax.swing.JLabel();
        txt_encargado = new javax.swing.JTextField();
        lbl_materia = new javax.swing.JLabel();
        cmb_materia = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Usuario");
        setBackground(new java.awt.Color(255, 204, 0));
        setResizable(false);

        jp_bienvenido.setBackground(new java.awt.Color(0, 51, 102));
        jp_bienvenido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));

        lbl_bienvenido.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        lbl_bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bienvenido.setText("Registro de Usuario");

        javax.swing.GroupLayout jp_bienvenidoLayout = new javax.swing.GroupLayout(jp_bienvenido);
        jp_bienvenido.setLayout(jp_bienvenidoLayout);
        jp_bienvenidoLayout.setHorizontalGroup(
            jp_bienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_bienvenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_bienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp_bienvenidoLayout.setVerticalGroup(
            jp_bienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_bienvenidoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_bienvenido)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jp_campos.setBackground(new java.awt.Color(255, 255, 255));
        jp_campos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));

        lbl_username.setBackground(new java.awt.Color(255, 255, 255));
        lbl_username.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(0, 51, 102));
        lbl_username.setText("Usuario");

        txt_username.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txt_username.setForeground(new java.awt.Color(0, 51, 102));
        txt_username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        pass_password.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        pass_password.setForeground(new java.awt.Color(0, 51, 102));
        pass_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        pass_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_passwordActionPerformed(evt);
            }
        });

        btn_clean.setBackground(new java.awt.Color(0, 51, 102));
        btn_clean.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        btn_clean.setForeground(new java.awt.Color(255, 255, 255));
        btn_clean.setText("Limpiar");
        btn_clean.setMaximumSize(new java.awt.Dimension(87, 26));
        btn_clean.setMinimumSize(new java.awt.Dimension(87, 26));
        btn_clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cleanActionPerformed(evt);
            }
        });

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estudiar2.png"))); // NOI18N

        lbl_password.setBackground(new java.awt.Color(0, 51, 102));
        lbl_password.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(0, 51, 102));
        lbl_password.setText("Contraseña");

        btn_registro.setBackground(new java.awt.Color(0, 51, 102));
        btn_registro.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        btn_registro.setForeground(new java.awt.Color(255, 255, 255));
        btn_registro.setText("Registrarse");
        btn_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 51, 102));

        lbl_nombre.setBackground(new java.awt.Color(255, 255, 255));
        lbl_nombre.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(0, 51, 102));
        lbl_nombre.setText("Nombre");

        txt_nombre.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 51, 102));
        txt_nombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        lbl_cedula.setBackground(new java.awt.Color(255, 255, 255));
        lbl_cedula.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        lbl_cedula.setForeground(new java.awt.Color(0, 51, 102));
        lbl_cedula.setText("Cédula");

        txt_cedula.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(0, 51, 102));
        txt_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });

        lbl_telefono.setBackground(new java.awt.Color(255, 255, 255));
        lbl_telefono.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        lbl_telefono.setForeground(new java.awt.Color(0, 51, 102));
        lbl_telefono.setText("Teléfono");

        txt_telefono.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(0, 51, 102));
        txt_telefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });

        lbl_role.setBackground(new java.awt.Color(255, 255, 255));
        lbl_role.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        lbl_role.setForeground(new java.awt.Color(0, 51, 102));
        lbl_role.setText("Role");

        cmb_role.setBackground(new java.awt.Color(0, 51, 102));
        cmb_role.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        cmb_role.setForeground(new java.awt.Color(255, 255, 255));
        cmb_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una opción", "Estudiante", "Profesor" }));
        cmb_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_roleActionPerformed(evt);
            }
        });

        cmb_escuela.setBackground(new java.awt.Color(0, 51, 102));
        cmb_escuela.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        cmb_escuela.setForeground(new java.awt.Color(255, 255, 255));
        cmb_escuela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una opción" }));
        cmb_escuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_escuelaActionPerformed(evt);
            }
        });

        lbl_escuela.setBackground(new java.awt.Color(255, 255, 255));
        lbl_escuela.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        lbl_escuela.setForeground(new java.awt.Color(0, 51, 102));
        lbl_escuela.setText("Escuela");

        lbl_grado.setBackground(new java.awt.Color(255, 255, 255));
        lbl_grado.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        lbl_grado.setForeground(new java.awt.Color(0, 51, 102));
        lbl_grado.setText("Grado");

        cmb_grado.setBackground(new java.awt.Color(0, 51, 102));
        cmb_grado.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        cmb_grado.setForeground(new java.awt.Color(255, 255, 255));
        cmb_grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una opción", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto" }));
        cmb_grado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_gradoActionPerformed(evt);
            }
        });

        lbl_encargado.setBackground(new java.awt.Color(255, 255, 255));
        lbl_encargado.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        lbl_encargado.setForeground(new java.awt.Color(0, 51, 102));
        lbl_encargado.setText("Encargado");

        txt_encargado.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txt_encargado.setForeground(new java.awt.Color(0, 51, 102));
        txt_encargado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        txt_encargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_encargadoActionPerformed(evt);
            }
        });

        lbl_materia.setBackground(new java.awt.Color(255, 255, 255));
        lbl_materia.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        lbl_materia.setForeground(new java.awt.Color(0, 51, 102));
        lbl_materia.setText("Materia");

        cmb_materia.setBackground(new java.awt.Color(0, 51, 102));
        cmb_materia.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        cmb_materia.setForeground(new java.awt.Color(255, 255, 255));
        cmb_materia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una opción" }));
        cmb_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_materiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_camposLayout = new javax.swing.GroupLayout(jp_campos);
        jp_campos.setLayout(jp_camposLayout);
        jp_camposLayout.setHorizontalGroup(
            jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jp_camposLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_camposLayout.createSequentialGroup()
                        .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pass_password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addComponent(lbl_materia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(cmb_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_camposLayout.createSequentialGroup()
                        .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jp_camposLayout.createSequentialGroup()
                                .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbl_cedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_logo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_camposLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_telefono)
                                        .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_camposLayout.createSequentialGroup()
                                        .addComponent(lbl_encargado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(29, 29, 29)
                                        .addComponent(txt_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jp_camposLayout.createSequentialGroup()
                                        .addComponent(lbl_grado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmb_grado, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jp_camposLayout.createSequentialGroup()
                                        .addComponent(lbl_escuela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmb_escuela, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_camposLayout.createSequentialGroup()
                                        .addComponent(lbl_role, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(cmb_role, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jp_camposLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btn_registro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_clean, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))))
                .addGap(125, 125, 125))
        );
        jp_camposLayout.setVerticalGroup(
            jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_camposLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_camposLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbl_username)
                        .addGap(18, 18, 18)
                        .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_password)
                            .addComponent(pass_password, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombre)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_camposLayout.createSequentialGroup()
                        .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_role)
                            .addComponent(cmb_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_materia)
                            .addComponent(cmb_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_encargado)
                            .addComponent(txt_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_camposLayout.createSequentialGroup()
                        .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_camposLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lbl_cedula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_camposLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbl_escuela)
                                        .addComponent(cmb_escuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_telefono, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jp_camposLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_grado)
                            .addComponent(cmb_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_clean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_registro))
                    .addComponent(lbl_logo))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jp_campos, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_bienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jp_bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void pass_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_passwordActionPerformed

    //Configuración del Botón de Clean
    private void btn_cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cleanActionPerformed
        // TODO add your handling code here:
        //Limpiar campos
        txt_username.setText(null);
        pass_password.setText(null);
        txt_nombre.setText(null);
        txt_cedula.setText(null);
        txt_telefono.setText(null);
        txt_encargado.setText(null);
        cmb_materia.setSelectedIndex(0);
        cmb_role.setSelectedIndex(0);
        cmb_grado.setSelectedIndex(0);
        cmb_escuela.setSelectedIndex(0);
    }//GEN-LAST:event_btn_cleanActionPerformed

    private void btn_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroActionPerformed
        // TODO add your handling code here:
        Registro_Usuario registro = new Registro_Usuario();
        Credenciales usuario = new Credenciales();

        //Extraer datos de los campos
        String username = this.txt_username.getText();
        String nombre = this.txt_nombre.getText();
        String cedula = this.txt_cedula.getText();
        String telefono = this.txt_telefono.getText();
        String role = cmb_role.getSelectedItem().toString();
        String encargado = this.txt_encargado.getText();
        String materia = this.cmb_materia.getSelectedItem().toString();
        String escuela = this.cmb_escuela.getSelectedItem().toString();
        String grado = this.cmb_materia.getSelectedItem().toString();
        String password = new String(this.pass_password.getPassword());

        if (username.length() > 0 && password.length() > 0 && nombre.length() > 0 && cedula.length() > 0 && telefono.length() > 0 && role.length() > 0) {
            try {
                switch (role) {
                    case "Estudiante":
                        Estudiante estudiante = new Estudiante(role, nombre, cedula,telefono,encargado, escuela, grado);
                        break;
                    case "Profesor":
                        Profesor profesor = new Profesor(role, nombre, cedula,telefono,materia, escuela, grado);
                        break;
                    default:
                        //Visualizar tipo de excepcion generada
                        JOptionPane.showMessageDialog(null, "Datos Invalidos.\n"
                                + "Revisar Formato.",
                                "Error: Revisar los datos ingresados", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            } catch (Exception e) {
                //Visualizar tipo de excepcion generada
                JOptionPane.showMessageDialog(null, "Datos Invalidos.\n"
                        + "Revisar Formato.",
                        "Error: Revisar los datos ingresados", JOptionPane.ERROR_MESSAGE);
            }

            registro.setVisible(false);
            usuario.setVisible(true);
            usuario.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btn_registroActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void cmb_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_roleActionPerformed
        // TODO add your handling code here:
        String role = cmb_role.getSelectedItem().toString();
        switch (role) {
            case "Estudiante":
                this.lbl_materia.setVisible(false);
                this.cmb_materia.setVisible(false);
                this.txt_encargado.setVisible(true);
                this.lbl_encargado.setVisible(true);
                this.cmb_escuela.setVisible(true);
                this.lbl_escuela.setVisible(true);
                this.cmb_grado.setVisible(true);
                this.lbl_grado.setVisible(true);
                break;
            case "Profesor":
                this.lbl_materia.setVisible(true);
                this.cmb_escuela.setVisible(true);
                this.lbl_escuela.setVisible(true);
                this.cmb_grado.setVisible(true);
                this.lbl_grado.setVisible(true);
                this.cmb_materia.setVisible(true);
                this.txt_encargado.setVisible(false);
                this.lbl_encargado.setVisible(false);
                break;
            default:
                this.lbl_materia.setVisible(false);
                this.txt_encargado.setVisible(false);
                this.lbl_encargado.setVisible(false);
                this.cmb_escuela.setVisible(false);
                this.lbl_escuela.setVisible(false);
                this.cmb_grado.setVisible(false);
                this.lbl_grado.setVisible(false);
                this.cmb_materia.setVisible(false);
                break;
        }

    }//GEN-LAST:event_cmb_roleActionPerformed

    private void cmb_escuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_escuelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_escuelaActionPerformed

    private void cmb_gradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_gradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_gradoActionPerformed

    private void txt_encargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_encargadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_encargadoActionPerformed

    private void cmb_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_materiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_materiaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clean;
    private javax.swing.JButton btn_registro;
    private javax.swing.JComboBox<String> cmb_escuela;
    private javax.swing.JComboBox<String> cmb_grado;
    private javax.swing.JComboBox<String> cmb_materia;
    private javax.swing.JComboBox<String> cmb_role;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jp_bienvenido;
    private javax.swing.JPanel jp_campos;
    private javax.swing.JLabel lbl_bienvenido;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_encargado;
    private javax.swing.JLabel lbl_escuela;
    private javax.swing.JLabel lbl_grado;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_materia;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_role;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField pass_password;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_encargado;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

}
