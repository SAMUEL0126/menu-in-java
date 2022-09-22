public class menu {
    public static void main(String[] args){


        
        int productocantidad = 0;
        int cantidad = 0;
        int valorProducto = 0;
        int resultado = 0;
        int cantidadBodega = 0;
        int cantidadMinima = 0 ; 
        int Ejercicio = 0 ;
        String respuesta;
        int unidadesFaltantes = 0;
        int valorEnCaja = 0 ;
        int valorDeCompra = 0 ;
        int compraDeseada = 0 ;
        int multiple = 0 ;
        int dia = 0;
        int total = 0;
        int descuento = 0;
        int porcentaje = 0;
        int valorPagar = 0;
        int total_factura = 0;
        int result = 0;
        int x = 0; 
        String atender;

    

        java.util.Scanner inventario = new java.util.Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DEL EJERCICIO");
        Ejercicio = inventario.nextInt();
        



            switch (Ejercicio) 
            
            { 

                case 1:  
              
                System.out.println(" EJERCICIO 1 ");
                System.out.println("------------------------------------------------------------------------ ");
                break;

                case 2:

                System.out.println(" EJERCICIO 2 ");
                System.out.println("------------------------------------------------------------------------ ");
                java.util.Scanner ejercicio2 = new java.util.Scanner(System.in);
                System.out.println("Ingrese la cantidad en Bodega: ");
                cantidadBodega = ejercicio2.nextInt();
                System.out.println("Ingrese la cantidad a comprar: ");
                cantidadMinima = ejercicio2.nextInt();
        
                if (cantidadMinima <= cantidadBodega) {
                    System.out.println("No Es necesario realizar el pedido al proveedor");
                }
                else{
                    System.out.println("Es necesario realizar el pedido al proveedor");
                }
                break;

                
 
                case 3:

                System.out.println("EJERCICIO 3 ");
                System.out.println("------------------------------------------------------------------------ ");
                java.util.Scanner ejercicio3 = new java.util.Scanner(System.in);
                System.out.println("Ingrese la cantidad en Bodega: ");
                cantidadBodega = ejercicio3.nextInt();
                System.out.println("Ingrese la cantidad a comprar: ");
                cantidadMinima = ejercicio3.nextInt();
        
                if (cantidadBodega >= cantidadMinima ) {
                    unidadesFaltantes = cantidadBodega - cantidadMinima;
                    System.out.println("Cantidad en bodega: " + cantidadBodega +  " Cantidad mínima requerida " + cantidadMinima + " Entonces no es necesario realizar el pedido al proveedor.");
                    System.out.println("Cantidad faltantes a vender: " + unidadesFaltantes);
        
                    if (unidadesFaltantes <= 10) {
                        System.out.println("*ALERTA GENERADA*");
                    }
                    
                }
        
                else if (cantidadBodega <= cantidadMinima ){
                    System.out.println("Cantidad en bodega: " + cantidadBodega +  " Cantidad mínima requerida es mayor a la Cantidad en BODEGA");
                    System.out.println("Si es necesario realizar el pedido al proveedor.");
                    if (unidadesFaltantes <= 10) {
                        System.out.print("*ALERTA GENERADA*");
                        
                    }
                }
                break;

                case 4:

                System.out.println("EJERCICIO 4 ");
                System.out.println("------------------------------------------------------------------------ ");
                java.util.Scanner ejercicio4 = new java.util.Scanner(System.in);
                System.out.println("Ingrese la cantidad en Bodega: ");
                cantidadBodega = ejercicio4.nextInt();
                System.out.println("Ingrese la cantidad a comprar: ");
                cantidadMinima = ejercicio4.nextInt();
            
                if (cantidadBodega >= cantidadMinima ) {
                    unidadesFaltantes = cantidadBodega - cantidadMinima;
                    System.out.println("Cantidad en bodega: " + cantidadBodega +  " Cantidad mínima requerida " + cantidadMinima + " Entonces no es necesario realizar el pedido al proveedor.");
                    System.out.println("Cantidad faltantes a vender: " + unidadesFaltantes);
            
                    if (unidadesFaltantes <= 10) {
                        System.out.println("*ALERTA GENERADA*");
                    }
                }
            
            
                else{
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Cantidad en bodega: " + cantidadBodega +  " Cantidad mínima requerida es mayor a la Cantidad en BODEGA");
                    System.out.println("Si es necesario realizar el pedido al proveedor.");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Ingrese la cantidad de compra deseada: ");
                        compraDeseada = ejercicio4.nextInt();
            
                    System.out.println("Ingrese El valor de la Compra: ");
                        valorDeCompra = ejercicio4.nextInt();
            
                    System.out.println("Valor de Caja: ");
                        valorEnCaja = ejercicio4.nextInt();
                        multiple = compraDeseada * valorDeCompra;
            
            
                    if (multiple < valorEnCaja ) {
                        System.out.println("FACTURA ");
                        System.out.println("Si es posible realizar el pedido.");
                        System.out.println("Unidades a comprar " + compraDeseada +" a " + valorDeCompra);
                        System.out.println("Valor Total a pagar: " + multiple);
                        System.out.println("----------------------------------------------------------------");
                    }
            
                    else {
                        System.out.println(" FACTURA ");
                        System.out.println("No es posible realizar el pedido.");
                        System.out.println("Unidades a comprar " + compraDeseada +" a " + valorDeCompra +" Cada una");
                        System.out.println("El valor en Caja insuficiente");
                        System.out.println("----------------------------------------------------------------");
                        
                    }
                }
                break;


                case 5:

                System.out.println("EJERCICIO 5 ");
                System.out.println("------------------------------------------------------------------------ ");

                System.out.println("Ingrese el dia hoy en (NUMEROS): ");
                dia = inventario.nextInt();
                System.out.println("--------------------------------------- ");
                System.out.println("Ingrese el Total a pagar: ");
                valorPagar = inventario.nextInt();
        
        
                    switch (dia) 
                    
                    {   
                        case 1:  porcentaje = 5;
                        descuento = (porcentaje * valorPagar) /100; 
                        total = (valorPagar - descuento);
                        break;
        
                        case 2:  porcentaje = 3; 
                        descuento = (porcentaje * valorPagar) /100; 
                        total = (valorPagar - descuento);
                        break;
        
                        case 3:  porcentaje = 10;
                        descuento = (porcentaje * valorPagar) /100; 
                        total = (valorPagar - descuento);
                        break;
        
                        case 4:  porcentaje = 4;
                        descuento = (porcentaje * valorPagar) /100; 
                        total = (valorPagar - descuento);
                        break;
        
                        case 5:  porcentaje = 6;
                        descuento = (porcentaje * valorPagar) /100; 
                        total = (valorPagar - descuento);
                        break;
        
                        case 6:  porcentaje = 2;
                        descuento = (porcentaje * valorPagar) /100; 
                        total = (valorPagar - descuento);
                        break;
        
                        case 7:  porcentaje = 1;
                        descuento = (porcentaje * valorPagar) /100; 
                        total = (valorPagar - descuento);
                        break;
                        default: respuesta = "invalido" ;
                        break;
                        
                    }
        
                    if (dia <= 7) {
                        System.out.println("--------------------------------------- ");
                        System.out.println("Samuel ");
                        System.out.println("El valor del producto es: " + valorPagar );
                        System.out.println("El valor Total a pagar menos el: "+ porcentaje + "%  Es: "  + total );
                        System.out.println("--------------------------------------- ");
                    }
                    
                    else{
                        System.out.println("--------------------------------------- ");
                        System.out.println("Samuel ");
                        System.out.println("EL numero que ingreso es invalido" );
                        System.out.println("--------------------------------------- ");
                    }
                break;
                
                case 6:
                try (java.util.Scanner TiendaExotica = new java.util.Scanner(System.in)) {
                    System.out.println("Ingrese la cantidad de Productos a comprar: ");
                    cantidad = TiendaExotica.nextInt();
                    if (cantidad <= 0)
                        System.out.println("El valor No es VALIDO");
        
                    else{
                      
                        for (int i = 1; i <= cantidad; i++){
                            System.out.println(" P R O D U C T O " +  i + " ");
        
                            System.out.print("Cantidad del producto " + i +  ": ");
                            productocantidad = TiendaExotica.nextInt();
        
                            System.out.print("Ingrese El valor del Producto " + i + ": $");
                            valorProducto = TiendaExotica.nextInt();
        
                            resultado = productocantidad * valorProducto;
                            total += resultado;
                            }
                            System.out.println("-------------------------------------------");
                            System.out.println("Total de la factura: "+ total);
        
                    }
                }
                break;
                
                case 7:
                
                java.util.Scanner TiendaExotica = new java.util.Scanner(System.in); 

                do {
                    x++;
                    System.out.println("\n");
                    System.out.println("  CLIENTE " +  x + " ");
                    
                    System.out.println("Ingrese la cantidad de Productos a comprar: ");
                    cantidad = TiendaExotica.nextInt();

                    if (cantidad <= 0)
                        System.out.println("El valor No es VALIDO");

                    else{
                        for (int i = 1; i <= cantidad; i++){
                            System.out.println(" P R O D U C T O " +  i + " ");

                            System.out.print("Cantidad del producto " + i +  ": ");
                            productocantidad = TiendaExotica.nextInt();

                            System.out.print("Ingrese El valor del Producto " + i + ": $");
                            valorProducto = TiendaExotica.nextInt();

                            resultado = productocantidad * valorProducto;
                            total += resultado;
                        }

                        if (total >= 100000) {
                            descuento = (10 * total) /100 ;
                            result = (total - descuento);
                            System.out.println("-------------------------------------------");
                            System.out.println("Valor de los productos: "+ total);
                            System.out.println("Valor Total menos- el 10%  es de " + result);
                            }
                            
                        else {
                            System.out.println("-------------------------------------------");
                            System.out.println("Total a Pagar: "+total );
                        }
                    }
                    
                    total_factura += total;
                    System.out.println("\n");
                    System.out.println("-------------------------------------------");
                    System.out.print("--------- Desea Atender A Otro Cliente: ---------");
                    atender=TiendaExotica.next();

                
                }while (atender.equals("si") || atender.equals("SI")); 


                System.out.println("El total vendido es: "+ total_factura);
                TiendaExotica.close();

                break;
                default: respuesta = "INGRESE UN NUMERO MENOR A (5)" ;
                System.out.println(respuesta);
                break;
                
            }

            inventario.close();

    }
}