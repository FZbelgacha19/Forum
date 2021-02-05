package com.formation.msglc.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

@Entity
public class Discussion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDiscussion;

	@ManyToOne
	@JoinColumn(name = "idFrom")
	private Auteur idFrom;

	private Long idTo;

	private Long SendBy; // dernier auteur envoyer un msg dans un discussion

	public Discussion() {
		super();
	}

	public Discussion(Long idTo, Long SendBy) {
		super();
		this.idTo = idTo;

	}

	public Long getIdDiscussion() {
		return idDiscussion;
	}

	public void setIdDiscussion(Long idDiscussion) {
		this.idDiscussion = idDiscussion;
	}

	public Auteur getIdFrom() {
		return idFrom;
	}

	public void setIdFrom(Auteur idFrom) {
		this.idFrom = idFrom;
	}

	public Long getIdTo() {
		return idTo;
	}

	public void setIdTo(Long idTo) {
		this.idTo = idTo;
	}

	public Long getSendBy() {
		return SendBy;
	}

	public void setSendBy(Long sendBy) {
		SendBy = sendBy;
	}

}
