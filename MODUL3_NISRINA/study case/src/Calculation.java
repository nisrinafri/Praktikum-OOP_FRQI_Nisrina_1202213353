public class Calculation implements Runnable {
    public double radius, side, area;
    public final double PI = 3.14;

    @Override
    public void run() {
        System.out.println("\n=== Program will start in ===");
        for (int i = 3; i > 0; i--) {
            System.out.println("Starting with thread " + i);
        }
        try {
            Thread.sleep(1000);
        } catch (Exception a) {

        }
    }

    public void setSquare() {
        if (side < 1) {
            throw new IllegalArgumentException();
        } else {
            this.area = side * side;
        }
    }

    public double getSquare() {
        return this.area;
    }

    public void setCircle(double radius) {
        if (radius < 1) {
            throw new IllegalArgumentException();
        } else {
            this.area = this.PI * radius * radius;
        }
    }

    public double getCircle() {
        return this.area;
    }

    public void setTrapezoid(double a, double b, double t) {
        if ((a < 1 && b < 1)) {
            throw new IllegalArgumentException();
        } else {
            this.area = ((a + b) * t) / 2;
        }
    }

    public double getTrapezoid() {
        return this.area;
    }

}