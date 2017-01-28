package kontrolltoo2;

import java.util.Arrays;

/**
 * Massiivide v�rdlemine
 */
public class VeeruMaksimumideMaatriks {
    public static void main(String[] args) {
        int[] res = veeruMaxid (new int[][] {{1, 2, 6}, {4, 5, 3}});
        System.out.println(Arrays.toString(res));
    }

    private static int[] veeruMaxid(int[][] m) {
        int koigePikemMassiiv = 0;

        for (int i = 0; i < m.length; i++) {
            if (m[i].length > koigePikemMassiiv) {
                koigePikemMassiiv = m[i].length;//teame k�ige pikema massiivi pikkust
            }
        }

        int[] uusMassiiv = new int[koigePikemMassiiv];

        for (int i = 0; i < uusMassiiv.length; i++) {//ts�kkel, et v�rdleks negatiivseid arve ka
            uusMassiiv[i] = Integer.MIN_VALUE;//v�tab integeri k�ige v�iksema v�imaliku v��rtuse
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                uusMassiiv[j] = Math.max(m[i][j], uusMassiiv[j]);//v�tab kaks numbrit vastu ja v�rdleb omavahel kumb on suurem ja salvestab massiivi
            }
        }
        return uusMassiiv;
    }
}
