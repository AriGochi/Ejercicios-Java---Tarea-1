public class Main {
    public static void main(String[] args) {
        System.out.println("Determinar la longitud de una cadena");
        String a = "Hola";
        int x = a.length(); // retorna: 4
        System.out.println("Longitud de una cadena:" + x);
        System.out.println("-------------------------");
        System.out.println("Determinar si una cadenas es vacia");
        String s1 = "Hola";
        boolean b1 = s1.isEmpty(); // retorna: false
        System.out.println("¿La cadena es vacia?:" + b1);

        String s2 = "";
        boolean b2 = s2.isEmpty(); // retorna: true
        System.out.println("¿La cadena es vacia?:" + b2);

        System.out.println("-------------------------");
        System.out.println("Acceder a los caracteres de una cadena");
        String h = "Hola";
        for (int i = 0; i < h.length(); i++) {
            char q = h.charAt(i);
            System.out.println(q); //Salida: H o l a

            System.out.println("-------------------------");
            System.out.println("Comparar cadenas");
            String n = "Hola";
            String y = "Hola";

            if (n.equals(y))//Compara sus contenidos y retorna: true!
                System.out.println("SON IGUALES?" + n.equals(y));
            {
                System.out.println("Si pasa por aquí!");
            }
            System.out.println("-------------------------");

            System.out.println("-Determinar la posicion que ocupa un caracter dentro de una cadena");
            String p= "Hola, como estas?";
            int p1 = p.indexOf ('a');// retorna: 3
            System.out.println("¿Que posicion tiene?"+ p1);
            int p2 = p.lastIndexOf ('a');// retorna: 14
            System.out.println("¿Que posicion tiene?"+ p2);

            System.out.println("-------------------------");
            System.out.println("-Determinar la posicion que ocupa una subcadena dentro de una cadena");

            String e= "Hola, como estas? Estas como querias?";
            int p3 = e.indexOf("como");// retorna: 6
            System.out.println("¿Que posicion tiene?"+ p3);
            int p4 = e.indexOf("estas");// retorna: 11
            System.out.println("¿Que posicion tiene?"+ p4);
            int p5 = e.lastIndexOf("como");// retorna: 24
            System.out.println("¿Que posicion tiene?"+ p5);

            System.out.println("-------------------------");

            System.out.println("Convertir mayusculas y minusculas");
            String r= "Hola, como estas";
            String may = r.toUpperCase(); //retorna: HOLA, COMOP ESTAS?
            System.out.println("Mayuscula: "+ may);
            String min = r.toLowerCase(); //  retona: hola, como estas?
            System.out.println("minuscula: "+ min);

            System.out.println("-------------------------");

            System.out.println("---Subcadenas---");
            String d = "Hola, como estas?";
            String s3 = d.substring (0,4); // retorna: Hola
            System.out.println("" + s3);
            String s4 = d.substring (6,10); // retorna: como
            System.out.println("" + s4);
            String s5 = d.substring (11); // retorna: estas?
            System.out.println("" + s5);

            System.out.println("-------------------------");
            System.out.println("Conversion entre cadenas y numeros");

            // Enteros
            String s6 = "1234";
            int u = Integer.parseInt(s6); // retorna: 1234
            System.out.println("" + u);
            String t1 = Integer.toString(u); // retorna "1234"
            System.out.println("" + s6);

            //Flotante
            String s7 = "1234.56";
            double l = Double.parseDouble(s7); // retorna: 1234.56
            System.out.println("" + l);
            String t2 = Double.toString(l);  // retorna: "1234.56"
            System.out.println("" + t2);

            System.out.println("-------------------------");
            System.out.println("Concatenar cadenas");
            String z = "Hola, ";
            String g = "que tal?";
            String m = z+g; // retorna: "Hola, que tal?"
            System.out.println(m);

            System.out.println("-------------------------");
            System.out.println("Concatenar cadenas de caracteres");

            StringBuilder sb = new StringBuilder ();
            sb.append("Hola, ");
            sb.append("Chau");
            System.out.println(sb); //SALIDA: Hola, chau
        }
    }
}