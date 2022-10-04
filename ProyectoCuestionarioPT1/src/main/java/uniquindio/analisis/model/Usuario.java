package uniquindio.analisis.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "usuario")
    private List<Test> tests;
}
