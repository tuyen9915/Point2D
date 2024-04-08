public class Point3d extends Point2d{
    private float z = 0.0f;

    public Point3d() {
    }

    public Point3d(float z) {
        this.z = z;
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
       this.z = z;
       super.getX();
       super.getY();
    }
    public float[] getXYZ(){
      return new float[]{super.getX(), super.getY(), z};
    }

    @Override
    public String toString() {
        return "Mảng 3d ={ " + super.getX()  +";"+ super.getY() + ";" + this.getZ() +"}";
    }
}
