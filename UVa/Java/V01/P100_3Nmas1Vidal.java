package V01;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JuanM
 */
public class P100_3Nmas1Vidal {

    static long count;
    static long max;
    static java.util.Hashtable hash;

    public static void main(String args[]) throws java.io.IOException {
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.io.PrintWriter out = new java.io.PrintWriter(System.out);
        hash = new java.util.Hashtable();
        String line;
        while ((line = reader.readLine()) != null) {

            if (line == null) {
// end of file
                break;
            } else if (line.length() == 0) {
                break;
            } else {
                line = line.trim();
                String[] entradas = line.split(" ");
                long firstO = Long.valueOf(entradas[0]);
                long secondO = Long.valueOf(entradas[entradas.length - 1]);
                long first = firstO;
                long second = secondO;

                if (first > second) {
                    long temp = second;
                    second = first;
                    first = temp;
                }

                for (long i = second; i >= first; i--) {
                    count = calculaNumeros(first, i);
                    if (count > max) {
                        max = count;
                    }
                }


                out.print(firstO + " ");
                out.print(secondO + " ");
                out.println(max);
                max = 0;
                count = 0;

            }

        }
        out.flush();



    }

    public static long calculaNumeros(Long i, Long j) {

        if (hash.get(j) != null) {
            return (Long) hash.get(j);
        } else {
            if (j == 1) {
                return 1;
            }
            if (j % 2 == 0) {
                long m = 1 + calculaNumeros(i, j / 2);
                hash.put(j, m);
                return m;

            } else {
                long m = 1 + calculaNumeros(i, (j * 3) + 1);
                hash.put(j, m);
                return m;

            }
        }

    }
}

