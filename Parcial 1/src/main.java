import java.util.Scanner;
        public class main {
    public static void main(String[] args) {
        int nc,tf,ach=0,acp=0,acs=0,acc=0,ch=0,cp=0,cs=0,cc=0,pp;
        double vtp;
        Scanner InputData = new Scanner(System.in);
        System.out.println("Ingrese el numero de comensales: ");
        nc = InputData.nextInt();
        for (int i = 0;i < nc; i++){
            System.out.println("Ingrese el pedido del cliente " + i +
                    " 1. hamburguesa 2. Perro 3. Salchipapa 4. Chorizo: ");
            tf = InputData.nextInt();
            if (tf ==1){
                ach = ach + 10000;
                ch++;
            }else if (tf ==2){
                acp = acp + 8000;
                cp++;
            }else  if (tf ==3){
                acs = acs + 7000;
                cs++;
            }else if (tf ==4){
                acc = acc + 6000;
                cc++;
            }else {
                System.out.println("El plato ingresado no existe");
            }
        }
        vtp = ach + acp + acs + acc;
        if ((vtp > 20000) && (ch >= 2)){
            vtp = vtp - (vtp * 0.15);
            System.out.println("Desea incluir propina? 1. SI, 2. NO: ");
            pp = InputData.nextInt();
            if (pp ==1){
                vtp = vtp + (vtp * 0.10);
                System.out.println("El valor total de su compra es: $"+ vtp);
                System.out.println("Usted tuvo un descuento del 10% por compras superiores a $20.000");
                System.out.println("Tambien un descuento del 5% por comprar "+ch+" Hamburguesas");
            }else if (pp ==2){
                System.out.println("El valor total de su compra es: $"+ vtp);
                System.out.println("Usted tuvo un descuento del 10% por compras superiores a $20.000");
                System.out.println("Tambien un descuento del 5% por comprar "+ch+" Hamburguesas");
            }else{
                System.out.println("La opción ingresada no es valida! ");
            }
        }else if ((vtp > 20000) && (cp >= 2)){
            vtp = vtp - (vtp * 0.15);
            System.out.println("Desea incluir propina? 1. SI, 2. NO: ");
            pp = InputData.nextInt();
            if (pp ==1){
                vtp = vtp + (vtp * 0.10);
                System.out.println("El valor total de su compra es: $"+ vtp);
                System.out.println("Usted tuvo un descuento del 10% por compras superiores a $20.000");
                System.out.println("Tambien un descuento del 5% por comprar "+cp+" Perros");
            }else if (pp ==2){
                System.out.println("El valor total de su compra es: $"+ vtp);
                System.out.println("Usted tuvo un descuento del 10% por compras superiores a $20.000");
                System.out.println("Tambien un descuento del 5% por comprar "+cp+" Perros");
            }else{
                System.out.println("La opción ingresada no es valida! ");
            }
        } else if ((vtp > 20000) && (cs >= 2)){
            vtp = vtp - (vtp * 0.15);
            System.out.println("Desea incluir propina? 1. SI, 2. NO: ");
            pp = InputData.nextInt();
            if (pp ==1){
                vtp = vtp + (vtp * 0.10);
                System.out.println("El valor total de su compra es: $"+ vtp);
                System.out.println("Usted tuvo un descuento del 10% por compras superiores a $20.000");
                System.out.println("Tambien un descuento del 5% por comprar "+cs+" Salchipapa");
            }else if (pp ==2){
                System.out.println("El valor total de su compra es: $"+ vtp);
                System.out.println("Usted tuvo un descuento del 10% por compras superiores a $20.000");
                System.out.println("Tambien un descuento del 5% por comprar "+cs+" Salchipapa");
            }else{
                System.out.println("La opción ingresada no es valida! ");
            }
        }else if ((vtp > 20000) && (cc >= 2)){
            vtp = vtp - (vtp * 0.15);
            System.out.println("Desea incluir propina? 1. SI, 2. NO: ");
            pp = InputData.nextInt();
            if (pp ==1){
                vtp = vtp + (vtp * 0.10);
                System.out.println("El valor total de su compra es: $"+ vtp);
                System.out.println("Usted tuvo un descuento del 10% por compras superiores a $20.000");
                System.out.println("Tambien un descuento del 5% por comprar "+cc+" Chorizos");
            }else if (pp ==2){
                System.out.println("El valor total de su compra es: $"+ vtp);
                System.out.println("Usted tuvo un descuento del 10% por compras superiores a $20.000");
                System.out.println("Tambien un descuento del 5% por comprar "+cc+" Chorizos");
            }else{
                System.out.println("La opción ingresada no es valida! ");
            }
        }else if (vtp > 2000){
            vtp = vtp + (vtp * 0.10);
            System.out.println("El valor total de su compra es: $"+ vtp);
            System.out.println("Usted tuvo un descuento del 10% por compras superiores a $20.000");
        }else {
            System.out.println("El valor total de su compra es: $"+ vtp);
        }
    }
}
