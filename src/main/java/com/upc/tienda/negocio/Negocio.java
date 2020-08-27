package com.upc.tienda.negocio;

import com.upc.tienda.entidades.Artefacto;
import org.springframework.stereotype.Service;

@Service
public class Negocio {

    public double calcularIGV(Artefacto artefacto){
        return artefacto.getPrecio()*0.18;

    }
    public double calcularDescuento(Artefacto artefacto){
        double descuento = 0;
        if (artefacto.getMarca().equals("PHILLIPS")){
            descuento = 0.10*artefacto.getPrecio();
        }
        return descuento;
    }
    public double calcularPrecioNeto(Artefacto artefacto){
        return artefacto.getPrecio() - calcularDescuento(artefacto);
    }

}
