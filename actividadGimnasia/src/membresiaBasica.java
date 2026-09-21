public class membresiaBasica extends membresia {
    private int visitasRestantes;
    public membresiaBasica(String idMiembro, String nombreUsuario, int visitasRestantes ){
        super(idMiembro, nombreUsuario);
        this.visitasRestantes = visitasRestantes;
    }

    @Override
    public boolean verificarAcceso() {
      if(visitasRestantes>0){
          visitasRestantes-=1;
          System.out.println("Bienvenido, le quedan " + visitasRestantes + " visitas restantes");
          return true;
      }else{
          System.out.println("\nNo hay visitas restantes");
          return false;
      }
    }





}
