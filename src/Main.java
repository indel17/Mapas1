import java.util.*;

public class Main {

    public static ArrayList<Ubicacion> ubiLista = new ArrayList<>();


    public static void main(String[] args) {
        Ubicacion clase = new Ubicacion(0, "Estás sentado en la clase de programación");
        Ubicacion montana = new Ubicacion(1, "Estás en la cima de una montaña");
        Ubicacion playa = new Ubicacion(2, "Estás bañándote en la playa");
        Ubicacion edificio = new Ubicacion(3, "Estás dentro de un edificio muy alto");
        Ubicacion puente = new Ubicacion(4, "Estás de pie en un puente");
        Ubicacion bosque = new Ubicacion(5, "Estás en un bosque");

        ubiLista.add(0, clase);
        ubiLista.add(1, montana);
        ubiLista.add(2, playa);
        ubiLista.add(3, edificio);
        ubiLista.add(4, puente);
        ubiLista.add(5, bosque);

        ubiLista.get(1).addExit("O", 2);
        ubiLista.get(1).addExit("Q", 0);
        ubiLista.get(1).addExit("N", 5);
        ubiLista.get(1).addExit("E", 3);
        ubiLista.get(1).addExit("S", 4);

        ubiLista.get(2).addExit("Q", 0);
        ubiLista.get(2).addExit("N", 5);

        ubiLista.get(3).addExit("O", 1);
        ubiLista.get(3).addExit("Q", 0);

        ubiLista.get(4).addExit("N", 1);
        ubiLista.get(4).addExit("Q", 0);
        ubiLista.get(4).addExit("O", 2);

        ubiLista.get(5).addExit("S", 1);
        ubiLista.get(5).addExit("0", 2);
        ubiLista.get(5).addExit("Q", 0);



        Scanner sc = new Scanner(System.in);
        int a = 1;
        String brujula;
        do {
            System.out.println("------ _______________________________________________________------");
            System.out.println("|     |                            \uD83C\uDF33                         |     |");
            System.out.println("|     |                 \uD83C\uDF33  5-Bosque \uD83C\uDF33                       |     |");
            System.out.println("|     |                   \uD83C\uDF33                                  |     |");
            System.out.println("|     |         ☀️                            \uD83C\uDFE2           |     |");
            System.out.println("|     |   2- Playa         1-Montaña       3-Edificio         |     |");
            System.out.println("|     |   --__----_             ⛰                            |     |");
            System.out.println("|     |                                                       |     |");
            System.out.println("|     |                     4-Puente                          |     |");
            System.out.println("|     |                    _========_                         |     |");
            System.out.println("|     |                                                       |     |");
            System.out.println("|     |                                               __      |     |");
            System.out.println("------|______________________________________________/  \\_____|-----");


            System.out.println("Q para salir");
            System.out.println();
            System.out.println(ubiLista.get(a).getDescripcion());
            for (Map.Entry<String, Integer> entry : ubiLista.get(a).getUbicaciones().entrySet()) {
                System.out.print(entry.getKey() + " ");
            }
            System.out.println();
            System.out.println("¿A dónde vamos?");
            brujula = sc.next();

            if (!brujula.equalsIgnoreCase("Q")) {
                for (Map.Entry<String, Integer> entry : ubiLista.get(a).getUbicaciones().entrySet()) {
                    if (brujula.equalsIgnoreCase(entry.getKey())) {
                        a = entry.getValue();
                    }
                }
            } else {
                System.out.println("Vuelta a la realidad! \uD83D\uDCBB");
            }

        } while (!brujula.equalsIgnoreCase("Q"));

    }

}

