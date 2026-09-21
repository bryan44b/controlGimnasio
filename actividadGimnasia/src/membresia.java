public abstract class membresia {

    protected String idMiembro;
    protected String nombreUsuario;

    public membresia(String idMiembro, String nombreUsuario){
        this.idMiembro = idMiembro;
        this.nombreUsuario = nombreUsuario;
    }

    public abstract boolean verificarAcceso();

    public void mostrarDatos(){
        System.out.println("El id del Usuario es: " + this.idMiembro);
        System.out.println("\nEl nombre del usuario es: " + this.nombreUsuario);
    }



}