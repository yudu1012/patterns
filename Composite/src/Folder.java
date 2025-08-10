import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem{
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    private List<FileSystemItem> items = new ArrayList<>();

    public void addItem(FileSystemItem fileSystemItem){
        items.add(fileSystemItem);
    }
    public void remove(FileSystemItem fileSystemItem){
        items.add(fileSystemItem);
    }

    @Override
    public void showName() {
        for (FileSystemItem fileSystemItem : items){
            fileSystemItem.showName();
        }
    }
}
