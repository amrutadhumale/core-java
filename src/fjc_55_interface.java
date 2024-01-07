public class fjc_55_interface {
    interface Bycycle {
        void applyBreak(int decrement);

        void speedUp(int increment);
    }

    class AvonCycle implements Bycycle {
        void blowHorn() {
            System.out.println("pee poo pee poo");

        }

        public void applyBreak(int decrement) {
            System.out.println("applying break");
        }

        public void speedUp(int increment) {
            System.out.println("applying speedUp");
        }

        public static void main(String[] args) {

        }
    }
}
