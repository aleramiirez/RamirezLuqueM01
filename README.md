# Contador Android

Este proyecto consiste en una aplicación Android que funciona como un contador simple.

## Pantallas Principales

### Pantalla de Inicio de Sesión

#### Descripción
La pantalla de inicio de sesión permite a los usuarios autenticarse antes de acceder al contador.

#### Componentes Principales
- **textLogin:** TextView para mostrar el título "LOGIN".
- **UserInput:** EditText para ingresar el nombre de usuario.
- **PasswordInput:** EditText para ingresar la contraseña.
- **btnLogin:** Botón para iniciar sesión.
- **messageText:** TextView para mostrar mensajes de error o éxito en el inicio de sesión.

#### Funcionalidad
- Se valida el usuario y la contraseña ingresados.
- Si el usuario es "alejandro" y la contraseña es "admin", se redirige a la pantalla principal del contador.
- En caso contrario, se muestra un mensaje de error.

#### Captura de Pantalla

![image](https://github.com/aleramiirez/RamirezLuqueM01/assets/121113496/2e85efe2-7484-49c8-97bd-edec936bb923)

### Pantalla Principal del Contador

#### Descripción
La pantalla principal del contador presenta un menú de navegación inferior y un contenedor de fragmentos para mostrar las diferentes secciones de la aplicación.

#### Componentes Principales
- **fragment:** Contenedor de fragmentos gestionado por `NavHostFragment`.
- **bottomNavigationView:** Menú de navegación inferior con opciones para "Home," "Count," "Map," y "Exit."

#### Funcionalidad
- Utiliza la biblioteca de navegación para cambiar entre fragmentos al seleccionar opciones en el menú de navegación inferior.
- Permite al usuario navegar a la pantalla de inicio, pantalla de contador, pantalla de mapa y salir de la aplicación.

### Pantalla de Inicio (Fragmento)

#### Descripción
Este fragmento de la pantalla de inicio muestra un mensaje de bienvenida al usuario.

#### Componentes Principales
- **byUserText:** TextView para mostrar un mensaje de bienvenida al usuario.

#### Captura de Pantalla

![image](https://github.com/aleramiirez/RamirezLuqueM01/assets/121113496/e4cce1ff-462f-4bf4-88e2-20e35d0cdcf8)

### Pantalla de Contador

#### Descripción
La pantalla de contador presenta un contador que puede aumentar, disminuir y reiniciar.

#### Componentes Principales
- **numberText:** TextView para mostrar el número actual del contador.
- **btnSubtract:** Botón para restar 1 al contador.
- **btnAdd:** Botón para sumar 1 al contador.
- **btnReset:** Botón para reiniciar el contador a 0.

#### Funcionalidad
- Permite al usuario incrementar, decrementar y reiniciar el contador.

#### Captura de Pantalla

![Captura de pantalla 2023-12-13 184544](https://github.com/aleramiirez/RamirezLuqueM01/assets/121113496/8691a43b-a7d5-4f6f-b606-4e045df2995d)

### Pantalla de Mapa

#### Descripción
La pantalla de mapa utiliza Google Maps para mostrar un marcador en una ubicación predeterminada.

#### Componentes Principales
- **map:** Fragmento de mapa de Google Maps.

#### Funcionalidad
- Muestra un marcador en una ubicación específica al cargar el mapa.

### Menú de Navegación

#### Descripción
El menú de navegación inferior permite al usuario cambiar entre las diferentes secciones de la aplicación.

#### Componentes Principales
- **navigation_home:** Opción para ir a la pantalla de inicio.
- **navigation_count:** Opción para ir a la pantalla de contador.
- **navigation_map:** Opción para ir a la pantalla de mapa.
- **navigation_exit:** Opción para salir de la aplicación.


## Uso

1. Descarga el código fuente.
2. Abre el proyecto en Android Studio.
3. Ejecuta la aplicación en un emulador o dispositivo Android.

## Requisitos del Sistema

- Android Studio 4.0 o superior.
- Dispositivo Android o emulador con API 21 o superior.

## Contribución

Si deseas contribuir a este proyecto, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios.
4. Haz commit de tus cambios (`git commit -am 'Agrega nueva funcionalidad'`).
5. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
6. Crea una solicitud de extracción (pull request).
