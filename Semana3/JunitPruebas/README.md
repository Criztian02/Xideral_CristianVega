Este es un ejemplo de un codigo en Java 21, de pruebas JUnit.
Se utilizo maven, para que el IDE (para este proyecto se uso Intellij Idea)
pueda llevar a cabo su funcion correctamente, primero el proyecto trabaja con Maven y 
para que funcione correctamente necesitamos tener el siguiente codigo en el archivo pom.xml

```html
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```


Esto hay que tenerlo en el pom.xml, es el archivo de configuración de Maven utilizado para definir 
la configuración y las dependencias del proyecto Java. Este fragmento de código indica que el 
proyecto depende de JUnit Jupiter versión 5.10.0 para ejecutar pruebas de unidad
