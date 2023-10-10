package BT2;

public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float[] getXYZ() {
        float[] xyz = new float[3];
        xyz[0] = getX();
        xyz[1] = getY();
        xyz[2] = z;
        return xyz;
    }

    @Override
    public String toString() {
        super.toString();
        return "Point3D{" +"x="+getX()+ "y="+getY()+
                "z=" + z +
                '}';
    }
}
