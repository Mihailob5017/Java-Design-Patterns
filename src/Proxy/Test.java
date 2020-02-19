package Proxy;
/*
    TIP:Strukturni Patern

    RAZLOG:Koristimo ga da bi preko njega motrili i testirali metode pravog objekta.Otprilike kao placehoalder!

    IMPLEMENTACIJA:Napravicemo dve klase,od kojih jedna od njih je Prava a druga je Proxy(kao klon slicno) te klase
    a obe klase ce implementirati specifican interfejs.
 */
public class Test {
    public static void main(String[] args) {
            Image proxy=new ProxyImage();
            Image image=new RealImage(24,"Superbad");
            proxy.Show();
            image.Show();
    }
}
