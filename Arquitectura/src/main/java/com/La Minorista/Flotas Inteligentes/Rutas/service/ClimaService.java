package main.java.com.La Minorista.Flotas Inteligentes.Rutas.service;

// Implementacion de la "O" Abierto/Cerrado. Se esta implementando de forma en que clima  puede ser extendida
// con diferentes implementaciones(por ejemplo, conectando con diferentes Apis)

public class ClimaService {
   
    public interface clima{
        String obtenerClima(String ruta);
    }
    public class ClimaApi Implements clima{
      @Override
        public String obtenerClima(String ruta) {
            return "Clima: El clima esta soleado en la ruta " + ruta;
        }
    }

  //Segregacion de interfaces "I". Se estan usando solamente las necesarias, entonces de llega a dividir interfaces
  //grandes en varias especificas

    public interface Alerta{
       void enviaralerta(String mensaje);
    }

    public class alertaconsola implements Alerta{
       @Override
        public void enviaralerta(String mensaje{
            System.out.print("Alerta:" + mensaje);
        })
    }
}



