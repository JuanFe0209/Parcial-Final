import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opc = "1";
        RepositorioCrud repo = new ImpAbstract();
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Menu \n 1. Agregar Producto  \n 2. Listar \n 3. Editar Producto " +
                    "\n 4. Borrar  \n 5. Salir \n =>");
            opc = s.next();
             switch (opc) {
            case "1": {
                System.out.println("Id Producto: ");
                Integer id = s.nextInt();
                System.out.println("Nombre Producto: ");
                String nom = s.next();
                System.out.println("Valor Producto: ");
                double val = s.nextDouble();
                System.out.println("Lugar Venta: ");
                String lv = s.next();
                repo.add(new Producto(id, nom, val, lv));
                break;
            }
                 case "2": {
                     List<Producto> productos = repo.findAll();
                     productos.forEach(System.out::println);
                     break;
    }
                 case "3": {
                     System.out.println("===== edit ====");
                     System.out.print("Id Producto: ");
                     Integer idp = s.nextInt();
                     System.out.print("Nombre Producto: ");
                     String nom = s.next();
                     System.out.print("Valor Producto: ");
                     double val = s.nextDouble();
                     System.out.print("Lugar Venta: ");
                     String lv = s.next();
                     Producto beaActualizar = new Producto(idp, nom, val, lv);
                     repo.update(beaActualizar);
                     break;

                 }
                     case "4": {
                         System.out.println("===== delete ======");
                         System.out.print("Id Producto: ");
                         Integer id = s.nextInt();
                         repo.delete(repo.findById(id));
                         repo.findAll().forEach(System.out::println);
                         break;
                     }

}


                 }while (opc != "5");
             }
        }


