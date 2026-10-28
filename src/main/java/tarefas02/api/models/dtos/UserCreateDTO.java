package tarefas02.api.models.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor 
@NoArgsConstructor 
@Data 

public class UserCreateDTO {

     // Nome do usuario, nao pode ser nulo, tamanho minimo 2 e maximo 100 caracteres
    @NotBlank
    @Size(min = 2, max = 100)
    private String username;

    // Senha do usuario, nao pode ser nulo, tamanho minimo 8 e maximo 60 caracteres
    @NotBlank
    @Size(min = 8, max = 60)
    private String password;

   
    
}
