public class fjc_abstract_method_56 {
    abstract class parent2 {
        public parent2() {
            System.out.println("mai parent2 ka constructor hoon");
        }

        public void sayHello() {
            System.out.println("hello");
        }

        abstract public void greet();

    }

    class child2 extends parent2 {
        @Override
        public void greet() {
            System.out.println("good morning");
        }
    }



    public static void main(String[] args) {



    }
}

