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
Comparando el avance entre la Fase 1 y 2, John refactoriza el código para evitar la redefinición de un objeto al momento de utilizarlo, para que el código sea más
entendible sin cambiar la funcionalidad de la misma y alterar los test. 


**Pregunta 3**  
● ¿Cuál es la cobertura del código ?  
Del 100%

● ¿La refactorización de la aplicación TDD ayudó tanto a mejorar la calidad del código?  
Si, porque con la refactorización hecha en la Fase 2, se mejoró el entendimiento de las clases y en la refactorización hecha en la Fase 3 con el método getPassengerList,
nos da a entender que el retorno es una lista de pasajeros.  

**Pregunta 4**  
¿En qué consiste está regla relacionada a la refactorización?. Explica como se relaciona al problema dado en la evaluación.  
En caso existan dos instancias similares y se desee añadir otra instancia similar, esta regla nos dice que se debe crear un nuevo método que agrupe estas similitudes y
así el código sea más escalable.  
En la Fase 3, las clases BussinessFlight y EconomicFlight tienen códigos similares; y se quiere agregar la clase PremiumFlight es cuál tambien tendría código similar a 
las clases mencionadas; por lo que convendría utilizar la Regla de Tres en la unidad de pruebas 

