package task2;

public class Counter {
    private static int instanceCount = 0;

    {
        instanceCount++;
    }

    static int getInstanceCount(){
        return instanceCount;
    }
}
