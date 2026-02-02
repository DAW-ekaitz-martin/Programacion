package Tienda;

public class Carrito {
    int numLineas = 0;
    LineaCarrito[] lineas = new LineaCarrito[20];
    double descuento;
    double total_a_pagar = 0;

    public Carrito(double descuento) {
        this.descuento = descuento / 100;//Me interesa tenerlo ya convertido por facilidad
    }
    //Mostrar los productos
    public void getProductos() {
        for (int i = 0; i < this.numLineas; i++) {
            System.out.println(this.lineas[i]);
        }
    }
    //Sacar la longitud del array
     public int getNumlineas() {
        return this.numLineas;
    }
    public void addProducto(Producto producto, int unidades) {
        boolean producto_existente = false;
        //Si existe sumo las unidades
        for(int i = 0; i < this.numLineas; i++) {
            if (producto.codigo.equals(this.lineas[i].producto.codigo)) {
                this.lineas[i].unidades += unidades;
                producto.stock -= unidades;
                producto_existente = true;
            }
        }
        if (!producto_existente) {
            //Sino creo una nueva linea y la añado al carrito
            if (unidades < 0) {
                System.out.println("El producto no se puedo añadir porque el número de unidades es negativo");
            }
            else if (producto.stock < unidades) {
                System.out.println("El producto no se puedo añadir porque no hay stock suficiente");
            }
            else {
                LineaCarrito nuevaLinea = new LineaCarrito(producto, unidades);
                this.lineas[numLineas] = nuevaLinea;
                producto.stock -= unidades;
                this.numLineas ++;
            }
        }
    }
    public void removeProducto(String codigo) {
        for (int i = 0; i < this.numLineas; i++) {
            //Si encuentro el mismo código de producto en el carrito
            if (this.lineas[i].producto.codigo.equals(codigo)) {
                if (i == numLineas-1) { //Si el producto está en la última posición del array lo quito directamente
                    lineas[i] = null;
                }
                else {
                    //Recorro el bucle pero hasta la penultima posición, ya que si llego a la ultima posición 
                    // del array me saldré de los límites(fuera del array) al buscar el nuevo valor que tengo que mover a la izquierda
                    for (int k = i; k < numLineas -1; k++) {
                        this.lineas[k] = this.lineas[k + 1];
                    }
                    lineas[numLineas-1] = null;
                }
                numLineas --;
            }
        }
    }
    public void cambiarUnidades(String codigo_producto, int unidades_nuevas) {
        boolean producto_existente = false;
        for (int i = 0; i < this.numLineas; i++) {
            if (this.lineas[i].producto.codigo.equals(codigo_producto)) {
                producto_existente = true;
                if (unidades_nuevas != 0) {
                    if (unidades_nuevas > this.lineas[i].producto.stock) {
                        System.out.println("No hay stock suficiente, cambio de unidades rechazado...");
                    }
                    else {
                        this.lineas[i].unidades = unidades_nuevas;
                    }
                }
                else {
                    System.out.println("El nuevo valor de unidades es 0, eliminando producto...");
                    removeProducto(codigo_producto);
                }
            }

        }
        if (!producto_existente) {
           System.out.println("El producto no se encuentra en el carrito"); 
        }
    }
    public double totalSinDescuento() {
        for (int i = 0; i < this.numLineas; i++) {
            this.total_a_pagar += lineas[i].producto.precio * lineas[i].unidades;
        }
        return this.total_a_pagar;
    }
    public double totalConDescuento() {
        for (int i = 0; i < this.numLineas; i++) {
            this.total_a_pagar += (lineas[i].producto.precio * lineas[i].unidades);
        }
        System.out.println("Subtotal: " + this.total_a_pagar);
        double cantidad_a_descontar = this.total_a_pagar*this.descuento;
        System.out.println("Cantidad a descontar: " + cantidad_a_descontar + "$");
        this.total_a_pagar -= cantidad_a_descontar;
        return this.total_a_pagar;
    }
    public String generarTicket() {
        double cantidad_a_descontar = this.total_a_pagar*this.descuento;
        System.out.println("TICKET");
        getProductos();
        return ("Subtotal: " + (this.total_a_pagar - cantidad_a_descontar)+ "$" +  "\nTotal a pagar: " + this.total_a_pagar + "$" + "\nDescuento aplicado: " + (int)(this.descuento * 100) + "%");
         
    }
    public void buscarProducto(String codigo) {
        for (int i = 0; i < this.numLineas; i++) {
            if (this.lineas[i].producto.codigo.equals(codigo)) {
                System.out.println(this.lineas[i]);
                break;
            }
        }
    }
    public void productoMasCaro() {
        double precio = 0;
        int posicion = 0;
        for (int i = 0; i < this.numLineas; i++) {
            if(lineas[i].producto.precio > precio) {
                precio = lineas[i].producto.precio;
                posicion = i;
            }
        }
        System.out.println("El producto más caro es=> " + lineas[posicion]);
    }
    public void productoMasComprado() {
        int unidades = 0;
        int posicion = 0;
        for (int i = 0; i < this.numLineas; i++) {
            if(lineas[i].unidades > unidades) {
                unidades = lineas[i].unidades;
                posicion = i;
            }
        }
        System.out.println("El producto más comprado es=> " + lineas[posicion]);
    }
}
