import java.util.ArrayList;
import java.util.List;

public class Elements implements FileElements {
    private int totalSize;
    private List<FileElements> elements;

    

    public Elements() {
        this.totalSize = 0;
        elements = new ArrayList<>();
    }

    public void add(FileElements component){
        elements.add(component);
    }

    @Override
    public int getsize() {
        for (FileElements component : elements) {
            totalSize += component.getsize();
        }
        return totalSize;
    }

}

