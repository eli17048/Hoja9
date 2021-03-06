/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
/**
 * 
 * Esta es la clase de Ruta
 * @author Andrea Elias
 */
public class Ruta {
       private String ciudad1;
    private String ciudad2;
    private int distancia;
    /**
     * Es la instancia de la clase
     * @param ciudad1 una ciudad
     * @param ciudad2 una ciudad 
     * @param distancia la distancia
     */
    public Ruta(String ciudad1, String ciudad2, int distancia) {
        this.ciudad1 = ciudad1;
        this.ciudad2 = ciudad2;
        this.distancia = distancia;
    }

    public Ruta() {
    }

    public String getCiudad1() {
        return ciudad1;
    }

    public void setOrigen(String ciudad1) {
        this.ciudad1 = ciudad1;
    }

    public String getCiudad2() {
        return ciudad2;
    }

    public void setDestino(String ciudad2) {
        this.ciudad2 = ciudad2;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Origen:" + ciudad1 + ", destino: " + ciudad2 + ", distancia: " + distancia;
    }
    /**
     * Se crea la lista
     * @param ruta es la ruta 
     * @return un ArrayList
     */
    public ArrayList crearLista(ArrayList<Ruta> ruta){
        ArrayList<String> ciudades = new ArrayList<>();
        
        for(Ruta c: ruta){
            if(!ciudades.contains(c.getCiudad1())){
                ciudades.add(c.getCiudad1());
            }
            if(!ciudades.contains(c.getCiudad2())){
                ciudades.add(c.getCiudad2());
            }
        }
        
        return ciudades;
    } 
}
