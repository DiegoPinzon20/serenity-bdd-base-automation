![GitHub repo size](https://img.shields.io/github/repo-size/DiegoPinzon20/serenity-bdd-base-automation?style=flat-square)
![GitHub top language](https://img.shields.io/github/languages/top/DiegoPinzon20/serenity-bdd-base-automation?color=orange&style=flat-square)
![GitHub last commit](https://img.shields.io/github/last-commit/DiegoPinzon20/serenity-bdd-base-automation?color=success&style=flat-square)
[![GitHub Stars](https://img.shields.io/github/stars/DiegoPinzon20/serenity-bdd-base-automation?label=GitHub%20stars&style=social)](https://github.com/DiegoPinzon20/serenity-bdd-base-automation/stargazers/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

<div align="left">
<h1>serenity-bdd-base-automation ✨</h1>
</div>

[![Iungot Server Application](https://jordinodejs.vercel.app/api/pin/?username=DiegoPinzon20&repo=serenity-bdd-base-automation&theme=calm&bg_color=c2c7ff&title_color=000000&icon_color=000000&border_color=000000&text_color=000000)](https://github.com/DiegoPinzon20/serenity-bdd-base-automation)

## Información General 🔬

| N°  | Item              |        Detalle |
|:---:|:------------------|---------------:|
|  1  | Java              |        11.0.15 |
|  2  | Gradle            |            7.4 |
|  3  | Navegador         |  Google Chrome |
|  4  | Sistema Operativo | Windows 10 Pro |
|  5  | Rama principal    |         master |

## Pre requisitos para ejecutar 📋

- Java: versión 1.8 o superior (variables de entorno configuradas).
- Entorno de desarrollo: Eclipse IDE o IntelliJ IDEA
- Gradle versión 7.0 o superior (variables de entorno configuradas).
- Plugin de Cucumber para Java
- Gherkin Plugin

## Ejecutar pruebas 🔨

La herramienta de compilación de código y administrador de dependencias para este proyecto es **Gradle**, así que pare
ejecutar las pruebas use el siguiente comando en la raíz del proyecto.

``` shell 
gradle clean test aggregate -i
```

Si desea ejecutar algún Runner especifico puede usar el siguiente comando, por ejemplo, para un corredor de pruebas de
un Login.

``` shell 
gradle clean test --tests "LoginRunner"
```

## Obtener el código

El código de la automatización está alojado en un repositorio de GitHub, para hacer uso de él puede clonarlo usando Git
o descargar el archivo zip del proyecto.

Git:

``` shell 
 git clone https://github.com/DiegoPinzon20/serenity-bdd-base-automation.git
 cd serenity-bdd-base-automation
```

O
simplemente [descargar archivo zip](https://github.com/DiegoPinzon20/serenity-bdd-base-automation/archive/refs/heads/master.zip)
.

## Ver los informes 👀

El comando proporcionado anteriormente para la ejecución de las pruebas, generará un informe de prueba de Serenity **index.html**
en el directorio **target/site/serenity**. Adicionalmente, puede encontrar evidencias generadas por Cucumber en la ruta **target/serenity-reports**, 
los archivos generados son:

- **rerun.txt**: Archivo de texto con la información de la línea donde falló el caso para su revisión.
- **serenity-html-report.html**: Reporte generado con el resultado de cada uno de los pasos del feature incluido en las
  pruebas.
- **serenity-summary.html**: Este reporte es un resumen gerencial sobre los resultados de la ejecución, si desea
  obtenerlo ejecute el siguiente comando después de la ejecución de las pruebas:
  ``` gradle reports```

## Construido con 🛠

La automatización fue desarrollada con:

- BDD - Estrategia de desarrollo de pruebas
- Screenplay - Patrón de diseño de pruebas
- Gradle - Administrador de dependencias del proyecto
- Selenium Web Driver - Herramienta para interaccionar con navegadores web
- Cucumber - Software que apoya el BDD
- Serenity BDD - Librería de código abierto para escribir pruebas de aceptación automatizadas
- Gherkin - Lenguaje DSL de lectura empresarial (lenguaje específico de dominio)

## Versionamiento 📌

Se usa Git para el control de versiones. 🔀

## Autor 👨 ([emoji key](https://allcontributors.org/docs/en/emoji-key))

[![Information](https://github-stats-alpha.vercel.app/api?username=DiegoPinzon20 "Information")](https://github-stats-alpha.vercel.app/api?username=DiegoPinzon20 "Information")

<div>
<p>&nbsp;<img align="center" src="https://jordinodejs.vercel.app/api?username=DiegoPinzon20&show_icons=true&locale=es&theme=calm" alt="DiegoPinzon20" /></p>
<p><img align="left" src="https://jordinodejs.vercel.app/api/top-langs?username=DiegoPinzon20&show_icons=true&locale=es&layout=compact&theme=calm&langs_count=8&hide=php,coffeescript" alt="DiegoPinzon20" /></p>
<br><br><br><br></div>

## Copyright

Publicado bajo la Licencia MIT, ver el archivo [LICENSE](https://github.com/DiegoPinzon20/serenity-bdd-base-automation/blob/master/LICENSE).
