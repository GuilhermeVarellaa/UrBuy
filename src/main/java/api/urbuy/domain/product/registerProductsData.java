package api.urbuy.domain.product;

import jakarta.validation.constraints.NotBlank;

public record registerProductsData(
        @NotBlank(message = "O nome do produto não pode ser vazio")
        String name,
        @NotBlank(message = "A descrção do produto não pode ser vazio")
        String description,
        @NotBlank(message = "O preço do produto não pode ser vazio")
        String price,
        @NotBlank(message = "A quantidade do produto não pode ser vazio")
        String amount,
        @NotBlank(message = "A imagem não pode ser vazia")
        String img,
        @NotBlank(message = "A marcar não pode ser vazia")
        String brand,
        @NotBlank(message = "A categoria não pode ser vazia")
        String category
) {
}
