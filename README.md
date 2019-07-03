# AplicacionPrueba01
Prueba de Intent y bundle

Se envían dos datos, como lo son un nombre y una contraseña ingresados cada uno en un EditText, depende sea el caso :
*si el botón que se presiona es el de guardar, se obtiene el texto del EditText y se muestran en su respectivo TextView por cada 
EditText.
*Si el  botón presionado es cargar, se realiza la acción de obtener cada dato y 
estos datos serán almacenados en un bundle y enviados en el Intent para iniciar la siguiente actividad llamada ActividadCargar, 
que se encarga de recibir el Intent y el bundle y si el dato en el bundle en null, 
se obtiene cada dato(del nombre y la contraseña) mediante un identificador o llave la
cual definimos en la actividad emisora  del Intent(MainActivity) y se muestran en su respectivo componente TextView.
