/**
 * 
 */
package invoker;

import java.util.HashMap;
import java.awt.event.ActionEvent;
import command.Command;
import receiver.Selection;

/**
 * @author DIANA
 *
 */
@SuppressWarnings("serial")
public class Ihm_impV2 extends Ihm_ImpV1{
	private javax.swing.JMenu jMenuSave;
	private javax.swing.JMenu jMenuReplay;
	private javax.swing.JMenu jMenuStop;
	private EditeurTexte TextArea;
	
	
	@SuppressWarnings("static-access")
	public Ihm_impV2() {
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
		TextArea =  new EditeurTexte(this);
		setTitle("Mini Editeur Version2");
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
	    
	    pack();
	    Ihm_impV2.getjMenuBar1().add(jMenuSave);
	    Ihm_impV2.getjMenuBar1().add(jMenuStop);
	    Ihm_impV2.getjMenuBar1().add(jMenuReplay);
	   
	    this.setVisible(true);		
		TextArea.requestFocusInWindow();
	}
	
	
}
 