![GitHub repo size](https://img.shields.io/github/repo-size/DiegoPinzon20/automation-utilities?style=flat-square)
![GitHub top language](https://img.shields.io/github/languages/top/DiegoPinzon20/automation-utilities?color=orange&style=flat-square)
![GitHub last commit](https://img.shields.io/github/last-commit/DiegoPinzon20/automation-utilities?color=success&style=flat-square)
[![GitHub Stars](https://img.shields.io/github/stars/DiegoPinzon20/automation-utilities?label=GitHub%20stars&style=social)](https://github.com/DiegoPinzon20/automation-utilities/stargazers/)

---

## Información General 🔬

| N°  | Item              |        Detalle |
|:---:|:------------------|---------------:|
|  1  | Java              |        11.0.15 |
|  2  | Gradle            |            7.4 |
|  3  | Navegador         |  Google Chrome |
|  4  | Sistema Operativo | Windows 10 Pro |
|  5  | Rama principal    |         Master |

## Pre requisitos para ejecutar 📋

- Java: versión 1.8 o superior (variables de entorno configuradas).
- Entorno de desarrollo: Eclipse IDE o IntelliJ IDEA
- Gradle versión 7.0 o superior (variables de entorno configuradas).
- Plugin de Cucumber para Java
- Gherkin Plugin

## Ejecutar pruebas 🔨

La herramienta de compilación de código y administrador de dependencias para este proyecto es **Gradle**, así que pare
ejecutar las pruebas use el siguiente comando en la raíz del proyecto.

``` javascript 
gradle clean test aggregate -i
```

Si desea ejecutar algún Runner especifico puede usar el siguiente comando, por ejemplo, para un corredor de pruebas de
un Login.

``` javascript 
gradle clean test --tests "LoginRunner"
```

## Obtener el código

El código de la automatización está alojado en un repositorio de GitHub, para hacer uso de él puede clonarlo usando Git
o descargar el archivo zip del proyecto.

Git:

``` javascript 
 git clone https://github.com/DiegoPinzon20/automation-utilities.git
 cd automation-utilities
```

O
simplemente [descargar archivo zip](https://github.com/DiegoPinzon20/automation-utilities/archive/refs/heads/master.zip)
.

## Ver los informes 👀

El comando proporcionado anteriormente para la ejecución de las pruebas, generará un informe de prueba de Serenity **index.html** en el directorio target/site/serenity. Adicionalmente, puede encontrar evidencias generadas por Cucumber en
la ruta **target/serenity-reports**, son los siguientes archivos:

- **rerun.txt**: Archivo de texto con la información de la línea donde falló el caso para su revisión.
- **serenity-html-report.html**: Reporte generado con el resultado de cada uno de los pasos del feature incluido en las
  pruebas.
- **serenity-summary.html**: Este reporte es un resumen muy general sobre los resultados de la ejecución, si desea
  obtenerlo ejecute el siguiente comando después de la ejecución de las pruebas:
  ```gradle reports```

## Construido con 🛠

La automatización fue desarrollada con:

- BDD - Estrategia de desarrollo
- Screenplay - Patrón de diseño
- Gradle - Administrador de dependencias
- Selenium Web Driver - Herramienta para interaccionar con navegadores web
- Cucumber - Software que apoya el BDD
- Serenity BDD - Librería de código abierto para escribir pruebas de aceptación automatizadas
- Gherkin - Lenguaje DSL de lectura empresarial (lenguaje específico de dominio)

## Versionamiento 📌

Se usa Git para el control de versiones. 🔀

## Colaboradores 👨

Gracias a todos los colaboradores por su aporte a este
proyecto ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

<table>
  <tr>
    <td align="center"><a href="https://github.com/DiegoPinzon20"><img src="https://avatars.githubusercontent.com/u/78321622?v=4" width="100px;" alt=""/><br /><sub><b>DiegoPinzon20</b></sub></a><br /><a href="https://github.com/DiegoPinzon20/automation-utilities/commits?author=DiegoPinzon20" title="Code">💻</a></td>
  </tr>
</table>
