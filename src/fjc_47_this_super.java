public class fjc_47_this_super {
    class Ekclass{
        int a;
        public int getA(){
            return a;
        }
        Ekclass(int a){
           this.a=a;
        }
        public int returnone(){
            return 1;

        }

    }
    public void main(String[] args) {
        Ekclass a = new Ekclass( 34);
        System.out.println(a.getA());

    }
}
