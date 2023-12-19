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

### Pantalla de Contador

#### Características

- **Interfaz Intuitiva:** Utiliza botones para aumentar, disminuir y reiniciar el contador.
- **Diseño Responsivo:** Desarrollado con ConstraintLayout para adaptarse a diferentes tamaños de pantalla.
- **Estilos Personalizados:** Botones y textos con estilos personalizados mediante atributos de diseño.
- **Creador:** Alejandro Ramirez

- #### Captura de Pantalla

![Captura de pantalla 2023-12-13 184544](https://github.com/aleramiirez/RamirezLuqueM01/assets/121113496/e9ba67f6-52ba-4015-b646-af7c2968a648)


## Uso

1. Descarga el código fuente.
2. Abre el proyecto en Android Studio.
3. Ejecuta la aplicación en un emulador o dispositivo Android.

## Requisitos del Sistema

- Android Studio 4.0 o superior.
- Dispositivo Android o emulador con API 21 o superior.

## Contribución

Si quieres contribuir a este proyecto, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios.
4. Haz commit de tus cambios (`git commit -am 'Agrega nueva funcionalidad'`).
5. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
6. Crea un pull request.
