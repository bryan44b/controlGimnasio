public class Main {
    public static void main(String[] args) {
        membresiaBasica basica = new membresiaBasica("001", "Bryan", 2);
        membresiaPremium premium = new membresiaPremium("002", "Ana", 1);

        membresia[] membresias = {basica, premium};

        for (int intento = 1; intento <= 3; intento++) {
            System.out.println("\n--- Intento de acceso " + intento + " ---");

            for (membresia membresia : membresias) {
                membresia.mostrarDatos();

                boolean accesoPermitido = membresia.verificarAcceso();

                if (accesoPermitido && membresia instanceof membresiaPremium) {
                    membresiaPremium miembroPremium = (membresiaPremium) membresia;
                    miembroPremium.ingresarConInvitado();
                }

                System.out.println();
            }
        }
    }
}