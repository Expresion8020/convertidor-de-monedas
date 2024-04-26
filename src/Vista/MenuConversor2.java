package Vista;

import java.awt.GridBagConstraints;
import java.awt.Desktop;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.SwingConstants;

import controlador.ControlFormularioMenu;
import controlador.Utilidades;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Color;


/**
 *
 * @author Mario Rodriguez
 * 
 * Clase de nuestro proyecto, esta sera nuestra vista principal dicha clase hereda de la clase JFrame
 * aqui se cargara la vista inicial que se mostrara al ejecutar la aplicación
 */
public class MenuConversor2 extends javax.swing.JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*Llamamos al objeto de la clase ControlFormularioMeni (el controlador de la vista)*/
    ControlFormularioMenu controller;
    
    
    
    public MenuConversor2() {
    	

        initComponents();  
        
        this.setLocationRelativeTo(null);
        controller = new ControlFormularioMenu(this);
        
       
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() {
    	setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logo1.png")).getImage());
    	setTitle("Programa de Conversor");
        java.awt.GridBagConstraints gridBagConstraints;

        barraDesplazamientoMenuPrincipal = new javax.swing.JScrollPane();
        panelMenuPrincipal = new javax.swing.JPanel();
        lbTitleMenu = new javax.swing.JLabel();
        btnMoneda = new javax.swing.JButton();
        btnUnidades = new javax.swing.JButton();
        lbSubTitle = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        panelOperaciones = new javax.swing.JPanel();
        barraDesplazamientoPanelOperaciones = new javax.swing.JScrollPane();
        panelInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        itemAyuda = new javax.swing.JMenu();
        itemAcercaDe = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       

        barraDesplazamientoMenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        barraDesplazamientoMenuPrincipal.setAutoscrolls(true);
        barraDesplazamientoMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelMenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelMenuPrincipal.setPreferredSize(new java.awt.Dimension(290, 542));
        GridBagLayout gbl_panelMenuPrincipal = new GridBagLayout();
        gbl_panelMenuPrincipal.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
        gbl_panelMenuPrincipal.columnWeights = new double[]{1.0};
        panelMenuPrincipal.setLayout(gbl_panelMenuPrincipal);

        lbTitleMenu.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lbTitleMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitleMenu.setText("Menú");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new Insets(0, 10, 5, 10);
        panelMenuPrincipal.add(lbTitleMenu, gridBagConstraints);

        btnMoneda.setBackground(new java.awt.Color(123, 202, 225));
        btnMoneda.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		ImageIcon imgBtnMone = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/Imagenes/converter.jpg")),30);
		btnMoneda.setIcon(imgBtnMone);
		btnMoneda.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		ImageIcon imgBtnMone = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/Imagenes/converter.jpg")),40);
        		btnMoneda.setIcon(imgBtnMone);
        		btnMoneda.setBackground(new Color(253, 254, 254));
        		
        	}
        	public void mouseExited(MouseEvent e) {
        		ImageIcon imgBtnMone = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/Imagenes/converter.jpg")),30);
        		btnMoneda.setIcon(imgBtnMone);
        		btnMoneda.setBackground(new Color(123, 202, 225));
        		
        	}
        	
        });
		
        btnMoneda.setText("Monedas");
        btnMoneda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMoneda.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnMoneda.setIconTextGap(14);
        
        gbc_btnMoneda = new java.awt.GridBagConstraints();
        gbc_btnMoneda.insets = new Insets(0, 0, 5, 0);
        gbc_btnMoneda.gridx = 0;
        gbc_btnMoneda.gridy = 3;
        gbc_btnMoneda.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gbc_btnMoneda.ipady = 20;
        panelMenuPrincipal.add(btnMoneda, gbc_btnMoneda);

        btnUnidades.setBackground(new java.awt.Color(123, 202, 225));
        btnUnidades.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		ImageIcon imgBtnUni = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/Imagenes/Longitud.png")),30);   
		btnUnidades.setIcon(imgBtnUni);// NOI18N
		btnUnidades.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		ImageIcon imgBtnMone = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/Imagenes/Longitud.png")),40);
        		btnUnidades.setIcon(imgBtnMone);
        		btnUnidades.setBackground(new Color(253, 254, 254));
        		
        	}
        	public void mouseExited(MouseEvent e) {
        		ImageIcon imgBtnMone = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/Imagenes/Longitud.png")),30);
        		btnUnidades.setIcon(imgBtnMone);
        		btnUnidades.setBackground(new Color(123, 202, 225));
        		
        	}
        	public void mouseClicked(MouseEvent e) {
        		ImageIcon imgBtnMone = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/Imagenes/Longitud.png")),40);
        		btnUnidades.setIcon(imgBtnMone);
        		btnUnidades.setBackground(new Color(253, 254, 254));
        	}
        });
        btnUnidades.setText("Longitudes");
        btnUnidades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUnidades.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnUnidades.setIconTextGap(14);
        gbc_btnUnidades = new java.awt.GridBagConstraints();
        gbc_btnUnidades.insets = new Insets(0, 0, 5, 0);
        gbc_btnUnidades.gridx = 0;
        gbc_btnUnidades.gridy = 4;
        gbc_btnUnidades.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gbc_btnUnidades.ipady = 20;
        panelMenuPrincipal.add(btnUnidades, gbc_btnUnidades);

        lbSubTitle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14)); // NOI18N
        lbSubTitle.setText("(Operaciones con Monedas y Longitudes )");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        panelMenuPrincipal.add(lbSubTitle, gridBagConstraints);

        btnSalir.setBackground(new java.awt.Color(255, 83, 83));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ImageIcon btnSalirImg = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/Imagenes/exit.png")),30);
        btnSalir.setIcon(btnSalirImg);
        btnSalir.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		ImageIcon imgBtnMone = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/Imagenes/exit.png")),40);
        		btnSalir.setIcon(imgBtnMone);
        		btnSalir.setBackground(new Color(217, 136, 128));
        		
        	}
        	public void mouseExited(MouseEvent e) {
        		ImageIcon imgBtnMone = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/Imagenes/exit.png")),30);
        		btnSalir.setIcon(imgBtnMone);
        		btnSalir.setBackground(new Color(255, 83, 83));
        		
        	}
        	public void mouseClicked(MouseEvent e) {
        		ImageIcon imgBtnMone = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/Imagenes/exit.png")),40);
        		btnSalir.setIcon(imgBtnMone);
        		btnSalir.setBackground(new Color(217, 136, 128));
        		
        	}
        });
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSalir.setIconTextGap(14);
        gridBagConstraints_1 = new java.awt.GridBagConstraints();
        gridBagConstraints_1.anchor = GridBagConstraints.NORTH;
        gridBagConstraints_1.gridx = 0;
        gridBagConstraints_1.gridy = 8;
        gridBagConstraints_1.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints_1.ipady = 20;
        gridBagConstraints_1.insets = new java.awt.Insets(0, 0, 20, 0);
        panelMenuPrincipal.add(btnSalir, gridBagConstraints_1);

        btnInicio.setBackground(new Color(51, 255, 153));
        btnInicio.setFont(new Font("Tahoma", 0, 24)); 
        ImageIcon imgBtnInicio = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/imagenes/home.png")),30);
        btnInicio.setIcon(imgBtnInicio);
        btnInicio.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		ImageIcon imgBtnInicio = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/imagenes/home.png")),40);
                btnInicio.setIcon(imgBtnInicio);
                btnInicio.setBackground(new Color(253, 254, 254));
        	}
        	 public void mouseExited(MouseEvent e) {
        		 ImageIcon imgBtnInicio = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/imagenes/home.png")),30);
                 btnInicio.setIcon(imgBtnInicio);
                 btnInicio.setBackground(new Color(51, 255, 153));
             }
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		ImageIcon imgBtnInicio = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/imagenes/home.png")),40);
                btnInicio.setIcon(imgBtnInicio);
                btnInicio.setBackground(new Color(253, 254, 254));
        		
        	}
        });
        btnInicio.setText("Inicio");
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnInicio.setIconTextGap(14);
        
        gridBagConstraints_2 = new java.awt.GridBagConstraints();
        gridBagConstraints_2.insets = new Insets(0, 0, 5, 0);
        gridBagConstraints_2.gridx = 0;
        gridBagConstraints_2.gridy = 2;
        gridBagConstraints_2.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints_2.ipady = 20;
        panelMenuPrincipal.add(btnInicio, gridBagConstraints_2);

        barraDesplazamientoMenuPrincipal.setViewportView(panelMenuPrincipal);
        
        JlabelDescripcion = new JLabel("<html> ALURA LATAM<font color='green'>❤</font>ORACLE <font color='green'></font></html>");
        JlabelDescripcion.setHorizontalAlignment(SwingConstants.CENTER);
        JlabelDescripcion.setFont(new Font("Roboto", Font.BOLD, 8));
        GridBagConstraints gbc_JlabelDescripcion = new GridBagConstraints();
        gbc_JlabelDescripcion.insets = new Insets(0, 0, 5, 0);
        gbc_JlabelDescripcion.gridx = 0;
        gbc_JlabelDescripcion.gridy = 9;
        panelMenuPrincipal.add(JlabelDescripcion, gbc_JlabelDescripcion);
        
        JlabelDescripcion_1 = new JLabel("<html> Copyright © 2023 |<font color='green'>❤</font> by <font color='green'>Mario Rodriguez</font></html>");
        JlabelDescripcion_1.setHorizontalAlignment(SwingConstants.CENTER);
        JlabelDescripcion_1.setFont(new Font("Roboto", Font.BOLD, 10));
        GridBagConstraints gbc_JlabelDescripcion_1 = new GridBagConstraints();
        gbc_JlabelDescripcion_1.insets = new Insets(0, 0, 5, 0);
        gbc_JlabelDescripcion_1.gridx = 0;
        gbc_JlabelDescripcion_1.gridy = 10;
        panelMenuPrincipal.add(JlabelDescripcion_1, gbc_JlabelDescripcion_1);
        
        panelDeRedes = new JPanel();
        panelDeRedes.setBackground(new Color(255, 255, 255));
        panelDeRedes.setLayout(null);
        GridBagConstraints gbc_panelDeRedes = new GridBagConstraints();
        gbc_panelDeRedes.fill = GridBagConstraints.BOTH;
        gbc_panelDeRedes.gridx = 0;
        gbc_panelDeRedes.gridy = 11;
        panelMenuPrincipal.add(panelDeRedes, gbc_panelDeRedes);
        
        linkedinJlabel = new JLabel("");
        linkedinJlabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirPageWeb("https://www.linkedin.com/in/mariorodriguez0609/");
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            	ImageIcon imgLin = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/Imagenes/linkedin.png")),30);
         		linkedinJlabel.setIcon(imgLin);
            }
            @Override
            public void mouseExited(MouseEvent e) {
            	ImageIcon imgLin = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/Imagenes/linkedin.png")),25);
         		linkedinJlabel.setIcon(imgLin);
            }
        });
        linkedinJlabel.setBounds(114, 0, 30, 30);
        ImageIcon imgLin = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/Imagenes/linkedin.png")),25);
		linkedinJlabel.setIcon(imgLin);
        panelDeRedes.add(linkedinJlabel);
        
        gitHubJlabel = new JLabel("");
        gitHubJlabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirPageWeb("https://github.com/marior102");
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            	ImageIcon imgGit = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/Imagenes/github.png")),30);
        		gitHubJlabel.setIcon(imgGit);
            }
            @Override
            public void mouseExited(MouseEvent e) {
            	ImageIcon imgGit = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/Imagenes/github.png")),25);
        		gitHubJlabel.setIcon(imgGit);
            }
        });
        gitHubJlabel.setBounds(147, 0, 30, 30);
		ImageIcon imgGit = (ImageIcon) Utilidades.setImage(new ImageIcon(getClass().getResource("/Imagenes/github.png")),25);
		gitHubJlabel.setIcon(imgGit);
        panelDeRedes.add(gitHubJlabel);

        getContentPane().add(barraDesplazamientoMenuPrincipal, java.awt.BorderLayout.WEST);

        panelOperaciones.setBackground(new java.awt.Color(255, 255, 255));
        panelOperaciones.setLayout(new java.awt.GridBagLayout());

        panelInicio.setBackground(new java.awt.Color(255, 255, 255));
        panelInicio.setLayout(new java.awt.GridBagLayout());
        
    
		gitHubJlabel.setIcon(imgGit);
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/inicio2.png"))); // NOI18N
        GridBagConstraints gbc_jLabel1 = new GridBagConstraints();
        gbc_jLabel1.gridx = 0;
        gbc_jLabel1.gridy = 0;
        panelInicio.add(jLabel1, gbc_jLabel1);

        barraDesplazamientoPanelOperaciones.setViewportView(panelInicio);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panelOperaciones.add(barraDesplazamientoPanelOperaciones, gridBagConstraints);

        getContentPane().add(panelOperaciones, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBorderPainted(false);

        itemAyuda.setIcon(new ImageIcon(getClass().getResource("/Imagenes/help.png"))); // NOI18N
        itemAyuda.setText("Ayuda");
        itemAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        itemAyuda.setIconTextGap(14);
        jMenuBar1.add(itemAyuda);

        itemAcercaDe.setIcon(new ImageIcon(getClass().getResource("/Imagenes/info.png"))); // NOI18N
        itemAcercaDe.setText("Acerca De");
        itemAcercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemAcercaDe.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        itemAcercaDe.setIconTextGap(14);
        jMenuBar1.add(itemAcercaDe);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 1031, 629);
        
		
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane barraDesplazamientoMenuPrincipal;
    public javax.swing.JScrollPane barraDesplazamientoPanelOperaciones;
    public javax.swing.JButton btnInicio;
    public javax.swing.JButton btnUnidades;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnMoneda;
    public javax.swing.JMenu itemAcercaDe;
    public javax.swing.JMenu itemAyuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbSubTitle;
    private javax.swing.JLabel lbTitleMenu;
    public javax.swing.JPanel panelInicio;
    public javax.swing.JPanel panelMenuPrincipal;
    public javax.swing.JPanel panelOperaciones;
    private GridBagConstraints gbc_btnMoneda;
    private GridBagConstraints gbc_btnUnidades;
    private GridBagConstraints gridBagConstraints_1;
    private JLabel JlabelDescripcion;
    private GridBagConstraints gridBagConstraints_2;
    private JLabel JlabelDescripcion_1;
    private JPanel panelDeRedes;
    private JLabel linkedinJlabel;
    private JLabel gitHubJlabel;
    // End of variables declaration//GEN-END:variables
    
    private void abrirPageWeb(String url){
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	
}