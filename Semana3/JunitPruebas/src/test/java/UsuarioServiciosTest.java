
import org.example.UsuarioDTO;
import org.example.UsuarioServicio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsuarioServiciosTest {

    @Test
    public void test1(){
        UsuarioDTO esperado = new UsuarioDTO(1L,"Cristian");
        UsuarioServicio usuarioServicio = new UsuarioServicio();
        final UsuarioDTO reslutado = usuarioServicio.crearUsuario(1L,"cristian");
        //Assertions.assertEquals(esperado.getId(),reslutado.getId());
        //Assertions.assertEquals(esperado.getNombre(),reslutado.getNombre(),"Los nombres son diferentes");
        Assertions.assertNotEquals(esperado,reslutado);

    }
}
