public class MashinTest {

    class mashin{
        boolean ayamashinroshanast;
        boolean ayadarbazast;


        void roshan(){
            System.out.println("Mashin Roshan Ast");
            ayamashinroshanast = true;
        }

        void khamosh(){
            System.out.println("Mashin Khamosh Ast");
            ayamashinroshanast = false;
        }

        void darbazast(){
            System.out.println("Dar Mashin Baz Ast");
            ayadarbazast = true;
        }

        void darbasteast(){
            System.out.println("Dar Mashin Baste Ast");
            ayadarbazast = false;
        }
        void harekat() {
            if (ayamashinroshanast && !ayadarbazast) {
                System.out.println("mashin dar harekat ast");
            } else {
                System.out.println("mashin park ast");
            }
        }

    }
}
