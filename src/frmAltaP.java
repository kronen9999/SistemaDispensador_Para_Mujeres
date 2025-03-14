
import java.awt.BorderLayout;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.general.DefaultPieDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kenor
 */
public class frmAltaP extends javax.swing.JFrame {
frmPrincipal datosPrincipal= new frmPrincipal();
public static float  Totalcompleto=0,totalPastillas=0,totalToallas=0,totalParches=0,totalTampones=0;
    /**
     * Creates new form frmAltaP
     */
    public frmAltaP() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblP1.setText("Toallas");
        lblP2.setText("Pastillas");
        lblP3.setText("Tampones");
        lblP4.setText("Parches");
        lblC1.setText("To1");
        lblC2.setText("Pa2");
        lblC3.setText("Ta3");
        lblC4.setText("Pa4");
        totalToallas=datosPrincipal.toalla*datosPrincipal.ventatoalla;
         totalPastillas=datosPrincipal.pastilla*datosPrincipal.ventaPastilla;
          totalParches=datosPrincipal.parche*datosPrincipal.ventaparche;
           totalTampones=datosPrincipal.tampon*datosPrincipal.ventaTampon;
        lblTV1.setText(""+datosPrincipal.ventatoalla);
        lblTV2.setText(""+datosPrincipal.ventaPastilla);
        lblTV3.setText(""+datosPrincipal.ventaTampon);
        lblTV4.setText(""+datosPrincipal.ventaparche);
        lblPr1.setText(""+datosPrincipal.toalla*datosPrincipal.ventatoalla);
        lblPr2.setText(""+datosPrincipal.pastilla*datosPrincipal.ventaPastilla);
        lblPr3.setText(""+datosPrincipal.tampon*datosPrincipal.ventaTampon);
        lblPr4.setText(""+datosPrincipal.parche*datosPrincipal.ventaparche);
        Totalcompleto=totalToallas+totalParches+totalPastillas+totalTampones;
        lblTotal.setText("$ "+Totalcompleto);
        
        DefaultPieDataset datos = new DefaultPieDataset();
        
        datos.setValue("Toallas  vendidas: "+ datosPrincipal.ventatoalla,datosPrincipal.ventatoalla);
        datos.setValue("Pastillas vendidas :"+datosPrincipal.ventaPastilla, datosPrincipal.ventaPastilla);
        datos.setValue("Tampones vendidos: "+datosPrincipal.ventaTampon, datosPrincipal.ventaTampon);
        datos.setValue("Parches vendidos : "+datosPrincipal.ventaparche, datosPrincipal.ventaparche);
        
        JFreeChart graficoCircular = ChartFactory.createPieChart(
        "Ventas de productos ",//nombre del grafico
        datos,//datos
        true,//nombre de las categorias
        true,//Herramientas
        false//Generacion de url
        );       
        ChartPanel panel= new ChartPanel(graficoCircular);
       panel.setMouseWheelEnabled(true);
       panel.setPreferredSize(new Dimension(560,380));//medidas
       
