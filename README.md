# Proyecto: Ejemplo de Clases Genéricas en Java

## **Descripción del Proyecto**
Este proyecto presenta el uso de **clases genéricas** en Java, específicamente con una clase llamada `Caja`. La clase `Caja` permite guardar y recuperar datos de cualquier tipo, lo que la hace adaptable y reutilizable. El propósito principal es demostrar cómo las clases genéricas simplifican el manejo de diferentes tipos de datos de manera eficiente y segura.

---

## **Ventajas de Usar Clases Genéricas**
1. **Adaptabilidad:**
   - Las clases genéricas permiten trabajar con múltiples tipos de datos usando una única implementación.
   - Puedes utilizar la misma clase para guardar diferentes tipos como `String`, `Integer` o incluso tus propias clases personalizadas.

2. **Reutilización de Código:**
   - Se evita escribir código repetitivo para manejar diferentes tipos de datos. Esto reduce redundancias y mejora la mantenibilidad.

3. **Seguridad de Tipos:**
   - Al usar clases genéricas, los errores relacionados con conversiones o tipos incompatibles se detectan en tiempo de compilación, lo que asegura un código más robusto.

4. **Legibilidad y Mantenimiento:**
   - El uso de genéricos mejora la claridad del código, ya que es más fácil identificar el tipo de datos que una clase o método está manejando.

---

## **¿Cómo Funciona Este Proyecto?**
En este proyecto se utiliza la clase `Caja<T>` para manejar diferentes tipos de datos. Esta clase tiene dos métodos principales:
1. **`ponerAlgo`:**
   - Permite guardar un objeto del tipo genérico `T` dentro de la caja.

2. **`sacarAlgo`:**
   - Recupera el contenido almacenado en la caja y devuelve un objeto del tipo `T`.

El proyecto incluye ejemplos de cómo utilizar esta clase genérica con los tipos `String`, `Integer` y `Double`.
