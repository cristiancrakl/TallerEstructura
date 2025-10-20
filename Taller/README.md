# Taller Estructura de Datos

Este proyecto es una aplicación Java que implementa una lista doblemente enlazada (Doubly Linked List) con una interfaz gráfica de usuario (GUI) para realizar operaciones básicas sobre la lista.

## Características

- **Carga de datos**: Los números se cargan automáticamente desde el archivo `numeros.txt` al iniciar la aplicación.
- **Operaciones en posiciones**: Permite ingresar una posición (1-based) y realizar operaciones basadas en el valor en esa posición (suma o resta de valores adyacentes según si es par o impar).
- **Imprimir lista**: Muestra el contenido actual de la lista.
- **Eliminar duplicados**: Remueve elementos duplicados de la lista.
- **Ordenar lista**: Ordena la lista de menor a mayor.

## Requisitos

- Java Development Kit (JDK) instalado (versión 8 o superior).
- Sistema operativo compatible con Java (Windows, macOS, Linux).

## Cómo ejecutar

1. **Ejecutar la aplicación**:

   ```
   java Run
   ```

   Esto abrirá la interfaz gráfica.

## Uso de la aplicación

- **Campo de texto**: Ingresa la posición (empezando desde 1) para operar.
- **Botón "Ingresar posicion"**: Realiza la operación en la posición especificada y muestra el resultado en el área de texto.
- **Botón "Imprimir lista"**: Muestra la lista actual.
- **Botón "Eliminar duplicados"**: Elimina duplicados y confirma en el área de texto.
- **Botón "Ordenar lista"**: Ordena la lista y confirma en el área de texto.

## Estructura del proyecto

- `src/Run.java`: Clase principal que inicia la aplicación.
- `src/Interfaz/Menu.java`: Interfaz gráfica con botones y área de texto.
- `src/Logica/DoublyLinkedList.java`: Implementación de la lista doblemente enlazada.
- `src/Logica/Node.java`: Clase para los nodos de la lista.
- `numeros.txt`: Archivo con los números iniciales (separados por comas).

## Notas

- Las posiciones se ingresan como 1-based (la primera posición es 1), pero internamente se ajustan a 0-based.
- Si se ingresa una posición inválida, se muestra un mensaje de error.
- La aplicación maneja errores de entrada no numérica.

## Autor

Cristiancrakl.
