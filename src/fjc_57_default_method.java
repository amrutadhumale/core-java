public class fjc_57_default_method {
    interface camera{
        void takesnap();
        void recordvideo();
    }

    interface wifi{
        String [] getnetwork();
        void connectToNetwork(String network);
        class Mycellphone{
            void callnumber(int phoneNumber){
                System.out.println("calling"+ phoneNumber);

            }
            void pickcall(){
                System.out.println("connecting...");

            }
            static class MySmartPhone extends Mycellphone implements wifi, camera{
                @Override
                public void takesnap() {
                    System.out.println("talking snap");

                }

                @Override
                public void recordvideo() {
                    System.out.println("Recording Video");

                }

                @Override
                public String[] getnetwork() {
                    System.out.println("getting list of network");
                    String [] networklist={"Harry,Amruta,Paritosh"};
                    return networklist;
                }

                @Override
                public void connectToNetwork(String network) {
                    System.out.println("connect to "+ network);

                }
            }
        }
    }
    public static void main(String[] args) {
        wifi.Mycellphone.MySmartPhone ms = new wifi.Mycellphone.MySmartPhone();
        camera c = new wifi.Mycellphone.MySmartPhone();
        c.recordvideo();
       /* String [] ar = ms.getnetwork();
        for (String item : ar){
            System.out.println(item);
        }*/
    }
}
