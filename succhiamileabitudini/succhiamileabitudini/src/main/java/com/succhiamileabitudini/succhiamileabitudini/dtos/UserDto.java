package com.succhiamileabitudini.succhiamileabitudini.dtos;

import lombok.*;

import javax.validation.constraints.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @NotBlank(message = "no")
    @NotEmpty(message = "no")
    @NotNull(message = "no")
    private String nome;
    @NotBlank(message = "no")
    @NotEmpty(message = "no")
    @NotNull(message = "no")
    private String cognome;

    @Email(message = "invalid email")
    private String email;

    @Pattern(regexp = "^[A-Z]{6}\\d{2}[A-Z]\\d{2}[A-Z]\\d{3}[A-Z]$")
    private String cf;
}
