package org.example.models;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Entidad que representa un equipo del inventario.
 * <p>
 * Los métodos de acceso (getters y setters) se generan automáticamente
 * mediante la anotación {@link lombok.Data} de Lombok.
 * </p>
 */
@Data
@Entity
@Table(name="Equipo")
public class Equipo {

    /** Identificador único del equipo en la base de datos. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Nombre descriptivo del equipo. */
    private String nombre;

    /** Categoría a la que pertenece el equipo (por ejemplo, portátil o monitor). */
    private String categoria;

    /** Indica si el equipo está disponible para su uso. */
    private Boolean disponible;
}
