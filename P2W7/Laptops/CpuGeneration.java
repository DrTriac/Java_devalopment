package Laptops;

public enum CpuGeneration {
    SANDY_BRIDGE, IVY_BRIDGE, HASWELL, BROADWELL, SKYLAKE, KABYLAKE;

    @Override
    public String toString() {
        String s = name().toLowerCase();
        String t= Character.toUpperCase(s.charAt(0)) + s.substring(1);
        return  t.replace('_', ' ');
    }
}
