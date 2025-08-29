package heroes;

public interface Heroes {
    
    public void crearHeroe(String nombre, int puntosVida, int armadura);
    
    public void crearVillano(String nombre, int puntosVida, int fuerza, int armadura);
    
    public void asignarPoder(String personaje, String nombrePoder, int fuerza, int turnos);
    
    public void batalla();
    
    public void mostrarPersonajes();
}