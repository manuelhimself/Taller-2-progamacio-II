# Taller-2-progamacio-II
Exercici de programació II de l'Universitat de les Illes Balears

Enunciat:

SEGUNDO TALLER EVALUABLE
OBJETIVOS
Los objetivos de este taller son los de trabajar con estructuras matriciales y con un
entorno gráfico e interactivo utilizando las prestaciones que ofrecen las librerías gráficas
de JAVA aplicando los conceptos de objetos y de tipos abstractos de datos.
ENUNCIADO
Implementación de un programa JAVA que visualice el juego de LA HORMIGA
COME HOJAS.
El juego se fundamenta en un tablero de 20x20 casillas en el que una casilla presenta
como contenido la imagen de una hormiga y, en el resto de casillas se visualizará la
imagen de una hoja.

La hormiga podrá cambiar de dirección a través de la interacción del usuario con las
teclas de dirección (izquierda, arriba, derecha y abajo), de manera que al pulsar el
usuario una de estas teclas se cambiará la dirección de la hormiga acorde a la tecla
pulsada, y se visualizará la imagen de la hormiga correspondiente a la dirección
seleccionada.
Para visualizar la hormiga se dispondrá de 4 imágenes que representarán a la hormiga en cada una de las direcciones de avance posible:
hormiga_o.png - oeste (izquierda)
hormiga_n.png - norte (arriba)
hormiga_e.png - este (derecha)
hormiga_s.png - sur (abajo).
El avance de la hormiga, a través de las casillas del tablero, se implementará al pulsar la
tecla de espacio del teclado, siguiendo la dirección seleccionada. El avance de la
hormiga conllevará la visualización de la imagen de la hormiga correspondiente en la
nueva casilla resultante del avance, dejándose de visualizar a la hormiga en la casilla
anterior al avance. Si en la casilla resultante del avance hubiese una hoja, ésta
desaparecerá. Las casillas que no presenten hoja debido al paso anterior por ellas de la
hormiga visualizarán un espacio blanco representado por la imagen nada.png.
Si al avanzar la hormiga sobrepasa los límites del tablero, la casilla que deberá ocupar
será la primera de lado opuesto.
La hoja será visualizada utilizando para ello la imagen hoja.png.

Una vez que la hormiga haya acabado con todas las hojas deberá aparecer una ventana
de información en la que se visualice el siguiente mensaje:
 ENHORABUENA
 ¡¡¡has completado el juego!!!
 LA HORMIGA SE HA COMIDO TODAS LAS HOJAS
 
Cuando el usuario confirme haber leído el mensaje anterior, la ejecución del programa
finalizará. También el usuario tendrá la posibilidad de acabar la ejecución utilizando la
salida de la ventana de Windows en cualquier momento.
