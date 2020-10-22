package com.projet.stock.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name = "llivrs")
public class Llivrs {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private int numero;
	  private String ligne;
	  private String Libart;
	  private double pu;
	  private int qte;
	  private int tva;
	  private int rem;
	  private int fodec;
	  private double totht;
	  private double totrem;
	  private double totfodec;
	  private double tottva;
	  private double totttc;
	  @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	  @JsonBackReference
	  private Livrs livrs;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getLigne() {
		return ligne;
	}
	public void setLigne(String ligne) {
		this.ligne = ligne;
	}
	public String getLibart() {
		return Libart;
	}
	public void setLibart(String libart) {
		Libart = libart;
	}
	public double getPu() {
		return pu;
	}
	public void setPu(double pu) {
		this.pu = pu;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public int getTva() {
		return tva;
	}
	public void setTva(int tva) {
		this.tva = tva;
	}
	public int getRem() {
		return rem;
	}
	public void setRem(int rem) {
		this.rem = rem;
	}
	public int getFodec() {
		return fodec;
	}
	public void setFodec(int fodec) {
		this.fodec = fodec;
	}
	public double getTotht() {
		return totht;
	}
	public void setTotht(double totht) {
		this.totht = totht;
	}
	public double getTotrem() {
		return totrem;
	}
	public void setTotrem(double totrem) {
		this.totrem = totrem;
	}
	public double getTotfodec() {
		return totfodec;
	}
	public void setTotfodec(double totfodec) {
		this.totfodec = totfodec;
	}
	public double getTottva() {
		return tottva;
	}
	public void setTottva(double tottva) {
		this.tottva = tottva;
	}
	public double getTotttc() {
		return totttc;
	}
	public void setTotttc(double totttc) {
		this.totttc = totttc;
	}
	public Livrs getLivrs() {
		return livrs;
	}
	public void setLivrs(Livrs livrs) {
		this.livrs = livrs;
	}
	public Llivrs(long id, int numero, String ligne, String libart, double pu, int qte, int tva, int rem, int fodec,
			double totht, double totrem, double totfodec, double tottva, double totttc, Livrs livrs) {
		super();
		this.id = id;
		this.numero = numero;
		this.ligne = ligne;
		Libart = libart;
		this.pu = pu;
		this.qte = qte;
		this.tva = tva;
		this.rem = rem;
		this.fodec = fodec;
		this.totht = totht;
		this.totrem = totrem;
		this.totfodec = totfodec;
		this.tottva = tottva;
		this.totttc = totttc;
		this.livrs = livrs;
	}
	@Override
	public String toString() {
		return "Llivrs [id=" + id + ", numero=" + numero + ", ligne=" + ligne + ", Libart=" + Libart + ", pu=" + pu
				+ ", qte=" + qte + ", tva=" + tva + ", rem=" + rem + ", fodec=" + fodec + ", totht=" + totht
				+ ", totrem=" + totrem + ", totfodec=" + totfodec + ", tottva=" + tottva + ", totttc=" + totttc
				+ ", livrs=" + livrs + "]";
	}
	public Llivrs() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
