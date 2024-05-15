public class Clint {
    public static void main(String[] args) {
        File file0 = new File(18);
        File file1 = new File(76);
        File file2 = new File(78);

        Elements sub = new Elements();
        Elements main = new Elements();

        main.add(sub);
        main.add(file0);
        main.add(file1);
        sub.add(file2);

        System.out.println(main.getsize());

    }
}

