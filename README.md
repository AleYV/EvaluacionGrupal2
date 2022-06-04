# EvaluacionGrupal2
Integrantes:  
  - Gladys Alesandra Yagi Vásquez
  - Italo Enrique Silva Guanilo
  - Renato Sebastian Perez Ruiz

#### Preguntas 
**Pregunta 1** Si ejecutamos las pruebas con cobertura desde IntelliJ IDEA, ¿cuales son los
resultados que se muestran?, ¿Por qué crees que la cobertura del código no es del 100%?  
Han pasado dos pruebas de cuatro.
No es del 100% debido a que en la clase Flight se ah definido dos tipos de vuelo(Economico y Negocios); sin embargo, en las pruebas estas son definidas como Economico y 
Business

**Pregunta 2** ¿Por qué John tiene la necesidad de refactorizar la aplicación?  
●Mejor estructuración del código  
Cuando se necesite añadir más tipos de vuelo, la estructura selectiva va a ir incrementándose, haciendo que el tiempo de ejecución sea cada vez mayor.      

●Legibilidad  
Al usar el polimorfismo, hay un mayor entendimiento de cada clase instanciada y su función en el código sin alterarla.


**Pregunta 3**  
● ¿Cuál es la cobertura del código?  
Del 100%. Esto lo podemos comprobar al ejecutar las pruebas.

● ¿La refactorización de la aplicación TDD ayudó tanto a mejorar la calidad del código?  
Si, por dos motivos:
1. Mejora en el tiempo de ejecución  
Al tener los tipos de vuelo separados por clases, ya no se necesita el uso de una estructura selectiva para diferenciarlos y que el código sea más reducido.
2. Código escalable  
Al estar usando la técnica de programación TDD, hace que el programa pueda aceptar más clases y quien quiera aportar en el proyecto pueda entender como funciona.

**Pregunta 4** 
¿En qué consiste está regla relacionada a la refactorización?. Explica como se relaciona al problema dado en la evaluación.  
En caso existan dos instancias similares y se desee añadir otra instancia similar, esta regla nos dice que se debe crear un nuevo método que agrupe estas similitudes y
así el código sea más escalable.  
En la Fase 3, las clases BussinessFlight y EconomicFlight tienen códigos similares; y se quiere agregar la clase PremiumFlight es cuál también tendría código similar a 
las clases mencionadas; por lo que convendría utilizar la Regla de Tres en la unidad de pruebas 

