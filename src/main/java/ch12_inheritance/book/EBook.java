package ch12_inheritance.book;

public class EBook extends Book {
   private double filesize;
   private String format;

    public EBook(String title, String author, double filesize, String format) {
        super(title, author);
        this.filesize = filesize;
        this.format = format;
    }

    public EBook(String title, String author) {
        super(title, author);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public double getFilesize() {
        return filesize;
    }

    public void setFilesize(double filesize) {
        this.filesize = filesize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void displayInfo(){
        this.filesize = filesize;
        this.format = format;
        System.out.println("제목은 : " + title);
        System.out.println("저자는 : "  + author);
        System.out.println("파일 크기는 : " + filesize + "MB");
        System.out.println("파일 형식은 : " + format);
    }
}
