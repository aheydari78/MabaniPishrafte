import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.*;
import static org.junit.jupiter.api.Assertions.*;

public class MashinTest {

    @Test
    void Mashin_Bayad_Harekat_Konad_Vaghti_Mashin_Roshan_va_Dar_Baste_Ast() {

        mashin benz = new mashin("Benz");
        mashin volvo = new mashin("Volvo");

        boolean AyaHarekatMikonad = benz.AyaMashinDarHaleHarekatAst();
        volvo.roshan();
        boolean AyaVolvoHarekatMikonad = volvo.AyaMashinDarHaleHarekatAst();

        assertFalse(AyaHarekatMikonad);
        Assertions.assertTrue(AyaVolvoHarekatMikonad);
//        mashin mashin = new mashin();
//        mashin.darbasteast();
//        mashin.darbazast();
//
//        System.out.println("Aya Dar Mashin Baz Ast ?" +mashin.ayadarbazast);
//        mashin.harekat();
//
//        System.out.println("----------------------------------------------");
//
//        MashinTest.mashin pride = new mashin("pride");
//        pride.roshan();
//        pride.darbasteast();
//        pride.harekat();

    }

    class mashin{
        boolean ayamashinroshanast;
        boolean ayadarbazast;
        String mark;

        mashin(){
            out.println("Yek Mashin Bedone Dade Sakhte Shod");
        }
        
        mashin(String mark){
            this.mark = mark;
            out.println(" yek mashin " + this.mark + "sakhte shod");
        }


        void roshan(){
            out.println("Mashin Roshan Ast");
            ayamashinroshanast = true;
        }

        void khamosh(){
            out.println("Mashin Khamosh Ast");
            ayamashinroshanast = false;
        }

        void darbazast(){
            out.println("Dar Mashin Baz Ast");
            ayadarbazast = true;
        }

        void darbasteast(){
            out.println("Dar Mashin Baste Ast");
            ayadarbazast = false;
        }
        boolean AyaMashinDarHaleHarekatAst() {
            if (ayamashinroshanast && !ayadarbazast) {
                out.println("mashin dar harekat ast");
                return true;
            } else {
                out.println("mashin park ast");
                return false;
            }
        }

    }
}
