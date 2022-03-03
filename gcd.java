private int findGcd(int x, int y) {
        if (x < y) {
            return findGcd(y, x);
        }
        return y == 0 ? x : findGcd(y, x % y);
    }
