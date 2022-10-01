package uniquindio.analisis.model;

import javax.persistence.*;

import lombok.*;
@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer documento;

    @Column(length = 50)
    private String nombre;

    @Column(length = 50)
    private String contrasenia;

    @ManyToOne
    private TipoUsuario tipoUsuario;
}
