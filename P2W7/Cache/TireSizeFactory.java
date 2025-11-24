
package Cache;

public class TireSizeFactory {
    private static final TireSize[] tireSizeCache = new TireSize[100];
    private static int size = 0;

    private TireSizeFactory() {
        // prevent instantiation
    }

    public static TireSize create(int width, int aspect, int diameter) {
        // 1) search in the filled portion of the cache
        for (int i = 0; i < size; i++) {
            TireSize ts = tireSizeCache[i];
            // ts is guaranteed non-null for i < size
            if (ts.getWidth() == width && ts.getAspect() == aspect && ts.getDiameter() == diameter) {
                return ts; // reuse existing object
            }
        }

        // 2) not found → create new and add to cache
        TireSize newSize = new TireSize(width, aspect, diameter);

        if (size < tireSizeCache.length) {
            tireSizeCache[size++] = newSize;
        } else {
            // Optional: handle cache full situation
            // You could throw an exception, or resize the array.
            // For the exercise, we'll just overwrite the last one:
            tireSizeCache[size - 1] = newSize;
        }

        return newSize;
    }
}
