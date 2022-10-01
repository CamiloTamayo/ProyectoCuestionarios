package uniquindio.analisis.model;

import javax.persistence.*;

import lombok.*;

import java.util.List;

@Entity
@Data
public class TipoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50)
    private String nombre;

    @OneToMany
    private List<Usuario> usuarios;

}
