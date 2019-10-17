Haciendo uso de la version 5.2 (ModelViewPResenter.presentacitonmodel )se requiere que las vistas no tengan metodo interact ayudandose del presentador, sino que le demos la vuelta al reparto de responsibilidades. El presentador es el que tiene el mtodoo control. El mastermind solo tiene la logica. 


MODELO VISTA PRESENTADOR.
Se requiere de un patron prototype o un abstract factory. Una factoria de vistas de textos o vista de graficas.


No hay lógica.

La clase principal,la vista es auxiliar de los controladores.
 
Se tiene la sesión y los controladores, en el main

------------------

class Mastermind
note left
public void play(){
  controllers.get(session.getValue()).control();
}
end note
Mastermind *-down-> Session
Mastermind *-down-> StartController
Mastermind *-down-> ProposalController
Mastermind *-down-> ResumeController


abstract class Controller{
+{abstract} void control()
}
Controller --> Session
Controller <|-down- StartController
Controller <|-down- ProposalController
Controller <|-down- ResumeController

class Session
Session *-down-> State
Session *-down-> Game

class StartController {
+void control()
}
note right 
public void control(){
new GameView().showTitle();
session.next();
}
end note

class ProposalController {
+void control()
}

class ResumeController {
+void control()
}

