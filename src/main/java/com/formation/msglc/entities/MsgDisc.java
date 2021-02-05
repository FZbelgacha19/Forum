package com.formation.msglc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MsgDisc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long idDisc;
	
	@Column(columnDefinition="TEXT")
	private String msg;
	private String envoipar;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateenvoi;
		
	public MsgDisc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MsgDisc(String msg, String envoipar, Long idDisc) {
		super();
		this.msg = msg;
		this.envoipar = envoipar;
		this.idDisc = idDisc;
		this.dateenvoi = new Date();
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getEnvoipar() {
		return envoipar;
	}
	public void setEnvoipar(String envoipar) {
		this.envoipar = envoipar;
	}
	public Date getDateenvoi() {
		return dateenvoi;
	}
	public void setDateenvoi(Date dateenvoi) {
		this.dateenvoi = dateenvoi;
	}
	@Override
	public String toString() {
		return "MsgDisc [msg=" + msg + ", envoipar=" + envoipar + ", dateenvoi=" + dateenvoi + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdDisc() {
		return idDisc;
	}
	public void setIdDisc(Long idDisc) {
		this.idDisc = idDisc;
	}
	
	
}
