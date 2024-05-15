public class File implements FileElements{
    private int size;

    public File(int size) {
        this.size = size;
    }


    @Override
    public int getsize() {
        return size;
    }

}
