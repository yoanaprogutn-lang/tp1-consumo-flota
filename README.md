#TP1 - Consumo de Flota

Estudiante: Carrasco Sanzana Joana Romina  
Materia: Programación II  
Profesor: Cesar Augusto Carbonell  

✨Programas incluidos
* Viaje.java: Registro y cálculo de consumo para un viaje individual.
* Flota.java: Registro de viajes de 6 camiones e informe consolidado de la flota.

✨Instrucciones de compilación y ejecución
Para compilar y ejecutar los programas desde la consola:

🔹Compilar y ejecutar Viaje.java
  javac Viaje.java
  java Viaje

🔹Compilar y ejecutar Flota.java
  javac Flota.java
  java Flota

Preguntas

✨1) División de enteros y promedios: En Java, si se dividen dos números enteros (int / int), el lenguaje realiza una división entera descartando los decimales sin avisar ningún error. Para solucionarlo, convertí uno de los operandos a double, permitiendo así obtener el resultado con decimales precisos.

✨2) Uso de ramas en Git: Trabajar la Parte C en la rama parte-c me permitió desarrollar y probar la lógica de la flota completa sin alterar el código estable de la Parte B en la rama principal. Esto me dio la libertad de experimentar y corregir errores sin riesgo de romper lo que ya funcionaba hasta integrar ambas partes.

✨3)Mejora de commit: Un mensaje inicial como git commit -m "cambios" era ambiguo porque no detallaba los archivos modificados ni la funcionalidad agregada. La versión mejorada git commit -m "Agrega calculo de consumo promedio e informe final" explica con 
mas precisión el avance realizado en el código para facilitar el seguimiento en
el historial, tanto si este fuera personal como grupal, facilitando el 
segumiento de modificaciones de manera mas puntual y menos ambiguas.🐱‍🐉


## Reentrega - Correcciones Aplicadas

### Nota sobre la Estructura del Proyecto
Se completó la **Parte 3 (Flota.java)**. 
La omisión previa surgió de una confusión en la consigna,al no reparar en que se requerían dos programas independientes 
(`Viaje.java` y `Flota.java`)entendí que era un solo programa que debía hacer todo, lo que derivó en código incompleto, Ambas partes se encuentran ahora correctamente separadas y finalizadas. Sin embargo me pareció correcto no sacar los errores que tuve anteriormente y dejarlos comentados, para que pudiera reparar en ellos.

### Detalle de Cambios
- **Parte C Completa:** Implementación de la gestión de flota mediante 3 arreglos paralelos y métodos auxiliares.
- **Fórmula de Consumo:** Ajuste de parámetros en `calcularConsumo(km, litros)` para obtener el promedio real en `L/100km`.
- **Formato Output:** Limpieza de especificadores `%10.2f` en las sentencias `printf`.
- **Lectura de Scanner:** Uso de `parseDouble(scanner.nextLine())` para evitar saltos en la toma de datos.
