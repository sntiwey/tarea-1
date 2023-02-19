public class tarea1{

     public static void main(String[] args){

        //.length

        String texto = "Mi juego favorito es el Rainbow Six";
        System.out.println("Mi juego favorito es el Rinbow six siege");
        System.out.println("La cadena es de: " + texto.length() + " caracteres. ");

        System.out.println("");
        System.out.println("");

        //espacio vacio

        String cancion = "Mi cancion favorita es Vete de Bad Bunny";
        boolean b1 = cancion.isEmpty();
        String cantante = "";
        boolean b2 = cantante.isEmpty();

        System.out.println("La primera es vacia " + cancion.isEmpty() );
        System.out.println("La segunda es vacia " + cantante.isEmpty() );

        System.out.println("");
        System.out.println("");

       //charAt

        String comida = "Mi comida favorita es la pizza";
        for (int i=0; i<comida.length(); i++)
        {
           char c = comida.charAt(i);
           System.out.println(c);
        }

        System.out.println("");
        System.out.println("");

        //Comparar cadenas

        String abc = "Santiago";
        String def = "Santiago";

        if (abc == def)
          System.out.println("Iguales");
              else
          System.out.println("No son iguales");

        System.out.println("");
        System.out.println("");

       //2.0 Comparar cadenas "No son iguales"

        String ghi = "Santiago";
        String jkl = "Jesus";

        if (ghi == jkl)
          System.out.println("Iguales");
              else
          System.out.println("No son iguales");

        System.out.println("");
        System.out.println("");

        //Determinar caracter de una cadena

        String pesopluma = "Puro Peso Pluma";
        int p1 = pesopluma.indexOf("e");
        int p2 = pesopluma.lastIndexOf("l");
          System.out.println("Puro peso pluma " + pesopluma.indexOf("e") );
          System.out.println("Puro peso pluma " + pesopluma.lastIndexOf("l") );

        System.out.println("");
        System.out.println("");

        //Determinar subcadena dentro de una cadena

        String anuel = "real hasta la muerte, como dijo anuel siempre real hasta la muerte";
        int o1 = anuel.indexOf("hasta");
        int o2 = anuel.indexOf("muerte");
        int o3 = anuel.lastIndexOf("hasta");
        System.out.println("real hasta la muerte, como dijo anuel siempre real hasta la muerte " + anuel.indexOf("hasta") );
        System.out.println("real hasta la muerte, como dijo anuel siempre real hasta la muerte " + anuel.indexOf("muerte") );
        System.out.println("real hasta la muerte, como dijo anuel siempre real hasta la muerte " + anuel.lastIndexOf("hasta") );
        System.out.println("real hasta la muerte, como dijo anuel siempre real hasta la muerte " + anuel.lastIndexOf("muerte") );

        System.out.println("");
        System.out.println("");

        //Convertir de minusculas a mayusculas

        String sin = "No more paper";
        String may = sin.toUpperCase();
        String min = sin.toLowerCase();
          System.out.println(sin.toUpperCase() );
          System.out.println(sin.toLowerCase() );

        System.out.println("");
        System.out.println("");

        //Subcadenas

        String motomami = "Las moto mamis";
        String q1 = motomami.substring(0,3);
        String q2 = motomami.substring(4,8);
        String q3 = motomami.substring(9,14);
          System.out.println(motomami.substring(0,3) );
          System.out.println(motomami.substring(4,8) );
          System.out.println(motomami.substring(9,14) );

        System.out.println("");
        System.out.println("");

        //Conversion entre cadenas y numeros

        String s1 = "0123456789";
        int i = Integer.parseInt(s1);
        String t1 = Integer.toString(i);
          System.out.println(Integer.parseInt(s1) );
          System.out.println(Integer.toString(i) );

        System.out.println("");

               //Conversiones flotantes

        String s2 = "012345.6789";
        double d = Double.parseDouble (s2);
        String t2 = Double.toString(d);
          System.out.println(Double.parseDouble (s2) );
          System.out.println(Double.toString (d) );

        System.out.println("");
        System.out.println("");

        //Concatenar cadenas

        String furia0 = "Me ";
        String furia1 = "llama ";
        String furia2 = "Dusita ";
        String furia3 = "Bebe ";
        String furiatotal = furia0+furia1+furia2+furia2+furia3;
          System.out.println(furia0+ furia1+ furia2+ furia3);

        System.out.println("");
        System.out.println("");

        //Concatenar cadenas de caracteres

        StringBuilder bellako = new StringBuilder();
        bellako.append("Quiero ser ");
        bellako.append("bellako" );
          System.out.println(bellako);

        System.out.println("");
        System.out.println("");

        //Modificar los caracteres de una cadena

        StringBuilder duki = new StringBuilder("Duki capo" );
        duki.setCharAt(3, 'x');
          System.out.println(duki);
  }
}
