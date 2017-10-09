package part_05;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */

class Class_01 {
    public static void main(String[] args) {
        Class_02 box = new Class_02(); //my object
        box.setAlpha(150);
        System.out.println("value of alpha is: " + box.getAlpha());

        box.setBeta(95);
        System.out.println("your grade is " + box.getBeta());

        box.setGamma(88);
        System.out.println("your grade is " + box.getGamma());

        Class_03 nihongo = new Class_03();
        System.out.println(nihongo.getPio());
        nihongo.setPio(6);
        System.out.println(nihongo.getPio());

        System.out.println(box.myMeth()); ;

    }
}


    class Class_02 {

        private int alpha;
        private int beta;
        private int gamma;


        public int getAlpha() {
            return alpha;
        }

        public void setAlpha(int alpha) {
            if (alpha > 0 && alpha <= 100) {
                this.alpha = alpha;
            } else {
                this.alpha = -1;
            }
        }

        public int getBeta() {
            return beta;
        }

        public void setBeta(int beta) {
            if (beta < 100 && beta >= 90) {
                System.out.println("you get an A-");
            }
            this.beta = beta;
        }

        public int getGamma() {
            return gamma;
        }

        public void setGamma(int gamma) {
            if (gamma < 90 && gamma >= 80) {
                System.out.println("you get a B+");
            }
            this.gamma = gamma;
        }

        public int myMeth() {
            int r = 5;
            return r;
        }
    }

    class Class_03 {
        private int pio;

        public int getPio() {
            for (int i = 1; i < 8; i++) {
                if (i == 5) {
                    System.out.println("value is 5");
                    continue;
                }
                System.out.println("value is not 5, value is " + i);
            }
            return pio;
        }

        public void setPio(int pio) {
            this.pio = pio;
        }

    }

