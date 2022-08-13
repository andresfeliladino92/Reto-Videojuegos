# Reto-Videojuegos

HABILITACIÓN – PROGRAMACIÓN BÁSICA
CONTEXTO
La empresa desarrolladora de videojuegos Bugland ha comenzado el desarrollo de uno de sus nuevos títulos. 
El juego será desarrollado en Java en un ambiente bidimensional (2-D) y enfocado para usuarios de PC inicialmente.
Usted ha sido contratado como Desarrollador en Java, porque ha logrado demostrar habilidades de desarrollo en este lenguaje de programación y se le
ha concedido implementar las clases correspondientes a personajes genéricos (Esta clase engloba a todos personajes del videojuego independientemente de
su rol, es la clase padre de los personajes involucrados en el juego) y enemigos, y un método que permita conocer algunas estadísticas del estado
de una colección de enemigos. Inicialmente estas clases sólo tendrán atributos. El método que genera las estadísticas de una colección de instancias de la

clase Enemigo debe retornar:
● Promedio de vida de los enemigos de la colección
● Promedio de la capacidad de daño de los enemigos de la colección
● La cantidad de vida de quién ha recibido menos golpes de los enemigos
de la colección (Cantidad de vida más alta)
● La cantidad de vida de quién ha recibido más golpes de los enemigos de
la colección (Cantidad de vida más baja)
● Promedio de velocidad de los enemigos de la colección

TAREAS
Realizar un método en Java (Llamado statisticsGame) que le permitirá al jugador conocer unas estadísticas básicas sobre sus enemigos, teniendo en
cuenta las siguientes especificaciones: 
Los enemigos con los que se está enfrentando el jugador se van a representar como un ArrayList de enemigos, donde cada elemento es una instancia de
la clase Enemigo de la cual el equipo de ingeniería de software le hace entrega del siguiente diagrama de clases:

Recuerde que los métodos relacionados al constructor, getters y setters son
obviados en el diagrama de clases, pero deberán ser incluidos en el código;
estos métodos deben ser creados con el estándar camel case, por ejemplo, si
el atributo se llama especieMutante, sus métodos correspondientes a get y
set serían getEspecieMutante y setEspecieMutante.
Nota: Los parámetros del método constructor deberán aparecer en el mismo
orden en que aparecen en el diagrama de clases, es decir, para el caso de
Enemigo se espera que el constructor sea: public Enemigo(String
identificador, String apodo, String rol, double posicionX,
double posicionY, double velocidad, int nivel, double vida,
int capacidadDeDano, String especieMutante)...

A partir de este ArrayList, usted deberá calcular:
● Promedio de vida de los enemigos de la colección (dato de tipo double)
● Promedio de la capacidad de daño de los enemigos de la colección (dato
de tipo double)

● Vida del enemigo que ha recibido menos golpes por parte del jugador
de entre la colección de enemigos, es decir, retornar la cantidad de vida
del enemigo con cantidad de vida más alta (dato de tipo double)
● Vida del enemigo que ha recibido más golpes por parte del jugador de
entre la colección de enemigos, es decir, retornar la cantidad de vida del
enemigo con cantidad de vida más baja (dato de tipo double)
● Promedio de velocidad de los enemigos de la colección (dato de tipo
double)
ENTRADAS
Su método recibirá como parámetro un ArrayList de instancias de la clase
Enemigo que representa los enemigos con los que está peleando el jugador en
este instante. NO CREE LOS DATOS DE ENTRADA, DEBE USAR LOS QUE SE
RECIBEN COMO PARÁMETRO.
Recuerde que el método se llama statisticsGame
SALIDAS
Su método debe retornar un Array de Object donde:
● En la primera posición se guardará el promedio de vida de los enemigos
de la colección (dato de tipo double)
● En la segunda posición se guardará el promedio de la capacidad de
daño de los enemigos de la colección (dato de tipo double)
● En la tercera posición se guardará la cantidad de vida del enemigo que
ha recibido menos golpes por parte del jugador (dato de tipo double)
● En la cuarta posición se guardará la cantidad de vida del enemigo que
ha recibido más golpes por parte del jugador (dato de tipo double)
● En la quinta posición se guardará el promedio de velocidad de los
enemigos de la colección (dato de tipo double)
Nota: Suponga que todos los enemigos del ArrayList tienen diferente
cantidad de vida.







