package com.hillel.lonzhansky.lessons.lesson13.main1;

public class Car {

    Engine engine;
    Wheel wheels;
    Door door;

    private static String model;
    private String nonStaticModel;

    public String getModel() {
        return model;
    }

    void demo() {
        if (true) {
            class DemoLocal {
                int qwerty;

                public DemoLocal(int qwerty) {
                    this.qwerty = qwerty;
                }

                public int getQwerty() {
                    return qwerty;
                }

                public void setQwerty(int qwerty) {
                    this.qwerty = qwerty;
                }

                @Override
                public String toString() {
                    return "DemoLocal{" +
                            "qwerty=" + qwerty +
                            '}';
                }
            }


            DemoLocal demoLocal2 = new DemoLocal(5);
        }


//        DemoLocal demoLocal = new DemoLocal(5);
//        System.out.println(demoLocal.qwerty);
//
//        demoLocal.getQwerty();
//        System.out.println(demoLocal.toString());
    }


    public Car(double volume, double radius) {
        this.engine = new Engine(volume);
        this.wheels = new Wheel(radius);
        this.door = new Door();
    }

    class Engine {
        double volume;
        boolean isStart;

        public Engine(double volume) {
            this.volume = volume;
            model = "BMW";
            nonStaticModel = "BMW";
            demo();
        }

        void startEngine() {
            System.out.println("Engine start");
            isStart = true;
        }

        void stopEngine() {
            System.out.println("Engine stop");
            isStart = false;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "volume=" + volume +
                    '}';
        }

        class Engine2 {

            class Engine3 {

            }

        }
    }

    class Wheel {
        double radius;

        public Wheel(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        @Override
        public String toString() {
            return "Wheel{" +
                    "radius=" + radius +
                    '}';
        }
    }

    static class Door {

        void demoStatic() {
            model = "BMW";
//            nonStaticModel = "BMW";
        }

        void rollUp() {
            System.out.println("roll up");
        }

        void rollDown() {
            System.out.println("roll down");
        }
    }

}
