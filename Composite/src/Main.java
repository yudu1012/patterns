public class Main {
    public static void main(String[] args) {
        FileItem file1 = new FileItem("doc.txt");
        FileItem file2 = new FileItem("image.png");

        Folder folder1 = new Folder("Documents");
        folder1.addItem(file1);
        folder1.addItem(file2);

        Folder rootFolder = new Folder("Root");
        rootFolder.addItem(folder1);
        rootFolder.addItem(new FileItem("readme.md"));

        rootFolder.showName();
    }
}
