package com.company;

public class Vector2d extends AbstractVector {
    private double x,y;


    public Vector2d(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void get_vector_mult3D(AbstractVector abstractVector) {
    }
    @Override
    public void get_sum3D(AbstractVector abstractVector) {
    }
    @Override
    public void get_diff3D(AbstractVector abstractVector) {
    }
    @Override
    public void get_sum(AbstractVector abstractVector) {
        Vector2d vector2d_2 = (Vector2d)abstractVector;
        double sum_x = x + vector2d_2.x;
        double sum_y = y + vector2d_2.y;
        System.out.println("The sum is "+"[" + sum_x + " ; " + sum_y+"]");
    }
    @Override
    public void get_diff(AbstractVector abstractVector) {
        Vector2d vector2d_2 = (Vector2d)abstractVector;
        double diff_x = x - vector2d_2.x;
        double diff_y = y - vector2d_2.y;
        System.out.println("The difference is "+"[" + diff_x + " ; " + diff_y+"]");
    }
    @Override
    public void get_mult(AbstractVector abstractVector) {
        Vector2d vector2d_2 = (Vector2d)abstractVector;
        double mult = (x * vector2d_2.x) + (y * vector2d_2.y);
        System.out.println("The miltiplication is " + mult);
    }
}