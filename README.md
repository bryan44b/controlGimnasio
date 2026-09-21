<div align="center">

 Control de acceso al gimnasio

Programación orientada a objetos en Java

ABSTRACCIÓN · HERENCIA · ENCAPSULAMIENTO · POLIMORFISMO

Membresías diferentes, reglas de acceso diferentes y una estructura común.

</div>

Objetivo de la actividad

Desarrollar una arquitectura de clases en Java que simule el control de acceso de un gimnasio. El programa debe reconocer el tipo de membresía de cada usuario, aplicar sus reglas de ingreso y administrar las visitas disponibles o los pases de invitado.

La actividad busca aplicar los cuatro conceptos principales de la programación orientada a objetos: abstracción, herencia, encapsulamiento y polimorfismo.

 Organización de las clases

Clase

Responsabilidad

Membresia

Es la clase abstracta que reúne el ID y el nombre del usuario. Define verificarAcceso() y permite mostrar los datos comunes mediante mostrarDatos().

MembresiaBasica

Administra las visitas restantes. Descuenta una por cada acceso autorizado y rechaza el ingreso cuando se agotan.

MembresiaPremium

Autoriza siempre al miembro y administra los pases para sus invitados.

Main

Crea los objetos, los almacena en un arreglo de tipo Membresia y simula los intentos de entrada.

 Aprendizajes de la actividad

01 · Abstracción

Una clase abstracta permite establecer una base para otras clases. En este caso, Membresia define los datos y las operaciones que comparten todas las membresías, pero deja que cada clase hija implemente su propia regla de acceso. Por ser abstracta, no se puede crear directamente un objeto de Membresia.

02 · Herencia

Las clases MembresiaBasica y MembresiaPremium reutilizan los atributos y métodos comunes de Membresia mediante extends. Sus constructores llaman a super() para inicializar los datos del usuario. Esto ayuda a organizar el código y evita repetir la misma información en ambas clases.

03 · Encapsulamiento

Los atributos visitasRestantes y pasesInvitado son privados. Su modificación se realiza dentro de los métodos de cada clase, de acuerdo con sus reglas. Así, Main solicita el acceso sin cambiar directamente los contadores. Los datos comunes, idMiembro y nombreUsuario, usan protected, como indica la actividad.

04 · Polimorfismo

Un arreglo de tipo Membresia puede contener objetos de ambas clases hijas. Al llamar a verificarAcceso() durante el recorrido, Java ejecuta la implementación correspondiente al objeto: la Básica revisa sus visitas y la Premium siempre autoriza al miembro.

Aprendizaje principal: una misma llamada a un método puede producir comportamientos diferentes según la clase del objeto que la recibe.

También se practica el uso de constructores, ciclos y valores boolean. La comprobación con instanceof y la conversión a MembresiaPremium permiten llamar a ingresarConInvitado(), un método que solo pertenece a esa clase.

 Simulación del programa

El ejemplo crea una membresía Básica con 2 visitas y una Premium con 1 pase de invitado. Cada miembro realiza tres intentos de acceso. Se supone que el Premium llega acompañado en cada intento, por lo que el pase se revisa dentro de ese mismo intento de entrada.

Intento

Miembro Básico

Miembro Premium

Invitado del Premium

1

Entra; queda 1 visita.

Entra.

Entra; se consume el pase.

2

Entra; quedan 0 visitas.

Entra.

No entra; no quedan pases.

3

No entra; no quedan visitas.

Entra.

No entra; no quedan pases.

Agotar el pase del invitado no impide que el miembro Premium entre solo.

 Ejecución

Coloca Main.java junto con las clases Membresia.java, MembresiaBasica.java y MembresiaPremium.java, implementadas según las instrucciones de la actividad. Si las cuatro clases están en la misma carpeta y no declaran un paquete, puedes compilarlas y ejecutarlas con un JDK instalado:

javac -encoding UTF-8 Main.java Membresia.java MembresiaBasica.java MembresiaPremium.java
java Main

Los mensajes de consola permiten observar los intentos de entrada y las decisiones de acceso. Esta simulación consume las visitas iniciales; la renovación mensual queda fuera del alcance de la actividad.

<div align="center">

Java · Programación orientada a objetos · Actividad académica

</div>
