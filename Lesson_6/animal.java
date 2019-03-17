package Lesson_6;

public abstract class animal {
    private int runMaxDistance;
    private int swimMaxDistance;
    private float jumpMaxDistance;

    public animal(int runMaxDistance, int swimMaxDistance, float jumpMaxDistance) {
        this.runMaxDistance = runMaxDistance;
        this.swimMaxDistance = swimMaxDistance;
        this.jumpMaxDistance = jumpMaxDistance;
    }

    public void run(int runDistance) {
        System.out.println("run: " + (runDistance <= runMaxDistance));
    }
    public void swim(int swimDistance) {
        System.out.println("swim: " + (swimDistance <= swimMaxDistance));
    }
    public void jump(float jumpHeight) {
        System.out.println("jump: " + (jumpHeight <= jumpMaxDistance));
    }
}

