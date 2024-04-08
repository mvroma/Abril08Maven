package com.softtek;
import lombok.*;

@Data
@NoArgsConstructor
public class Producto {

    public int ID = 0;
    public String nombre = "Mesa";
    public double precio = 20.4;
    public String proveedor = "ikea";
    public String descripción = "De jardín";

    public int comprobar() throws ExceptionOut {
        if (ID ==0){
            throw new ExceptionOut("No existe el ID");
        }else{ return ID;
    }
}
}