package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "generos")
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
private int id;
 private String nome;
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}   
}
