package com.formation.msglc.models;

/*
 * je cree cet classe pour recuperer les donnees de fichier jsp vers controller
 */
public class Echange {
	private Long idMsg;
	private Long idFrom;
	private Long idTo;
	private String contenu;

	public Echange(Long idMsg, Long idFrom, Long idTo, String contenu) {
		super();
		this.idMsg = idMsg;
		this.idFrom = idFrom;
		this.idTo = idTo;
		this.contenu = contenu;
	}

	public Echange(Long idMsg, Long idFrom, Long idTo) {
		super();
		this.idMsg = idMsg;
		this.idFrom = idFrom;
		this.idTo = idTo;
	}

	public Echange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdFrom() {
		return idFrom;
	}

	public void setIdFrom(Long idFrom) {
		this.idFrom = idFrom;
	}

	public Long getIdTo() {
		return idTo;
	}

	public void setIdTo(Long idTo) {
		this.idTo = idTo;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Long getIdMsg() {
		return idMsg;
	}

	public void setIdMsg(Long idMsg) {
		this.idMsg = idMsg;
	}

	@Override
	public String toString() {
		return "Echange [idMsg=" + idMsg + ", idFrom=" + idFrom + ", idTo=" + idTo + ", contenu=" + contenu + "]";
	}

}
