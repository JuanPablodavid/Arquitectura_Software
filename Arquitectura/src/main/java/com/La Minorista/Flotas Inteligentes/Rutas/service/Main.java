package main.java.com.La Minorista.Flotas Inteligentes.Rutas.service;
//Principio Sustitucion de Liskov "L"
//Este  principio dice que deberiamos poder reemplazar una clase por otra sin dañar el sistema
//de forma que ambos implementen la misma interfaz
// en este caso usamos la clase "ClimaAPi" que implementa la interfaz "Climaservice" lo mismo con alertaconsola
// que implementa la interfaz alerta.
public class main {
    public static void main (string[] args){
        ClimaService climaservice = new ClimaApi();
        Alerta alerta= new alertaconsola();
        // Estas implementaciones se pasan a la clase "Clima", logrando que funcione con cualquier otra que siga las mismas reglas.
        Clima clima = new Clima(climaservice, alerta);
        clima.procesarruta("Medellin-Santa Rosa");
    }
    
}
