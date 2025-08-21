package br.com.fiap.IACreator.character;

import java.time.LocalDate;

import br.com.fiap.IACreator.character.enums.Species;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Charater {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "{character.name.notblank}")
    @Size(min = 3, max = 40, message = "{character.name.size}")
    private String name;

    @NotNull(message = "{character.species.notnull}")
    private Species species;


    @NotNull(message = "{character.startingLevel.notnull}")
    @Min(value = 1, message = "{character.startingLevel.min}")
    @Max(value = 100, message = "{character.startingLevel.max}")
    private int startingLevel;

    @NotBlank(message = "{character.specialAbility.notblank}")
    @Size(max = 60, message = "{character.specialAbility.size}")
    private String specialAbility;

    @Size(max = 200, message = "{character.bio.size}")
    private String bio;

    @NotNull(message = "{character.creationDate.notnull}")
    @PastOrPresent(message = "{character.creationDate.pastOrPresent}")
    private LocalDate creationDate;

    
}
