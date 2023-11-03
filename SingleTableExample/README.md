# SINGLE TABLE
>Single Table es un tipo de herencia en Hibernate que consiste en que la tabla madre no se va a tener ninguna instancia y va a ser abstracta y lo único que crearemos son instancias de sus clases hijas
## ¿Cómo resolver esta herencia?
Para resolver esta herencia tenemos que añadir a la clase madre las anotaciones `
´
@DiscriminatorColumn(name = "Type")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@SuperBuilder
`

Con la primera anotación indicamos el nombre de la columna en la base de datos con la que vamos a diferenciar cual de las hijas es y la segunda indica el tipo de herencia. En la clase hija añadiremos:

`
@SuperBuilder
@DiscriminatorValue("A")
`

Con la primera anotación podremos usar el builder de la clase madre y la segunda es la que indica cual es la anotación que va a salir en la columna asignada según sea una instancia u otra
