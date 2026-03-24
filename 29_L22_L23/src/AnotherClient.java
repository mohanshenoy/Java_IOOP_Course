class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Another version of callback: " + (p + 10));
    }
}