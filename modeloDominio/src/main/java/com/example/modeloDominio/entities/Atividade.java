package com.example.modeloDominio.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_atividade")
public class Atividade {


	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    private String nome;
	    
	    private String descricao;
	    
	    private Double preco;

	    @ManyToMany
	    @JoinTable(name = "tb_atividade_participante",
	            joinColumns = @JoinColumn(name = "atividade_id"),
	            inverseJoinColumns = @JoinColumn(name = "participante_id"))    
	    private List<Participante> participantes;
	

}
