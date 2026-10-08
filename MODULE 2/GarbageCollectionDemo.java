public class GarbageCollectionDemo {
    public void display() {
        System.out.println("Object is alive");
    }

    public static void main(String[] args) {
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj3 = new GarbageCollectionDemo();
        obj1.display();
        obj2 = null;
        obj3 = null;
        System.gc();
        System.out.println("Garbage collection requested");
    }
}
