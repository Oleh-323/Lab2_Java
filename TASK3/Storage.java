import java.util.ArrayList;

public class Storage {
    private final int box = 5;
    private final int maxHeight = 5;
    private final int maxWidth = 5;
    private final int maxLength = 5;


    private final ArrayList<Goods> items;
    private final ArrayList<Goods> storage;
    private Goods goods;

    public Storage() {
        items = new ArrayList<>();
        storage = new ArrayList<>();

    }

    public void reciverGoods() {
        int count = 0;
        for (Goods goods : items) {
            if (getBox() >= count) {
                if (goods.getHeight() <= getMaxHeight() && goods.getLength() <= getMaxLength() && goods.getWidth() <= getMaxWidth()) {
                    System.out.println("Товар у комірці ");
                    addStorage(goods);

                } else {
                    System.out.println("Товар за великий:" + goods.getNameObject() + " Height: " + goods.getHeight() + " Length: " + goods.getLength() + " Width: " + goods.getWidth() + ";");
                }

            } else {
                System.out.println("Забагато!");
            }
        }
    }

    public void allStorageArray() {

        System.out.println("Товару приїхало: " + storage.size());
        // System.out.println("Товари:"+storage);
        for (int i = 0; i < storage.size(); i++) {
            System.out.println("Товар: " + storage.get(i));
        }
    }

    public void addStorage(Goods goods) {
        storage.add(goods);
    }

    public void addGoods(Goods goods) {
        items.add(goods);
    }


    public void displayArray() {
        for (Goods goods : items) {
            System.out.println(goods);
        }
    }

    public int getBox() {
        return box;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxWidth() {
        return maxWidth;
    }
}
