package api.urbuy.domain.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;

public record registerUserData(
        @NotBlank(message = "O nome não pode ser vazio")
        String name,
        @NotBlank(message = "O nome não pode ser vazio")
        @Email(message = "Email inválido")
        String email,
        @NotBlank(message = "O CNPJ não pode ser vazio")
        @CNPJ(message = "CNPJ inválido")
        String cnpj,
        @NotBlank(message = "A senha não pode ser")
        String password,
        @NotBlank(message = "A confirmação de senha não pode ser vazia")
        String confirm_password
) {

}
