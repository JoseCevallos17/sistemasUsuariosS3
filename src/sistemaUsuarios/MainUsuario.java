package sistemaUsuarios;

public class MainUsuario {
        public static void main(String[] args) {
            Usuario usuario = new Usuario();
            usuario.setUsername("jose_carlos");
            usuario.setCorreo("jose@example.com");
            usuario.setNivel(5);

            usuario.activar();

            System.out.println("--- PROYECTO 1: USUARIO DEL SISTEMA ---");
            System.out.println("Usuario: " + usuario.getUsername());
            System.out.println("Correo: " + usuario.getCorreo());
            System.out.println("Nivel: " + usuario.getNivel());
            System.out.println("¿Está activo?: " + usuario.isActivo());
        }
    }

