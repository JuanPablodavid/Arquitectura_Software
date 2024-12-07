package main.java.com.La Minorista.Flotas Inteligentes.Rutas.service;


//Principio Inversion de Dependencias "D"
// En este código,se implemena de manera que  el jefe es la clase `Clima`, y depende de interfaces
// clases específicas.

public class Clima {
    private final Climaservice climaservice;
    private final Alerta alerta;

    public Clima(Climaservice climaservice,Alerta alerta){
        this.climaservice = climaservice;
        this.alerta = alerta;
    }

    public void procesarruta(string ruta){
            String condiciones = climaservice.obtenerclima(ruta);
            if (condiciones.contains("tormenta")){
                alertaclima.enviaralerta("Las condiciones de la ruta" + ruta "no son opticas");
            }
    }
 }


 