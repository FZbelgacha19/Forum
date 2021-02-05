package com.formation.msglc.entities;


import javax.persistence.*;

@Entity
public class EchangeManager{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEchange;
	
	private String FromTo;
	private Long idMessage;

	public EchangeManager() {
		super();
	}

	public EchangeManager(String fromTo, Long idMessage) {
		super();
		FromTo = fromTo;
		this.idMessage = idMessage;
	}

	public Long getIdEchange() {
		return idEchange;
	}

	public void setIdEchange(Long idEchange) {
		this.idEchange = idEchange;
	}

	public String getFromTo() {
		return FromTo;
	}

	public void setFromTo(String fromTo) {
		FromTo = fromTo;
	}

	public Long getIdMessage() {
		return idMessage;
	}

	public void setIdMessage(Long idMessage) {
		this.idMessage = idMessage;
	}
	
	
   
}
