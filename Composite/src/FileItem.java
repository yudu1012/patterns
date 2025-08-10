public class FileItem implements FileSystemItem{
    private String name;

    public FileItem(String name) {
        this.name = name;
    }

    @Override
    public void showName() {
        System.out.println("name " + name);
    }
}
