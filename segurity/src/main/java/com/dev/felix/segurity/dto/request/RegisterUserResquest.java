package com.dev.felix.segurity.dto.request;
import jakarta.validation.constraints.NotEmpty;

public record RegisterUserResquest(@NotEmpty(message = "Nome é obrigatório") String name,
                                   @NotEmpty(message = "Email é obrigatório") String email,
                                   @NotEmpty(message = "Senha é obrigatória") String password) {
}
