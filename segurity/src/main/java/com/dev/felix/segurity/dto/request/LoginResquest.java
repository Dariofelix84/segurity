package com.dev.felix.segurity.dto.request;

import jakarta.validation.constraints.NotEmpty;

public record LoginResquest(@NotEmpty(message = "Email é obrigatório") String email,
                            @NotEmpty(message = "Senha é obrigatória") String password) {

}
