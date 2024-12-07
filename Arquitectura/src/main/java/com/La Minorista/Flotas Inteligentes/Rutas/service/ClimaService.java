package main.java.com.La Minorista.Flotas Inteligentes.Rutas.service;

// Implementacion de la "O" Abierto/Cerrado

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

  //Segregacion de interfaces "I"

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



