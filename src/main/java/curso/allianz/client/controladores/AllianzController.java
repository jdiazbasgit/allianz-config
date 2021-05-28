package curso.allianz.client.controladores;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import lombok.val;

@RestController
@Data
public class AllianzController {
	@Value("${mensaje}")
	private String mensaje;

	@Value("${mensaje-service}")
	private String mensajeService;
	
	@GetMapping("/mensaje")
	public String mensaje() {
		return getMensaje();
	}
	
	@GetMapping("/mensajeService")
	public String mensajeService() {
		return getMensajeService();
	}

}
