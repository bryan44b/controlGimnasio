public class membresiaPremium extends membresia {
    private int pasesInvitado;

    public membresiaPremium(String idMiembro, String nombreUsuario, int pasesInvitado){
       super(idMiembro, nombreUsuario);
       this.pasesInvitado = pasesInvitado;
    }

    @Override
    public boolean verificarAcceso() {
        System.out.println("Bienvenido!");
        return true;
    }

    public boolean ingresarConInvitado(){
        if(pasesInvitado > 0 ){
            pasesInvitado=-1;
            System.out.println("Bienvenido, invitado");
            return true;
        }else{
            System.out.println("No quedan pases de invitado");
            return false;
        }
    }
}
