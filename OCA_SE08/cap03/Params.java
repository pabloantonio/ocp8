package cap03;

public class Params {

    /**
     * 
     * @param valor
     * @param ejecucion
     */
    public void paramUno(int valor, String ejecucion) {
        /**
         * 
         */
    }

    /**
     * 
     * @param ejecucion
     * @param valor
     */
    public void paramUno(String ejecucion, int valor) {
        /**
         * 
         */
    }

    /**
     * 
     */
    public void paramUno() {
        /**
         * 
         */
    }

    /**
     * 
     * @param params
     */
    public void paramUno(int... params) {
        /**
         * 
         */
    }

    /**
     * 
     * @param params
     */
    public void paramUno(String[] params) {
        /**
         * 
         */
    }

    /**
     * 
     * @param marks1
     * @param marks2
     * @return
     */
    double calcAverage(double marks1, int marks2) {
        return (marks1 + marks2) / 2.0;
    }

    /**
     * 
     * @param marks1
     * @param marks2
     * @return
     */
    double calcAverage(int marks1, double marks2) {
        return (marks1 + marks2) / 2.0;
    }

    public static void main(String args[]) {
        Params params = new Params();
        params.calcAverage(2, 1d);
    }

}
