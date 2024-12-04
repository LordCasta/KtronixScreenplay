# language: es

  Característica: Automatizar proceso compra ktronix

  @SmokeTest

  Esquema del escenario: Agregar producto al carrito

    Dado Que me encuentro en la pagina '<url>'

    Cuando Seleccione categoria '<categoria>'

    Y escoja el producto '<producto>' con precio '<precio>'

    Entonces Visualizo la ventana de compra con el producto '<producto>' correo '<correo>' nombres '<nombres>' apellidos '<apellidos>' celular '<celular>' documento '<documento>' departamento '<departamento>' ciudad '<validarCiudad>' direccion '<direccion>' barrio '<barrio>'

    Ejemplos:
  | url | categoria | producto | correo | nombres | apellidos | celular | documento | departamento | validarCiudad | direccion | barrio | precio|
##@externaldata@parametros/Datos.xlsx@AgregarProducto
   |https://www.ktronix.com/   |Celulares   |Celular SAMSUNG Galaxy S24 Ultra 512GB Negro   |castanocastano02@gmail.com   |Juan Pablo   |Castaño   |3015302175   |123456   |Antioquia   |Medellin   |calle 80   |Robledo   |6.999.990|
   |https://www.ktronix.com/   |Celulares   |Celular SAMSUNG Galaxy S24 Ultra 256GB Amarillo   |castanocastano04@gmail.com   |Chanchito   |Feliz   |3015302176   |7891011   |Antioquia   |Medellin   |Calle 20   |Manizales   |5.999.990|
