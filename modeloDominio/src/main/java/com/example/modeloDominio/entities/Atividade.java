package com.example.modeloDominio.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

	    @OneToMany(mappedBy = "atividade")
	    private List<Bloco> blocos;
	    
	    @ManyToOne
	    @JoinColumn(name = "categoria_id")
	    private Categoria categoria;
	    
	    
	    @ManyToMany(mappedBy = "atividades")
	    private List<Participante> participantes;
	
}
