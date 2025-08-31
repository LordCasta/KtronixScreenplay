# KtronixScreenplay
Automatización de proceso de compra con Java, Serenity BDD, Cucumber, Gherkin, patrón Screenplay, excel

Importante: En caso de que no permita acceder al formulario para facturar, cambiar los correos del excel, o uno solo.

Automatización realizada para realizar dos procesos de compras de un celular samsung s24 ultra en la tienda ktronix, esto con dos ejecuciones, con diferentes datos.
Se implementan 3 validaciones, 2 exceptions, se realizan los siguientes pasos:
- Abre la página en google chrome
- Selecciona categoría celulares, si no encuentra, salta una excepción
- Selecciona el botón de filtro de celulares samsung
- Selecciona el botón de filtro de s24 ultra
- Realiza la búsqueda del producto del excel
- Lo selecciona y añade al carrito
- Abre el carrito, valida que esté añadido el producto del excel y el precio del excel esté igual
- Continua con el formulario para facturar
- Llena un correo y verifica que sea accesible la facturación, por el contrario, salta una excepción
- Continua con el llenado de un formulario de datos del excel
- Verifica que el nombre esté correcto y termina la automatización
- Se repite con la segunda fila de datos del excel

Link de video de automatización corriendo: <a target="_blank" href="https://www.loom.com/share/d19896932e754fdd91b80755b72af4f5">Ver video</a>
