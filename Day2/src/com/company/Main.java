package com.company;

public class Main {

    public static void main(String[] args)
    {
        Vector2d vec2d_1 = new Vector2d(8, 3);
        Vector2d vec2d_2 = new Vector2d(2, 5);
        Vector3d vec3d_1 = new Vector3d(5,7,6);
        Vector3d vec3d_2 = new Vector3d(4, 3,-6);

        System.out.println("First Vector " + vec2d_1.getX()+ " ; " + vec2d_1.getY());
        System.out.println("Second Vector " +vec2d_2.getX() + " ; " + vec2d_2.getY());
        vec2d_1.get_diff(vec2d_2);
        vec2d_1.get_sum(vec2d_2);
        vec2d_1.get_mult(vec2d_2);
        System.out.println("First Vector "+ vec3d_1.getA() + " ; "+ vec3d_1.getB() + " ; " + vec3d_1.getC());
        System.out.println("Second Vector "+ vec3d_2.getA() + " ; "+ vec3d_2.getB() + " ; " + vec3d_2.getC());
        vec3d_1.get_vector_mult3D(vec3d_2);
        vec3d_1.get_diff3D(vec3d_2);
        vec3d_1.get_sum3D(vec3d_2);
    }
}
