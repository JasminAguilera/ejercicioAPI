package com.example.ejercicioapig5.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "comentario_api")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comentarioId;

    @NotNull
    private String comentarioTexto;

    @NotNull
    private String comentarioFecha;

    @ManyToOne
    @JoinColumn(name = "tarea_id", nullable = false)
    private Tarea tarea;
}


