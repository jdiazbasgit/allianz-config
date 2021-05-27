package curso.allianz.client.dtos;

import java.util.List;

import curso.allianz.client.enitidaddes.Authority;
import lombok.Data;
@Data
public class UserDto {

	private String user;
	
	private String token;
	
	private List <Authority> rol;

	
	

}