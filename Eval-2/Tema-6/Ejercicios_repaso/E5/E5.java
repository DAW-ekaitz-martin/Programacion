import Tienda.Tienda;
import Tienda.Producto;
import Tienda.LineaCarrito;
import Tienda.Carrito;
public class E5 {
    public static void main(String[] args) {
        Tienda mi_tienda = new Tienda("Tienda Ekaitz Martin");
        Producto gafas = new Producto("G1", "Gafas hawkers", 19.99, 15);
        Producto pantalones = new Producto("P1", "Skinny Jeans", 39.23, 20);
        Producto hoddie = new Producto("H1", "Stooner Hoddie", 63.49, 20);
        Carrito mi_carrito = new Carrito(20);

        //Añadir productos al carrito
        System.out.println("PRODUCTOS QUE HAY EN EL CARRITO (QUE NO EXISTIAN ANTES):");
        mi_carrito.addProducto(gafas, 3);
        mi_carrito.addProducto(pantalones, 6);
        mi_carrito.addProducto(hoddie, 7);
        mi_carrito.getProductos();
        System.out.println("PRODUCTOS QUE HAY EN EL CARRITO AÑADIENDO UNIDADES A UNO YA EXISTENTE:");
        mi_carrito.addProducto(gafas, 3);
        mi_carrito.getProductos();
        //Quitar producto
        System.out.println("PRODUCTOS QUE HAY EN EL CARRITO DESPUES DE ELIMINAR LA SUDADERA:");
        System.out.println("Longitud de productos antes de eliminar: " + mi_carrito.getNumlineas());
        mi_carrito.removeProducto(hoddie.getCodigo());
        mi_carrito.getProductos();
        System.out.println("Longitud de productos antes de eliminar: " + mi_carrito.getNumlineas());
        //Cambiar unidades
        System.out.println("CAMBIO DE UNIDADES DE LOS PANTALONES:");
        mi_carrito.cambiarUnidades("P1", 3);
        mi_carrito.getProductos();
        /*
        System.out.println("PRUEBA DE CAMBIO DE UNIDADES DE LOS PANTALONES CON STOCK INSUFICIENTE:");
        mi_carrito.cambiarUnidades("P1", 21);
        mi_carrito.getProductos();

        System.out.println("PRUEBA DE CAMBIO DE UNIDADES DE LOS PANTALONES A 0:");
        mi_carrito.cambiarUnidades("P1", 0);
        mi_carrito.getProductos();
        //Calcular precio final sin descuento
        System.out.println("TOTAL A PAGAR SIN DESCUENTO:");
        System.out.println(mi_carrito.totalSinDescuento() + "$");*/
        //Calcular precio final con descuento
        System.out.println("TOTAL A PAGAR CON DESCUENTO:");
        System.out.println(mi_carrito.totalConDescuento() + "$");
        //Generar ticket
        System.out.println(mi_carrito.generarTicket());
        //Buscar producto
        System.out.println("BUSCANDO PRODUCTO:");
        mi_carrito.buscarProducto("G1");
        //Buscar producto más caro
        System.out.println("BUSCANDO PRODUCTO MÁS CARO:");
        mi_carrito.productoMasCaro();
        //Buscar producto más comprado
        System.out.println("BUSCANDO PRODUCTO MÁS COMPRADO:");
        mi_carrito.productoMasComprado();
    }
}
