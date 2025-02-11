package gr.aueb.cf.ch13.exercise.PointXYZ;

public class Main {

    public static void main(String[] args) {
        PointXYZ pointXYZ = new PointXYZ(10,10,10);

        System.out.println(pointXYZ.getXYDistance());
        System.out.println(pointXYZ.getYZDistance());
        System.out.println(pointXYZ.getXZDistance());
        System.out.println(pointXYZ.getXYZDistance());
    }
}
