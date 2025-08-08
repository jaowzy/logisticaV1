package br.com.logistica.api.domain.cliente.validacao;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = TipoClienteValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoClienteValido {

    String message() default "Tipo de cliente inválido";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
