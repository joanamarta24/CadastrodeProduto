package dto;

import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;

public record ProdutoDTO(
        @NotBlank(message ="O nome não pode ser vazio.")
        String nome,

        @NotNull(message = "O preço é obrigatorio.")
        @Positive(message = "O preço deve ser um valor positivo.")
        Double preco,

        @NotNull (message = "O campo 'emEstoque' é obrigatório.")
        Boolean emEstoque

        ) {
}
