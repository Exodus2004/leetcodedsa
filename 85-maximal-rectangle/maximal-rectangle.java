class Solution {
    public int maximalRectangle(char[][] a) {

        int r = a.length;
        int c = a[0].length;
        int p[][] = new int[r][c];

        for (int j = 0; j < c; j++) {
            int sum = 0;
            for (int i = 0; i < r; i++) {
                if (a[i][j] == '0') {
                    sum = 0;
                } else {
                    sum ++;
                }
                p[i][j] = sum;
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(p[i][j] + " ");


                System.out.println();
        }

        int max = 0;
        for (int i = 0; i < r; i++) {
            max = Math.max(max, histogram(p[i]));
        }
        return max;

    }

    static int histogram(int a[]) {

        int n = a.length;
        if (n == 1)
            return a[0];

        int[] nse = findnse(a);
        int[] pse = findpse(a);

        int res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, (nse[i] - pse[i] - 1) * a[i]);
        }

        return res;

    }

    static int[] findnse(int[] a) {
        int n = a.length;
        Stack<Integer> s = new Stack<>();

        int b[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && a[s.peek()] >= a[i])
                s.pop();

            if (s.isEmpty())
                b[i] = n;

            else
                b[i] = s.peek();

            s.push(i);
        }

        return b;

    }

    static int[] findpse(int[] a) {
        int n = a.length;
        Stack<Integer> s = new Stack<>();

        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && a[s.peek()] >= a[i])
                s.pop();

            if (s.isEmpty())
                b[i] = -1;

            else
                b[i] = s.peek();

            s.push(i);
        }

        return b;

    }

}