package uniquindio.analisis.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uniquindio.analisis.model.Opcion;
import uniquindio.analisis.model.Pregunta;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResultadoDTO {
    Opcion opcionCorrecta;
    Opcion opcionMarcada;
    Pregunta pregunta;

}
