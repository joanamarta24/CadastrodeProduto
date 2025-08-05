package cadastrarproduto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@Entity
public class Produto {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @NotNull(message = "Nome do produto é obrigatório")
 private String nome;

 private double preco;
 private boolean emEstoque;

}

