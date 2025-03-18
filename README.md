# Flujo E/S (NIO2) - Origen – Destino

Este proyecto consiste en un programa Java que lee el contenido de un archivo de texto (`M2_T02_Origen.txt`), reemplaza todos los espacios en blanco por guiones (`-`) y escribe el resultado en un nuevo archivo (`M2_02_Destino.txt`).

## Temas Utilizados

1.  **Flujo de E/S (NIO2):**
    * Se utilizan las clases `java.nio.file.Files` y `java.nio.file.Paths` para leer y escribir archivos de manera eficiente. NIO2 (New Input/Output 2) proporciona una forma más flexible y potente de trabajar con archivos y directorios en comparación con las clases de E/S tradicionales.
2.  **Flujos de Caracteres:**
    * Se emplean `BufferedReader` y `BufferedWriter` para leer y escribir el contenido de los archivos como secuencias de caracteres. Esto es adecuado para archivos de texto, ya que permite trabajar con caracteres Unicode.
3.  **`try-with-resources`:**
    * Se utiliza la instrucción `try-with-resources` para garantizar que los recursos (como los flujos de archivos) se cierren automáticamente después de su uso. Esto ayuda a prevenir fugas de recursos y simplifica el manejo de excepciones.
4.  **Manipulación de Cadenas:**
    * Se utiliza el método `String.replace()` para reemplazar todos los espacios en blanco en el contenido del archivo por guiones.

## Instrucciones

1.  Asegúrate de tener el archivo `M2_T02_Origen.txt` en la misma carpeta que el archivo `.java` que contiene el codigo, o en la ruta especificada en el codigo.
2.  Compila y ejecuta el programa Java.
3.  El programa creará un nuevo archivo llamado `M2_02_Destino.txt` con el contenido modificado.

## Ejemplo

Si el archivo `M2_T02_Origen.txt` contiene:

Hola Mundo
¿Qué tal estás?


El archivo `M2_02_Destino.txt` resultante contendrá:

Hola-Mundo
¿Qué-tal-estás?
