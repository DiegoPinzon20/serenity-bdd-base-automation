# author: DiegoPinzon20
# date: 20/02/2023
# language: es

Característica: Iniciar sesion en Start Sharp
  Como usuario quiero iniciar sesión en la página web de Start Sharp

  @InicioSesionExitoso
  Escenario: Inicio de sesón exitoso
    Dado Pepito navega a la página de inicio de sesión
    Cuando incia sesión con las credenciales de acceso correctas
    Entonces debería ver el tablero en la página principal