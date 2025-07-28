package com.example.idol.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "artists")
@Data
@NoArgsConstructor
public class Artist {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Integer artistId;
	@NotEmpty
	private String artistName;
	@NotEmpty
	private String artistHiraganaName;
	//エンティティの値の書き換え
	@NotEmpty
	private String artistArtUrl;
	
	

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="artistId")
	List<Member> members;
}
