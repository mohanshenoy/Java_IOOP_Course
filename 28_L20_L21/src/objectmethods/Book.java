package objectmethods;
class Book {
    String title;
    Book(String title) {
        this.title = title;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Book) {
            return this.title.equals(((Book) obj).title);
        }
        return false;
    }
    class Resource {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Cleaning up resources before GC.");
        }
    }
}