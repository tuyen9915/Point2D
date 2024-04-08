//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point2d point2d = new Point2d();
        point2d = new Point2d(2f,4f);
        System.out.println(point2d);

        Point3d point3d = new Point3d();
        point3d = new Point3d(2f,4f,7f);
        System.out.println(point3d);
    }
}