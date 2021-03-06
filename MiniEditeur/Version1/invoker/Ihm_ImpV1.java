package invoker;


import java.util.HashMap;
import javax.swing.JFrame;
import command.Command;
import observer.Subject;
import receiver.MoteurEditeur_Impl;
import receiver.Selection;

@SuppressWarnings("serial")
public class Ihm_ImpV1 extends javax.swing.JFrame implements Ihm {
	    private EditeurTexte TextArea = null;
	    private javax.swing.JLabel jLabelPressePapier;
	    private javax.swing.JLabel jLabelSelection;
	    private static javax.swing.JMenuBar jMenuBar1;
	    private javax.swing.JMenu jMenuColler;
	    private javax.swing.JMenu jMenuCopier;
	    private javax.swing.JMenu jMenuCouper;
	    private javax.swing.JScrollPane jScrollPane1;
	    private Selection selection;
		private String inputCharacter;
		private String pressePapier;
		private HashMap<String, Command> cmds = null;
	    // End of variables declaration               
    /**
     * Creates new form NewJFrame
     */
    public Ihm_ImpV1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    	selection = new Selection();
		pressePapier = "";
		cmds = new HashMap<String, Command>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea =  new EditeurTexte(this);
        jLabelPressePapier = new javax.swing.JLabel();
        jLabelSelection = new javax.swing.JLabel();
        setjMenuBar1(new javax.swing.JMenuBar());
        jMenuCopier = new javax.swing.JMenu();
        jMenuColler = new javax.swing.JMenu();
        jMenuCouper = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Editeur Version1");
        setBackground(new java.awt.Color(153, 204, 255));
        setName("FrameV1"); // NOI18N

        TextArea.addCaretListener(TextArea);
		TextArea.addKeyListener(TextArea);
        jScrollPane1.setViewportView(TextArea);
        jLabelPressePapier.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabelPressePapier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setPressePapierLabelTexte(" ");

        jLabelSelection.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabelSelection.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSelection.setLabelFor(jLabelPressePapier);
        jLabelSelection.setText("Debut Selection:   / Fin Selection:   ");
        
		setSelectionLabelTexte(selection.getDebut() , selection.getFin());

        jMenuCopier.setText("Copier");
        jMenuCopier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {                                        
		        
				invoke("copier");
				TextArea.requestFocusInWindow();
			}

			
		});
        getjMenuBar1().add(jMenuCopier);

        jMenuColler.setText("Coller");
        jMenuColler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) { 
            	invoke("coller");
				TextArea.requestFocusInWindow();
            }
        });
        getjMenuBar1().add(jMenuColler);

        jMenuCouper.setText("Couper");
        jMenuCouper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) { 
            	invoke("couper");
				TextArea.requestFocusInWindow();
            }
        });
        getjMenuBar1().add(jMenuCouper);

        setJMenuBar(getjMenuBar1());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPressePapier, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPressePapier, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		TextArea.requestFocusInWindow();
    }// </editor-fold>                        

                                             

    /**
     * @param args the command line arguments
     */
   

    /**
	 * returns the property selection of this object
	 * 
	 * @return non-null Selection reference
	 */
	public Selection getSelection() {
		return selection;
	}

	/**
	 * set the property selection of this object
	 * 
	 * @param debut
	 *            the begining index
	 * @param fin
	 *            the ending index
	 */
	public void setSelection(int debut, int fin) {
		selection.setPosition(debut, fin);
	}

	/**
	 * Getter
	 * 
	 * @return le texte entr�
	 */
	public String getInputCharacter() {
		return inputCharacter;
	}

	/**
	 * Setter
	 * 
	 * @param inputCharacter
	 *            : texte entr�
	 */
	public void setInputCharacter(String inputCharacter) {
		this.inputCharacter = inputCharacter;
	}

	/**
	 * Getter
	 * 
	 * @return presse papier
	 */
	public String getPressePapier() {
		return pressePapier;
	}

	/**
	 * Setter
	 * 
	 * @param pressePapier
	 *            : presse papier
	 */
	public void setPressePapier(String pressePapier) {
		this.pressePapier = pressePapier;
	}
	
	/**
	 * Modifie le texte du label renseignant sur l'�tat de la selection
	 * @param debut
	 * 				Position de d�but de la selection
	 * @param fin
	 * 				Position de fin de la selection
	 */
	public void setSelectionLabelTexte(int debut, int fin){
		jLabelSelection.setText("Debut Selection: " + debut + " | Fin Selection: " + fin);
	}
	
	/**
	 * Modifie le texte du label renseignant sur l'�tat du presse papier
	 * @param texte 
	 * 				Etat du presse papier
	 */
	public void setPressePapierLabelTexte(String texte){
		jLabelPressePapier.setText("Presse papier: " + texte);
	}
	
	/**
	 * Ajoute une commande � la hashmap
	 * 
	 * @param keyword
	 *            : mot cl�
	 * @param cmd
	 *            : commande
	 */
	public void addCommand(String keyword, Command cmd) {
		if ((keyword == null) || (cmd == null)) {
			throw new IllegalArgumentException("aucun param�tre");
		}
		cmds.put(keyword, cmd);
	}

	/**
	 * Execute une commande
	 * 
	 * @param cmd
	 *            : commande
	 */
	public void invoke(String cmd) {
		if (cmds.containsKey(cmd)){
			cmds.get(cmd).execute();
		
	}
		else {
			throw new IllegalArgumentException(cmd + " n'est pas une commande valide");
	}
}
	/**
	 * 
	 * @param subject
	 */
	public void update(Subject subject) {
		MoteurEditeur_Impl moteurEdition = (MoteurEditeur_Impl) subject;
		String texteBuffer = moteurEdition.getBuffer().getBufferTexte();
		String textePp = moteurEdition.getPressePapier().getContent();
		int debutSelec = moteurEdition.getSelection().getDebut();
		int finSelect = moteurEdition.getSelection().getFin();
		
		TextArea.setText(texteBuffer);
		TextArea.requestFocusInWindow(); //Restitution du focus � la zone de texte
		//Repositionnement de la selection courante
		TextArea.setSelectionStart(debutSelec);
		TextArea.setSelectionEnd(finSelect);
		//Actualisation des labels d'�tat du presse-papier et de la selection
		setPressePapierLabelTexte(textePp);
		System.out.println(textePp);
		setSelectionLabelTexte(debutSelec, finSelect);
		
	}

	/**
	 * @return the jMenuBar1
	 */
	public static javax.swing.JMenuBar getjMenuBar1() {
		return jMenuBar1;
	}

	/**
	 * @param jMenuBar1 the jMenuBar1 to set
	 */
	public static void setjMenuBar1(javax.swing.JMenuBar jMenuBar1) {
		Ihm_ImpV1.jMenuBar1 = jMenuBar1;
	}	
}

