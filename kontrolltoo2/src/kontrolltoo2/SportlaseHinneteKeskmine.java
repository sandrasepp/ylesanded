package kontrolltoo2;

import java.util.Arrays;


public class SportlaseHinneteKeskmine {

    public static void main(String[] args) {
        System.out.println(result (new double[] {0., 1., 5.6, 2., 3., 4.}));
    }

    private static double result(double[] marks) {
        double[] maatriks = new double[marks.length];

        for (int i = 0; i < marks.length; i++) {
            maatriks[i] = marks[i];
        }

        //Arrays.sort(maatriks);//automaatne sortimine

        boolean sorteeritud = true;//käsitsi sortimine
        double tulemus;
        while (sorteeritud) {
            sorteeritud = false;
            for (int i = 0; i < maatriks.length-1; i++) {
                if (maatriks[i] > maatriks[i+1]) {
                    tulemus = maatriks[i];
                    maatriks[i] = maatriks[i+1];
                    maatriks[i+1] = tulemus;
                    sorteeritud = true;//paneb uuesti sorteeritud true, sest tükel kestab, kuni ei ole enam midagi sortida
                }
            }
        }
        System.out.println(Arrays.toString(maatriks));

        double summa = 0;
        double vastus;

        for (int i = 0; i < maatriks.length-1; i++) {//-1, sest kõige nõrgemat ja paremat tulemust ei arvestata
            summa = summa + maatriks[i];
        }

        vastus = summa/(maatriks.length-2);
        return vastus;
    }
}
