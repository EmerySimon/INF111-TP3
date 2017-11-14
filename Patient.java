/**
 * Classe pour les patients.
 * 
 * Dans le cadre du cours inf111, travail pratique num�ro 3
 * (voir �nonc� INF111 A17 tp3 partie 1 fourni).
 * 
 * @author Pierre B�lisle
 * @version Copyright A2017
 */
package clinique;

import java.io.Serializable;

public class Patient extends Participant implements Serializable{

    private static final long serialVersionUID = 1L;

    private String            nas;



    /**
     * Cr�e un patient avec l'identification et le num�ro d'assurance social
     * fournis � l'appel.
     * 
     * @param identificationParticipant
     * @param nas
     */
    public Patient(Identification identification, String nas) {

        super(identification);
        this.nas = nas;

    }


    /**
     * @return Le num�ro d'assurance social.
     */
    public String getNas() {
        return nas;
    }

    
    /**
     * @param nas
     *        Le num�ro d'assurance social � utiliser.
     */
    public void setNas(String nas) {
        this.nas = nas;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Patient other = (Patient) obj;
        if (this.getIdentification() == null)
            if (other.getIdentification() != null)
                return false;
            
        if (!this.getIdentification().equals(other.getIdentification()))
            return false;
        
        if(this.nas != other.nas)
            return false;
            
        return true;
    }


    @Override
    public String toString() {

        // La partie identification laiss�e au parent.
        return "Nom : " + this.getIdentification().getNom() + "    " + "Pr�nom : " + this.getIdentification().getPrenom() + "   " + "NAS : " + nas;
    }
}
