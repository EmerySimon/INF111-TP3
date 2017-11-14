/**
 * Classe pour les docteurs. 
 * 
 * Ls d�partement peuvent �tre : 	Clinique.CHIRURGIE, 
 * Clinique.UROLOGIE ou Clinique.URGENCE
 * 
 * Dans le cadre du cours inf111, travail pratique num�ro 3
 * (voir �nonc� INF111 A17 tp3 partie 1 fourni).
 * 
 * @author Pierre B�lisle
 * @version Copyright A2017
 */
package clinique;

import java.io.Serializable;

public class Docteur extends Participant implements Serializable{

    private static final long serialVersionUID = 1L;

    private int               numDepartement;


    /**
     * Cr�e un docteur avec l'identification et le num�ro de
     * d�partement fournis � l'appel.
     * 
     * @param identification
     *        Doit �tre non null (aucune validation).
     * @param numDepartement
     *        Le num�ro qui peut �tre Clinique.UROLOGIE...
     * 
     */
    public Docteur(Identification unIdentification, int numDepartement) {
        
        super(unIdentification);
        this.numDepartement = numDepartement;
        
    }


    /**
     * @return Le num�ro de departement.
     */
    public int getNumDepartement() {
        return numDepartement;
    }


    /**
     * @param numDepartement
     *        Le num�ro de departement � utiliser.
     */
    public void setNumDepartement(int numDepartement) {
        this.numDepartement = numDepartement;
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Docteur other = (Docteur) obj;
        if (this.getIdentification() == null)
            if (other.getIdentification() != null)
                return false;
            
        if (!this.getIdentification().equals(other.getIdentification()))
            return false;
        
        if(this.numDepartement != other.numDepartement)
            return false;
            
        return true;
    }


    @Override
    public String toString() {

        // La partie identification laiss�e au parent.
        return "Nom : " + this.getIdentification().getNom() + "    " + "Pr�nom : " + this.getIdentification().getPrenom() + "   " + "Departement   :   " + Clinique.getNumDepartement2String(numDepartement);
    }
}
