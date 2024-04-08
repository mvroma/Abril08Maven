package com.softtek;

public class pruebaProducto {
    public static void main(String[] args) {
        Producto producto = new Producto();
        System.out.println("Su Id es:" + producto.ID );
        System.out.println("Su nombre es:" + producto.nombre);
        System.out.println("Su precio es:" + producto.precio);
        System.out.println("El proovedor es:" + producto.proveedor);
        System.out.println("Su descripción es:" + producto.descripción);
    }
}