       panelGraficacircular.setLayout(new BorderLayout());
       panelGraficacircular.add(panel,BorderLayout.NORTH);
       panelGraficacircular.validate();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelGraficacircular = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnAceptar1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lblTotal = new javax.swing.JLabel();
        lblC4 = new javax.swing.JLabel();
        lblTV4 = new javax.swing.JLabel();
        lblP4 = new javax.swing.JLabel();
        lblPr4 = new javax.swing.JLabel();
        lblC3 = new javax.swing.JLabel();
        lblTV3 = new javax.swing.JLabel();
        lblPr3 = new javax.swing.JLabel();
        lblP3 = new javax.swing.JLabel();
        lblP2 = new javax.swing.JLabel();
        lblC2 = new javax.swing.JLabel();
        lblTV2 = new javax.swing.JLabel();
        lblPr2 = new javax.swing.JLabel();
        lblP1 = new javax.swing.JLabel();
        lblPr1 = new javax.swing.JLabel();
        lblC1 = new javax.swing.JLabel();
        lblTV1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnAceptar5 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel1.setText("Registro  de ventas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        javax.swing.GroupLayout panelGraficacircularLayout = new javax.swing.GroupLayout(panelGraficacircular);
        panelGraficacircular.setLayout(panelGraficacircularLayout);
        panelGraficacircularLayout.setHorizontalGroup(
            panelGraficacircularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        panelGraficacircularLayout.setVerticalGroup(
            panelGraficacircularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jPanel1.add(panelGraficacircular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 560, 380));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Total producto 1: $");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Producto 1 :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Codigo de Producto: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Total de ventas registradas: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Producto 2 :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Codigo de Producto: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Total de ventas registradas: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Total producto 2: $");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("Producto 3 :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Codigo de Producto: ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setText("Total producto 3: $");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel17.setText("Total de ventas registradas: ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Codigo de Producto: ");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel19.setText("Total de ventas registradas: ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, -1, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel20.setText("Producto 4 :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel21.setText("Total :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, -1, -1));

        btnAceptar1.setBackground(new java.awt.Color(102, 102, 255));
        btnAceptar1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAceptar1.setText("Atras");
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 80, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 900, 10));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 300, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 900, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 300, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 300, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 300, 10));

        lblTotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, 220, 20));

        lblC4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblC4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel1.add(lblC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 110, 20));

        lblTV4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTV4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel1.add(lblTV4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, 50, 20));

        lblP4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblP4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel1.add(lblP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 180, 20));

        lblPr4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPr4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel1.add(lblPr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 120, 20));

        lblC3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblC3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel1.add(lblC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 110, 20));

        lblTV3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTV3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel1.add(lblTV3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 320, 50, 20));

        lblPr3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPr3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel1.add(lblPr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 120, 20));

        lblP3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblP3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel1.add(lblP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 180, 20));

        lblP2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblP2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel1.add(lblP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 180, 20));

        lblC2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblC2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel1.add(lblC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 110, 20));

        lblTV2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTV2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel1.add(lblTV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, 50, 20));

        lblPr2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPr2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel1.add(lblPr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 120, 20));

        lblP1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblP1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel1.add(lblP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 180, 20));

        lblPr1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPr1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel1.add(lblPr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 120, 20));

        lblC1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblC1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel1.add(lblC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 110, 20));

        lblTV1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTV1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jPanel1.add(lblTV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 50, 20));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel22.setText("Total producto 4: $");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, -1, -1));

        btnAceptar5.setBackground(new java.awt.Color(255, 51, 51));
        btnAceptar5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAceptar5.setText("Salir");
        btnAceptar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 570, 70, 20));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoRojo.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        // TODO add your handling code here:}
           frmSeleccion verfrmSeleccion = new frmSeleccion();
           verfrmSeleccion.setVisible(true);
           this.hide();
    }//GEN-LAST:event_btnAceptar1ActionPerformed

    private void btnAceptar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnAceptar5ActionPerformed

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
            java.util.logging.Logger.getLogger(frmAltaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAltaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAltaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAltaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAltaP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnAceptar5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblC1;
    private javax.swing.JLabel lblC2;
    private javax.swing.JLabel lblC3;
    private javax.swing.JLabel lblC4;
    private javax.swing.JLabel lblP1;
    private javax.swing.JLabel lblP2;
    private javax.swing.JLabel lblP3;
    private javax.swing.JLabel lblP4;
    private javax.swing.JLabel lblPr1;
    private javax.swing.JLabel lblPr2;
    private javax.swing.JLabel lblPr3;
    private javax.swing.JLabel lblPr4;
    private javax.swing.JLabel lblTV1;
    private javax.swing.JLabel lblTV2;
    private javax.swing.JLabel lblTV3;
    private javax.swing.JLabel lblTV4;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panelGraficacircular;
    // End of variables declaration//GEN-END:variables
}
