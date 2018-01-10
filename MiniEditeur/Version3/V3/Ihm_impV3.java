package V3;
import invoker.EditeurTexte;
import invoker.Ihm_ImpV1;
import invoker.Ihm_impV2;

/**
 * 
 */

/**
 * @author DIANA
 *
 */
public class Ihm_impV3 extends Ihm_ImpV1 {
	private javax.swing.JMenu jMenuDefaire;
	private javax.swing.JMenu jMenuDelete;
	private javax.swing.JMenu jMenuSave;
	private javax.swing.JMenu jMenuReplay;
	private javax.swing.JMenu jMenuStop;
	private EditeurTexte TextArea;
	
	
	@SuppressWarnings("static-access")
	public Ihm_impV3() {
		super();
		 initComponents();
		
		//Ihm Ihm_ImpV1= new Ihm_ImpV1();
		
	}
	
	private void initComponents() {
    	//selection = new Selection();
	//	pressePapier = "";
		//cmds = new HashMap<String, Command>();
		jMenuSave = new javax.swing.JMenu();
		jMenuStop = new javax.swing.JMenu();
		jMenuReplay = new javax.swing.JMenu();
		jMenuDefaire = new javax.swing.JMenu();
		jMenuDelete = new javax.swing.JMenu();
		TextArea =  new EditeurTexte(this);
		setTitle("Mini Editeur Version3");
	    jMenuSave.setText("Save");
	    jMenuSave.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) { 
	            	 invoke("Save");
	            	 jMenuSave.setEnabled(false);
	            	 jMenuReplay.setEnabled(true);
					 TextArea.requestFocusInWindow(); 
	            }
	           
	
	});
	    
	    jMenuStop .setText("Stop");
	    jMenuStop.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) { 
	            	invoke("arreter");
	            	 jMenuSave.setEnabled(true);
					TextArea.requestFocusInWindow();
	            }
	           
	
	});
	  
	 jMenuReplay.setText("Replay");
	 jMenuReplay.setEnabled(false);
	 jMenuReplay.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) { 
	            	invoke("rejouer");
	            	 jMenuReplay.setEnabled(false);
					TextArea.requestFocusInWindow();
	            }
	           
	
	});
	   
	 jMenuDefaire.setText("Retour");
	// jMenuDefaire.setEnabled(true);
	 jMenuDefaire.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) { 
	            	invoke("RetourArriere");
	            	// jMenuDefaire.setEnabled(true);
					TextArea.requestFocusInWindow();
	            }
	           
	
	});
	 
	 jMenuDelete.setText("Delete");
		// jMenuDefaire.setEnabled(true);
		 jMenuDelete.addMouseListener(new java.awt.event.MouseAdapter() {
		            public void mouseClicked(java.awt.event.MouseEvent evt) { 
		            	invoke("supprimer");
		            	// jMenuDefaire.setEnabled(true);
						TextArea.requestFocusInWindow();
		            }
		           
		
		});
	    pack();
	    Ihm_impV3.getjMenuBar1().add(jMenuSave);
	    Ihm_impV3.getjMenuBar1().add(jMenuStop);
	    Ihm_impV3.getjMenuBar1().add(jMenuReplay);
	    Ihm_impV3.getjMenuBar1().add(jMenuDefaire);
	    Ihm_impV3.getjMenuBar1().add(jMenuDelete);
	   
	    this.setVisible(true);		
		TextArea.requestFocusInWindow();
	}
}
