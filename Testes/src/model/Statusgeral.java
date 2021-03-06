package model;
// Generated 03/01/2016 21:12:32 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Statusgeral generated by hbm2java
 */
public class Statusgeral  implements java.io.Serializable {


     private Integer idStatus;
     private String descricaoStatus;
     private Set modalidadeses = new HashSet(0);
     private Set alunoses = new HashSet(0);
     private Set planoses = new HashSet(0);

    public Statusgeral() {
    }

	
    public Statusgeral(String descricaoStatus) {
        this.descricaoStatus = descricaoStatus;
    }
    public Statusgeral(String descricaoStatus, Set modalidadeses, Set alunoses, Set planoses) {
       this.descricaoStatus = descricaoStatus;
       this.modalidadeses = modalidadeses;
       this.alunoses = alunoses;
       this.planoses = planoses;
    }
   
    public Integer getIdStatus() {
        return this.idStatus;
    }
    
    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }
    public String getDescricaoStatus() {
        return this.descricaoStatus;
    }
    
    public void setDescricaoStatus(String descricaoStatus) {
        this.descricaoStatus = descricaoStatus;
    }
    public Set getModalidadeses() {
        return this.modalidadeses;
    }
    
    public void setModalidadeses(Set modalidadeses) {
        this.modalidadeses = modalidadeses;
    }
    public Set getAlunoses() {
        return this.alunoses;
    }
    
    public void setAlunoses(Set alunoses) {
        this.alunoses = alunoses;
    }
    public Set getPlanoses() {
        return this.planoses;
    }
    
    public void setPlanoses(Set planoses) {
        this.planoses = planoses;
    }


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((alunoses == null) ? 0 : alunoses.hashCode());
		result = prime * result
				+ ((descricaoStatus == null) ? 0 : descricaoStatus.hashCode());
		result = prime * result
				+ ((idStatus == null) ? 0 : idStatus.hashCode());
		result = prime * result
				+ ((modalidadeses == null) ? 0 : modalidadeses.hashCode());
		result = prime * result
				+ ((planoses == null) ? 0 : planoses.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Statusgeral))
			return false;
		Statusgeral other = (Statusgeral) obj;
		if (alunoses == null) {
			if (other.alunoses != null)
				return false;
		} else if (!alunoses.equals(other.alunoses))
			return false;
		if (descricaoStatus == null) {
			if (other.descricaoStatus != null)
				return false;
		} else if (!descricaoStatus.equals(other.descricaoStatus))
			return false;
		if (idStatus == null) {
			if (other.idStatus != null)
				return false;
		} else if (!idStatus.equals(other.idStatus))
			return false;
		if (modalidadeses == null) {
			if (other.modalidadeses != null)
				return false;
		} else if (!modalidadeses.equals(other.modalidadeses))
			return false;
		if (planoses == null) {
			if (other.planoses != null)
				return false;
		} else if (!planoses.equals(other.planoses))
			return false;
		return true;
	}




}


