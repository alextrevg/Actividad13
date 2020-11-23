import java.util.*;

public class Main {




    public static void main(String args[]){

        //List <String> list = new ArrayList<String>();

            ArrayList<String> list = new ArrayList<>();
            /*List<Cadena> lista = Arrays.asList(
        new Cadena ("Cecilia"),
        new Cadena("Alejandro"),
        new Cadena("Alondra"),
        new Cadena("Ezequiel"),
        new Cadena("Treviño"),
        new Cadena("Sofia"),
        new Cadena("Ander"),
        new Cadena("Luis"),
        new Cadena("Samuel"),
        new Cadena("Guajardo"),
        new Cadena("Jonathan"));
        //String[] lista = {"Cecilia","Alejandro", "Alondra", "Ezequiel", "Treviño", "Sofia", "Ander", "Luis", "Samuel", "Guajardo", "Jonathan"};*/

            list.add("Cecilia");
            list.add("Alejandro");
            list.add("Alondra");
            list.add("Ezequiel");
            list.add("Treviño");
            list.add("Sofia");
            list.add("Ander");
            list.add("Luis");
            list.add("Samuel");
            list.add("Guajardo");
            list.add("Jonathan");

        boolean salir = false;


        Scanner keyboard = new Scanner(System.in);
        while(!salir) {
            System.out.println("1. Por longitud utilizando clase anónima.");
            System.out.println("2. Por longitud utilizando expresión lambda. ");
            System.out.println("3. Por longitud utilizando método de referencia.");
            System.out.println("4. Por orden alfabético utilizando clase anónima. ");
            System.out.println("5. Por orden alfabético utilizando expresión Lambda.");
            System.out.println("6. Por orden alfabético utilizando método de referencia.");


            try {
                int opcion;
                opcion = keyboard.nextInt();
                switch (opcion) {

                    case 1:
                        list.sort(((String n1, String n2) -> -(n2.compareTo(n1))));
                        list.forEach((n) -> System.out.println(n));

                        break;

                    case 2:

                        list.sort(((String o1, String o2) -> -(o2.compareTo(o1))));
                        list.forEach((o) -> System.out.println(o));

                        break;

                    case 3:
                        list.sort(((String o1, String o2) -> -(o2.compareTo(o1))));
                        list.forEach((o) -> System.out.println(o));
                        break;

                    case 4:
                        Comparator<String> comp = Comparator.comparing(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER);
                        Collections.sort(list, comp);
                        list.forEach(System.out::println);
                        list.forEach(Main::ordenLongitudReferencia);
                        break;
                    case 5:

                        //list.sort(((String o1, String o2) -> -(o2.compareTo(o1))));
                        Comparator<String> compa = Comparator.comparing(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER);
                        Collections.sort(list, compa);
                        list.forEach(System.out::println);
                        //list.forEach((o) -> System.out.println(o));
                        break;
                    case 6:
                        Comparator<String> com = Comparator.comparing(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER);
                        Collections.sort(list, com);
                        list.forEach(System.out::println);
                        list.forEach(Main::ordenAlfaReferencia);
                        break;

                    default:
                        System.out.println("Favor de ingresar un numero valido");


                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        /*Collections.sort(list);
        //Arrays.sort(lista);

        for (String n : list){
            System.out.println(n);
        }


        Comparator<String> comp = Comparator.comparing(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER);
        Collections.sort(list, comp);
        list.forEach(System.out::println);*/



    }

    public static void  ordenAlfaReferencia(String list){


        Comparator<String> comp = Comparator.comparing(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER);
        //Collections.sort(ArrayList, comp);
       // list.forEach(System.out::println);
    }

    public static void ordenLongitudReferencia(String list){
        //list.sort(((String o1, String o2) -> -(o2.compareTo(o1))));
        //list.forEach((o) -> System.out.println(o));
    }

}
