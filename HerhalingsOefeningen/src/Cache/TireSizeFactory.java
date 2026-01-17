package Cache;

import java.util.Arrays;

public class TireSizeFactory {
    private static TireSize[] tireSizeCache = new TireSize[99];
    private static int size = 0;

    public TireSizeFactory(){}

    public static TireSize create(int width, int aspect, int diameter)
    {
            for (int i = 0; i<tireSizeCache.length; i++)
            {
                if(size == 0)
                {
                    TireSize t = new TireSize(diameter,width,aspect);
                    tireSizeCache[size++] = t;
                    size++;
                    return t;
                }

                if (width == tireSizeCache[i].getWidth() && aspect == tireSizeCache[i].getAspect() && diameter == tireSizeCache[i].getDiameter() && size !=0)
                {
                    return tireSizeCache[i];
                }
            }
            TireSize t = new TireSize(diameter,width,aspect);
            tireSizeCache[size++] = t;
            size++;
            return null;
    }


}
