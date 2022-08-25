package com.christopherAdasme.bolsaSuperMercado.modelo;

public class NoPerecible extends Producto{
    private Integer contenido;
    private Integer calorias;

    public NoPerecible(String nombre, Double precio, Integer contenido, Integer calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }
}
