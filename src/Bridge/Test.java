package Bridge;
/*
    TIP: Strunkturni Dijagram

    RAZLOG: Korisimo kada zelimo da razdvojim apstrakciju od implemantacije kako bi mogle da postoje nezavisno,a
    koristi se interfejs kao most izmedju ta dva.Na ovaj nacin promene u jednoj klasi ne uticu na promene u drugoj

    IMPLEMENTACIJA: Pocinjemo praveci interfejs koji sluzi kao most izmedju.Zatim pravimo klase koje ce implementirajti
    taj most interfejs, posle toga napravimo apstratkrnu klasu koja sadrzi referencu na most interfejs.Zatim napravimo
    konkretnu klasu/klase koje ce extendovati tu apstraktnu klasu
 */
public class Test {
    public static void main(String[] args) {
       Most sony=new SonyTV();
       BeoDaljinac sonijev=new BeoDaljinac(sony);

       Most samsung=new SamsungTV();
       CrnDaljinac crnDaljinac=new CrnDaljinac(samsung);
       sonijev.turnOff();
       crnDaljinac.turnOn();
        System.out.println("----------------");

    }
}
