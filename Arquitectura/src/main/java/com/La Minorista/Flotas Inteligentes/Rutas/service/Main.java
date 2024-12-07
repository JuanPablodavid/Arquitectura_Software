package main.java.com.La Minorista.Flotas Inteligentes.Rutas.service;

public class main {
    public static void main (string[] args){
        ClimaService climaservice = new ClimaApi();
        Alerta alerta= new alertaconsola();

        Clima clima = new Clima(climaservice, alerta);
        clima.procesarruta("Medellin-Santa Rosa");
    }
    
}
