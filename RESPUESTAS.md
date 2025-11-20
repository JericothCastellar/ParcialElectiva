VALIDACIÓN DE LOS LOGS

> RUN FALLIDO  
Esto ocurrió cuando la cobertura alcanzó el 80%, pues el log indicó:  
"Regla violada para el paquete calculadora: la proporción de instrucciones cubiertas es 0.80, pero el mínimo esperado es 0.85"  
Esto significa que la etapa de validación de cobertura falló y el programa se detuvo.

> RUN EXITOSO  
Esto se logró tras ajustar el pom.xml para excluir la clase que no estaba cubierta. El log terminó con el:  
"BUILD SUCCESS"  
Tambien, el informe de JaCoCo muestra un 100% de cobertura en instrucciones, ramas, líneas, métodos y las clases.

> CÓMO IDENTIFICAR FALLAS EN LOS LOGS  
- LINTER: señala errores de estilo y detiene el run si se utiliza "checkstyle:check"  
- PRUEBAS: muestra "Failures" o "Errors" en el bloque de resultados de las pruebas.  
- COBERTURA: muestra "Regla violada" si no se cumple el umbral mínimo definido en el pom.xml que es 0.85.

IA Y ÉTICA

> MÉTODOS DE DETECCIÓN  
1. Analizando los patrones de escritura y estilo (repetición, estructura sintáctica vocabulario, etc).  
2. Uso de herramientas automáticas como GPTZero, Turnitin con módulos de IA o detectores de ese estilo.

> LIMITACIONES  
No se puede garantizar al 100% la autoría, ya que los detectores pueden dar falsos positivos o negativos.  
Además, el estilo humano puede coincidir con patrones generados por IA a veces.

> POLÍTICAS PROPUESTAS  
- Permitir el uso de IA como apoyo en investigación y documentación, pero prohibir su uso para generar código en evaluaciones prácticas debe ser todo medido.  
- Requerir referencias explícitas si se utiliza IA para ideas o explicaciones.  
- Fomentar la transparencia y la ética en el uso de estas herramientas en entornos educativos y profesionale.