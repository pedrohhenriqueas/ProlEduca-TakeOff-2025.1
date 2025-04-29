package com.example.prol_educa.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cursos")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "instituicao_id")
    private Institutions institutions;

    @Column(name = "nome")
    private String name;

    @Column(name = "vagas")
    private Integer vacancies;

    @Column(name = "bolsa_percentual")
    private BigDecimal percentageScholarship;

    @Column(name = "valor_original")
    private BigDecimal originalValue;

    @Column(name = "valor_desconto")
    private BigDecimal discountValue;

    @Column(name = "turno")
    private String shift;

    @Column(name = "imagem_url")
    private String image_url;

    @Column(name = "desconto_entrada")
    private BigDecimal discountEntrance;

    @Column(name = "status")
    private boolean status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVacancies() {
		return vacancies;
	}

	public void setVacancies(Integer vacancies) {
		this.vacancies = vacancies;
	}

	

	public Courses(Institutions institutions, String name, Integer vacancies, BigDecimal percentageScholarship,
			BigDecimal originalValue, BigDecimal discountValue, String shift, String image_url,
			BigDecimal discountEntrance, boolean status) {
		this.institutions = institutions;
		this.name = name;
		this.vacancies = vacancies;
		this.percentageScholarship = percentageScholarship;
		this.originalValue = originalValue;
		this.discountValue = discountValue;
		this.shift = shift;
		this.image_url = image_url;
		this.discountEntrance = discountEntrance;
		this.status = status;
	}

	public Institutions getInstitutions() {
		return institutions;
	}

	public void setInstitutions(Institutions institutions) {
		this.institutions = institutions;
	}

	public BigDecimal getPercentageScholarship() {
		return percentageScholarship;
	}

	public void setPercentageScholarship(BigDecimal percentageScholarship) {
		this.percentageScholarship = percentageScholarship;
	}

	public BigDecimal getOriginalValue() {
		return originalValue;
	}

	public void setOriginalValue(BigDecimal originalValue) {
		this.originalValue = originalValue;
	}

	public BigDecimal getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(BigDecimal discountValue) {
		this.discountValue = discountValue;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public BigDecimal getDiscountEntrance() {
		return discountEntrance;
	}

	public void setDiscountEntrance(BigDecimal discountEntrance) {
		this.discountEntrance = discountEntrance;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Courses() {}

}
