package test;

public abstract class ArrayUtil {
    private ArrayUtil() {
    }

    public static int[] intArrayOf(int... values) {
        return values;
    }

    public static long[] longArrayOf(long... values) {
        return values;
    }

    public static float[] floatArrayOf(float... values) {
        return values;
    }

    public static double[] doubleArrayOf(double... values) {
        return values;
    }

    @SafeVarargs
    public static <T> T[] arrayOf(T... values) {
        return values;
    }
}
