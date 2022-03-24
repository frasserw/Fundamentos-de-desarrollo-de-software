

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerDato {
	 /**
     * 
     * @return
     */
    public static String dato(){
        String sdato = "";
        try {
            BufferedReader leer =new BufferedReader(new InputStreamReader(System.in));
            sdato = leer.readLine();
        }
        catch (IOException e){
            System.err.println("Error: " + e.getMessage());
        }
        return sdato;
    }
    /**
     * 
     * @return un dato de tipo entero
     */
    public static int datoInt(){
        try {
            return Integer.parseInt(dato());
        }
        catch (NumberFormatException e){
            return Integer.MIN_VALUE;
        }
    }
    /**
     * 
     * @return un dato de tipo long
     */
    public static long datoLong(){
        try {
            return Long.parseLong(dato());
        }
        catch (NumberFormatException e){
            return Long.MIN_VALUE;
        }
    }
    /**
     * 
     * @return un dato de tipo float
     */
    public static float datoFloat(){
        try {
            Float f = new Float(dato());
            return f.floatValue();
        }
        catch (NumberFormatException e){
            return Float.NaN;
        }
    }
    /**
     * 
     * @return un dato de tipo double
     */
    public static double datoDouble(){
        try {
            Double d = new Double(dato());
            return d.doubleValue();
        }
        catch (NumberFormatException e){
            return Double.NaN;
        }
    }
    /**
     * 
     * @return un dato de tipo short
     */
    public static short datoShort(){
        try {
            return Short.parseShort(dato());
        }
        catch (NumberFormatException e){
            return Short.MIN_VALUE;
        }
    }
}
