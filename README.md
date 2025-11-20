CALCULADORA - CI/CD QUALITY PIPELINE

DESCRIPCION<>
Este proyecto en Java crea una calculadora que incluye pruebas unitarias y validación de cobertura utilizando JaCoCo.
El propósito es mostrar un pipeline de CI/CD utilizando GitHub Actions y nektos/act .

EJECUCION DEL PIPELINE
El flujo de trabajo se encuentra en .github/workflows/ci-quality.yml.
Se activa automáticamente cada vez que hay un PUSH en la rama main.

> ETAPAS DEL PIPELINE
1. CHECKOUT del repositorio
2. INSTALACION DE DEPENDENCIAS con Maven
3. LINTER (Checkstyle) para validar el estilo del código
4. BUILD Y PRUEBAS UNITARIAS con BUILD AND CLEAN
5. COBERTURA con JaCoCo (con umbral mínimo del 85%)
6. GENERACION DE REPORTE en target/site/jacoco/index.html

EJECUCION LOCAL CON ACT
Para simular GitHub Actions en tu máquina, se utiliza la herramienta nektos/act.

> REQUISITOS
- Tener DOCKER instalado y en funcionamiento
- Instalar ACT en tu máquina local

> COMANDO DE EJECUCION
act push

EVIDENCIA
- Captura de un run EXITOSO (cuando la cobertura alcanzó el 100% esto esta en las capturas al lado de este documento) 

AUTORIA Y ETICA
Todo el código fue escrito a manualmente.
Se investigaron métodos para detectar código generado por IA y se proponen políticas de uso responsable y la calidad.